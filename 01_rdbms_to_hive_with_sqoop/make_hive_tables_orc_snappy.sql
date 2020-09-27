SET hive.exec.compress.output=true;
SET mapred.output.compression.codec=org.apache.hadoop.io.compress.SnappyCodec;
set hive.server2.logging.operation.level=NONE;

CREATE TABLE homecredit.application_test_orc_snappy
STORED AS ORC TBLPROPERTIES('ORC.COMPRESS'='SNAPPY') as
SELECT * FROM homecredit.application_test;
DROP table homecredit.application_test;
ANALYZE TABLE homecredit.application_test_orc_snappy compute statistics;


CREATE TABLE homecredit.application_train_orc_snappy
STORED AS ORC TBLPROPERTIES('ORC.COMPRESS'='SNAPPY') as
SELECT * FROM homecredit.application_train;
DROP table homecredit.application_train;
ANALYZE TABLE homecredit.application_train_orc_snappy compute statistics;


CREATE TABLE homecredit.bureau_orc_snappy
STORED AS ORC TBLPROPERTIES('ORC.COMPRESS'='SNAPPY') as
SELECT * FROM homecredit.bureau;
DROP table homecredit.bureau;
ANALYZE TABLE homecredit.bureau_orc_snappy compute statistics;


CREATE TABLE homecredit.bureau_balance_orc_snappy
STORED AS ORC TBLPROPERTIES('ORC.COMPRESS'='SNAPPY') as
SELECT * FROM homecredit.bureau_balance;
DROP table homecredit.bureau_balance;
ANALYZE TABLE homecredit.bureau_balance_orc_snappy compute statistics;


CREATE TABLE homecredit.credit_card_balance_orc_snappy
STORED AS ORC TBLPROPERTIES('ORC.COMPRESS'='SNAPPY') as
SELECT * FROM homecredit.credit_card_balance;
DROP table homecredit.credit_card_balance;
ANALYZE TABLE homecredit.credit_card_balance_orc_snappy compute statistics;


CREATE TABLE homecredit.installments_payments_orc_snappy 
STORED AS ORC TBLPROPERTIES('ORC.COMPRESS'='SNAPPY') as
SELECT * FROM homecredit.installments_payments;
DROP table homecredit.installments_payments;
ANALYZE TABLE homecredit.installments_payments_orc_snappy compute statistics;

CREATE TABLE homecredit.pos_cash_balance_orc_snappy 
STORED AS ORC TBLPROPERTIES('ORC.COMPRESS'='SNAPPY') as
SELECT * FROM homecredit.pos_cash_balance;
DROP table homecredit.pos_cash_balance;
ANALYZE TABLE homecredit.pos_cash_balance_orc_snappy compute statistics;


CREATE TABLE homecredit.previous_application_orc_snappy 
STORED AS ORC TBLPROPERTIES('ORC.COMPRESS'='SNAPPY') as
SELECT * FROM homecredit.previous_application;
DROP table homecredit.previous_application;
ANALYZE TABLE homecredit.previous_application_orc_snappy compute statistics;
