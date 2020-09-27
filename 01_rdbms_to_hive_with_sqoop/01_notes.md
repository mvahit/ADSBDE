1. Sqoop submit job  
`[train@localhost 01_rdbms_to_hive_with_sqoop]$ ./drop_olds_create_news.sh `

```
[train@localhost advanced_ds_bigdata]$ hdfs dfs -du -h /user/hive/warehouse/homecredit.db
4.4 M    4.4 M    /user/hive/warehouse/homecredit.db/application_test_orc_snappy
26.9 M   26.9 M   /user/hive/warehouse/homecredit.db/application_train_orc_snappy
7.7 M    7.7 M    /user/hive/warehouse/homecredit.db/bureau_balance_orc_snappy
26.5 M   26.5 M   /user/hive/warehouse/homecredit.db/bureau_orc_snappy
99.5 M   99.5 M   /user/hive/warehouse/homecredit.db/credit_card_balance_orc_snappy
265.2 M  265.2 M  /user/hive/warehouse/homecredit.db/installments_payments_orc_snappy
81.4 M   81.4 M   /user/hive/warehouse/homecredit.db/pos_cash_balance_orc_snappy
57.8 M   57.8 M   /user/hive/warehouse/homecredit.db/previous_application_orc_snappy
```


