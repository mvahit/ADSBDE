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
        #
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
