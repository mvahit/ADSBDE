SET hive.exec.compress.output=true;
SET mapred.output.compression.codec=org.apache.hadoop.io.compress.SnappyCodec;
ALTER table  IF EXISTS homecredit.application_test set fileformat orc;
ALTER table  IF EXISTS homecredit.application_test set TBLPROPERTIES ('orc.compress' = 'SNAPPY');
ALTER table IF EXISTS homecredit.application_test RENAME to homecredit.application_test_orc_snappy;


ALTER table IF EXISTS homecredit.application_train set fileformat orc;
ALTER table IF EXISTS homecredit.application_train set TBLPROPERTIES ('orc.compress' = 'SNAPPY');
ALTER table IF EXISTS homecredit.application_train RENAME to homecredit.application_train_orc_snappy;


ALTER table IF EXISTS homecredit.bureau set fileformat orc;
ALTER table IF EXISTS homecredit.bureau set TBLPROPERTIES ('orc.compress' = 'SNAPPY');
ALTER table IF EXISTS homecredit.bureau RENAME to homecredit.bureau_orc_snappy;


ALTER table IF EXISTS homecredit.bureau_balance set fileformat orc;
ALTER table IF EXISTS homecredit.bureau_balance set TBLPROPERTIES ('orc.compress' = 'SNAPPY');
ALTER table IF EXISTS homecredit.bureau_balance RENAME to homecredit.bureau_balance_orc_snappy;


ALTER table IF EXISTS homecredit.credit_card_balance set fileformat orc;
ALTER table IF EXISTS homecredit.credit_card_balance set TBLPROPERTIES ('orc.compress' = 'SNAPPY');
ALTER table IF EXISTS homecredit.credit_card_balance RENAME to homecredit.credit_card_balance_orc_snappy;


ALTER table IF EXISTS homecredit.installments_payments set fileformat orc;
ALTER table IF EXISTS homecredit.installments_payments set TBLPROPERTIES ('orc.compress' = 'SNAPPY');
ALTER table IF EXISTS homecredit.installments_payments RENAME to homecredit.installments_payments_orc_snappy;


ALTER table IF EXISTS homecredit.POS_CASH_balance set fileformat orc;
ALTER table IF EXISTS homecredit.POS_CASH_balance set TBLPROPERTIES ('orc.compress' = 'SNAPPY');
ALTER table IF EXISTS homecredit.POS_CASH_balance RENAME to homecredit.POS_CASH_balance_orc_snappy;


ALTER table IF EXISTS homecredit.previous_application set fileformat orc;
ALTER table IF EXISTS homecredit.previous_application set TBLPROPERTIES ('orc.compress' = 'SNAPPY');
ALTER table IF EXISTS homecredit.previous_application RENAME to homecredit.previous_application_orc_snappy;
