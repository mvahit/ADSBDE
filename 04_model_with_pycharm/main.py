import findspark
import pandas as pd
SPARK_HOME = "/opt/manual/spark/"
findspark.init(SPARK_HOME)
from pyspark.sql import SparkSession, functions as F
from myutilities.prep_before_ml_pipe import DataPrepBeforeMLPipeline

# Create SparkSession
spark = (SparkSession.builder
        .appName("Model with Spark")
        .master("yarn")
        .enableHiveSupport()
        .getOrCreate())

# Read data
train_df = spark.sql("select * from homecredit.application_train_orc_snappy")
test_df = spark.sql("select * from homecredit.application_test_orc_snappy")


# Create and preperation object
prep_before_pipe = DataPrepBeforeMLPipeline()


# drop columns having too many nulls
train_drop_null_cols_df, null_cols_to_drop, null_cols_to_stay = prep_before_pipe.drop_too_much_null_cols(df=train_df,
                                                                                                         drop_ratio=0.48)

print("train_df column count: " + str(len(train_df.columns)))
print("train_drop_null_cols_df column count: " + str(len(train_drop_null_cols_df.columns)))
print("null_cols_to_stay")
print(null_cols_to_stay)
print("null_cols_to_drop")
print(null_cols_to_drop)

# Split numric, categoric, label and other columns
numeric_cols, categoric_cols, other_cols = prep_before_pipe.split_numeric_and_categoric_cols(df=train_drop_null_cols_df,
                                                                                             label='target')
print("numeric_cols")
print(numeric_cols)
print("categoric_cols")
print(categoric_cols)





spark.stop()


