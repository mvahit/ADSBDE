#!/bin/bash
echo "This script is for to transfer tables from postgresql homecredit db to hive homecredit db.
It will drop old and create new all hive tables."
sleep 10
echo "This script will start in 10 seconds... If you stop it press Ctrl+C "
sleep 10
echo "Dropping old homecredit hive tables"
beeline -n train -p Ankara06 -u jdbc:hive2://localhost:10000 \
-f /home/train/advanced_ds_bigdata/01_rdbms_to_hive_with_sqoop/drop_homecredit_hive_tables.sql
printf "\n\n\n"
echo "Drop tables completed.g/"
printf "\n\n\n"

echo "sqoop transfers have just started."
printf "\n\n\n"

echo "table application_test transfer have just started."
# clean tmp directory
hdfs dfs -rm -R -skipTrash /tmp/application_test
sqoop import --connect jdbc:postgresql://localhost/homecredit  \
--driver org.postgresql.Driver \
--username train --password-file file://${HOME}/sqoop.password \
--query "select * from application_test WHERE \$CONDITIONS" \
--m 4 --split-by sk_id_curr \
--hive-import --create-hive-table  --hive-table homecredit.application_test \
--target-dir /tmp/application_test

echo "table application_train transfer have just started."
# clean tmp directory
hdfs dfs -rm -R -skipTrash /tmp/application_train
sqoop import --connect jdbc:postgresql://localhost/homecredit  \
--driver org.postgresql.Driver \
--username train --password-file file://${HOME}/sqoop.password \
--query "select * from application_train WHERE \$CONDITIONS" \
--m 4 --split-by sk_id_curr \
--hive-import --create-hive-table  --hive-table homecredit.application_train \
--target-dir /tmp/application_train
printf "\n\n\n"


echo "table bureau transfer have just started."
# clean tmp directory
hdfs dfs -rm -R -skipTrash /tmp/bureau
rm -rf /opt/manual/hadoop/logs/userlogs/*
sqoop import --connect jdbc:postgresql://localhost/homecredit  \
--driver org.postgresql.Driver \
--username train --password-file file://${HOME}/sqoop.password \
--query "select * from bureau WHERE \$CONDITIONS" \
--m 4 --split-by sk_id_bureau \
--hive-import --create-hive-table  --hive-table homecredit.bureau \
--target-dir /tmp/bureau
printf "\n\n\n"


echo "table bureau_balance transfer have just started."
# clean tmp directory
hdfs dfs -rm -R -skipTrash /tmp/bureau_balance
sqoop import --connect jdbc:postgresql://localhost/homecredit  \
--driver org.postgresql.Driver \
--username train --password-file file://${HOME}/sqoop.password \
--query "select * from bureau_balance WHERE \$CONDITIONS" \
--m 4 --split-by id \
--hive-import --create-hive-table  --hive-table homecredit.bureau_balance \
--target-dir /tmp/bureau_balance
printf "\n\n\n"

echo "table credit_card_balance transfer have just started."
# clean tmp directory
hdfs dfs -rm -R -skipTrash /tmp/credit_card_balance
sqoop import --connect jdbc:postgresql://localhost/homecredit  \
--driver org.postgresql.Driver \
--username train --password-file file://${HOME}/sqoop.password \
--query "select * from credit_card_balance WHERE \$CONDITIONS" \
--m 4 --split-by id \
--hive-import --create-hive-table  --hive-table homecredit.credit_card_balance \
--target-dir /tmp/credit_card_balance
printf "\n\n\n"


echo "table installments_payments transfer have just started."
# clean tmp directory
hdfs dfs -rm -R -skipTrash /tmp/installments_payments
sqoop import --connect jdbc:postgresql://localhost/homecredit  \
--driver org.postgresql.Driver \
--username train --password-file file://${HOME}/sqoop.password \
--query "select * from installments_payments WHERE \$CONDITIONS" \
--m 4 --split-by id \
--hive-import --create-hive-table  --hive-table homecredit.installments_payments \
--target-dir /tmp/installments_payments
printf "\n\n\n"


echo "table POS_CASH_balance transfer have just started."
# clean tmp directory
hdfs dfs -rm -R -skipTrash /tmp/POS_CASH_balance
sqoop import --connect jdbc:postgresql://localhost/homecredit  \
--driver org.postgresql.Driver \
--username train --password-file file://${HOME}/sqoop.password \
--query "select * from POS_CASH_balance WHERE \$CONDITIONS" \
--m 4 --split-by id \
--hive-import --create-hive-table  --hive-table homecredit.POS_CASH_balance \
--target-dir /tmp/POS_CASH_balance
printf "\n\n\n"


echo "table previous_application transfer have just started."
# clean tmp directory
hdfs dfs -rm -R -skipTrash /tmp/previous_application
sqoop import --connect jdbc:postgresql://localhost/homecredit  \
--driver org.postgresql.Driver \
--username train --password-file file://${HOME}/sqoop.password \
--query "select * from previous_application WHERE \$CONDITIONS" \
--m 4 --split-by sk_id_prev \
--hive-import --create-hive-table  --hive-table homecredit.previous_application \
--target-dir /tmp/previous_application
printf "\n\n\n"

echo "Making hive tables orc snappy"
beeline -n train -w ${HOME}/sqoop.password -u jdbc:hive2://localhost:10000 \
-f /home/train/advanced_ds_bigdata/01_rdbms_to_hive_with_sqoop/make_hive_tables_orc_snappy.sql
echo "Convertion hive tables to orc snappy has completed."