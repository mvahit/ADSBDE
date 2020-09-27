# activate venv
source ~/venvspark/bin/activate

spark-submit --master yarn \
--conf=spark.executor.heartbeatInterval=200000 \
--conf spark.storage.blockManagerSlaveTimeoutMs=200000 \
--conf=spark.network.timeout=300000 \
~/advanced_ds_bigdata/02_rdbms_to_hive_with_spark/homecredit_from_postgres_to_hive_orc_snappy.py

deactivate