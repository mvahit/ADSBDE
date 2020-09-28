from pyspark.sql import functions as F
import pandas as pd


class DataPrepBeforeMLPipeline:
    def __init__(self):
        pass

    def drop_too_much_null_cols(self, df, drop_ratio=0.5):
        """
        Cleans dataframe from null values and drops columns according to drop_ratio.
        If there is too much nulls in a column it is dropped.
        :param df: Spark dataframe to clean
        :param drop_ratio: User specified null_ratio in a column. 0.5 means if half of values a column are null drop that column.
        :return: null cleaned dataframe, staying null column list, dropped null column list
        """
        # This dict is for pandas dataframe to explore more comfortable null value exploration
        null_dict = {
            "columns": df.columns,
            "null_count": [],
            "has_null": [],
            "null_ratio": []
        }

        # To calculate null_ratio we need to know record count
        df_count = float(df.count())

        for col in df.columns:
            # If a column has null, nan or empty value calculate how many?
            null_count = df.filter((df[col].isNull()) |
                                   (df[col] == "") |
                                   (F.isnan(F.col(col))) |
                                   (df[col] == "null") |
                                   (df[col] == "NULL")
                                   ).count()

            # Append this calculated count to dictionary
            null_dict["null_count"].append(null_count)
            # If null_count is gt 0 that means this column has atleast one null, nan or empty value.

            if null_count > 0:
                null_ratio = null_count / df_count
                null_dict["null_ratio"].append(null_ratio)
                null_dict["has_null"].append(True)
                print("{} has {} null and null ratio {}".format(col, null_count, round(null_ratio, 4)))
            else:
                # Add zero for non-null columns
                null_dict["null_ratio"].append(0.0)
                # Add False for non-null columns
                null_dict["has_null"].append(False)

        # Create a pandas dataframe from null_dictionary
        null_df = pd.DataFrame.from_dict(null_dict)

        # Convert to list columns gt drop_ratio
        null_cols_to_drop = null_df.loc[null_df.null_ratio > drop_ratio].loc[:, "columns"].tolist()
        null_cols_to_stay = null_df.loc[null_df.null_ratio < drop_ratio].loc[:, "columns"].tolist()

        # Drop columns gt drop_ratio
        df2 = df.drop(*null_cols_to_drop)
        return df2, null_cols_to_drop, null_cols_to_stay

    def split_numeric_and_categoric_cols(self, df, label='target'):
        """
        Splits categoric(string) numeric(int, double, float) and rest
        :param df: spark dataframe
        :param label: To exclude label columns to placed in input cols
        :return: python lists of categoric(string) numeric(int, double, float) and other columns
        """
        categoric_cols = []
        numeric_cols = []
        other_cols = []
        label_col = [label]

        for col in df.dtypes:
            if col[0] not in label_col:
                if col[1] == 'string':
                    categoric_cols.append(col[0])
                elif (col[1] == 'int') | (col[1] == 'double') | (col[1] == 'float'):
                    numeric_cols.append(col[0])
                else:
                    other_cols.append(col[0])

        print("categoric_cols")
        print(categoric_cols)
        print("numeric_cols")
        print(numeric_cols)
        print("label_col")
        print(label_col)
        if len(df.columns) == (len(categoric_cols) + len(numeric_cols) + len(label_col)):
            print("columns split is successful.")
        else:
            print("there is a mistake column split ops.")

        return numeric_cols, categoric_cols, other_cols

    def impute_categoric_null_cols(self, df, categoric_cols, null_cols_to_stay, constant='Unknown_'):
        """
        Imputes categoric null columns with a constant.
        :param df: spark dataframe
        :param categoric_cols: all categoric columns
        :param null_cols_to_stay: null containing columns to apply imputation
        :param constant: User defined value to replace nulls.
        :return: imputed spark dataframe
        """

        null_cat_cols = list(set(categoric_cols).intersection(set(null_cols_to_stay)))
        print(null_cat_cols)

        for col in null_cat_cols:
            df = df.withColumn(col, F.when(((df[col].isNull()) |
                                            (df[col] == "") |
                                            (F.isnan(F.col(col))) |
                                            (df[col] == "null") |
                                            (df[col] == "NULL")), constant).otherwise(F.col(col)))
        return df

    def impute_numeric_null_cols(self, df, numeric_cols, null_cols_to_stay, strategy='mean'):
        """

        :param df:
        :param numeric_cols:
        :param null_cols_to_stay:
        :param strategy:
        :return:
        """
        null_num_cols = list(set(numeric_cols).intersection(set(null_cols_to_stay)))
        null_num_cols_dict = {
            "null_num_cols": null_num_cols,
            "means": []
        }
        for col in null_num_cols:
            print(col)
            df.select(F.mean(col).alias("mean")).show()
            col_mean1 = df.select(F.mean(col).alias("mean")).head(1)
            col_mean = col_mean1[0].asDict()["mean"]
            null_num_cols_dict["means"].append(col_mean)

        # Fill numeric nulls with mean
        null_num_cols = list(set(numeric_cols).intersection(set(null_cols_to_stay)))
        for col, mean in zip(null_num_cols, null_num_cols_dict["means"]):
            df = df.withColumn(col, F.when(((df[col].isNull()) |
                                            (df[col] == "") |
                                            (F.isnan(F.col(col))) |
                                            (df[col] == "null") |
                                            (df[col] == "NULL")), mean).otherwise(F.col(col)))
            print(col, mean)

        return df

    def trim_string_columns(self, df, string_cols):
        """

        :param df:
        :param string_cols:
        :return:
        """
        for col_name in string_cols:
            df = df.withColumn(col_name, F.trim(F.col(col_name)))
        return df

    def truncate_weak_cat_classes(self, df, categoric_cols, max_distinct_cat=20, weak_class_ratio=0.001):
        """

        :param df:
        :param categoric_cols:
        :param max_distinct_cat:
        :param weak_class_ratio:
        :return:
        """

        # We don't want too much categories if a column has more categories than max_distinct_cat
        # we want to drop that column
        max_distinct_cat = max_distinct_cat
        cat_cols_and_distinc_cls_dict = {}
        drop_cols_too_many_clss = []
        for col in categoric_cols:
            dist_count = df.select(F.countDistinct(col).alias("distinct")).head(1)[0].asDict()["distinct"]
            if dist_count < max_distinct_cat:
                cat_cols_and_distinc_cls_dict[col] = dist_count
                print(col, dist_count)
            else:
                print("{} has dropped because it has too many ({}) caregories ".format(col, dist_count))
                drop_cols_too_many_clss.append(col)

        weak_class_ratio = weak_class_ratio
        weak_classes_dict = {}
        df_count = df.count()
        for col in cat_cols_and_distinc_cls_dict.keys():
            # calculate weak class total count and class ratio than filter if class ration less than user specified value
            dummy_df = df.groupBy(col) \
                .agg(F.count("*").alias("total_count")) \
                .orderBy(F.desc("total_count")) \
                .withColumn("class_ratio", F.round(F.col("total_count") / F.lit(df_count), 4)) \
                .filter(F.col("class_ratio") < weak_class_ratio)
            dummy_df.show()

            # Make a dictionary col name is key and weak classes value as another dictionary
            my_dict = dummy_df.select(dummy_df.columns[0]).toPandas().to_dict()
            print(my_dict)
            # Get weak classes as list
            weak_calss_list = list(my_dict[col].values())
            print(weak_calss_list)

            # filter out rows that contain weak clases
            df = df.filter(~ (F.col(col).isin(weak_calss_list)))
            print(df.count())

            # Collect deleted weak classes in a dictionary
            if weak_calss_list:
                weak_classes_dict[col] = weak_calss_list

        print("Dropped columns due to too many classes gt {}".format(max_distinct_cat))
        print("{} rows are deleted.".format(df_count - df.count()))

        return df, weak_classes_dict
