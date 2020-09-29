from pyspark.ml.feature import StringIndexer, OneHotEncoder, VectorAssembler, MinMaxScaler
from pyspark.ml.classification import RandomForestClassifier
from pyspark.ml.feature import StringIndexer, OneHotEncoder, VectorAssembler, MinMaxScaler


class MLPipelines:
    def __init__(self):
        pass

    def makePipeline(self, df, numeric_cols, categoric_cols, other_cols):
        string_indexer_dict = {
            "column_names": [],
            "onehot_column_names": []
        }

        for col in categoric_cols:
            string_indexer_dict["column_names"].append(col + "_str_idx")
            string_indexer_dict["onehot_column_names"].append(col + "_onehot")

        indexer = StringIndexer() \
            .setInputCols(categoric_cols) \
            .setOutputCols(string_indexer_dict["column_names"])

        encoder = OneHotEncoder() \
            .setInputCols(string_indexer_dict["column_names"]) \
            .setOutputCols(string_indexer_dict["onehot_column_names"])

        assembler = VectorAssembler() \
            .setInputCols(numeric_cols + string_indexer_dict["onehot_column_names"]) \
            .setOutputCol("non_scaled_features")

        scaler = MinMaxScaler() \
            .setInputCol("non_scaled_features") \
            .setOutputCol("features")

        estimator = RandomForestClassifier() \
            .setFeaturesCol("features") \
            .setLabelCol("target")

        pipeline_obj = Pipeline() \
            .setStages([indexer, encoder, assembler, scaler, estimator])

        pipeline_model = pipeline_obj.fit(df)

        pipeline_model.write().overwrite().save("/saved_models/homecredit-randomforest-pipeline-model")
        print("Pipeline model has written to /saved_models/homecredit-randomforest-pipeline-model")

        return pipeline_model