import findspark
findspark.init("/opt/manual/spark/")
from pyspark.sql import SparkSession
from pyspark import StorageLevel

spark = (SparkSession.builder
         .appName("Homecredit Data to Hive")
         .master("yarn")
         .enableHiveSupport()
         .config("spark.sql.shuffle.partitions","5")
        .config("spark.memory.fraction","0.8")
        .config("spark.memory.storageFraction","0.7")
         .getOrCreate())

jdbcUrl = "jdbc:postgresql://localhost/homecredit?user=train&password=Ankara06"


# 2. application_train
application_train = (spark.read
.format("jdbc")
.option("url", jdbcUrl)
.option("driver", 'org.postgresql.Driver')
.option("query","select * from application_train")
.load().repartition(100).persist(StorageLevel.DISK_ONLY))

application_train.write.mode("overwrite") \
    .option("compression","snappy") \
    .option("format","orc") \
    .saveAsTable("homecredit.application_train_orc_snappy")
application_train.unpersist()
print("application_train completed.")

