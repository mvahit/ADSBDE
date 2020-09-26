import findspark
findspark.init("/opt/manual/spark/")
from pyspark.sql import SparkSession

spark = (SparkSession.builder
         .appName("Homecredit Data to Hive")
         .master("yarn")
         .enableHiveSupport()
         .getOrCreate())

jdbcUrl = "jdbc:postgresql://localhost/homecredit?user=train&password=Ankara06"

applcation_test = (spark.read
.format("jdbc")
.option("url", jdbcUrl)
.option("driver", 'org.postgresql.Driver')
.option("query","select * from application_test")
.load())

applcation_test.write.mode("overwrite") \
    .option("compression","snappy") \
    .option("format","orc") \
    .saveAsTable("homecredit.application_test_orc_snappy")