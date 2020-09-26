create database if not exists homecredit;
create table if not exists homecredit.bureau_orc_snappy (
SK_ID_CURR int,
SK_ID_BUREAU int,
CREDIT_ACTIVE string,
CREDIT_CURRENCY string,
DAYS_CREDIT int,
CREDIT_DAY_OVERDUE int,
DAYS_CREDIT_ENDDATE float,
DAYS_ENDDATE_FACT float,
AMT_CREDIT_MAX_OVERDUE float,
CNT_CREDIT_PROLONG int,
AMT_CREDIT_SUM  float,
AMT_CREDIT_SUM_DEBT float,
AMT_CREDIT_SUM_LIMIT float,
AMT_CREDIT_SUM_OVERDUE float,
CREDIT_TYPE string,
DAYS_CREDIT_UPDATE int,
AMT_ANNUITY  float
) row format delimited 
fields terminated by ',' 
collection items terminated by ':' 
lines terminated by '\n' 
stored as orc 
TBLPROPERTIES ("orc.compress"="SNAPPY");
-- "table homecredit.bureau created."
truncate table homecredit.bureau_orc_snappy;
-- "table homecredit.bureau truncated."
create table if not exists homecredit.bureau_balance_orc_snappy (
SK_ID_BUREAU      int,
MONTHS_BALANCE    int,
STATUS            CHAR(1)
);
-- "table homecredit.bureau_balance created."
truncate table homecredit.bureau_balance_orc_snappy;
-- "table homecredit.bureau_balance truncated."
create table if not exists homecredit.credit_card_balance_orc_snappy (
SK_ID_PREV                    int,
SK_ID_CURR                    int,
MONTHS_BALANCE                int,
AMT_BALANCE                   float,
AMT_CREDIT_LIMIT_ACTUAL       int,
AMT_DRAWINGS_ATM_CURRENT      float,
AMT_DRAWINGS_CURRENT          float,
AMT_DRAWINGS_OTHER_CURRENT    float,
AMT_DRAWINGS_POS_CURRENT      float,
AMT_INST_MIN_REGULARITY       float,
AMT_PAYMENT_CURRENT           float,
AMT_PAYMENT_TOTAL_CURRENT     float,
AMT_RECEIVABLE_PRINCIPAL      float,
AMT_RECIVABLE                 float,
AMT_TOTAL_RECEIVABLE          float,
CNT_DRAWINGS_ATM_CURRENT      float,
CNT_DRAWINGS_CURRENT          int,
CNT_DRAWINGS_OTHER_CURRENT    float,
CNT_DRAWINGS_POS_CURRENT      float,
CNT_INSTALMENT_MATURE_CUM     float,
NAME_CONTRACT_STATUS          string,
SK_DPD                        int,
SK_DPD_DEF                    int
) row format delimited 
fields terminated by ',' 
collection items terminated by ':' 
lines terminated by '\n' 
stored as orc 
TBLPROPERTIES ("orc.compress"="SNAPPY");
truncate table homecredit.credit_card_balance_orc_snappy;
create table if not exists homecredit.installments_payments_orc_snappy(
SK_ID_PREV                int,
SK_ID_CURR                int,
NUM_INSTALMENT_VERSION    float,
NUM_INSTALMENT_NUMBER     int,
DAYS_INSTALMENT           float,
DAYS_ENTRY_PAYMENT        float,
AMT_INSTALMENT            float,
AMT_PAYMENT               float
) row format delimited 
fields terminated by ',' 
collection items terminated by ':' 
lines terminated by '\n' 
stored as orc 
TBLPROPERTIES ("orc.compress"="SNAPPY");
truncate table homecredit.installments_payments_orc_snappy;
create table if not exists homecredit.POS_CASH_balance_orc_snappy (
SK_ID_PREV               int,
SK_ID_CURR               int,
MONTHS_BALANCE           int,
CNT_INSTALMENT           float,
CNT_INSTALMENT_FUTURE    float,
NAME_CONTRACT_STATUS     string,
SK_DPD                   int,
SK_DPD_DEF               int
) row format delimited 
fields terminated by ',' 
collection items terminated by ':' 
lines terminated by '\n' 
stored as orc 
TBLPROPERTIES ("orc.compress"="SNAPPY");
truncate table homecredit.POS_CASH_balance_orc_snappy;
create table if not exists homecredit.previous_application_orc_snappy (
SK_ID_PREV                      int,
SK_ID_CURR                      int,
NAME_CONTRACT_TYPE              string,
AMT_ANNUITY                     float,
AMT_APPLICATION                 float,
AMT_CREDIT                      float,
AMT_DOWN_PAYMENT               float,
AMT_GOODS_PRICE                 float,
WEEKDAY_APPR_PROCESS_START      string,
HOUR_APPR_PROCESS_START         int,
FLAG_LAST_APPL_PER_CONTRACT     string,
NFLAG_LAST_APPL_IN_DAY          int,
RATE_DOWN_PAYMENT              float,
RATE_INTEREST_PRIMARY          float,
RATE_INTEREST_PRIVILEGED       float,
NAME_CASH_LOAN_PURPOSE          string,
NAME_CONTRACT_STATUS            string,
DAYS_DECISION                   int,
NAME_PAYMENT_TYPE               string,
CODE_REJECT_REASON              string,
NAME_TYPE_SUITE                string,
NAME_CLIENT_TYPE                string,
NAME_GOODS_CATEGORY             string,
NAME_PORTFOLIO                  string,
NAME_PRODUCT_TYPE               string,
CHANNEL_TYPE                    string,
SELLERPLACE_AREA                int,
NAME_SELLER_INDUSTRY            string,
CNT_PAYMENT                     float,
NAME_YIELD_GROUP                string,
PRODUCT_COMBINATION             string,
DAYS_FIRST_DRAWING             float,
DAYS_FIRST_DUE                 float,
DAYS_LAST_DUE_1ST_VERSION      float,
DAYS_LAST_DUE                  float,
DAYS_TERMINATION               float,
NFLAG_INSURED_ON_APPROVAL      float
) row format delimited 
fields terminated by ',' 
collection items terminated by ':' 
lines terminated by '\n' 
stored as orc 
TBLPROPERTIES ("orc.compress"="SNAPPY");
truncate table homecredit.previous_application_orc_snappy;
create table if not exists homecredit.application_train_orc_snappy (
SK_ID_CURR int,
TARGET int,
NAME_CONTRACT_TYPE string,
CODE_GENDER string,
FLAG_OWN_CAR string,
FLAG_OWN_REALTY string,
CNT_CHILDREN int,
AMT_INCOME_TOTAL float,
AMT_CREDIT float,
AMT_ANNUITY float,
AMT_GOODS_PRICE float,
NAME_TYPE_SUITE string,
NAME_INCOME_TYPE string,
NAME_EDUCATION_TYPE string,
NAME_FAMILY_STATUS string,
NAME_HOUSING_TYPE string,
REGION_POPULATION_RELATIVE float,
DAYS_BIRTH int,
DAYS_EMPLOYED int,
DAYS_REGISTRATION float,
DAYS_ID_PUBLISH int,
OWN_CAR_AGE float,
FLAG_MOBIL int,
FLAG_EMP_PHONE int,
FLAG_WORK_PHONE int,
FLAG_CONT_MOBILE int,
FLAG_PHONE int,
FLAG_EMAIL int,
OCCUPATION_TYPE string,
CNT_FAM_MEMBERS float,
REGION_RATING_CLIENT int,
REGION_RATING_CLIENT_W_CITY int,
WEEKDAY_APPR_PROCESS_START string,
HOUR_APPR_PROCESS_START int,
REG_REGION_NOT_LIVE_REGION int,
REG_REGION_NOT_WORK_REGION int,
LIVE_REGION_NOT_WORK_REGION int,
REG_CITY_NOT_LIVE_CITY int,
REG_CITY_NOT_WORK_CITY int,
LIVE_CITY_NOT_WORK_CITY int,
ORGANIZATION_TYPE string,
EXT_SOURCE_1 float,
EXT_SOURCE_2 float,
EXT_SOURCE_3 float,
APARTMENTS_AVG float,
BASEMENTAREA_AVG float,
YEARS_BEGINEXPLUATATION_AVG float,
YEARS_BUILD_AVG float,
COMMONAREA_AVG float,
ELEVATORS_AVG float,
ENTRANCES_AVG float,
FLOORSMAX_AVG float,
FLOORSMIN_AVG float,
LANDAREA_AVG float,
LIVINGAPARTMENTS_AVG float,
LIVINGAREA_AVG float,
NONLIVINGAPARTMENTS_AVG float,
NONLIVINGAREA_AVG float,
APARTMENTS_MODE float,
BASEMENTAREA_MODE float,
YEARS_BEGINEXPLUATATION_MODE float,
YEARS_BUILD_MODE float,
COMMONAREA_MODE float,
ELEVATORS_MODE float,
ENTRANCES_MODE float,
FLOORSMAX_MODE float,
FLOORSMIN_MODE float,
LANDAREA_MODE float,
LIVINGAPARTMENTS_MODE float,
LIVINGAREA_MODE float,
NONLIVINGAPARTMENTS_MODE float,
NONLIVINGAREA_MODE float,
APARTMENTS_MEDI float,
BASEMENTAREA_MEDI float,
YEARS_BEGINEXPLUATATION_MEDI float,
YEARS_BUILD_MEDI float,
COMMONAREA_MEDI float,
ELEVATORS_MEDI float,
ENTRANCES_MEDI float,
FLOORSMAX_MEDI float,
FLOORSMIN_MEDI float,
LANDAREA_MEDI float,
LIVINGAPARTMENTS_MEDI float,
LIVINGAREA_MEDI float,
NONLIVINGAPARTMENTS_MEDI float,
NONLIVINGAREA_MEDI float,
FONDKAPREMONT_MODE string,
HOUSETYPE_MODE string,
TOTALAREA_MODE float,
WALLSMATERIAL_MODE string,
EMERGENCYSTATE_MODE string,
OBS_30_CNT_SOCIAL_CIRCLE float,
DEF_30_CNT_SOCIAL_CIRCLE float,
OBS_60_CNT_SOCIAL_CIRCLE float,
DEF_60_CNT_SOCIAL_CIRCLE float,
DAYS_LAST_PHONE_CHANGE float,
FLAG_DOCUMENT_2 int,
FLAG_DOCUMENT_3 int,
FLAG_DOCUMENT_4 int,
FLAG_DOCUMENT_5 int,
FLAG_DOCUMENT_6 int,
FLAG_DOCUMENT_7 int,
FLAG_DOCUMENT_8 int,
FLAG_DOCUMENT_9 int,
FLAG_DOCUMENT_10 int,
FLAG_DOCUMENT_11 int,
FLAG_DOCUMENT_12 int,
FLAG_DOCUMENT_13 int,
FLAG_DOCUMENT_14 int,
FLAG_DOCUMENT_15 int,
FLAG_DOCUMENT_16 int,
FLAG_DOCUMENT_17 int,
FLAG_DOCUMENT_18 int,
FLAG_DOCUMENT_19 int,
FLAG_DOCUMENT_20 int,
FLAG_DOCUMENT_21 int,
AMT_REQ_CREDIT_BUREAU_HOUR float,
AMT_REQ_CREDIT_BUREAU_DAY float,
AMT_REQ_CREDIT_BUREAU_WEEK float,
AMT_REQ_CREDIT_BUREAU_MON float,
AMT_REQ_CREDIT_BUREAU_QRT float,
AMT_REQ_CREDIT_BUREAU_YEAR float
) row format delimited 
fields terminated by ',' 
collection items terminated by ':' 
lines terminated by '\n' 
stored as orc 
TBLPROPERTIES ("orc.compress"="SNAPPY");
truncate table homecredit.application_train_orc_snappy;
create table if not exists homecredit.application_test_orc_snappy (
SK_ID_CURR int,
NAME_CONTRACT_TYPE string,
CODE_GENDER string,
FLAG_OWN_CAR string,
FLAG_OWN_REALTY string,
CNT_CHILDREN int,
AMT_INCOME_TOTAL float,
AMT_CREDIT float,
AMT_ANNUITY float,
AMT_GOODS_PRICE float,
NAME_TYPE_SUITE string,
NAME_INCOME_TYPE string,
NAME_EDUCATION_TYPE string,
NAME_FAMILY_STATUS string,
NAME_HOUSING_TYPE string,
REGION_POPULATION_RELATIVE float,
DAYS_BIRTH int,
DAYS_EMPLOYED int,
DAYS_REGISTRATION float,
DAYS_ID_PUBLISH int,
OWN_CAR_AGE float,
FLAG_MOBIL int,
FLAG_EMP_PHONE int,
FLAG_WORK_PHONE int,
FLAG_CONT_MOBILE int,
FLAG_PHONE int,
FLAG_EMAIL int,
OCCUPATION_TYPE string,
CNT_FAM_MEMBERS float,
REGION_RATING_CLIENT int,
REGION_RATING_CLIENT_W_CITY int,
WEEKDAY_APPR_PROCESS_START string,
HOUR_APPR_PROCESS_START int,
REG_REGION_NOT_LIVE_REGION int,
REG_REGION_NOT_WORK_REGION int,
LIVE_REGION_NOT_WORK_REGION int,
REG_CITY_NOT_LIVE_CITY int,
REG_CITY_NOT_WORK_CITY int,
LIVE_CITY_NOT_WORK_CITY int,
ORGANIZATION_TYPE string,
EXT_SOURCE_1 float,
EXT_SOURCE_2 float,
EXT_SOURCE_3 float,
APARTMENTS_AVG float,
BASEMENTAREA_AVG float,
YEARS_BEGINEXPLUATATION_AVG float,
YEARS_BUILD_AVG float,
COMMONAREA_AVG float,
ELEVATORS_AVG float,
ENTRANCES_AVG float,
FLOORSMAX_AVG float,
FLOORSMIN_AVG float,
LANDAREA_AVG float,
LIVINGAPARTMENTS_AVG float,
LIVINGAREA_AVG float,
NONLIVINGAPARTMENTS_AVG float,
NONLIVINGAREA_AVG float,
APARTMENTS_MODE float,
BASEMENTAREA_MODE float,
YEARS_BEGINEXPLUATATION_MODE float,
YEARS_BUILD_MODE float,
COMMONAREA_MODE float,
ELEVATORS_MODE float,
ENTRANCES_MODE float,
FLOORSMAX_MODE float,
FLOORSMIN_MODE float,
LANDAREA_MODE float,
LIVINGAPARTMENTS_MODE float,
LIVINGAREA_MODE float,
NONLIVINGAPARTMENTS_MODE float,
NONLIVINGAREA_MODE float,
APARTMENTS_MEDI float,
BASEMENTAREA_MEDI float,
YEARS_BEGINEXPLUATATION_MEDI float,
YEARS_BUILD_MEDI float,
COMMONAREA_MEDI float,
ELEVATORS_MEDI float,
ENTRANCES_MEDI float,
FLOORSMAX_MEDI float,
FLOORSMIN_MEDI float,
LANDAREA_MEDI float,
LIVINGAPARTMENTS_MEDI float,
LIVINGAREA_MEDI float,
NONLIVINGAPARTMENTS_MEDI float,
NONLIVINGAREA_MEDI float,
FONDKAPREMONT_MODE string,
HOUSETYPE_MODE string,
TOTALAREA_MODE float,
WALLSMATERIAL_MODE string,
EMERGENCYSTATE_MODE string,
OBS_30_CNT_SOCIAL_CIRCLE float,
DEF_30_CNT_SOCIAL_CIRCLE float,
OBS_60_CNT_SOCIAL_CIRCLE float,
DEF_60_CNT_SOCIAL_CIRCLE float,
DAYS_LAST_PHONE_CHANGE float,
FLAG_DOCUMENT_2 int,
FLAG_DOCUMENT_3 int,
FLAG_DOCUMENT_4 int,
FLAG_DOCUMENT_5 int,
FLAG_DOCUMENT_6 int,
FLAG_DOCUMENT_7 int,
FLAG_DOCUMENT_8 int,
FLAG_DOCUMENT_9 int,
FLAG_DOCUMENT_10 int,
FLAG_DOCUMENT_11 int,
FLAG_DOCUMENT_12 int,
FLAG_DOCUMENT_13 int,
FLAG_DOCUMENT_14 int,
FLAG_DOCUMENT_15 int,
FLAG_DOCUMENT_16 int,
FLAG_DOCUMENT_17 int,
FLAG_DOCUMENT_18 int,
FLAG_DOCUMENT_19 int,
FLAG_DOCUMENT_20 int,
FLAG_DOCUMENT_21 int,
AMT_REQ_CREDIT_BUREAU_HOUR float,
AMT_REQ_CREDIT_BUREAU_DAY float,
AMT_REQ_CREDIT_BUREAU_WEEK float,
AMT_REQ_CREDIT_BUREAU_MON float,
AMT_REQ_CREDIT_BUREAU_QRT float,
AMT_REQ_CREDIT_BUREAU_YEAR float
) row format delimited 
fields terminated by ',' 
collection items terminated by ':' 
lines terminated by '\n' 
stored as orc 
TBLPROPERTIES ("orc.compress"="SNAPPY");
truncate table homecredit.application_test_orc_snappy;












