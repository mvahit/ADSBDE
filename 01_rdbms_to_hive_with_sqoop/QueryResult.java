// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Sep 26 23:04:36 TRT 2020
// For connector: org.apache.sqoop.manager.GenericJdbcManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer sk_id_curr;
  public Integer get_sk_id_curr() {
    return sk_id_curr;
  }
  public void set_sk_id_curr(Integer sk_id_curr) {
    this.sk_id_curr = sk_id_curr;
  }
  public QueryResult with_sk_id_curr(Integer sk_id_curr) {
    this.sk_id_curr = sk_id_curr;
    return this;
  }
  private String name_contract_type;
  public String get_name_contract_type() {
    return name_contract_type;
  }
  public void set_name_contract_type(String name_contract_type) {
    this.name_contract_type = name_contract_type;
  }
  public QueryResult with_name_contract_type(String name_contract_type) {
    this.name_contract_type = name_contract_type;
    return this;
  }
  private String code_gender;
  public String get_code_gender() {
    return code_gender;
  }
  public void set_code_gender(String code_gender) {
    this.code_gender = code_gender;
  }
  public QueryResult with_code_gender(String code_gender) {
    this.code_gender = code_gender;
    return this;
  }
  private String flag_own_car;
  public String get_flag_own_car() {
    return flag_own_car;
  }
  public void set_flag_own_car(String flag_own_car) {
    this.flag_own_car = flag_own_car;
  }
  public QueryResult with_flag_own_car(String flag_own_car) {
    this.flag_own_car = flag_own_car;
    return this;
  }
  private String flag_own_realty;
  public String get_flag_own_realty() {
    return flag_own_realty;
  }
  public void set_flag_own_realty(String flag_own_realty) {
    this.flag_own_realty = flag_own_realty;
  }
  public QueryResult with_flag_own_realty(String flag_own_realty) {
    this.flag_own_realty = flag_own_realty;
    return this;
  }
  private Integer cnt_children;
  public Integer get_cnt_children() {
    return cnt_children;
  }
  public void set_cnt_children(Integer cnt_children) {
    this.cnt_children = cnt_children;
  }
  public QueryResult with_cnt_children(Integer cnt_children) {
    this.cnt_children = cnt_children;
    return this;
  }
  private Double amt_income_total;
  public Double get_amt_income_total() {
    return amt_income_total;
  }
  public void set_amt_income_total(Double amt_income_total) {
    this.amt_income_total = amt_income_total;
  }
  public QueryResult with_amt_income_total(Double amt_income_total) {
    this.amt_income_total = amt_income_total;
    return this;
  }
  private Double amt_credit;
  public Double get_amt_credit() {
    return amt_credit;
  }
  public void set_amt_credit(Double amt_credit) {
    this.amt_credit = amt_credit;
  }
  public QueryResult with_amt_credit(Double amt_credit) {
    this.amt_credit = amt_credit;
    return this;
  }
  private Double amt_annuity;
  public Double get_amt_annuity() {
    return amt_annuity;
  }
  public void set_amt_annuity(Double amt_annuity) {
    this.amt_annuity = amt_annuity;
  }
  public QueryResult with_amt_annuity(Double amt_annuity) {
    this.amt_annuity = amt_annuity;
    return this;
  }
  private Double amt_goods_price;
  public Double get_amt_goods_price() {
    return amt_goods_price;
  }
  public void set_amt_goods_price(Double amt_goods_price) {
    this.amt_goods_price = amt_goods_price;
  }
  public QueryResult with_amt_goods_price(Double amt_goods_price) {
    this.amt_goods_price = amt_goods_price;
    return this;
  }
  private String name_type_suite;
  public String get_name_type_suite() {
    return name_type_suite;
  }
  public void set_name_type_suite(String name_type_suite) {
    this.name_type_suite = name_type_suite;
  }
  public QueryResult with_name_type_suite(String name_type_suite) {
    this.name_type_suite = name_type_suite;
    return this;
  }
  private String name_income_type;
  public String get_name_income_type() {
    return name_income_type;
  }
  public void set_name_income_type(String name_income_type) {
    this.name_income_type = name_income_type;
  }
  public QueryResult with_name_income_type(String name_income_type) {
    this.name_income_type = name_income_type;
    return this;
  }
  private String name_education_type;
  public String get_name_education_type() {
    return name_education_type;
  }
  public void set_name_education_type(String name_education_type) {
    this.name_education_type = name_education_type;
  }
  public QueryResult with_name_education_type(String name_education_type) {
    this.name_education_type = name_education_type;
    return this;
  }
  private String name_family_status;
  public String get_name_family_status() {
    return name_family_status;
  }
  public void set_name_family_status(String name_family_status) {
    this.name_family_status = name_family_status;
  }
  public QueryResult with_name_family_status(String name_family_status) {
    this.name_family_status = name_family_status;
    return this;
  }
  private String name_housing_type;
  public String get_name_housing_type() {
    return name_housing_type;
  }
  public void set_name_housing_type(String name_housing_type) {
    this.name_housing_type = name_housing_type;
  }
  public QueryResult with_name_housing_type(String name_housing_type) {
    this.name_housing_type = name_housing_type;
    return this;
  }
  private Double region_population_relative;
  public Double get_region_population_relative() {
    return region_population_relative;
  }
  public void set_region_population_relative(Double region_population_relative) {
    this.region_population_relative = region_population_relative;
  }
  public QueryResult with_region_population_relative(Double region_population_relative) {
    this.region_population_relative = region_population_relative;
    return this;
  }
  private Integer days_birth;
  public Integer get_days_birth() {
    return days_birth;
  }
  public void set_days_birth(Integer days_birth) {
    this.days_birth = days_birth;
  }
  public QueryResult with_days_birth(Integer days_birth) {
    this.days_birth = days_birth;
    return this;
  }
  private Integer days_employed;
  public Integer get_days_employed() {
    return days_employed;
  }
  public void set_days_employed(Integer days_employed) {
    this.days_employed = days_employed;
  }
  public QueryResult with_days_employed(Integer days_employed) {
    this.days_employed = days_employed;
    return this;
  }
  private Double days_registration;
  public Double get_days_registration() {
    return days_registration;
  }
  public void set_days_registration(Double days_registration) {
    this.days_registration = days_registration;
  }
  public QueryResult with_days_registration(Double days_registration) {
    this.days_registration = days_registration;
    return this;
  }
  private Integer days_id_publish;
  public Integer get_days_id_publish() {
    return days_id_publish;
  }
  public void set_days_id_publish(Integer days_id_publish) {
    this.days_id_publish = days_id_publish;
  }
  public QueryResult with_days_id_publish(Integer days_id_publish) {
    this.days_id_publish = days_id_publish;
    return this;
  }
  private Double own_car_age;
  public Double get_own_car_age() {
    return own_car_age;
  }
  public void set_own_car_age(Double own_car_age) {
    this.own_car_age = own_car_age;
  }
  public QueryResult with_own_car_age(Double own_car_age) {
    this.own_car_age = own_car_age;
    return this;
  }
  private Integer flag_mobil;
  public Integer get_flag_mobil() {
    return flag_mobil;
  }
  public void set_flag_mobil(Integer flag_mobil) {
    this.flag_mobil = flag_mobil;
  }
  public QueryResult with_flag_mobil(Integer flag_mobil) {
    this.flag_mobil = flag_mobil;
    return this;
  }
  private Integer flag_emp_phone;
  public Integer get_flag_emp_phone() {
    return flag_emp_phone;
  }
  public void set_flag_emp_phone(Integer flag_emp_phone) {
    this.flag_emp_phone = flag_emp_phone;
  }
  public QueryResult with_flag_emp_phone(Integer flag_emp_phone) {
    this.flag_emp_phone = flag_emp_phone;
    return this;
  }
  private Integer flag_work_phone;
  public Integer get_flag_work_phone() {
    return flag_work_phone;
  }
  public void set_flag_work_phone(Integer flag_work_phone) {
    this.flag_work_phone = flag_work_phone;
  }
  public QueryResult with_flag_work_phone(Integer flag_work_phone) {
    this.flag_work_phone = flag_work_phone;
    return this;
  }
  private Integer flag_cont_mobile;
  public Integer get_flag_cont_mobile() {
    return flag_cont_mobile;
  }
  public void set_flag_cont_mobile(Integer flag_cont_mobile) {
    this.flag_cont_mobile = flag_cont_mobile;
  }
  public QueryResult with_flag_cont_mobile(Integer flag_cont_mobile) {
    this.flag_cont_mobile = flag_cont_mobile;
    return this;
  }
  private Integer flag_phone;
  public Integer get_flag_phone() {
    return flag_phone;
  }
  public void set_flag_phone(Integer flag_phone) {
    this.flag_phone = flag_phone;
  }
  public QueryResult with_flag_phone(Integer flag_phone) {
    this.flag_phone = flag_phone;
    return this;
  }
  private Integer flag_email;
  public Integer get_flag_email() {
    return flag_email;
  }
  public void set_flag_email(Integer flag_email) {
    this.flag_email = flag_email;
  }
  public QueryResult with_flag_email(Integer flag_email) {
    this.flag_email = flag_email;
    return this;
  }
  private String occupation_type;
  public String get_occupation_type() {
    return occupation_type;
  }
  public void set_occupation_type(String occupation_type) {
    this.occupation_type = occupation_type;
  }
  public QueryResult with_occupation_type(String occupation_type) {
    this.occupation_type = occupation_type;
    return this;
  }
  private Double cnt_fam_members;
  public Double get_cnt_fam_members() {
    return cnt_fam_members;
  }
  public void set_cnt_fam_members(Double cnt_fam_members) {
    this.cnt_fam_members = cnt_fam_members;
  }
  public QueryResult with_cnt_fam_members(Double cnt_fam_members) {
    this.cnt_fam_members = cnt_fam_members;
    return this;
  }
  private Integer region_rating_client;
  public Integer get_region_rating_client() {
    return region_rating_client;
  }
  public void set_region_rating_client(Integer region_rating_client) {
    this.region_rating_client = region_rating_client;
  }
  public QueryResult with_region_rating_client(Integer region_rating_client) {
    this.region_rating_client = region_rating_client;
    return this;
  }
  private Integer region_rating_client_w_city;
  public Integer get_region_rating_client_w_city() {
    return region_rating_client_w_city;
  }
  public void set_region_rating_client_w_city(Integer region_rating_client_w_city) {
    this.region_rating_client_w_city = region_rating_client_w_city;
  }
  public QueryResult with_region_rating_client_w_city(Integer region_rating_client_w_city) {
    this.region_rating_client_w_city = region_rating_client_w_city;
    return this;
  }
  private String weekday_appr_process_start;
  public String get_weekday_appr_process_start() {
    return weekday_appr_process_start;
  }
  public void set_weekday_appr_process_start(String weekday_appr_process_start) {
    this.weekday_appr_process_start = weekday_appr_process_start;
  }
  public QueryResult with_weekday_appr_process_start(String weekday_appr_process_start) {
    this.weekday_appr_process_start = weekday_appr_process_start;
    return this;
  }
  private Integer hour_appr_process_start;
  public Integer get_hour_appr_process_start() {
    return hour_appr_process_start;
  }
  public void set_hour_appr_process_start(Integer hour_appr_process_start) {
    this.hour_appr_process_start = hour_appr_process_start;
  }
  public QueryResult with_hour_appr_process_start(Integer hour_appr_process_start) {
    this.hour_appr_process_start = hour_appr_process_start;
    return this;
  }
  private Integer reg_region_not_live_region;
  public Integer get_reg_region_not_live_region() {
    return reg_region_not_live_region;
  }
  public void set_reg_region_not_live_region(Integer reg_region_not_live_region) {
    this.reg_region_not_live_region = reg_region_not_live_region;
  }
  public QueryResult with_reg_region_not_live_region(Integer reg_region_not_live_region) {
    this.reg_region_not_live_region = reg_region_not_live_region;
    return this;
  }
  private Integer reg_region_not_work_region;
  public Integer get_reg_region_not_work_region() {
    return reg_region_not_work_region;
  }
  public void set_reg_region_not_work_region(Integer reg_region_not_work_region) {
    this.reg_region_not_work_region = reg_region_not_work_region;
  }
  public QueryResult with_reg_region_not_work_region(Integer reg_region_not_work_region) {
    this.reg_region_not_work_region = reg_region_not_work_region;
    return this;
  }
  private Integer live_region_not_work_region;
  public Integer get_live_region_not_work_region() {
    return live_region_not_work_region;
  }
  public void set_live_region_not_work_region(Integer live_region_not_work_region) {
    this.live_region_not_work_region = live_region_not_work_region;
  }
  public QueryResult with_live_region_not_work_region(Integer live_region_not_work_region) {
    this.live_region_not_work_region = live_region_not_work_region;
    return this;
  }
  private Integer reg_city_not_live_city;
  public Integer get_reg_city_not_live_city() {
    return reg_city_not_live_city;
  }
  public void set_reg_city_not_live_city(Integer reg_city_not_live_city) {
    this.reg_city_not_live_city = reg_city_not_live_city;
  }
  public QueryResult with_reg_city_not_live_city(Integer reg_city_not_live_city) {
    this.reg_city_not_live_city = reg_city_not_live_city;
    return this;
  }
  private Integer reg_city_not_work_city;
  public Integer get_reg_city_not_work_city() {
    return reg_city_not_work_city;
  }
  public void set_reg_city_not_work_city(Integer reg_city_not_work_city) {
    this.reg_city_not_work_city = reg_city_not_work_city;
  }
  public QueryResult with_reg_city_not_work_city(Integer reg_city_not_work_city) {
    this.reg_city_not_work_city = reg_city_not_work_city;
    return this;
  }
  private Integer live_city_not_work_city;
  public Integer get_live_city_not_work_city() {
    return live_city_not_work_city;
  }
  public void set_live_city_not_work_city(Integer live_city_not_work_city) {
    this.live_city_not_work_city = live_city_not_work_city;
  }
  public QueryResult with_live_city_not_work_city(Integer live_city_not_work_city) {
    this.live_city_not_work_city = live_city_not_work_city;
    return this;
  }
  private String organization_type;
  public String get_organization_type() {
    return organization_type;
  }
  public void set_organization_type(String organization_type) {
    this.organization_type = organization_type;
  }
  public QueryResult with_organization_type(String organization_type) {
    this.organization_type = organization_type;
    return this;
  }
  private Double ext_source_1;
  public Double get_ext_source_1() {
    return ext_source_1;
  }
  public void set_ext_source_1(Double ext_source_1) {
    this.ext_source_1 = ext_source_1;
  }
  public QueryResult with_ext_source_1(Double ext_source_1) {
    this.ext_source_1 = ext_source_1;
    return this;
  }
  private Double ext_source_2;
  public Double get_ext_source_2() {
    return ext_source_2;
  }
  public void set_ext_source_2(Double ext_source_2) {
    this.ext_source_2 = ext_source_2;
  }
  public QueryResult with_ext_source_2(Double ext_source_2) {
    this.ext_source_2 = ext_source_2;
    return this;
  }
  private Double ext_source_3;
  public Double get_ext_source_3() {
    return ext_source_3;
  }
  public void set_ext_source_3(Double ext_source_3) {
    this.ext_source_3 = ext_source_3;
  }
  public QueryResult with_ext_source_3(Double ext_source_3) {
    this.ext_source_3 = ext_source_3;
    return this;
  }
  private Double apartments_avg;
  public Double get_apartments_avg() {
    return apartments_avg;
  }
  public void set_apartments_avg(Double apartments_avg) {
    this.apartments_avg = apartments_avg;
  }
  public QueryResult with_apartments_avg(Double apartments_avg) {
    this.apartments_avg = apartments_avg;
    return this;
  }
  private Double basementarea_avg;
  public Double get_basementarea_avg() {
    return basementarea_avg;
  }
  public void set_basementarea_avg(Double basementarea_avg) {
    this.basementarea_avg = basementarea_avg;
  }
  public QueryResult with_basementarea_avg(Double basementarea_avg) {
    this.basementarea_avg = basementarea_avg;
    return this;
  }
  private Double years_beginexpluatation_avg;
  public Double get_years_beginexpluatation_avg() {
    return years_beginexpluatation_avg;
  }
  public void set_years_beginexpluatation_avg(Double years_beginexpluatation_avg) {
    this.years_beginexpluatation_avg = years_beginexpluatation_avg;
  }
  public QueryResult with_years_beginexpluatation_avg(Double years_beginexpluatation_avg) {
    this.years_beginexpluatation_avg = years_beginexpluatation_avg;
    return this;
  }
  private Double years_build_avg;
  public Double get_years_build_avg() {
    return years_build_avg;
  }
  public void set_years_build_avg(Double years_build_avg) {
    this.years_build_avg = years_build_avg;
  }
  public QueryResult with_years_build_avg(Double years_build_avg) {
    this.years_build_avg = years_build_avg;
    return this;
  }
  private Double commonarea_avg;
  public Double get_commonarea_avg() {
    return commonarea_avg;
  }
  public void set_commonarea_avg(Double commonarea_avg) {
    this.commonarea_avg = commonarea_avg;
  }
  public QueryResult with_commonarea_avg(Double commonarea_avg) {
    this.commonarea_avg = commonarea_avg;
    return this;
  }
  private Double elevators_avg;
  public Double get_elevators_avg() {
    return elevators_avg;
  }
  public void set_elevators_avg(Double elevators_avg) {
    this.elevators_avg = elevators_avg;
  }
  public QueryResult with_elevators_avg(Double elevators_avg) {
    this.elevators_avg = elevators_avg;
    return this;
  }
  private Double entrances_avg;
  public Double get_entrances_avg() {
    return entrances_avg;
  }
  public void set_entrances_avg(Double entrances_avg) {
    this.entrances_avg = entrances_avg;
  }
  public QueryResult with_entrances_avg(Double entrances_avg) {
    this.entrances_avg = entrances_avg;
    return this;
  }
  private Double floorsmax_avg;
  public Double get_floorsmax_avg() {
    return floorsmax_avg;
  }
  public void set_floorsmax_avg(Double floorsmax_avg) {
    this.floorsmax_avg = floorsmax_avg;
  }
  public QueryResult with_floorsmax_avg(Double floorsmax_avg) {
    this.floorsmax_avg = floorsmax_avg;
    return this;
  }
  private Double floorsmin_avg;
  public Double get_floorsmin_avg() {
    return floorsmin_avg;
  }
  public void set_floorsmin_avg(Double floorsmin_avg) {
    this.floorsmin_avg = floorsmin_avg;
  }
  public QueryResult with_floorsmin_avg(Double floorsmin_avg) {
    this.floorsmin_avg = floorsmin_avg;
    return this;
  }
  private Double landarea_avg;
  public Double get_landarea_avg() {
    return landarea_avg;
  }
  public void set_landarea_avg(Double landarea_avg) {
    this.landarea_avg = landarea_avg;
  }
  public QueryResult with_landarea_avg(Double landarea_avg) {
    this.landarea_avg = landarea_avg;
    return this;
  }
  private Double livingapartments_avg;
  public Double get_livingapartments_avg() {
    return livingapartments_avg;
  }
  public void set_livingapartments_avg(Double livingapartments_avg) {
    this.livingapartments_avg = livingapartments_avg;
  }
  public QueryResult with_livingapartments_avg(Double livingapartments_avg) {
    this.livingapartments_avg = livingapartments_avg;
    return this;
  }
  private Double livingarea_avg;
  public Double get_livingarea_avg() {
    return livingarea_avg;
  }
  public void set_livingarea_avg(Double livingarea_avg) {
    this.livingarea_avg = livingarea_avg;
  }
  public QueryResult with_livingarea_avg(Double livingarea_avg) {
    this.livingarea_avg = livingarea_avg;
    return this;
  }
  private Double nonlivingapartments_avg;
  public Double get_nonlivingapartments_avg() {
    return nonlivingapartments_avg;
  }
  public void set_nonlivingapartments_avg(Double nonlivingapartments_avg) {
    this.nonlivingapartments_avg = nonlivingapartments_avg;
  }
  public QueryResult with_nonlivingapartments_avg(Double nonlivingapartments_avg) {
    this.nonlivingapartments_avg = nonlivingapartments_avg;
    return this;
  }
  private Double nonlivingarea_avg;
  public Double get_nonlivingarea_avg() {
    return nonlivingarea_avg;
  }
  public void set_nonlivingarea_avg(Double nonlivingarea_avg) {
    this.nonlivingarea_avg = nonlivingarea_avg;
  }
  public QueryResult with_nonlivingarea_avg(Double nonlivingarea_avg) {
    this.nonlivingarea_avg = nonlivingarea_avg;
    return this;
  }
  private Double apartments_mode;
  public Double get_apartments_mode() {
    return apartments_mode;
  }
  public void set_apartments_mode(Double apartments_mode) {
    this.apartments_mode = apartments_mode;
  }
  public QueryResult with_apartments_mode(Double apartments_mode) {
    this.apartments_mode = apartments_mode;
    return this;
  }
  private Double basementarea_mode;
  public Double get_basementarea_mode() {
    return basementarea_mode;
  }
  public void set_basementarea_mode(Double basementarea_mode) {
    this.basementarea_mode = basementarea_mode;
  }
  public QueryResult with_basementarea_mode(Double basementarea_mode) {
    this.basementarea_mode = basementarea_mode;
    return this;
  }
  private Double years_beginexpluatation_mode;
  public Double get_years_beginexpluatation_mode() {
    return years_beginexpluatation_mode;
  }
  public void set_years_beginexpluatation_mode(Double years_beginexpluatation_mode) {
    this.years_beginexpluatation_mode = years_beginexpluatation_mode;
  }
  public QueryResult with_years_beginexpluatation_mode(Double years_beginexpluatation_mode) {
    this.years_beginexpluatation_mode = years_beginexpluatation_mode;
    return this;
  }
  private Double years_build_mode;
  public Double get_years_build_mode() {
    return years_build_mode;
  }
  public void set_years_build_mode(Double years_build_mode) {
    this.years_build_mode = years_build_mode;
  }
  public QueryResult with_years_build_mode(Double years_build_mode) {
    this.years_build_mode = years_build_mode;
    return this;
  }
  private Double commonarea_mode;
  public Double get_commonarea_mode() {
    return commonarea_mode;
  }
  public void set_commonarea_mode(Double commonarea_mode) {
    this.commonarea_mode = commonarea_mode;
  }
  public QueryResult with_commonarea_mode(Double commonarea_mode) {
    this.commonarea_mode = commonarea_mode;
    return this;
  }
  private Double elevators_mode;
  public Double get_elevators_mode() {
    return elevators_mode;
  }
  public void set_elevators_mode(Double elevators_mode) {
    this.elevators_mode = elevators_mode;
  }
  public QueryResult with_elevators_mode(Double elevators_mode) {
    this.elevators_mode = elevators_mode;
    return this;
  }
  private Double entrances_mode;
  public Double get_entrances_mode() {
    return entrances_mode;
  }
  public void set_entrances_mode(Double entrances_mode) {
    this.entrances_mode = entrances_mode;
  }
  public QueryResult with_entrances_mode(Double entrances_mode) {
    this.entrances_mode = entrances_mode;
    return this;
  }
  private Double floorsmax_mode;
  public Double get_floorsmax_mode() {
    return floorsmax_mode;
  }
  public void set_floorsmax_mode(Double floorsmax_mode) {
    this.floorsmax_mode = floorsmax_mode;
  }
  public QueryResult with_floorsmax_mode(Double floorsmax_mode) {
    this.floorsmax_mode = floorsmax_mode;
    return this;
  }
  private Double floorsmin_mode;
  public Double get_floorsmin_mode() {
    return floorsmin_mode;
  }
  public void set_floorsmin_mode(Double floorsmin_mode) {
    this.floorsmin_mode = floorsmin_mode;
  }
  public QueryResult with_floorsmin_mode(Double floorsmin_mode) {
    this.floorsmin_mode = floorsmin_mode;
    return this;
  }
  private Double landarea_mode;
  public Double get_landarea_mode() {
    return landarea_mode;
  }
  public void set_landarea_mode(Double landarea_mode) {
    this.landarea_mode = landarea_mode;
  }
  public QueryResult with_landarea_mode(Double landarea_mode) {
    this.landarea_mode = landarea_mode;
    return this;
  }
  private Double livingapartments_mode;
  public Double get_livingapartments_mode() {
    return livingapartments_mode;
  }
  public void set_livingapartments_mode(Double livingapartments_mode) {
    this.livingapartments_mode = livingapartments_mode;
  }
  public QueryResult with_livingapartments_mode(Double livingapartments_mode) {
    this.livingapartments_mode = livingapartments_mode;
    return this;
  }
  private Double livingarea_mode;
  public Double get_livingarea_mode() {
    return livingarea_mode;
  }
  public void set_livingarea_mode(Double livingarea_mode) {
    this.livingarea_mode = livingarea_mode;
  }
  public QueryResult with_livingarea_mode(Double livingarea_mode) {
    this.livingarea_mode = livingarea_mode;
    return this;
  }
  private Double nonlivingapartments_mode;
  public Double get_nonlivingapartments_mode() {
    return nonlivingapartments_mode;
  }
  public void set_nonlivingapartments_mode(Double nonlivingapartments_mode) {
    this.nonlivingapartments_mode = nonlivingapartments_mode;
  }
  public QueryResult with_nonlivingapartments_mode(Double nonlivingapartments_mode) {
    this.nonlivingapartments_mode = nonlivingapartments_mode;
    return this;
  }
  private Double nonlivingarea_mode;
  public Double get_nonlivingarea_mode() {
    return nonlivingarea_mode;
  }
  public void set_nonlivingarea_mode(Double nonlivingarea_mode) {
    this.nonlivingarea_mode = nonlivingarea_mode;
  }
  public QueryResult with_nonlivingarea_mode(Double nonlivingarea_mode) {
    this.nonlivingarea_mode = nonlivingarea_mode;
    return this;
  }
  private Double apartments_medi;
  public Double get_apartments_medi() {
    return apartments_medi;
  }
  public void set_apartments_medi(Double apartments_medi) {
    this.apartments_medi = apartments_medi;
  }
  public QueryResult with_apartments_medi(Double apartments_medi) {
    this.apartments_medi = apartments_medi;
    return this;
  }
  private Double basementarea_medi;
  public Double get_basementarea_medi() {
    return basementarea_medi;
  }
  public void set_basementarea_medi(Double basementarea_medi) {
    this.basementarea_medi = basementarea_medi;
  }
  public QueryResult with_basementarea_medi(Double basementarea_medi) {
    this.basementarea_medi = basementarea_medi;
    return this;
  }
  private Double years_beginexpluatation_medi;
  public Double get_years_beginexpluatation_medi() {
    return years_beginexpluatation_medi;
  }
  public void set_years_beginexpluatation_medi(Double years_beginexpluatation_medi) {
    this.years_beginexpluatation_medi = years_beginexpluatation_medi;
  }
  public QueryResult with_years_beginexpluatation_medi(Double years_beginexpluatation_medi) {
    this.years_beginexpluatation_medi = years_beginexpluatation_medi;
    return this;
  }
  private Double years_build_medi;
  public Double get_years_build_medi() {
    return years_build_medi;
  }
  public void set_years_build_medi(Double years_build_medi) {
    this.years_build_medi = years_build_medi;
  }
  public QueryResult with_years_build_medi(Double years_build_medi) {
    this.years_build_medi = years_build_medi;
    return this;
  }
  private Double commonarea_medi;
  public Double get_commonarea_medi() {
    return commonarea_medi;
  }
  public void set_commonarea_medi(Double commonarea_medi) {
    this.commonarea_medi = commonarea_medi;
  }
  public QueryResult with_commonarea_medi(Double commonarea_medi) {
    this.commonarea_medi = commonarea_medi;
    return this;
  }
  private Double elevators_medi;
  public Double get_elevators_medi() {
    return elevators_medi;
  }
  public void set_elevators_medi(Double elevators_medi) {
    this.elevators_medi = elevators_medi;
  }
  public QueryResult with_elevators_medi(Double elevators_medi) {
    this.elevators_medi = elevators_medi;
    return this;
  }
  private Double entrances_medi;
  public Double get_entrances_medi() {
    return entrances_medi;
  }
  public void set_entrances_medi(Double entrances_medi) {
    this.entrances_medi = entrances_medi;
  }
  public QueryResult with_entrances_medi(Double entrances_medi) {
    this.entrances_medi = entrances_medi;
    return this;
  }
  private Double floorsmax_medi;
  public Double get_floorsmax_medi() {
    return floorsmax_medi;
  }
  public void set_floorsmax_medi(Double floorsmax_medi) {
    this.floorsmax_medi = floorsmax_medi;
  }
  public QueryResult with_floorsmax_medi(Double floorsmax_medi) {
    this.floorsmax_medi = floorsmax_medi;
    return this;
  }
  private Double floorsmin_medi;
  public Double get_floorsmin_medi() {
    return floorsmin_medi;
  }
  public void set_floorsmin_medi(Double floorsmin_medi) {
    this.floorsmin_medi = floorsmin_medi;
  }
  public QueryResult with_floorsmin_medi(Double floorsmin_medi) {
    this.floorsmin_medi = floorsmin_medi;
    return this;
  }
  private Double landarea_medi;
  public Double get_landarea_medi() {
    return landarea_medi;
  }
  public void set_landarea_medi(Double landarea_medi) {
    this.landarea_medi = landarea_medi;
  }
  public QueryResult with_landarea_medi(Double landarea_medi) {
    this.landarea_medi = landarea_medi;
    return this;
  }
  private Double livingapartments_medi;
  public Double get_livingapartments_medi() {
    return livingapartments_medi;
  }
  public void set_livingapartments_medi(Double livingapartments_medi) {
    this.livingapartments_medi = livingapartments_medi;
  }
  public QueryResult with_livingapartments_medi(Double livingapartments_medi) {
    this.livingapartments_medi = livingapartments_medi;
    return this;
  }
  private Double livingarea_medi;
  public Double get_livingarea_medi() {
    return livingarea_medi;
  }
  public void set_livingarea_medi(Double livingarea_medi) {
    this.livingarea_medi = livingarea_medi;
  }
  public QueryResult with_livingarea_medi(Double livingarea_medi) {
    this.livingarea_medi = livingarea_medi;
    return this;
  }
  private Double nonlivingapartments_medi;
  public Double get_nonlivingapartments_medi() {
    return nonlivingapartments_medi;
  }
  public void set_nonlivingapartments_medi(Double nonlivingapartments_medi) {
    this.nonlivingapartments_medi = nonlivingapartments_medi;
  }
  public QueryResult with_nonlivingapartments_medi(Double nonlivingapartments_medi) {
    this.nonlivingapartments_medi = nonlivingapartments_medi;
    return this;
  }
  private Double nonlivingarea_medi;
  public Double get_nonlivingarea_medi() {
    return nonlivingarea_medi;
  }
  public void set_nonlivingarea_medi(Double nonlivingarea_medi) {
    this.nonlivingarea_medi = nonlivingarea_medi;
  }
  public QueryResult with_nonlivingarea_medi(Double nonlivingarea_medi) {
    this.nonlivingarea_medi = nonlivingarea_medi;
    return this;
  }
  private String fondkapremont_mode;
  public String get_fondkapremont_mode() {
    return fondkapremont_mode;
  }
  public void set_fondkapremont_mode(String fondkapremont_mode) {
    this.fondkapremont_mode = fondkapremont_mode;
  }
  public QueryResult with_fondkapremont_mode(String fondkapremont_mode) {
    this.fondkapremont_mode = fondkapremont_mode;
    return this;
  }
  private String housetype_mode;
  public String get_housetype_mode() {
    return housetype_mode;
  }
  public void set_housetype_mode(String housetype_mode) {
    this.housetype_mode = housetype_mode;
  }
  public QueryResult with_housetype_mode(String housetype_mode) {
    this.housetype_mode = housetype_mode;
    return this;
  }
  private Double totalarea_mode;
  public Double get_totalarea_mode() {
    return totalarea_mode;
  }
  public void set_totalarea_mode(Double totalarea_mode) {
    this.totalarea_mode = totalarea_mode;
  }
  public QueryResult with_totalarea_mode(Double totalarea_mode) {
    this.totalarea_mode = totalarea_mode;
    return this;
  }
  private String wallsmaterial_mode;
  public String get_wallsmaterial_mode() {
    return wallsmaterial_mode;
  }
  public void set_wallsmaterial_mode(String wallsmaterial_mode) {
    this.wallsmaterial_mode = wallsmaterial_mode;
  }
  public QueryResult with_wallsmaterial_mode(String wallsmaterial_mode) {
    this.wallsmaterial_mode = wallsmaterial_mode;
    return this;
  }
  private String emergencystate_mode;
  public String get_emergencystate_mode() {
    return emergencystate_mode;
  }
  public void set_emergencystate_mode(String emergencystate_mode) {
    this.emergencystate_mode = emergencystate_mode;
  }
  public QueryResult with_emergencystate_mode(String emergencystate_mode) {
    this.emergencystate_mode = emergencystate_mode;
    return this;
  }
  private Double obs_30_cnt_social_circle;
  public Double get_obs_30_cnt_social_circle() {
    return obs_30_cnt_social_circle;
  }
  public void set_obs_30_cnt_social_circle(Double obs_30_cnt_social_circle) {
    this.obs_30_cnt_social_circle = obs_30_cnt_social_circle;
  }
  public QueryResult with_obs_30_cnt_social_circle(Double obs_30_cnt_social_circle) {
    this.obs_30_cnt_social_circle = obs_30_cnt_social_circle;
    return this;
  }
  private Double def_30_cnt_social_circle;
  public Double get_def_30_cnt_social_circle() {
    return def_30_cnt_social_circle;
  }
  public void set_def_30_cnt_social_circle(Double def_30_cnt_social_circle) {
    this.def_30_cnt_social_circle = def_30_cnt_social_circle;
  }
  public QueryResult with_def_30_cnt_social_circle(Double def_30_cnt_social_circle) {
    this.def_30_cnt_social_circle = def_30_cnt_social_circle;
    return this;
  }
  private Double obs_60_cnt_social_circle;
  public Double get_obs_60_cnt_social_circle() {
    return obs_60_cnt_social_circle;
  }
  public void set_obs_60_cnt_social_circle(Double obs_60_cnt_social_circle) {
    this.obs_60_cnt_social_circle = obs_60_cnt_social_circle;
  }
  public QueryResult with_obs_60_cnt_social_circle(Double obs_60_cnt_social_circle) {
    this.obs_60_cnt_social_circle = obs_60_cnt_social_circle;
    return this;
  }
  private Double def_60_cnt_social_circle;
  public Double get_def_60_cnt_social_circle() {
    return def_60_cnt_social_circle;
  }
  public void set_def_60_cnt_social_circle(Double def_60_cnt_social_circle) {
    this.def_60_cnt_social_circle = def_60_cnt_social_circle;
  }
  public QueryResult with_def_60_cnt_social_circle(Double def_60_cnt_social_circle) {
    this.def_60_cnt_social_circle = def_60_cnt_social_circle;
    return this;
  }
  private Double days_last_phone_change;
  public Double get_days_last_phone_change() {
    return days_last_phone_change;
  }
  public void set_days_last_phone_change(Double days_last_phone_change) {
    this.days_last_phone_change = days_last_phone_change;
  }
  public QueryResult with_days_last_phone_change(Double days_last_phone_change) {
    this.days_last_phone_change = days_last_phone_change;
    return this;
  }
  private Integer flag_document_2;
  public Integer get_flag_document_2() {
    return flag_document_2;
  }
  public void set_flag_document_2(Integer flag_document_2) {
    this.flag_document_2 = flag_document_2;
  }
  public QueryResult with_flag_document_2(Integer flag_document_2) {
    this.flag_document_2 = flag_document_2;
    return this;
  }
  private Integer flag_document_3;
  public Integer get_flag_document_3() {
    return flag_document_3;
  }
  public void set_flag_document_3(Integer flag_document_3) {
    this.flag_document_3 = flag_document_3;
  }
  public QueryResult with_flag_document_3(Integer flag_document_3) {
    this.flag_document_3 = flag_document_3;
    return this;
  }
  private Integer flag_document_4;
  public Integer get_flag_document_4() {
    return flag_document_4;
  }
  public void set_flag_document_4(Integer flag_document_4) {
    this.flag_document_4 = flag_document_4;
  }
  public QueryResult with_flag_document_4(Integer flag_document_4) {
    this.flag_document_4 = flag_document_4;
    return this;
  }
  private Integer flag_document_5;
  public Integer get_flag_document_5() {
    return flag_document_5;
  }
  public void set_flag_document_5(Integer flag_document_5) {
    this.flag_document_5 = flag_document_5;
  }
  public QueryResult with_flag_document_5(Integer flag_document_5) {
    this.flag_document_5 = flag_document_5;
    return this;
  }
  private Integer flag_document_6;
  public Integer get_flag_document_6() {
    return flag_document_6;
  }
  public void set_flag_document_6(Integer flag_document_6) {
    this.flag_document_6 = flag_document_6;
  }
  public QueryResult with_flag_document_6(Integer flag_document_6) {
    this.flag_document_6 = flag_document_6;
    return this;
  }
  private Integer flag_document_7;
  public Integer get_flag_document_7() {
    return flag_document_7;
  }
  public void set_flag_document_7(Integer flag_document_7) {
    this.flag_document_7 = flag_document_7;
  }
  public QueryResult with_flag_document_7(Integer flag_document_7) {
    this.flag_document_7 = flag_document_7;
    return this;
  }
  private Integer flag_document_8;
  public Integer get_flag_document_8() {
    return flag_document_8;
  }
  public void set_flag_document_8(Integer flag_document_8) {
    this.flag_document_8 = flag_document_8;
  }
  public QueryResult with_flag_document_8(Integer flag_document_8) {
    this.flag_document_8 = flag_document_8;
    return this;
  }
  private Integer flag_document_9;
  public Integer get_flag_document_9() {
    return flag_document_9;
  }
  public void set_flag_document_9(Integer flag_document_9) {
    this.flag_document_9 = flag_document_9;
  }
  public QueryResult with_flag_document_9(Integer flag_document_9) {
    this.flag_document_9 = flag_document_9;
    return this;
  }
  private Integer flag_document_10;
  public Integer get_flag_document_10() {
    return flag_document_10;
  }
  public void set_flag_document_10(Integer flag_document_10) {
    this.flag_document_10 = flag_document_10;
  }
  public QueryResult with_flag_document_10(Integer flag_document_10) {
    this.flag_document_10 = flag_document_10;
    return this;
  }
  private Integer flag_document_11;
  public Integer get_flag_document_11() {
    return flag_document_11;
  }
  public void set_flag_document_11(Integer flag_document_11) {
    this.flag_document_11 = flag_document_11;
  }
  public QueryResult with_flag_document_11(Integer flag_document_11) {
    this.flag_document_11 = flag_document_11;
    return this;
  }
  private Integer flag_document_12;
  public Integer get_flag_document_12() {
    return flag_document_12;
  }
  public void set_flag_document_12(Integer flag_document_12) {
    this.flag_document_12 = flag_document_12;
  }
  public QueryResult with_flag_document_12(Integer flag_document_12) {
    this.flag_document_12 = flag_document_12;
    return this;
  }
  private Integer flag_document_13;
  public Integer get_flag_document_13() {
    return flag_document_13;
  }
  public void set_flag_document_13(Integer flag_document_13) {
    this.flag_document_13 = flag_document_13;
  }
  public QueryResult with_flag_document_13(Integer flag_document_13) {
    this.flag_document_13 = flag_document_13;
    return this;
  }
  private Integer flag_document_14;
  public Integer get_flag_document_14() {
    return flag_document_14;
  }
  public void set_flag_document_14(Integer flag_document_14) {
    this.flag_document_14 = flag_document_14;
  }
  public QueryResult with_flag_document_14(Integer flag_document_14) {
    this.flag_document_14 = flag_document_14;
    return this;
  }
  private Integer flag_document_15;
  public Integer get_flag_document_15() {
    return flag_document_15;
  }
  public void set_flag_document_15(Integer flag_document_15) {
    this.flag_document_15 = flag_document_15;
  }
  public QueryResult with_flag_document_15(Integer flag_document_15) {
    this.flag_document_15 = flag_document_15;
    return this;
  }
  private Integer flag_document_16;
  public Integer get_flag_document_16() {
    return flag_document_16;
  }
  public void set_flag_document_16(Integer flag_document_16) {
    this.flag_document_16 = flag_document_16;
  }
  public QueryResult with_flag_document_16(Integer flag_document_16) {
    this.flag_document_16 = flag_document_16;
    return this;
  }
  private Integer flag_document_17;
  public Integer get_flag_document_17() {
    return flag_document_17;
  }
  public void set_flag_document_17(Integer flag_document_17) {
    this.flag_document_17 = flag_document_17;
  }
  public QueryResult with_flag_document_17(Integer flag_document_17) {
    this.flag_document_17 = flag_document_17;
    return this;
  }
  private Integer flag_document_18;
  public Integer get_flag_document_18() {
    return flag_document_18;
  }
  public void set_flag_document_18(Integer flag_document_18) {
    this.flag_document_18 = flag_document_18;
  }
  public QueryResult with_flag_document_18(Integer flag_document_18) {
    this.flag_document_18 = flag_document_18;
    return this;
  }
  private Integer flag_document_19;
  public Integer get_flag_document_19() {
    return flag_document_19;
  }
  public void set_flag_document_19(Integer flag_document_19) {
    this.flag_document_19 = flag_document_19;
  }
  public QueryResult with_flag_document_19(Integer flag_document_19) {
    this.flag_document_19 = flag_document_19;
    return this;
  }
  private Integer flag_document_20;
  public Integer get_flag_document_20() {
    return flag_document_20;
  }
  public void set_flag_document_20(Integer flag_document_20) {
    this.flag_document_20 = flag_document_20;
  }
  public QueryResult with_flag_document_20(Integer flag_document_20) {
    this.flag_document_20 = flag_document_20;
    return this;
  }
  private Integer flag_document_21;
  public Integer get_flag_document_21() {
    return flag_document_21;
  }
  public void set_flag_document_21(Integer flag_document_21) {
    this.flag_document_21 = flag_document_21;
  }
  public QueryResult with_flag_document_21(Integer flag_document_21) {
    this.flag_document_21 = flag_document_21;
    return this;
  }
  private Double amt_req_credit_bureau_hour;
  public Double get_amt_req_credit_bureau_hour() {
    return amt_req_credit_bureau_hour;
  }
  public void set_amt_req_credit_bureau_hour(Double amt_req_credit_bureau_hour) {
    this.amt_req_credit_bureau_hour = amt_req_credit_bureau_hour;
  }
  public QueryResult with_amt_req_credit_bureau_hour(Double amt_req_credit_bureau_hour) {
    this.amt_req_credit_bureau_hour = amt_req_credit_bureau_hour;
    return this;
  }
  private Double amt_req_credit_bureau_day;
  public Double get_amt_req_credit_bureau_day() {
    return amt_req_credit_bureau_day;
  }
  public void set_amt_req_credit_bureau_day(Double amt_req_credit_bureau_day) {
    this.amt_req_credit_bureau_day = amt_req_credit_bureau_day;
  }
  public QueryResult with_amt_req_credit_bureau_day(Double amt_req_credit_bureau_day) {
    this.amt_req_credit_bureau_day = amt_req_credit_bureau_day;
    return this;
  }
  private Double amt_req_credit_bureau_week;
  public Double get_amt_req_credit_bureau_week() {
    return amt_req_credit_bureau_week;
  }
  public void set_amt_req_credit_bureau_week(Double amt_req_credit_bureau_week) {
    this.amt_req_credit_bureau_week = amt_req_credit_bureau_week;
  }
  public QueryResult with_amt_req_credit_bureau_week(Double amt_req_credit_bureau_week) {
    this.amt_req_credit_bureau_week = amt_req_credit_bureau_week;
    return this;
  }
  private Double amt_req_credit_bureau_mon;
  public Double get_amt_req_credit_bureau_mon() {
    return amt_req_credit_bureau_mon;
  }
  public void set_amt_req_credit_bureau_mon(Double amt_req_credit_bureau_mon) {
    this.amt_req_credit_bureau_mon = amt_req_credit_bureau_mon;
  }
  public QueryResult with_amt_req_credit_bureau_mon(Double amt_req_credit_bureau_mon) {
    this.amt_req_credit_bureau_mon = amt_req_credit_bureau_mon;
    return this;
  }
  private Double amt_req_credit_bureau_qrt;
  public Double get_amt_req_credit_bureau_qrt() {
    return amt_req_credit_bureau_qrt;
  }
  public void set_amt_req_credit_bureau_qrt(Double amt_req_credit_bureau_qrt) {
    this.amt_req_credit_bureau_qrt = amt_req_credit_bureau_qrt;
  }
  public QueryResult with_amt_req_credit_bureau_qrt(Double amt_req_credit_bureau_qrt) {
    this.amt_req_credit_bureau_qrt = amt_req_credit_bureau_qrt;
    return this;
  }
  private Double amt_req_credit_bureau_year;
  public Double get_amt_req_credit_bureau_year() {
    return amt_req_credit_bureau_year;
  }
  public void set_amt_req_credit_bureau_year(Double amt_req_credit_bureau_year) {
    this.amt_req_credit_bureau_year = amt_req_credit_bureau_year;
  }
  public QueryResult with_amt_req_credit_bureau_year(Double amt_req_credit_bureau_year) {
    this.amt_req_credit_bureau_year = amt_req_credit_bureau_year;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.sk_id_curr == null ? that.sk_id_curr == null : this.sk_id_curr.equals(that.sk_id_curr));
    equal = equal && (this.name_contract_type == null ? that.name_contract_type == null : this.name_contract_type.equals(that.name_contract_type));
    equal = equal && (this.code_gender == null ? that.code_gender == null : this.code_gender.equals(that.code_gender));
    equal = equal && (this.flag_own_car == null ? that.flag_own_car == null : this.flag_own_car.equals(that.flag_own_car));
    equal = equal && (this.flag_own_realty == null ? that.flag_own_realty == null : this.flag_own_realty.equals(that.flag_own_realty));
    equal = equal && (this.cnt_children == null ? that.cnt_children == null : this.cnt_children.equals(that.cnt_children));
    equal = equal && (this.amt_income_total == null ? that.amt_income_total == null : this.amt_income_total.equals(that.amt_income_total));
    equal = equal && (this.amt_credit == null ? that.amt_credit == null : this.amt_credit.equals(that.amt_credit));
    equal = equal && (this.amt_annuity == null ? that.amt_annuity == null : this.amt_annuity.equals(that.amt_annuity));
    equal = equal && (this.amt_goods_price == null ? that.amt_goods_price == null : this.amt_goods_price.equals(that.amt_goods_price));
    equal = equal && (this.name_type_suite == null ? that.name_type_suite == null : this.name_type_suite.equals(that.name_type_suite));
    equal = equal && (this.name_income_type == null ? that.name_income_type == null : this.name_income_type.equals(that.name_income_type));
    equal = equal && (this.name_education_type == null ? that.name_education_type == null : this.name_education_type.equals(that.name_education_type));
    equal = equal && (this.name_family_status == null ? that.name_family_status == null : this.name_family_status.equals(that.name_family_status));
    equal = equal && (this.name_housing_type == null ? that.name_housing_type == null : this.name_housing_type.equals(that.name_housing_type));
    equal = equal && (this.region_population_relative == null ? that.region_population_relative == null : this.region_population_relative.equals(that.region_population_relative));
    equal = equal && (this.days_birth == null ? that.days_birth == null : this.days_birth.equals(that.days_birth));
    equal = equal && (this.days_employed == null ? that.days_employed == null : this.days_employed.equals(that.days_employed));
    equal = equal && (this.days_registration == null ? that.days_registration == null : this.days_registration.equals(that.days_registration));
    equal = equal && (this.days_id_publish == null ? that.days_id_publish == null : this.days_id_publish.equals(that.days_id_publish));
    equal = equal && (this.own_car_age == null ? that.own_car_age == null : this.own_car_age.equals(that.own_car_age));
    equal = equal && (this.flag_mobil == null ? that.flag_mobil == null : this.flag_mobil.equals(that.flag_mobil));
    equal = equal && (this.flag_emp_phone == null ? that.flag_emp_phone == null : this.flag_emp_phone.equals(that.flag_emp_phone));
    equal = equal && (this.flag_work_phone == null ? that.flag_work_phone == null : this.flag_work_phone.equals(that.flag_work_phone));
    equal = equal && (this.flag_cont_mobile == null ? that.flag_cont_mobile == null : this.flag_cont_mobile.equals(that.flag_cont_mobile));
    equal = equal && (this.flag_phone == null ? that.flag_phone == null : this.flag_phone.equals(that.flag_phone));
    equal = equal && (this.flag_email == null ? that.flag_email == null : this.flag_email.equals(that.flag_email));
    equal = equal && (this.occupation_type == null ? that.occupation_type == null : this.occupation_type.equals(that.occupation_type));
    equal = equal && (this.cnt_fam_members == null ? that.cnt_fam_members == null : this.cnt_fam_members.equals(that.cnt_fam_members));
    equal = equal && (this.region_rating_client == null ? that.region_rating_client == null : this.region_rating_client.equals(that.region_rating_client));
    equal = equal && (this.region_rating_client_w_city == null ? that.region_rating_client_w_city == null : this.region_rating_client_w_city.equals(that.region_rating_client_w_city));
    equal = equal && (this.weekday_appr_process_start == null ? that.weekday_appr_process_start == null : this.weekday_appr_process_start.equals(that.weekday_appr_process_start));
    equal = equal && (this.hour_appr_process_start == null ? that.hour_appr_process_start == null : this.hour_appr_process_start.equals(that.hour_appr_process_start));
    equal = equal && (this.reg_region_not_live_region == null ? that.reg_region_not_live_region == null : this.reg_region_not_live_region.equals(that.reg_region_not_live_region));
    equal = equal && (this.reg_region_not_work_region == null ? that.reg_region_not_work_region == null : this.reg_region_not_work_region.equals(that.reg_region_not_work_region));
    equal = equal && (this.live_region_not_work_region == null ? that.live_region_not_work_region == null : this.live_region_not_work_region.equals(that.live_region_not_work_region));
    equal = equal && (this.reg_city_not_live_city == null ? that.reg_city_not_live_city == null : this.reg_city_not_live_city.equals(that.reg_city_not_live_city));
    equal = equal && (this.reg_city_not_work_city == null ? that.reg_city_not_work_city == null : this.reg_city_not_work_city.equals(that.reg_city_not_work_city));
    equal = equal && (this.live_city_not_work_city == null ? that.live_city_not_work_city == null : this.live_city_not_work_city.equals(that.live_city_not_work_city));
    equal = equal && (this.organization_type == null ? that.organization_type == null : this.organization_type.equals(that.organization_type));
    equal = equal && (this.ext_source_1 == null ? that.ext_source_1 == null : this.ext_source_1.equals(that.ext_source_1));
    equal = equal && (this.ext_source_2 == null ? that.ext_source_2 == null : this.ext_source_2.equals(that.ext_source_2));
    equal = equal && (this.ext_source_3 == null ? that.ext_source_3 == null : this.ext_source_3.equals(that.ext_source_3));
    equal = equal && (this.apartments_avg == null ? that.apartments_avg == null : this.apartments_avg.equals(that.apartments_avg));
    equal = equal && (this.basementarea_avg == null ? that.basementarea_avg == null : this.basementarea_avg.equals(that.basementarea_avg));
    equal = equal && (this.years_beginexpluatation_avg == null ? that.years_beginexpluatation_avg == null : this.years_beginexpluatation_avg.equals(that.years_beginexpluatation_avg));
    equal = equal && (this.years_build_avg == null ? that.years_build_avg == null : this.years_build_avg.equals(that.years_build_avg));
    equal = equal && (this.commonarea_avg == null ? that.commonarea_avg == null : this.commonarea_avg.equals(that.commonarea_avg));
    equal = equal && (this.elevators_avg == null ? that.elevators_avg == null : this.elevators_avg.equals(that.elevators_avg));
    equal = equal && (this.entrances_avg == null ? that.entrances_avg == null : this.entrances_avg.equals(that.entrances_avg));
    equal = equal && (this.floorsmax_avg == null ? that.floorsmax_avg == null : this.floorsmax_avg.equals(that.floorsmax_avg));
    equal = equal && (this.floorsmin_avg == null ? that.floorsmin_avg == null : this.floorsmin_avg.equals(that.floorsmin_avg));
    equal = equal && (this.landarea_avg == null ? that.landarea_avg == null : this.landarea_avg.equals(that.landarea_avg));
    equal = equal && (this.livingapartments_avg == null ? that.livingapartments_avg == null : this.livingapartments_avg.equals(that.livingapartments_avg));
    equal = equal && (this.livingarea_avg == null ? that.livingarea_avg == null : this.livingarea_avg.equals(that.livingarea_avg));
    equal = equal && (this.nonlivingapartments_avg == null ? that.nonlivingapartments_avg == null : this.nonlivingapartments_avg.equals(that.nonlivingapartments_avg));
    equal = equal && (this.nonlivingarea_avg == null ? that.nonlivingarea_avg == null : this.nonlivingarea_avg.equals(that.nonlivingarea_avg));
    equal = equal && (this.apartments_mode == null ? that.apartments_mode == null : this.apartments_mode.equals(that.apartments_mode));
    equal = equal && (this.basementarea_mode == null ? that.basementarea_mode == null : this.basementarea_mode.equals(that.basementarea_mode));
    equal = equal && (this.years_beginexpluatation_mode == null ? that.years_beginexpluatation_mode == null : this.years_beginexpluatation_mode.equals(that.years_beginexpluatation_mode));
    equal = equal && (this.years_build_mode == null ? that.years_build_mode == null : this.years_build_mode.equals(that.years_build_mode));
    equal = equal && (this.commonarea_mode == null ? that.commonarea_mode == null : this.commonarea_mode.equals(that.commonarea_mode));
    equal = equal && (this.elevators_mode == null ? that.elevators_mode == null : this.elevators_mode.equals(that.elevators_mode));
    equal = equal && (this.entrances_mode == null ? that.entrances_mode == null : this.entrances_mode.equals(that.entrances_mode));
    equal = equal && (this.floorsmax_mode == null ? that.floorsmax_mode == null : this.floorsmax_mode.equals(that.floorsmax_mode));
    equal = equal && (this.floorsmin_mode == null ? that.floorsmin_mode == null : this.floorsmin_mode.equals(that.floorsmin_mode));
    equal = equal && (this.landarea_mode == null ? that.landarea_mode == null : this.landarea_mode.equals(that.landarea_mode));
    equal = equal && (this.livingapartments_mode == null ? that.livingapartments_mode == null : this.livingapartments_mode.equals(that.livingapartments_mode));
    equal = equal && (this.livingarea_mode == null ? that.livingarea_mode == null : this.livingarea_mode.equals(that.livingarea_mode));
    equal = equal && (this.nonlivingapartments_mode == null ? that.nonlivingapartments_mode == null : this.nonlivingapartments_mode.equals(that.nonlivingapartments_mode));
    equal = equal && (this.nonlivingarea_mode == null ? that.nonlivingarea_mode == null : this.nonlivingarea_mode.equals(that.nonlivingarea_mode));
    equal = equal && (this.apartments_medi == null ? that.apartments_medi == null : this.apartments_medi.equals(that.apartments_medi));
    equal = equal && (this.basementarea_medi == null ? that.basementarea_medi == null : this.basementarea_medi.equals(that.basementarea_medi));
    equal = equal && (this.years_beginexpluatation_medi == null ? that.years_beginexpluatation_medi == null : this.years_beginexpluatation_medi.equals(that.years_beginexpluatation_medi));
    equal = equal && (this.years_build_medi == null ? that.years_build_medi == null : this.years_build_medi.equals(that.years_build_medi));
    equal = equal && (this.commonarea_medi == null ? that.commonarea_medi == null : this.commonarea_medi.equals(that.commonarea_medi));
    equal = equal && (this.elevators_medi == null ? that.elevators_medi == null : this.elevators_medi.equals(that.elevators_medi));
    equal = equal && (this.entrances_medi == null ? that.entrances_medi == null : this.entrances_medi.equals(that.entrances_medi));
    equal = equal && (this.floorsmax_medi == null ? that.floorsmax_medi == null : this.floorsmax_medi.equals(that.floorsmax_medi));
    equal = equal && (this.floorsmin_medi == null ? that.floorsmin_medi == null : this.floorsmin_medi.equals(that.floorsmin_medi));
    equal = equal && (this.landarea_medi == null ? that.landarea_medi == null : this.landarea_medi.equals(that.landarea_medi));
    equal = equal && (this.livingapartments_medi == null ? that.livingapartments_medi == null : this.livingapartments_medi.equals(that.livingapartments_medi));
    equal = equal && (this.livingarea_medi == null ? that.livingarea_medi == null : this.livingarea_medi.equals(that.livingarea_medi));
    equal = equal && (this.nonlivingapartments_medi == null ? that.nonlivingapartments_medi == null : this.nonlivingapartments_medi.equals(that.nonlivingapartments_medi));
    equal = equal && (this.nonlivingarea_medi == null ? that.nonlivingarea_medi == null : this.nonlivingarea_medi.equals(that.nonlivingarea_medi));
    equal = equal && (this.fondkapremont_mode == null ? that.fondkapremont_mode == null : this.fondkapremont_mode.equals(that.fondkapremont_mode));
    equal = equal && (this.housetype_mode == null ? that.housetype_mode == null : this.housetype_mode.equals(that.housetype_mode));
    equal = equal && (this.totalarea_mode == null ? that.totalarea_mode == null : this.totalarea_mode.equals(that.totalarea_mode));
    equal = equal && (this.wallsmaterial_mode == null ? that.wallsmaterial_mode == null : this.wallsmaterial_mode.equals(that.wallsmaterial_mode));
    equal = equal && (this.emergencystate_mode == null ? that.emergencystate_mode == null : this.emergencystate_mode.equals(that.emergencystate_mode));
    equal = equal && (this.obs_30_cnt_social_circle == null ? that.obs_30_cnt_social_circle == null : this.obs_30_cnt_social_circle.equals(that.obs_30_cnt_social_circle));
    equal = equal && (this.def_30_cnt_social_circle == null ? that.def_30_cnt_social_circle == null : this.def_30_cnt_social_circle.equals(that.def_30_cnt_social_circle));
    equal = equal && (this.obs_60_cnt_social_circle == null ? that.obs_60_cnt_social_circle == null : this.obs_60_cnt_social_circle.equals(that.obs_60_cnt_social_circle));
    equal = equal && (this.def_60_cnt_social_circle == null ? that.def_60_cnt_social_circle == null : this.def_60_cnt_social_circle.equals(that.def_60_cnt_social_circle));
    equal = equal && (this.days_last_phone_change == null ? that.days_last_phone_change == null : this.days_last_phone_change.equals(that.days_last_phone_change));
    equal = equal && (this.flag_document_2 == null ? that.flag_document_2 == null : this.flag_document_2.equals(that.flag_document_2));
    equal = equal && (this.flag_document_3 == null ? that.flag_document_3 == null : this.flag_document_3.equals(that.flag_document_3));
    equal = equal && (this.flag_document_4 == null ? that.flag_document_4 == null : this.flag_document_4.equals(that.flag_document_4));
    equal = equal && (this.flag_document_5 == null ? that.flag_document_5 == null : this.flag_document_5.equals(that.flag_document_5));
    equal = equal && (this.flag_document_6 == null ? that.flag_document_6 == null : this.flag_document_6.equals(that.flag_document_6));
    equal = equal && (this.flag_document_7 == null ? that.flag_document_7 == null : this.flag_document_7.equals(that.flag_document_7));
    equal = equal && (this.flag_document_8 == null ? that.flag_document_8 == null : this.flag_document_8.equals(that.flag_document_8));
    equal = equal && (this.flag_document_9 == null ? that.flag_document_9 == null : this.flag_document_9.equals(that.flag_document_9));
    equal = equal && (this.flag_document_10 == null ? that.flag_document_10 == null : this.flag_document_10.equals(that.flag_document_10));
    equal = equal && (this.flag_document_11 == null ? that.flag_document_11 == null : this.flag_document_11.equals(that.flag_document_11));
    equal = equal && (this.flag_document_12 == null ? that.flag_document_12 == null : this.flag_document_12.equals(that.flag_document_12));
    equal = equal && (this.flag_document_13 == null ? that.flag_document_13 == null : this.flag_document_13.equals(that.flag_document_13));
    equal = equal && (this.flag_document_14 == null ? that.flag_document_14 == null : this.flag_document_14.equals(that.flag_document_14));
    equal = equal && (this.flag_document_15 == null ? that.flag_document_15 == null : this.flag_document_15.equals(that.flag_document_15));
    equal = equal && (this.flag_document_16 == null ? that.flag_document_16 == null : this.flag_document_16.equals(that.flag_document_16));
    equal = equal && (this.flag_document_17 == null ? that.flag_document_17 == null : this.flag_document_17.equals(that.flag_document_17));
    equal = equal && (this.flag_document_18 == null ? that.flag_document_18 == null : this.flag_document_18.equals(that.flag_document_18));
    equal = equal && (this.flag_document_19 == null ? that.flag_document_19 == null : this.flag_document_19.equals(that.flag_document_19));
    equal = equal && (this.flag_document_20 == null ? that.flag_document_20 == null : this.flag_document_20.equals(that.flag_document_20));
    equal = equal && (this.flag_document_21 == null ? that.flag_document_21 == null : this.flag_document_21.equals(that.flag_document_21));
    equal = equal && (this.amt_req_credit_bureau_hour == null ? that.amt_req_credit_bureau_hour == null : this.amt_req_credit_bureau_hour.equals(that.amt_req_credit_bureau_hour));
    equal = equal && (this.amt_req_credit_bureau_day == null ? that.amt_req_credit_bureau_day == null : this.amt_req_credit_bureau_day.equals(that.amt_req_credit_bureau_day));
    equal = equal && (this.amt_req_credit_bureau_week == null ? that.amt_req_credit_bureau_week == null : this.amt_req_credit_bureau_week.equals(that.amt_req_credit_bureau_week));
    equal = equal && (this.amt_req_credit_bureau_mon == null ? that.amt_req_credit_bureau_mon == null : this.amt_req_credit_bureau_mon.equals(that.amt_req_credit_bureau_mon));
    equal = equal && (this.amt_req_credit_bureau_qrt == null ? that.amt_req_credit_bureau_qrt == null : this.amt_req_credit_bureau_qrt.equals(that.amt_req_credit_bureau_qrt));
    equal = equal && (this.amt_req_credit_bureau_year == null ? that.amt_req_credit_bureau_year == null : this.amt_req_credit_bureau_year.equals(that.amt_req_credit_bureau_year));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.sk_id_curr == null ? that.sk_id_curr == null : this.sk_id_curr.equals(that.sk_id_curr));
    equal = equal && (this.name_contract_type == null ? that.name_contract_type == null : this.name_contract_type.equals(that.name_contract_type));
    equal = equal && (this.code_gender == null ? that.code_gender == null : this.code_gender.equals(that.code_gender));
    equal = equal && (this.flag_own_car == null ? that.flag_own_car == null : this.flag_own_car.equals(that.flag_own_car));
    equal = equal && (this.flag_own_realty == null ? that.flag_own_realty == null : this.flag_own_realty.equals(that.flag_own_realty));
    equal = equal && (this.cnt_children == null ? that.cnt_children == null : this.cnt_children.equals(that.cnt_children));
    equal = equal && (this.amt_income_total == null ? that.amt_income_total == null : this.amt_income_total.equals(that.amt_income_total));
    equal = equal && (this.amt_credit == null ? that.amt_credit == null : this.amt_credit.equals(that.amt_credit));
    equal = equal && (this.amt_annuity == null ? that.amt_annuity == null : this.amt_annuity.equals(that.amt_annuity));
    equal = equal && (this.amt_goods_price == null ? that.amt_goods_price == null : this.amt_goods_price.equals(that.amt_goods_price));
    equal = equal && (this.name_type_suite == null ? that.name_type_suite == null : this.name_type_suite.equals(that.name_type_suite));
    equal = equal && (this.name_income_type == null ? that.name_income_type == null : this.name_income_type.equals(that.name_income_type));
    equal = equal && (this.name_education_type == null ? that.name_education_type == null : this.name_education_type.equals(that.name_education_type));
    equal = equal && (this.name_family_status == null ? that.name_family_status == null : this.name_family_status.equals(that.name_family_status));
    equal = equal && (this.name_housing_type == null ? that.name_housing_type == null : this.name_housing_type.equals(that.name_housing_type));
    equal = equal && (this.region_population_relative == null ? that.region_population_relative == null : this.region_population_relative.equals(that.region_population_relative));
    equal = equal && (this.days_birth == null ? that.days_birth == null : this.days_birth.equals(that.days_birth));
    equal = equal && (this.days_employed == null ? that.days_employed == null : this.days_employed.equals(that.days_employed));
    equal = equal && (this.days_registration == null ? that.days_registration == null : this.days_registration.equals(that.days_registration));
    equal = equal && (this.days_id_publish == null ? that.days_id_publish == null : this.days_id_publish.equals(that.days_id_publish));
    equal = equal && (this.own_car_age == null ? that.own_car_age == null : this.own_car_age.equals(that.own_car_age));
    equal = equal && (this.flag_mobil == null ? that.flag_mobil == null : this.flag_mobil.equals(that.flag_mobil));
    equal = equal && (this.flag_emp_phone == null ? that.flag_emp_phone == null : this.flag_emp_phone.equals(that.flag_emp_phone));
    equal = equal && (this.flag_work_phone == null ? that.flag_work_phone == null : this.flag_work_phone.equals(that.flag_work_phone));
    equal = equal && (this.flag_cont_mobile == null ? that.flag_cont_mobile == null : this.flag_cont_mobile.equals(that.flag_cont_mobile));
    equal = equal && (this.flag_phone == null ? that.flag_phone == null : this.flag_phone.equals(that.flag_phone));
    equal = equal && (this.flag_email == null ? that.flag_email == null : this.flag_email.equals(that.flag_email));
    equal = equal && (this.occupation_type == null ? that.occupation_type == null : this.occupation_type.equals(that.occupation_type));
    equal = equal && (this.cnt_fam_members == null ? that.cnt_fam_members == null : this.cnt_fam_members.equals(that.cnt_fam_members));
    equal = equal && (this.region_rating_client == null ? that.region_rating_client == null : this.region_rating_client.equals(that.region_rating_client));
    equal = equal && (this.region_rating_client_w_city == null ? that.region_rating_client_w_city == null : this.region_rating_client_w_city.equals(that.region_rating_client_w_city));
    equal = equal && (this.weekday_appr_process_start == null ? that.weekday_appr_process_start == null : this.weekday_appr_process_start.equals(that.weekday_appr_process_start));
    equal = equal && (this.hour_appr_process_start == null ? that.hour_appr_process_start == null : this.hour_appr_process_start.equals(that.hour_appr_process_start));
    equal = equal && (this.reg_region_not_live_region == null ? that.reg_region_not_live_region == null : this.reg_region_not_live_region.equals(that.reg_region_not_live_region));
    equal = equal && (this.reg_region_not_work_region == null ? that.reg_region_not_work_region == null : this.reg_region_not_work_region.equals(that.reg_region_not_work_region));
    equal = equal && (this.live_region_not_work_region == null ? that.live_region_not_work_region == null : this.live_region_not_work_region.equals(that.live_region_not_work_region));
    equal = equal && (this.reg_city_not_live_city == null ? that.reg_city_not_live_city == null : this.reg_city_not_live_city.equals(that.reg_city_not_live_city));
    equal = equal && (this.reg_city_not_work_city == null ? that.reg_city_not_work_city == null : this.reg_city_not_work_city.equals(that.reg_city_not_work_city));
    equal = equal && (this.live_city_not_work_city == null ? that.live_city_not_work_city == null : this.live_city_not_work_city.equals(that.live_city_not_work_city));
    equal = equal && (this.organization_type == null ? that.organization_type == null : this.organization_type.equals(that.organization_type));
    equal = equal && (this.ext_source_1 == null ? that.ext_source_1 == null : this.ext_source_1.equals(that.ext_source_1));
    equal = equal && (this.ext_source_2 == null ? that.ext_source_2 == null : this.ext_source_2.equals(that.ext_source_2));
    equal = equal && (this.ext_source_3 == null ? that.ext_source_3 == null : this.ext_source_3.equals(that.ext_source_3));
    equal = equal && (this.apartments_avg == null ? that.apartments_avg == null : this.apartments_avg.equals(that.apartments_avg));
    equal = equal && (this.basementarea_avg == null ? that.basementarea_avg == null : this.basementarea_avg.equals(that.basementarea_avg));
    equal = equal && (this.years_beginexpluatation_avg == null ? that.years_beginexpluatation_avg == null : this.years_beginexpluatation_avg.equals(that.years_beginexpluatation_avg));
    equal = equal && (this.years_build_avg == null ? that.years_build_avg == null : this.years_build_avg.equals(that.years_build_avg));
    equal = equal && (this.commonarea_avg == null ? that.commonarea_avg == null : this.commonarea_avg.equals(that.commonarea_avg));
    equal = equal && (this.elevators_avg == null ? that.elevators_avg == null : this.elevators_avg.equals(that.elevators_avg));
    equal = equal && (this.entrances_avg == null ? that.entrances_avg == null : this.entrances_avg.equals(that.entrances_avg));
    equal = equal && (this.floorsmax_avg == null ? that.floorsmax_avg == null : this.floorsmax_avg.equals(that.floorsmax_avg));
    equal = equal && (this.floorsmin_avg == null ? that.floorsmin_avg == null : this.floorsmin_avg.equals(that.floorsmin_avg));
    equal = equal && (this.landarea_avg == null ? that.landarea_avg == null : this.landarea_avg.equals(that.landarea_avg));
    equal = equal && (this.livingapartments_avg == null ? that.livingapartments_avg == null : this.livingapartments_avg.equals(that.livingapartments_avg));
    equal = equal && (this.livingarea_avg == null ? that.livingarea_avg == null : this.livingarea_avg.equals(that.livingarea_avg));
    equal = equal && (this.nonlivingapartments_avg == null ? that.nonlivingapartments_avg == null : this.nonlivingapartments_avg.equals(that.nonlivingapartments_avg));
    equal = equal && (this.nonlivingarea_avg == null ? that.nonlivingarea_avg == null : this.nonlivingarea_avg.equals(that.nonlivingarea_avg));
    equal = equal && (this.apartments_mode == null ? that.apartments_mode == null : this.apartments_mode.equals(that.apartments_mode));
    equal = equal && (this.basementarea_mode == null ? that.basementarea_mode == null : this.basementarea_mode.equals(that.basementarea_mode));
    equal = equal && (this.years_beginexpluatation_mode == null ? that.years_beginexpluatation_mode == null : this.years_beginexpluatation_mode.equals(that.years_beginexpluatation_mode));
    equal = equal && (this.years_build_mode == null ? that.years_build_mode == null : this.years_build_mode.equals(that.years_build_mode));
    equal = equal && (this.commonarea_mode == null ? that.commonarea_mode == null : this.commonarea_mode.equals(that.commonarea_mode));
    equal = equal && (this.elevators_mode == null ? that.elevators_mode == null : this.elevators_mode.equals(that.elevators_mode));
    equal = equal && (this.entrances_mode == null ? that.entrances_mode == null : this.entrances_mode.equals(that.entrances_mode));
    equal = equal && (this.floorsmax_mode == null ? that.floorsmax_mode == null : this.floorsmax_mode.equals(that.floorsmax_mode));
    equal = equal && (this.floorsmin_mode == null ? that.floorsmin_mode == null : this.floorsmin_mode.equals(that.floorsmin_mode));
    equal = equal && (this.landarea_mode == null ? that.landarea_mode == null : this.landarea_mode.equals(that.landarea_mode));
    equal = equal && (this.livingapartments_mode == null ? that.livingapartments_mode == null : this.livingapartments_mode.equals(that.livingapartments_mode));
    equal = equal && (this.livingarea_mode == null ? that.livingarea_mode == null : this.livingarea_mode.equals(that.livingarea_mode));
    equal = equal && (this.nonlivingapartments_mode == null ? that.nonlivingapartments_mode == null : this.nonlivingapartments_mode.equals(that.nonlivingapartments_mode));
    equal = equal && (this.nonlivingarea_mode == null ? that.nonlivingarea_mode == null : this.nonlivingarea_mode.equals(that.nonlivingarea_mode));
    equal = equal && (this.apartments_medi == null ? that.apartments_medi == null : this.apartments_medi.equals(that.apartments_medi));
    equal = equal && (this.basementarea_medi == null ? that.basementarea_medi == null : this.basementarea_medi.equals(that.basementarea_medi));
    equal = equal && (this.years_beginexpluatation_medi == null ? that.years_beginexpluatation_medi == null : this.years_beginexpluatation_medi.equals(that.years_beginexpluatation_medi));
    equal = equal && (this.years_build_medi == null ? that.years_build_medi == null : this.years_build_medi.equals(that.years_build_medi));
    equal = equal && (this.commonarea_medi == null ? that.commonarea_medi == null : this.commonarea_medi.equals(that.commonarea_medi));
    equal = equal && (this.elevators_medi == null ? that.elevators_medi == null : this.elevators_medi.equals(that.elevators_medi));
    equal = equal && (this.entrances_medi == null ? that.entrances_medi == null : this.entrances_medi.equals(that.entrances_medi));
    equal = equal && (this.floorsmax_medi == null ? that.floorsmax_medi == null : this.floorsmax_medi.equals(that.floorsmax_medi));
    equal = equal && (this.floorsmin_medi == null ? that.floorsmin_medi == null : this.floorsmin_medi.equals(that.floorsmin_medi));
    equal = equal && (this.landarea_medi == null ? that.landarea_medi == null : this.landarea_medi.equals(that.landarea_medi));
    equal = equal && (this.livingapartments_medi == null ? that.livingapartments_medi == null : this.livingapartments_medi.equals(that.livingapartments_medi));
    equal = equal && (this.livingarea_medi == null ? that.livingarea_medi == null : this.livingarea_medi.equals(that.livingarea_medi));
    equal = equal && (this.nonlivingapartments_medi == null ? that.nonlivingapartments_medi == null : this.nonlivingapartments_medi.equals(that.nonlivingapartments_medi));
    equal = equal && (this.nonlivingarea_medi == null ? that.nonlivingarea_medi == null : this.nonlivingarea_medi.equals(that.nonlivingarea_medi));
    equal = equal && (this.fondkapremont_mode == null ? that.fondkapremont_mode == null : this.fondkapremont_mode.equals(that.fondkapremont_mode));
    equal = equal && (this.housetype_mode == null ? that.housetype_mode == null : this.housetype_mode.equals(that.housetype_mode));
    equal = equal && (this.totalarea_mode == null ? that.totalarea_mode == null : this.totalarea_mode.equals(that.totalarea_mode));
    equal = equal && (this.wallsmaterial_mode == null ? that.wallsmaterial_mode == null : this.wallsmaterial_mode.equals(that.wallsmaterial_mode));
    equal = equal && (this.emergencystate_mode == null ? that.emergencystate_mode == null : this.emergencystate_mode.equals(that.emergencystate_mode));
    equal = equal && (this.obs_30_cnt_social_circle == null ? that.obs_30_cnt_social_circle == null : this.obs_30_cnt_social_circle.equals(that.obs_30_cnt_social_circle));
    equal = equal && (this.def_30_cnt_social_circle == null ? that.def_30_cnt_social_circle == null : this.def_30_cnt_social_circle.equals(that.def_30_cnt_social_circle));
    equal = equal && (this.obs_60_cnt_social_circle == null ? that.obs_60_cnt_social_circle == null : this.obs_60_cnt_social_circle.equals(that.obs_60_cnt_social_circle));
    equal = equal && (this.def_60_cnt_social_circle == null ? that.def_60_cnt_social_circle == null : this.def_60_cnt_social_circle.equals(that.def_60_cnt_social_circle));
    equal = equal && (this.days_last_phone_change == null ? that.days_last_phone_change == null : this.days_last_phone_change.equals(that.days_last_phone_change));
    equal = equal && (this.flag_document_2 == null ? that.flag_document_2 == null : this.flag_document_2.equals(that.flag_document_2));
    equal = equal && (this.flag_document_3 == null ? that.flag_document_3 == null : this.flag_document_3.equals(that.flag_document_3));
    equal = equal && (this.flag_document_4 == null ? that.flag_document_4 == null : this.flag_document_4.equals(that.flag_document_4));
    equal = equal && (this.flag_document_5 == null ? that.flag_document_5 == null : this.flag_document_5.equals(that.flag_document_5));
    equal = equal && (this.flag_document_6 == null ? that.flag_document_6 == null : this.flag_document_6.equals(that.flag_document_6));
    equal = equal && (this.flag_document_7 == null ? that.flag_document_7 == null : this.flag_document_7.equals(that.flag_document_7));
    equal = equal && (this.flag_document_8 == null ? that.flag_document_8 == null : this.flag_document_8.equals(that.flag_document_8));
    equal = equal && (this.flag_document_9 == null ? that.flag_document_9 == null : this.flag_document_9.equals(that.flag_document_9));
    equal = equal && (this.flag_document_10 == null ? that.flag_document_10 == null : this.flag_document_10.equals(that.flag_document_10));
    equal = equal && (this.flag_document_11 == null ? that.flag_document_11 == null : this.flag_document_11.equals(that.flag_document_11));
    equal = equal && (this.flag_document_12 == null ? that.flag_document_12 == null : this.flag_document_12.equals(that.flag_document_12));
    equal = equal && (this.flag_document_13 == null ? that.flag_document_13 == null : this.flag_document_13.equals(that.flag_document_13));
    equal = equal && (this.flag_document_14 == null ? that.flag_document_14 == null : this.flag_document_14.equals(that.flag_document_14));
    equal = equal && (this.flag_document_15 == null ? that.flag_document_15 == null : this.flag_document_15.equals(that.flag_document_15));
    equal = equal && (this.flag_document_16 == null ? that.flag_document_16 == null : this.flag_document_16.equals(that.flag_document_16));
    equal = equal && (this.flag_document_17 == null ? that.flag_document_17 == null : this.flag_document_17.equals(that.flag_document_17));
    equal = equal && (this.flag_document_18 == null ? that.flag_document_18 == null : this.flag_document_18.equals(that.flag_document_18));
    equal = equal && (this.flag_document_19 == null ? that.flag_document_19 == null : this.flag_document_19.equals(that.flag_document_19));
    equal = equal && (this.flag_document_20 == null ? that.flag_document_20 == null : this.flag_document_20.equals(that.flag_document_20));
    equal = equal && (this.flag_document_21 == null ? that.flag_document_21 == null : this.flag_document_21.equals(that.flag_document_21));
    equal = equal && (this.amt_req_credit_bureau_hour == null ? that.amt_req_credit_bureau_hour == null : this.amt_req_credit_bureau_hour.equals(that.amt_req_credit_bureau_hour));
    equal = equal && (this.amt_req_credit_bureau_day == null ? that.amt_req_credit_bureau_day == null : this.amt_req_credit_bureau_day.equals(that.amt_req_credit_bureau_day));
    equal = equal && (this.amt_req_credit_bureau_week == null ? that.amt_req_credit_bureau_week == null : this.amt_req_credit_bureau_week.equals(that.amt_req_credit_bureau_week));
    equal = equal && (this.amt_req_credit_bureau_mon == null ? that.amt_req_credit_bureau_mon == null : this.amt_req_credit_bureau_mon.equals(that.amt_req_credit_bureau_mon));
    equal = equal && (this.amt_req_credit_bureau_qrt == null ? that.amt_req_credit_bureau_qrt == null : this.amt_req_credit_bureau_qrt.equals(that.amt_req_credit_bureau_qrt));
    equal = equal && (this.amt_req_credit_bureau_year == null ? that.amt_req_credit_bureau_year == null : this.amt_req_credit_bureau_year.equals(that.amt_req_credit_bureau_year));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.sk_id_curr = JdbcWritableBridge.readInteger(1, __dbResults);
    this.name_contract_type = JdbcWritableBridge.readString(2, __dbResults);
    this.code_gender = JdbcWritableBridge.readString(3, __dbResults);
    this.flag_own_car = JdbcWritableBridge.readString(4, __dbResults);
    this.flag_own_realty = JdbcWritableBridge.readString(5, __dbResults);
    this.cnt_children = JdbcWritableBridge.readInteger(6, __dbResults);
    this.amt_income_total = JdbcWritableBridge.readDouble(7, __dbResults);
    this.amt_credit = JdbcWritableBridge.readDouble(8, __dbResults);
    this.amt_annuity = JdbcWritableBridge.readDouble(9, __dbResults);
    this.amt_goods_price = JdbcWritableBridge.readDouble(10, __dbResults);
    this.name_type_suite = JdbcWritableBridge.readString(11, __dbResults);
    this.name_income_type = JdbcWritableBridge.readString(12, __dbResults);
    this.name_education_type = JdbcWritableBridge.readString(13, __dbResults);
    this.name_family_status = JdbcWritableBridge.readString(14, __dbResults);
    this.name_housing_type = JdbcWritableBridge.readString(15, __dbResults);
    this.region_population_relative = JdbcWritableBridge.readDouble(16, __dbResults);
    this.days_birth = JdbcWritableBridge.readInteger(17, __dbResults);
    this.days_employed = JdbcWritableBridge.readInteger(18, __dbResults);
    this.days_registration = JdbcWritableBridge.readDouble(19, __dbResults);
    this.days_id_publish = JdbcWritableBridge.readInteger(20, __dbResults);
    this.own_car_age = JdbcWritableBridge.readDouble(21, __dbResults);
    this.flag_mobil = JdbcWritableBridge.readInteger(22, __dbResults);
    this.flag_emp_phone = JdbcWritableBridge.readInteger(23, __dbResults);
    this.flag_work_phone = JdbcWritableBridge.readInteger(24, __dbResults);
    this.flag_cont_mobile = JdbcWritableBridge.readInteger(25, __dbResults);
    this.flag_phone = JdbcWritableBridge.readInteger(26, __dbResults);
    this.flag_email = JdbcWritableBridge.readInteger(27, __dbResults);
    this.occupation_type = JdbcWritableBridge.readString(28, __dbResults);
    this.cnt_fam_members = JdbcWritableBridge.readDouble(29, __dbResults);
    this.region_rating_client = JdbcWritableBridge.readInteger(30, __dbResults);
    this.region_rating_client_w_city = JdbcWritableBridge.readInteger(31, __dbResults);
    this.weekday_appr_process_start = JdbcWritableBridge.readString(32, __dbResults);
    this.hour_appr_process_start = JdbcWritableBridge.readInteger(33, __dbResults);
    this.reg_region_not_live_region = JdbcWritableBridge.readInteger(34, __dbResults);
    this.reg_region_not_work_region = JdbcWritableBridge.readInteger(35, __dbResults);
    this.live_region_not_work_region = JdbcWritableBridge.readInteger(36, __dbResults);
    this.reg_city_not_live_city = JdbcWritableBridge.readInteger(37, __dbResults);
    this.reg_city_not_work_city = JdbcWritableBridge.readInteger(38, __dbResults);
    this.live_city_not_work_city = JdbcWritableBridge.readInteger(39, __dbResults);
    this.organization_type = JdbcWritableBridge.readString(40, __dbResults);
    this.ext_source_1 = JdbcWritableBridge.readDouble(41, __dbResults);
    this.ext_source_2 = JdbcWritableBridge.readDouble(42, __dbResults);
    this.ext_source_3 = JdbcWritableBridge.readDouble(43, __dbResults);
    this.apartments_avg = JdbcWritableBridge.readDouble(44, __dbResults);
    this.basementarea_avg = JdbcWritableBridge.readDouble(45, __dbResults);
    this.years_beginexpluatation_avg = JdbcWritableBridge.readDouble(46, __dbResults);
    this.years_build_avg = JdbcWritableBridge.readDouble(47, __dbResults);
    this.commonarea_avg = JdbcWritableBridge.readDouble(48, __dbResults);
    this.elevators_avg = JdbcWritableBridge.readDouble(49, __dbResults);
    this.entrances_avg = JdbcWritableBridge.readDouble(50, __dbResults);
    this.floorsmax_avg = JdbcWritableBridge.readDouble(51, __dbResults);
    this.floorsmin_avg = JdbcWritableBridge.readDouble(52, __dbResults);
    this.landarea_avg = JdbcWritableBridge.readDouble(53, __dbResults);
    this.livingapartments_avg = JdbcWritableBridge.readDouble(54, __dbResults);
    this.livingarea_avg = JdbcWritableBridge.readDouble(55, __dbResults);
    this.nonlivingapartments_avg = JdbcWritableBridge.readDouble(56, __dbResults);
    this.nonlivingarea_avg = JdbcWritableBridge.readDouble(57, __dbResults);
    this.apartments_mode = JdbcWritableBridge.readDouble(58, __dbResults);
    this.basementarea_mode = JdbcWritableBridge.readDouble(59, __dbResults);
    this.years_beginexpluatation_mode = JdbcWritableBridge.readDouble(60, __dbResults);
    this.years_build_mode = JdbcWritableBridge.readDouble(61, __dbResults);
    this.commonarea_mode = JdbcWritableBridge.readDouble(62, __dbResults);
    this.elevators_mode = JdbcWritableBridge.readDouble(63, __dbResults);
    this.entrances_mode = JdbcWritableBridge.readDouble(64, __dbResults);
    this.floorsmax_mode = JdbcWritableBridge.readDouble(65, __dbResults);
    this.floorsmin_mode = JdbcWritableBridge.readDouble(66, __dbResults);
    this.landarea_mode = JdbcWritableBridge.readDouble(67, __dbResults);
    this.livingapartments_mode = JdbcWritableBridge.readDouble(68, __dbResults);
    this.livingarea_mode = JdbcWritableBridge.readDouble(69, __dbResults);
    this.nonlivingapartments_mode = JdbcWritableBridge.readDouble(70, __dbResults);
    this.nonlivingarea_mode = JdbcWritableBridge.readDouble(71, __dbResults);
    this.apartments_medi = JdbcWritableBridge.readDouble(72, __dbResults);
    this.basementarea_medi = JdbcWritableBridge.readDouble(73, __dbResults);
    this.years_beginexpluatation_medi = JdbcWritableBridge.readDouble(74, __dbResults);
    this.years_build_medi = JdbcWritableBridge.readDouble(75, __dbResults);
    this.commonarea_medi = JdbcWritableBridge.readDouble(76, __dbResults);
    this.elevators_medi = JdbcWritableBridge.readDouble(77, __dbResults);
    this.entrances_medi = JdbcWritableBridge.readDouble(78, __dbResults);
    this.floorsmax_medi = JdbcWritableBridge.readDouble(79, __dbResults);
    this.floorsmin_medi = JdbcWritableBridge.readDouble(80, __dbResults);
    this.landarea_medi = JdbcWritableBridge.readDouble(81, __dbResults);
    this.livingapartments_medi = JdbcWritableBridge.readDouble(82, __dbResults);
    this.livingarea_medi = JdbcWritableBridge.readDouble(83, __dbResults);
    this.nonlivingapartments_medi = JdbcWritableBridge.readDouble(84, __dbResults);
    this.nonlivingarea_medi = JdbcWritableBridge.readDouble(85, __dbResults);
    this.fondkapremont_mode = JdbcWritableBridge.readString(86, __dbResults);
    this.housetype_mode = JdbcWritableBridge.readString(87, __dbResults);
    this.totalarea_mode = JdbcWritableBridge.readDouble(88, __dbResults);
    this.wallsmaterial_mode = JdbcWritableBridge.readString(89, __dbResults);
    this.emergencystate_mode = JdbcWritableBridge.readString(90, __dbResults);
    this.obs_30_cnt_social_circle = JdbcWritableBridge.readDouble(91, __dbResults);
    this.def_30_cnt_social_circle = JdbcWritableBridge.readDouble(92, __dbResults);
    this.obs_60_cnt_social_circle = JdbcWritableBridge.readDouble(93, __dbResults);
    this.def_60_cnt_social_circle = JdbcWritableBridge.readDouble(94, __dbResults);
    this.days_last_phone_change = JdbcWritableBridge.readDouble(95, __dbResults);
    this.flag_document_2 = JdbcWritableBridge.readInteger(96, __dbResults);
    this.flag_document_3 = JdbcWritableBridge.readInteger(97, __dbResults);
    this.flag_document_4 = JdbcWritableBridge.readInteger(98, __dbResults);
    this.flag_document_5 = JdbcWritableBridge.readInteger(99, __dbResults);
    this.flag_document_6 = JdbcWritableBridge.readInteger(100, __dbResults);
    this.flag_document_7 = JdbcWritableBridge.readInteger(101, __dbResults);
    this.flag_document_8 = JdbcWritableBridge.readInteger(102, __dbResults);
    this.flag_document_9 = JdbcWritableBridge.readInteger(103, __dbResults);
    this.flag_document_10 = JdbcWritableBridge.readInteger(104, __dbResults);
    this.flag_document_11 = JdbcWritableBridge.readInteger(105, __dbResults);
    this.flag_document_12 = JdbcWritableBridge.readInteger(106, __dbResults);
    this.flag_document_13 = JdbcWritableBridge.readInteger(107, __dbResults);
    this.flag_document_14 = JdbcWritableBridge.readInteger(108, __dbResults);
    this.flag_document_15 = JdbcWritableBridge.readInteger(109, __dbResults);
    this.flag_document_16 = JdbcWritableBridge.readInteger(110, __dbResults);
    this.flag_document_17 = JdbcWritableBridge.readInteger(111, __dbResults);
    this.flag_document_18 = JdbcWritableBridge.readInteger(112, __dbResults);
    this.flag_document_19 = JdbcWritableBridge.readInteger(113, __dbResults);
    this.flag_document_20 = JdbcWritableBridge.readInteger(114, __dbResults);
    this.flag_document_21 = JdbcWritableBridge.readInteger(115, __dbResults);
    this.amt_req_credit_bureau_hour = JdbcWritableBridge.readDouble(116, __dbResults);
    this.amt_req_credit_bureau_day = JdbcWritableBridge.readDouble(117, __dbResults);
    this.amt_req_credit_bureau_week = JdbcWritableBridge.readDouble(118, __dbResults);
    this.amt_req_credit_bureau_mon = JdbcWritableBridge.readDouble(119, __dbResults);
    this.amt_req_credit_bureau_qrt = JdbcWritableBridge.readDouble(120, __dbResults);
    this.amt_req_credit_bureau_year = JdbcWritableBridge.readDouble(121, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.sk_id_curr = JdbcWritableBridge.readInteger(1, __dbResults);
    this.name_contract_type = JdbcWritableBridge.readString(2, __dbResults);
    this.code_gender = JdbcWritableBridge.readString(3, __dbResults);
    this.flag_own_car = JdbcWritableBridge.readString(4, __dbResults);
    this.flag_own_realty = JdbcWritableBridge.readString(5, __dbResults);
    this.cnt_children = JdbcWritableBridge.readInteger(6, __dbResults);
    this.amt_income_total = JdbcWritableBridge.readDouble(7, __dbResults);
    this.amt_credit = JdbcWritableBridge.readDouble(8, __dbResults);
    this.amt_annuity = JdbcWritableBridge.readDouble(9, __dbResults);
    this.amt_goods_price = JdbcWritableBridge.readDouble(10, __dbResults);
    this.name_type_suite = JdbcWritableBridge.readString(11, __dbResults);
    this.name_income_type = JdbcWritableBridge.readString(12, __dbResults);
    this.name_education_type = JdbcWritableBridge.readString(13, __dbResults);
    this.name_family_status = JdbcWritableBridge.readString(14, __dbResults);
    this.name_housing_type = JdbcWritableBridge.readString(15, __dbResults);
    this.region_population_relative = JdbcWritableBridge.readDouble(16, __dbResults);
    this.days_birth = JdbcWritableBridge.readInteger(17, __dbResults);
    this.days_employed = JdbcWritableBridge.readInteger(18, __dbResults);
    this.days_registration = JdbcWritableBridge.readDouble(19, __dbResults);
    this.days_id_publish = JdbcWritableBridge.readInteger(20, __dbResults);
    this.own_car_age = JdbcWritableBridge.readDouble(21, __dbResults);
    this.flag_mobil = JdbcWritableBridge.readInteger(22, __dbResults);
    this.flag_emp_phone = JdbcWritableBridge.readInteger(23, __dbResults);
    this.flag_work_phone = JdbcWritableBridge.readInteger(24, __dbResults);
    this.flag_cont_mobile = JdbcWritableBridge.readInteger(25, __dbResults);
    this.flag_phone = JdbcWritableBridge.readInteger(26, __dbResults);
    this.flag_email = JdbcWritableBridge.readInteger(27, __dbResults);
    this.occupation_type = JdbcWritableBridge.readString(28, __dbResults);
    this.cnt_fam_members = JdbcWritableBridge.readDouble(29, __dbResults);
    this.region_rating_client = JdbcWritableBridge.readInteger(30, __dbResults);
    this.region_rating_client_w_city = JdbcWritableBridge.readInteger(31, __dbResults);
    this.weekday_appr_process_start = JdbcWritableBridge.readString(32, __dbResults);
    this.hour_appr_process_start = JdbcWritableBridge.readInteger(33, __dbResults);
    this.reg_region_not_live_region = JdbcWritableBridge.readInteger(34, __dbResults);
    this.reg_region_not_work_region = JdbcWritableBridge.readInteger(35, __dbResults);
    this.live_region_not_work_region = JdbcWritableBridge.readInteger(36, __dbResults);
    this.reg_city_not_live_city = JdbcWritableBridge.readInteger(37, __dbResults);
    this.reg_city_not_work_city = JdbcWritableBridge.readInteger(38, __dbResults);
    this.live_city_not_work_city = JdbcWritableBridge.readInteger(39, __dbResults);
    this.organization_type = JdbcWritableBridge.readString(40, __dbResults);
    this.ext_source_1 = JdbcWritableBridge.readDouble(41, __dbResults);
    this.ext_source_2 = JdbcWritableBridge.readDouble(42, __dbResults);
    this.ext_source_3 = JdbcWritableBridge.readDouble(43, __dbResults);
    this.apartments_avg = JdbcWritableBridge.readDouble(44, __dbResults);
    this.basementarea_avg = JdbcWritableBridge.readDouble(45, __dbResults);
    this.years_beginexpluatation_avg = JdbcWritableBridge.readDouble(46, __dbResults);
    this.years_build_avg = JdbcWritableBridge.readDouble(47, __dbResults);
    this.commonarea_avg = JdbcWritableBridge.readDouble(48, __dbResults);
    this.elevators_avg = JdbcWritableBridge.readDouble(49, __dbResults);
    this.entrances_avg = JdbcWritableBridge.readDouble(50, __dbResults);
    this.floorsmax_avg = JdbcWritableBridge.readDouble(51, __dbResults);
    this.floorsmin_avg = JdbcWritableBridge.readDouble(52, __dbResults);
    this.landarea_avg = JdbcWritableBridge.readDouble(53, __dbResults);
    this.livingapartments_avg = JdbcWritableBridge.readDouble(54, __dbResults);
    this.livingarea_avg = JdbcWritableBridge.readDouble(55, __dbResults);
    this.nonlivingapartments_avg = JdbcWritableBridge.readDouble(56, __dbResults);
    this.nonlivingarea_avg = JdbcWritableBridge.readDouble(57, __dbResults);
    this.apartments_mode = JdbcWritableBridge.readDouble(58, __dbResults);
    this.basementarea_mode = JdbcWritableBridge.readDouble(59, __dbResults);
    this.years_beginexpluatation_mode = JdbcWritableBridge.readDouble(60, __dbResults);
    this.years_build_mode = JdbcWritableBridge.readDouble(61, __dbResults);
    this.commonarea_mode = JdbcWritableBridge.readDouble(62, __dbResults);
    this.elevators_mode = JdbcWritableBridge.readDouble(63, __dbResults);
    this.entrances_mode = JdbcWritableBridge.readDouble(64, __dbResults);
    this.floorsmax_mode = JdbcWritableBridge.readDouble(65, __dbResults);
    this.floorsmin_mode = JdbcWritableBridge.readDouble(66, __dbResults);
    this.landarea_mode = JdbcWritableBridge.readDouble(67, __dbResults);
    this.livingapartments_mode = JdbcWritableBridge.readDouble(68, __dbResults);
    this.livingarea_mode = JdbcWritableBridge.readDouble(69, __dbResults);
    this.nonlivingapartments_mode = JdbcWritableBridge.readDouble(70, __dbResults);
    this.nonlivingarea_mode = JdbcWritableBridge.readDouble(71, __dbResults);
    this.apartments_medi = JdbcWritableBridge.readDouble(72, __dbResults);
    this.basementarea_medi = JdbcWritableBridge.readDouble(73, __dbResults);
    this.years_beginexpluatation_medi = JdbcWritableBridge.readDouble(74, __dbResults);
    this.years_build_medi = JdbcWritableBridge.readDouble(75, __dbResults);
    this.commonarea_medi = JdbcWritableBridge.readDouble(76, __dbResults);
    this.elevators_medi = JdbcWritableBridge.readDouble(77, __dbResults);
    this.entrances_medi = JdbcWritableBridge.readDouble(78, __dbResults);
    this.floorsmax_medi = JdbcWritableBridge.readDouble(79, __dbResults);
    this.floorsmin_medi = JdbcWritableBridge.readDouble(80, __dbResults);
    this.landarea_medi = JdbcWritableBridge.readDouble(81, __dbResults);
    this.livingapartments_medi = JdbcWritableBridge.readDouble(82, __dbResults);
    this.livingarea_medi = JdbcWritableBridge.readDouble(83, __dbResults);
    this.nonlivingapartments_medi = JdbcWritableBridge.readDouble(84, __dbResults);
    this.nonlivingarea_medi = JdbcWritableBridge.readDouble(85, __dbResults);
    this.fondkapremont_mode = JdbcWritableBridge.readString(86, __dbResults);
    this.housetype_mode = JdbcWritableBridge.readString(87, __dbResults);
    this.totalarea_mode = JdbcWritableBridge.readDouble(88, __dbResults);
    this.wallsmaterial_mode = JdbcWritableBridge.readString(89, __dbResults);
    this.emergencystate_mode = JdbcWritableBridge.readString(90, __dbResults);
    this.obs_30_cnt_social_circle = JdbcWritableBridge.readDouble(91, __dbResults);
    this.def_30_cnt_social_circle = JdbcWritableBridge.readDouble(92, __dbResults);
    this.obs_60_cnt_social_circle = JdbcWritableBridge.readDouble(93, __dbResults);
    this.def_60_cnt_social_circle = JdbcWritableBridge.readDouble(94, __dbResults);
    this.days_last_phone_change = JdbcWritableBridge.readDouble(95, __dbResults);
    this.flag_document_2 = JdbcWritableBridge.readInteger(96, __dbResults);
    this.flag_document_3 = JdbcWritableBridge.readInteger(97, __dbResults);
    this.flag_document_4 = JdbcWritableBridge.readInteger(98, __dbResults);
    this.flag_document_5 = JdbcWritableBridge.readInteger(99, __dbResults);
    this.flag_document_6 = JdbcWritableBridge.readInteger(100, __dbResults);
    this.flag_document_7 = JdbcWritableBridge.readInteger(101, __dbResults);
    this.flag_document_8 = JdbcWritableBridge.readInteger(102, __dbResults);
    this.flag_document_9 = JdbcWritableBridge.readInteger(103, __dbResults);
    this.flag_document_10 = JdbcWritableBridge.readInteger(104, __dbResults);
    this.flag_document_11 = JdbcWritableBridge.readInteger(105, __dbResults);
    this.flag_document_12 = JdbcWritableBridge.readInteger(106, __dbResults);
    this.flag_document_13 = JdbcWritableBridge.readInteger(107, __dbResults);
    this.flag_document_14 = JdbcWritableBridge.readInteger(108, __dbResults);
    this.flag_document_15 = JdbcWritableBridge.readInteger(109, __dbResults);
    this.flag_document_16 = JdbcWritableBridge.readInteger(110, __dbResults);
    this.flag_document_17 = JdbcWritableBridge.readInteger(111, __dbResults);
    this.flag_document_18 = JdbcWritableBridge.readInteger(112, __dbResults);
    this.flag_document_19 = JdbcWritableBridge.readInteger(113, __dbResults);
    this.flag_document_20 = JdbcWritableBridge.readInteger(114, __dbResults);
    this.flag_document_21 = JdbcWritableBridge.readInteger(115, __dbResults);
    this.amt_req_credit_bureau_hour = JdbcWritableBridge.readDouble(116, __dbResults);
    this.amt_req_credit_bureau_day = JdbcWritableBridge.readDouble(117, __dbResults);
    this.amt_req_credit_bureau_week = JdbcWritableBridge.readDouble(118, __dbResults);
    this.amt_req_credit_bureau_mon = JdbcWritableBridge.readDouble(119, __dbResults);
    this.amt_req_credit_bureau_qrt = JdbcWritableBridge.readDouble(120, __dbResults);
    this.amt_req_credit_bureau_year = JdbcWritableBridge.readDouble(121, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(sk_id_curr, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(name_contract_type, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(code_gender, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flag_own_car, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flag_own_realty, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(cnt_children, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_income_total, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_credit, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_annuity, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_goods_price, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(name_type_suite, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_income_type, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_education_type, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_family_status, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_housing_type, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(region_population_relative, 16 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(days_birth, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(days_employed, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(days_registration, 19 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(days_id_publish, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(own_car_age, 21 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_mobil, 22 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_emp_phone, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_work_phone, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_cont_mobile, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_phone, 26 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_email, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(occupation_type, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(cnt_fam_members, 29 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(region_rating_client, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(region_rating_client_w_city, 31 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(weekday_appr_process_start, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(hour_appr_process_start, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(reg_region_not_live_region, 34 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(reg_region_not_work_region, 35 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(live_region_not_work_region, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(reg_city_not_live_city, 37 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(reg_city_not_work_city, 38 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(live_city_not_work_city, 39 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(organization_type, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(ext_source_1, 41 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(ext_source_2, 42 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(ext_source_3, 43 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(apartments_avg, 44 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(basementarea_avg, 45 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(years_beginexpluatation_avg, 46 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(years_build_avg, 47 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(commonarea_avg, 48 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(elevators_avg, 49 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(entrances_avg, 50 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(floorsmax_avg, 51 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(floorsmin_avg, 52 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(landarea_avg, 53 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(livingapartments_avg, 54 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(livingarea_avg, 55 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(nonlivingapartments_avg, 56 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(nonlivingarea_avg, 57 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(apartments_mode, 58 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(basementarea_mode, 59 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(years_beginexpluatation_mode, 60 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(years_build_mode, 61 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(commonarea_mode, 62 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(elevators_mode, 63 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(entrances_mode, 64 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(floorsmax_mode, 65 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(floorsmin_mode, 66 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(landarea_mode, 67 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(livingapartments_mode, 68 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(livingarea_mode, 69 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(nonlivingapartments_mode, 70 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(nonlivingarea_mode, 71 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(apartments_medi, 72 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(basementarea_medi, 73 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(years_beginexpluatation_medi, 74 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(years_build_medi, 75 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(commonarea_medi, 76 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(elevators_medi, 77 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(entrances_medi, 78 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(floorsmax_medi, 79 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(floorsmin_medi, 80 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(landarea_medi, 81 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(livingapartments_medi, 82 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(livingarea_medi, 83 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(nonlivingapartments_medi, 84 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(nonlivingarea_medi, 85 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(fondkapremont_mode, 86 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(housetype_mode, 87 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(totalarea_mode, 88 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(wallsmaterial_mode, 89 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(emergencystate_mode, 90 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(obs_30_cnt_social_circle, 91 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(def_30_cnt_social_circle, 92 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(obs_60_cnt_social_circle, 93 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(def_60_cnt_social_circle, 94 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(days_last_phone_change, 95 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_2, 96 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_3, 97 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_4, 98 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_5, 99 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_6, 100 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_7, 101 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_8, 102 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_9, 103 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_10, 104 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_11, 105 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_12, 106 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_13, 107 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_14, 108 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_15, 109 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_16, 110 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_17, 111 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_18, 112 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_19, 113 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_20, 114 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_21, 115 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_req_credit_bureau_hour, 116 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_req_credit_bureau_day, 117 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_req_credit_bureau_week, 118 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_req_credit_bureau_mon, 119 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_req_credit_bureau_qrt, 120 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_req_credit_bureau_year, 121 + __off, 8, __dbStmt);
    return 121;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(sk_id_curr, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(name_contract_type, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(code_gender, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flag_own_car, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(flag_own_realty, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(cnt_children, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_income_total, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_credit, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_annuity, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_goods_price, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(name_type_suite, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_income_type, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_education_type, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_family_status, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_housing_type, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(region_population_relative, 16 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(days_birth, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(days_employed, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(days_registration, 19 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(days_id_publish, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(own_car_age, 21 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_mobil, 22 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_emp_phone, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_work_phone, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_cont_mobile, 25 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_phone, 26 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_email, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(occupation_type, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(cnt_fam_members, 29 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(region_rating_client, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(region_rating_client_w_city, 31 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(weekday_appr_process_start, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(hour_appr_process_start, 33 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(reg_region_not_live_region, 34 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(reg_region_not_work_region, 35 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(live_region_not_work_region, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(reg_city_not_live_city, 37 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(reg_city_not_work_city, 38 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(live_city_not_work_city, 39 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(organization_type, 40 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(ext_source_1, 41 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(ext_source_2, 42 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(ext_source_3, 43 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(apartments_avg, 44 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(basementarea_avg, 45 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(years_beginexpluatation_avg, 46 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(years_build_avg, 47 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(commonarea_avg, 48 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(elevators_avg, 49 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(entrances_avg, 50 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(floorsmax_avg, 51 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(floorsmin_avg, 52 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(landarea_avg, 53 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(livingapartments_avg, 54 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(livingarea_avg, 55 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(nonlivingapartments_avg, 56 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(nonlivingarea_avg, 57 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(apartments_mode, 58 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(basementarea_mode, 59 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(years_beginexpluatation_mode, 60 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(years_build_mode, 61 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(commonarea_mode, 62 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(elevators_mode, 63 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(entrances_mode, 64 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(floorsmax_mode, 65 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(floorsmin_mode, 66 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(landarea_mode, 67 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(livingapartments_mode, 68 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(livingarea_mode, 69 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(nonlivingapartments_mode, 70 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(nonlivingarea_mode, 71 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(apartments_medi, 72 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(basementarea_medi, 73 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(years_beginexpluatation_medi, 74 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(years_build_medi, 75 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(commonarea_medi, 76 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(elevators_medi, 77 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(entrances_medi, 78 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(floorsmax_medi, 79 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(floorsmin_medi, 80 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(landarea_medi, 81 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(livingapartments_medi, 82 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(livingarea_medi, 83 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(nonlivingapartments_medi, 84 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(nonlivingarea_medi, 85 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(fondkapremont_mode, 86 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(housetype_mode, 87 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(totalarea_mode, 88 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(wallsmaterial_mode, 89 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(emergencystate_mode, 90 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(obs_30_cnt_social_circle, 91 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(def_30_cnt_social_circle, 92 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(obs_60_cnt_social_circle, 93 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(def_60_cnt_social_circle, 94 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(days_last_phone_change, 95 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_2, 96 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_3, 97 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_4, 98 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_5, 99 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_6, 100 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_7, 101 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_8, 102 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_9, 103 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_10, 104 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_11, 105 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_12, 106 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_13, 107 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_14, 108 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_15, 109 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_16, 110 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_17, 111 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_18, 112 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_19, 113 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_20, 114 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(flag_document_21, 115 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_req_credit_bureau_hour, 116 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_req_credit_bureau_day, 117 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_req_credit_bureau_week, 118 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_req_credit_bureau_mon, 119 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_req_credit_bureau_qrt, 120 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(amt_req_credit_bureau_year, 121 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.sk_id_curr = null;
    } else {
    this.sk_id_curr = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.name_contract_type = null;
    } else {
    this.name_contract_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.code_gender = null;
    } else {
    this.code_gender = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flag_own_car = null;
    } else {
    this.flag_own_car = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flag_own_realty = null;
    } else {
    this.flag_own_realty = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cnt_children = null;
    } else {
    this.cnt_children = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.amt_income_total = null;
    } else {
    this.amt_income_total = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.amt_credit = null;
    } else {
    this.amt_credit = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.amt_annuity = null;
    } else {
    this.amt_annuity = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.amt_goods_price = null;
    } else {
    this.amt_goods_price = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.name_type_suite = null;
    } else {
    this.name_type_suite = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.name_income_type = null;
    } else {
    this.name_income_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.name_education_type = null;
    } else {
    this.name_education_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.name_family_status = null;
    } else {
    this.name_family_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.name_housing_type = null;
    } else {
    this.name_housing_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.region_population_relative = null;
    } else {
    this.region_population_relative = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.days_birth = null;
    } else {
    this.days_birth = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.days_employed = null;
    } else {
    this.days_employed = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.days_registration = null;
    } else {
    this.days_registration = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.days_id_publish = null;
    } else {
    this.days_id_publish = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.own_car_age = null;
    } else {
    this.own_car_age = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_mobil = null;
    } else {
    this.flag_mobil = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_emp_phone = null;
    } else {
    this.flag_emp_phone = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_work_phone = null;
    } else {
    this.flag_work_phone = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_cont_mobile = null;
    } else {
    this.flag_cont_mobile = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_phone = null;
    } else {
    this.flag_phone = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_email = null;
    } else {
    this.flag_email = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.occupation_type = null;
    } else {
    this.occupation_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cnt_fam_members = null;
    } else {
    this.cnt_fam_members = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.region_rating_client = null;
    } else {
    this.region_rating_client = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.region_rating_client_w_city = null;
    } else {
    this.region_rating_client_w_city = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.weekday_appr_process_start = null;
    } else {
    this.weekday_appr_process_start = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.hour_appr_process_start = null;
    } else {
    this.hour_appr_process_start = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.reg_region_not_live_region = null;
    } else {
    this.reg_region_not_live_region = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.reg_region_not_work_region = null;
    } else {
    this.reg_region_not_work_region = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.live_region_not_work_region = null;
    } else {
    this.live_region_not_work_region = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.reg_city_not_live_city = null;
    } else {
    this.reg_city_not_live_city = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.reg_city_not_work_city = null;
    } else {
    this.reg_city_not_work_city = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.live_city_not_work_city = null;
    } else {
    this.live_city_not_work_city = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.organization_type = null;
    } else {
    this.organization_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ext_source_1 = null;
    } else {
    this.ext_source_1 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.ext_source_2 = null;
    } else {
    this.ext_source_2 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.ext_source_3 = null;
    } else {
    this.ext_source_3 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.apartments_avg = null;
    } else {
    this.apartments_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.basementarea_avg = null;
    } else {
    this.basementarea_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.years_beginexpluatation_avg = null;
    } else {
    this.years_beginexpluatation_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.years_build_avg = null;
    } else {
    this.years_build_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.commonarea_avg = null;
    } else {
    this.commonarea_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.elevators_avg = null;
    } else {
    this.elevators_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.entrances_avg = null;
    } else {
    this.entrances_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.floorsmax_avg = null;
    } else {
    this.floorsmax_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.floorsmin_avg = null;
    } else {
    this.floorsmin_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.landarea_avg = null;
    } else {
    this.landarea_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.livingapartments_avg = null;
    } else {
    this.livingapartments_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.livingarea_avg = null;
    } else {
    this.livingarea_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.nonlivingapartments_avg = null;
    } else {
    this.nonlivingapartments_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.nonlivingarea_avg = null;
    } else {
    this.nonlivingarea_avg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.apartments_mode = null;
    } else {
    this.apartments_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.basementarea_mode = null;
    } else {
    this.basementarea_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.years_beginexpluatation_mode = null;
    } else {
    this.years_beginexpluatation_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.years_build_mode = null;
    } else {
    this.years_build_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.commonarea_mode = null;
    } else {
    this.commonarea_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.elevators_mode = null;
    } else {
    this.elevators_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.entrances_mode = null;
    } else {
    this.entrances_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.floorsmax_mode = null;
    } else {
    this.floorsmax_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.floorsmin_mode = null;
    } else {
    this.floorsmin_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.landarea_mode = null;
    } else {
    this.landarea_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.livingapartments_mode = null;
    } else {
    this.livingapartments_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.livingarea_mode = null;
    } else {
    this.livingarea_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.nonlivingapartments_mode = null;
    } else {
    this.nonlivingapartments_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.nonlivingarea_mode = null;
    } else {
    this.nonlivingarea_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.apartments_medi = null;
    } else {
    this.apartments_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.basementarea_medi = null;
    } else {
    this.basementarea_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.years_beginexpluatation_medi = null;
    } else {
    this.years_beginexpluatation_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.years_build_medi = null;
    } else {
    this.years_build_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.commonarea_medi = null;
    } else {
    this.commonarea_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.elevators_medi = null;
    } else {
    this.elevators_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.entrances_medi = null;
    } else {
    this.entrances_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.floorsmax_medi = null;
    } else {
    this.floorsmax_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.floorsmin_medi = null;
    } else {
    this.floorsmin_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.landarea_medi = null;
    } else {
    this.landarea_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.livingapartments_medi = null;
    } else {
    this.livingapartments_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.livingarea_medi = null;
    } else {
    this.livingarea_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.nonlivingapartments_medi = null;
    } else {
    this.nonlivingapartments_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.nonlivingarea_medi = null;
    } else {
    this.nonlivingarea_medi = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.fondkapremont_mode = null;
    } else {
    this.fondkapremont_mode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.housetype_mode = null;
    } else {
    this.housetype_mode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.totalarea_mode = null;
    } else {
    this.totalarea_mode = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.wallsmaterial_mode = null;
    } else {
    this.wallsmaterial_mode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.emergencystate_mode = null;
    } else {
    this.emergencystate_mode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.obs_30_cnt_social_circle = null;
    } else {
    this.obs_30_cnt_social_circle = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.def_30_cnt_social_circle = null;
    } else {
    this.def_30_cnt_social_circle = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.obs_60_cnt_social_circle = null;
    } else {
    this.obs_60_cnt_social_circle = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.def_60_cnt_social_circle = null;
    } else {
    this.def_60_cnt_social_circle = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.days_last_phone_change = null;
    } else {
    this.days_last_phone_change = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_2 = null;
    } else {
    this.flag_document_2 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_3 = null;
    } else {
    this.flag_document_3 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_4 = null;
    } else {
    this.flag_document_4 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_5 = null;
    } else {
    this.flag_document_5 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_6 = null;
    } else {
    this.flag_document_6 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_7 = null;
    } else {
    this.flag_document_7 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_8 = null;
    } else {
    this.flag_document_8 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_9 = null;
    } else {
    this.flag_document_9 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_10 = null;
    } else {
    this.flag_document_10 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_11 = null;
    } else {
    this.flag_document_11 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_12 = null;
    } else {
    this.flag_document_12 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_13 = null;
    } else {
    this.flag_document_13 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_14 = null;
    } else {
    this.flag_document_14 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_15 = null;
    } else {
    this.flag_document_15 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_16 = null;
    } else {
    this.flag_document_16 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_17 = null;
    } else {
    this.flag_document_17 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_18 = null;
    } else {
    this.flag_document_18 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_19 = null;
    } else {
    this.flag_document_19 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_20 = null;
    } else {
    this.flag_document_20 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.flag_document_21 = null;
    } else {
    this.flag_document_21 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.amt_req_credit_bureau_hour = null;
    } else {
    this.amt_req_credit_bureau_hour = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.amt_req_credit_bureau_day = null;
    } else {
    this.amt_req_credit_bureau_day = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.amt_req_credit_bureau_week = null;
    } else {
    this.amt_req_credit_bureau_week = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.amt_req_credit_bureau_mon = null;
    } else {
    this.amt_req_credit_bureau_mon = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.amt_req_credit_bureau_qrt = null;
    } else {
    this.amt_req_credit_bureau_qrt = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.amt_req_credit_bureau_year = null;
    } else {
    this.amt_req_credit_bureau_year = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.sk_id_curr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sk_id_curr);
    }
    if (null == this.name_contract_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_contract_type);
    }
    if (null == this.code_gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, code_gender);
    }
    if (null == this.flag_own_car) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flag_own_car);
    }
    if (null == this.flag_own_realty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flag_own_realty);
    }
    if (null == this.cnt_children) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cnt_children);
    }
    if (null == this.amt_income_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_income_total);
    }
    if (null == this.amt_credit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_credit);
    }
    if (null == this.amt_annuity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_annuity);
    }
    if (null == this.amt_goods_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_goods_price);
    }
    if (null == this.name_type_suite) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_type_suite);
    }
    if (null == this.name_income_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_income_type);
    }
    if (null == this.name_education_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_education_type);
    }
    if (null == this.name_family_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_family_status);
    }
    if (null == this.name_housing_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_housing_type);
    }
    if (null == this.region_population_relative) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.region_population_relative);
    }
    if (null == this.days_birth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.days_birth);
    }
    if (null == this.days_employed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.days_employed);
    }
    if (null == this.days_registration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.days_registration);
    }
    if (null == this.days_id_publish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.days_id_publish);
    }
    if (null == this.own_car_age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.own_car_age);
    }
    if (null == this.flag_mobil) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_mobil);
    }
    if (null == this.flag_emp_phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_emp_phone);
    }
    if (null == this.flag_work_phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_work_phone);
    }
    if (null == this.flag_cont_mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_cont_mobile);
    }
    if (null == this.flag_phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_phone);
    }
    if (null == this.flag_email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_email);
    }
    if (null == this.occupation_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, occupation_type);
    }
    if (null == this.cnt_fam_members) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.cnt_fam_members);
    }
    if (null == this.region_rating_client) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.region_rating_client);
    }
    if (null == this.region_rating_client_w_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.region_rating_client_w_city);
    }
    if (null == this.weekday_appr_process_start) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, weekday_appr_process_start);
    }
    if (null == this.hour_appr_process_start) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hour_appr_process_start);
    }
    if (null == this.reg_region_not_live_region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.reg_region_not_live_region);
    }
    if (null == this.reg_region_not_work_region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.reg_region_not_work_region);
    }
    if (null == this.live_region_not_work_region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.live_region_not_work_region);
    }
    if (null == this.reg_city_not_live_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.reg_city_not_live_city);
    }
    if (null == this.reg_city_not_work_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.reg_city_not_work_city);
    }
    if (null == this.live_city_not_work_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.live_city_not_work_city);
    }
    if (null == this.organization_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organization_type);
    }
    if (null == this.ext_source_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.ext_source_1);
    }
    if (null == this.ext_source_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.ext_source_2);
    }
    if (null == this.ext_source_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.ext_source_3);
    }
    if (null == this.apartments_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.apartments_avg);
    }
    if (null == this.basementarea_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.basementarea_avg);
    }
    if (null == this.years_beginexpluatation_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.years_beginexpluatation_avg);
    }
    if (null == this.years_build_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.years_build_avg);
    }
    if (null == this.commonarea_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.commonarea_avg);
    }
    if (null == this.elevators_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.elevators_avg);
    }
    if (null == this.entrances_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.entrances_avg);
    }
    if (null == this.floorsmax_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.floorsmax_avg);
    }
    if (null == this.floorsmin_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.floorsmin_avg);
    }
    if (null == this.landarea_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.landarea_avg);
    }
    if (null == this.livingapartments_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.livingapartments_avg);
    }
    if (null == this.livingarea_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.livingarea_avg);
    }
    if (null == this.nonlivingapartments_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.nonlivingapartments_avg);
    }
    if (null == this.nonlivingarea_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.nonlivingarea_avg);
    }
    if (null == this.apartments_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.apartments_mode);
    }
    if (null == this.basementarea_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.basementarea_mode);
    }
    if (null == this.years_beginexpluatation_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.years_beginexpluatation_mode);
    }
    if (null == this.years_build_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.years_build_mode);
    }
    if (null == this.commonarea_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.commonarea_mode);
    }
    if (null == this.elevators_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.elevators_mode);
    }
    if (null == this.entrances_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.entrances_mode);
    }
    if (null == this.floorsmax_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.floorsmax_mode);
    }
    if (null == this.floorsmin_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.floorsmin_mode);
    }
    if (null == this.landarea_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.landarea_mode);
    }
    if (null == this.livingapartments_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.livingapartments_mode);
    }
    if (null == this.livingarea_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.livingarea_mode);
    }
    if (null == this.nonlivingapartments_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.nonlivingapartments_mode);
    }
    if (null == this.nonlivingarea_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.nonlivingarea_mode);
    }
    if (null == this.apartments_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.apartments_medi);
    }
    if (null == this.basementarea_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.basementarea_medi);
    }
    if (null == this.years_beginexpluatation_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.years_beginexpluatation_medi);
    }
    if (null == this.years_build_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.years_build_medi);
    }
    if (null == this.commonarea_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.commonarea_medi);
    }
    if (null == this.elevators_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.elevators_medi);
    }
    if (null == this.entrances_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.entrances_medi);
    }
    if (null == this.floorsmax_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.floorsmax_medi);
    }
    if (null == this.floorsmin_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.floorsmin_medi);
    }
    if (null == this.landarea_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.landarea_medi);
    }
    if (null == this.livingapartments_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.livingapartments_medi);
    }
    if (null == this.livingarea_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.livingarea_medi);
    }
    if (null == this.nonlivingapartments_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.nonlivingapartments_medi);
    }
    if (null == this.nonlivingarea_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.nonlivingarea_medi);
    }
    if (null == this.fondkapremont_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fondkapremont_mode);
    }
    if (null == this.housetype_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, housetype_mode);
    }
    if (null == this.totalarea_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.totalarea_mode);
    }
    if (null == this.wallsmaterial_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wallsmaterial_mode);
    }
    if (null == this.emergencystate_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, emergencystate_mode);
    }
    if (null == this.obs_30_cnt_social_circle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.obs_30_cnt_social_circle);
    }
    if (null == this.def_30_cnt_social_circle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.def_30_cnt_social_circle);
    }
    if (null == this.obs_60_cnt_social_circle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.obs_60_cnt_social_circle);
    }
    if (null == this.def_60_cnt_social_circle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.def_60_cnt_social_circle);
    }
    if (null == this.days_last_phone_change) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.days_last_phone_change);
    }
    if (null == this.flag_document_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_2);
    }
    if (null == this.flag_document_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_3);
    }
    if (null == this.flag_document_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_4);
    }
    if (null == this.flag_document_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_5);
    }
    if (null == this.flag_document_6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_6);
    }
    if (null == this.flag_document_7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_7);
    }
    if (null == this.flag_document_8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_8);
    }
    if (null == this.flag_document_9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_9);
    }
    if (null == this.flag_document_10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_10);
    }
    if (null == this.flag_document_11) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_11);
    }
    if (null == this.flag_document_12) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_12);
    }
    if (null == this.flag_document_13) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_13);
    }
    if (null == this.flag_document_14) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_14);
    }
    if (null == this.flag_document_15) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_15);
    }
    if (null == this.flag_document_16) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_16);
    }
    if (null == this.flag_document_17) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_17);
    }
    if (null == this.flag_document_18) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_18);
    }
    if (null == this.flag_document_19) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_19);
    }
    if (null == this.flag_document_20) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_20);
    }
    if (null == this.flag_document_21) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_21);
    }
    if (null == this.amt_req_credit_bureau_hour) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_req_credit_bureau_hour);
    }
    if (null == this.amt_req_credit_bureau_day) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_req_credit_bureau_day);
    }
    if (null == this.amt_req_credit_bureau_week) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_req_credit_bureau_week);
    }
    if (null == this.amt_req_credit_bureau_mon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_req_credit_bureau_mon);
    }
    if (null == this.amt_req_credit_bureau_qrt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_req_credit_bureau_qrt);
    }
    if (null == this.amt_req_credit_bureau_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_req_credit_bureau_year);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.sk_id_curr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sk_id_curr);
    }
    if (null == this.name_contract_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_contract_type);
    }
    if (null == this.code_gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, code_gender);
    }
    if (null == this.flag_own_car) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flag_own_car);
    }
    if (null == this.flag_own_realty) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, flag_own_realty);
    }
    if (null == this.cnt_children) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cnt_children);
    }
    if (null == this.amt_income_total) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_income_total);
    }
    if (null == this.amt_credit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_credit);
    }
    if (null == this.amt_annuity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_annuity);
    }
    if (null == this.amt_goods_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_goods_price);
    }
    if (null == this.name_type_suite) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_type_suite);
    }
    if (null == this.name_income_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_income_type);
    }
    if (null == this.name_education_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_education_type);
    }
    if (null == this.name_family_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_family_status);
    }
    if (null == this.name_housing_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_housing_type);
    }
    if (null == this.region_population_relative) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.region_population_relative);
    }
    if (null == this.days_birth) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.days_birth);
    }
    if (null == this.days_employed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.days_employed);
    }
    if (null == this.days_registration) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.days_registration);
    }
    if (null == this.days_id_publish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.days_id_publish);
    }
    if (null == this.own_car_age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.own_car_age);
    }
    if (null == this.flag_mobil) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_mobil);
    }
    if (null == this.flag_emp_phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_emp_phone);
    }
    if (null == this.flag_work_phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_work_phone);
    }
    if (null == this.flag_cont_mobile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_cont_mobile);
    }
    if (null == this.flag_phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_phone);
    }
    if (null == this.flag_email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_email);
    }
    if (null == this.occupation_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, occupation_type);
    }
    if (null == this.cnt_fam_members) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.cnt_fam_members);
    }
    if (null == this.region_rating_client) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.region_rating_client);
    }
    if (null == this.region_rating_client_w_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.region_rating_client_w_city);
    }
    if (null == this.weekday_appr_process_start) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, weekday_appr_process_start);
    }
    if (null == this.hour_appr_process_start) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hour_appr_process_start);
    }
    if (null == this.reg_region_not_live_region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.reg_region_not_live_region);
    }
    if (null == this.reg_region_not_work_region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.reg_region_not_work_region);
    }
    if (null == this.live_region_not_work_region) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.live_region_not_work_region);
    }
    if (null == this.reg_city_not_live_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.reg_city_not_live_city);
    }
    if (null == this.reg_city_not_work_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.reg_city_not_work_city);
    }
    if (null == this.live_city_not_work_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.live_city_not_work_city);
    }
    if (null == this.organization_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organization_type);
    }
    if (null == this.ext_source_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.ext_source_1);
    }
    if (null == this.ext_source_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.ext_source_2);
    }
    if (null == this.ext_source_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.ext_source_3);
    }
    if (null == this.apartments_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.apartments_avg);
    }
    if (null == this.basementarea_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.basementarea_avg);
    }
    if (null == this.years_beginexpluatation_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.years_beginexpluatation_avg);
    }
    if (null == this.years_build_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.years_build_avg);
    }
    if (null == this.commonarea_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.commonarea_avg);
    }
    if (null == this.elevators_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.elevators_avg);
    }
    if (null == this.entrances_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.entrances_avg);
    }
    if (null == this.floorsmax_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.floorsmax_avg);
    }
    if (null == this.floorsmin_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.floorsmin_avg);
    }
    if (null == this.landarea_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.landarea_avg);
    }
    if (null == this.livingapartments_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.livingapartments_avg);
    }
    if (null == this.livingarea_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.livingarea_avg);
    }
    if (null == this.nonlivingapartments_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.nonlivingapartments_avg);
    }
    if (null == this.nonlivingarea_avg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.nonlivingarea_avg);
    }
    if (null == this.apartments_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.apartments_mode);
    }
    if (null == this.basementarea_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.basementarea_mode);
    }
    if (null == this.years_beginexpluatation_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.years_beginexpluatation_mode);
    }
    if (null == this.years_build_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.years_build_mode);
    }
    if (null == this.commonarea_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.commonarea_mode);
    }
    if (null == this.elevators_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.elevators_mode);
    }
    if (null == this.entrances_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.entrances_mode);
    }
    if (null == this.floorsmax_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.floorsmax_mode);
    }
    if (null == this.floorsmin_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.floorsmin_mode);
    }
    if (null == this.landarea_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.landarea_mode);
    }
    if (null == this.livingapartments_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.livingapartments_mode);
    }
    if (null == this.livingarea_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.livingarea_mode);
    }
    if (null == this.nonlivingapartments_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.nonlivingapartments_mode);
    }
    if (null == this.nonlivingarea_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.nonlivingarea_mode);
    }
    if (null == this.apartments_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.apartments_medi);
    }
    if (null == this.basementarea_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.basementarea_medi);
    }
    if (null == this.years_beginexpluatation_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.years_beginexpluatation_medi);
    }
    if (null == this.years_build_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.years_build_medi);
    }
    if (null == this.commonarea_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.commonarea_medi);
    }
    if (null == this.elevators_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.elevators_medi);
    }
    if (null == this.entrances_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.entrances_medi);
    }
    if (null == this.floorsmax_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.floorsmax_medi);
    }
    if (null == this.floorsmin_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.floorsmin_medi);
    }
    if (null == this.landarea_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.landarea_medi);
    }
    if (null == this.livingapartments_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.livingapartments_medi);
    }
    if (null == this.livingarea_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.livingarea_medi);
    }
    if (null == this.nonlivingapartments_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.nonlivingapartments_medi);
    }
    if (null == this.nonlivingarea_medi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.nonlivingarea_medi);
    }
    if (null == this.fondkapremont_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fondkapremont_mode);
    }
    if (null == this.housetype_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, housetype_mode);
    }
    if (null == this.totalarea_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.totalarea_mode);
    }
    if (null == this.wallsmaterial_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wallsmaterial_mode);
    }
    if (null == this.emergencystate_mode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, emergencystate_mode);
    }
    if (null == this.obs_30_cnt_social_circle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.obs_30_cnt_social_circle);
    }
    if (null == this.def_30_cnt_social_circle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.def_30_cnt_social_circle);
    }
    if (null == this.obs_60_cnt_social_circle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.obs_60_cnt_social_circle);
    }
    if (null == this.def_60_cnt_social_circle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.def_60_cnt_social_circle);
    }
    if (null == this.days_last_phone_change) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.days_last_phone_change);
    }
    if (null == this.flag_document_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_2);
    }
    if (null == this.flag_document_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_3);
    }
    if (null == this.flag_document_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_4);
    }
    if (null == this.flag_document_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_5);
    }
    if (null == this.flag_document_6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_6);
    }
    if (null == this.flag_document_7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_7);
    }
    if (null == this.flag_document_8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_8);
    }
    if (null == this.flag_document_9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_9);
    }
    if (null == this.flag_document_10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_10);
    }
    if (null == this.flag_document_11) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_11);
    }
    if (null == this.flag_document_12) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_12);
    }
    if (null == this.flag_document_13) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_13);
    }
    if (null == this.flag_document_14) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_14);
    }
    if (null == this.flag_document_15) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_15);
    }
    if (null == this.flag_document_16) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_16);
    }
    if (null == this.flag_document_17) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_17);
    }
    if (null == this.flag_document_18) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_18);
    }
    if (null == this.flag_document_19) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_19);
    }
    if (null == this.flag_document_20) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_20);
    }
    if (null == this.flag_document_21) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag_document_21);
    }
    if (null == this.amt_req_credit_bureau_hour) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_req_credit_bureau_hour);
    }
    if (null == this.amt_req_credit_bureau_day) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_req_credit_bureau_day);
    }
    if (null == this.amt_req_credit_bureau_week) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_req_credit_bureau_week);
    }
    if (null == this.amt_req_credit_bureau_mon) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_req_credit_bureau_mon);
    }
    if (null == this.amt_req_credit_bureau_qrt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_req_credit_bureau_qrt);
    }
    if (null == this.amt_req_credit_bureau_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amt_req_credit_bureau_year);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(sk_id_curr==null?"null":"" + sk_id_curr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_contract_type==null?"null":name_contract_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(code_gender==null?"null":code_gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_own_car==null?"null":flag_own_car, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_own_realty==null?"null":flag_own_realty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cnt_children==null?"null":"" + cnt_children, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_income_total==null?"null":"" + amt_income_total, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_credit==null?"null":"" + amt_credit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_annuity==null?"null":"" + amt_annuity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_goods_price==null?"null":"" + amt_goods_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_type_suite==null?"null":name_type_suite, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_income_type==null?"null":name_income_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_education_type==null?"null":name_education_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_family_status==null?"null":name_family_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_housing_type==null?"null":name_housing_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_population_relative==null?"null":"" + region_population_relative, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(days_birth==null?"null":"" + days_birth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(days_employed==null?"null":"" + days_employed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(days_registration==null?"null":"" + days_registration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(days_id_publish==null?"null":"" + days_id_publish, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(own_car_age==null?"null":"" + own_car_age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_mobil==null?"null":"" + flag_mobil, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_emp_phone==null?"null":"" + flag_emp_phone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_work_phone==null?"null":"" + flag_work_phone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_cont_mobile==null?"null":"" + flag_cont_mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_phone==null?"null":"" + flag_phone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_email==null?"null":"" + flag_email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(occupation_type==null?"null":occupation_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cnt_fam_members==null?"null":"" + cnt_fam_members, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_rating_client==null?"null":"" + region_rating_client, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_rating_client_w_city==null?"null":"" + region_rating_client_w_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(weekday_appr_process_start==null?"null":weekday_appr_process_start, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hour_appr_process_start==null?"null":"" + hour_appr_process_start, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_region_not_live_region==null?"null":"" + reg_region_not_live_region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_region_not_work_region==null?"null":"" + reg_region_not_work_region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(live_region_not_work_region==null?"null":"" + live_region_not_work_region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_city_not_live_city==null?"null":"" + reg_city_not_live_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_city_not_work_city==null?"null":"" + reg_city_not_work_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(live_city_not_work_city==null?"null":"" + live_city_not_work_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organization_type==null?"null":organization_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext_source_1==null?"null":"" + ext_source_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext_source_2==null?"null":"" + ext_source_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext_source_3==null?"null":"" + ext_source_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(apartments_avg==null?"null":"" + apartments_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(basementarea_avg==null?"null":"" + basementarea_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(years_beginexpluatation_avg==null?"null":"" + years_beginexpluatation_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(years_build_avg==null?"null":"" + years_build_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(commonarea_avg==null?"null":"" + commonarea_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elevators_avg==null?"null":"" + elevators_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(entrances_avg==null?"null":"" + entrances_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floorsmax_avg==null?"null":"" + floorsmax_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floorsmin_avg==null?"null":"" + floorsmin_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(landarea_avg==null?"null":"" + landarea_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(livingapartments_avg==null?"null":"" + livingapartments_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(livingarea_avg==null?"null":"" + livingarea_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nonlivingapartments_avg==null?"null":"" + nonlivingapartments_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nonlivingarea_avg==null?"null":"" + nonlivingarea_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(apartments_mode==null?"null":"" + apartments_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(basementarea_mode==null?"null":"" + basementarea_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(years_beginexpluatation_mode==null?"null":"" + years_beginexpluatation_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(years_build_mode==null?"null":"" + years_build_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(commonarea_mode==null?"null":"" + commonarea_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elevators_mode==null?"null":"" + elevators_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(entrances_mode==null?"null":"" + entrances_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floorsmax_mode==null?"null":"" + floorsmax_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floorsmin_mode==null?"null":"" + floorsmin_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(landarea_mode==null?"null":"" + landarea_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(livingapartments_mode==null?"null":"" + livingapartments_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(livingarea_mode==null?"null":"" + livingarea_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nonlivingapartments_mode==null?"null":"" + nonlivingapartments_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nonlivingarea_mode==null?"null":"" + nonlivingarea_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(apartments_medi==null?"null":"" + apartments_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(basementarea_medi==null?"null":"" + basementarea_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(years_beginexpluatation_medi==null?"null":"" + years_beginexpluatation_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(years_build_medi==null?"null":"" + years_build_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(commonarea_medi==null?"null":"" + commonarea_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elevators_medi==null?"null":"" + elevators_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(entrances_medi==null?"null":"" + entrances_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floorsmax_medi==null?"null":"" + floorsmax_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floorsmin_medi==null?"null":"" + floorsmin_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(landarea_medi==null?"null":"" + landarea_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(livingapartments_medi==null?"null":"" + livingapartments_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(livingarea_medi==null?"null":"" + livingarea_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nonlivingapartments_medi==null?"null":"" + nonlivingapartments_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nonlivingarea_medi==null?"null":"" + nonlivingarea_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fondkapremont_mode==null?"null":fondkapremont_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(housetype_mode==null?"null":housetype_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(totalarea_mode==null?"null":"" + totalarea_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wallsmaterial_mode==null?"null":wallsmaterial_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(emergencystate_mode==null?"null":emergencystate_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(obs_30_cnt_social_circle==null?"null":"" + obs_30_cnt_social_circle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(def_30_cnt_social_circle==null?"null":"" + def_30_cnt_social_circle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(obs_60_cnt_social_circle==null?"null":"" + obs_60_cnt_social_circle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(def_60_cnt_social_circle==null?"null":"" + def_60_cnt_social_circle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(days_last_phone_change==null?"null":"" + days_last_phone_change, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_2==null?"null":"" + flag_document_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_3==null?"null":"" + flag_document_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_4==null?"null":"" + flag_document_4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_5==null?"null":"" + flag_document_5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_6==null?"null":"" + flag_document_6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_7==null?"null":"" + flag_document_7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_8==null?"null":"" + flag_document_8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_9==null?"null":"" + flag_document_9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_10==null?"null":"" + flag_document_10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_11==null?"null":"" + flag_document_11, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_12==null?"null":"" + flag_document_12, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_13==null?"null":"" + flag_document_13, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_14==null?"null":"" + flag_document_14, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_15==null?"null":"" + flag_document_15, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_16==null?"null":"" + flag_document_16, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_17==null?"null":"" + flag_document_17, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_18==null?"null":"" + flag_document_18, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_19==null?"null":"" + flag_document_19, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_20==null?"null":"" + flag_document_20, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_21==null?"null":"" + flag_document_21, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_req_credit_bureau_hour==null?"null":"" + amt_req_credit_bureau_hour, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_req_credit_bureau_day==null?"null":"" + amt_req_credit_bureau_day, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_req_credit_bureau_week==null?"null":"" + amt_req_credit_bureau_week, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_req_credit_bureau_mon==null?"null":"" + amt_req_credit_bureau_mon, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_req_credit_bureau_qrt==null?"null":"" + amt_req_credit_bureau_qrt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_req_credit_bureau_year==null?"null":"" + amt_req_credit_bureau_year, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(sk_id_curr==null?"null":"" + sk_id_curr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_contract_type==null?"null":name_contract_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(code_gender==null?"null":code_gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_own_car==null?"null":flag_own_car, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_own_realty==null?"null":flag_own_realty, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cnt_children==null?"null":"" + cnt_children, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_income_total==null?"null":"" + amt_income_total, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_credit==null?"null":"" + amt_credit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_annuity==null?"null":"" + amt_annuity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_goods_price==null?"null":"" + amt_goods_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_type_suite==null?"null":name_type_suite, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_income_type==null?"null":name_income_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_education_type==null?"null":name_education_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_family_status==null?"null":name_family_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_housing_type==null?"null":name_housing_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_population_relative==null?"null":"" + region_population_relative, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(days_birth==null?"null":"" + days_birth, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(days_employed==null?"null":"" + days_employed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(days_registration==null?"null":"" + days_registration, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(days_id_publish==null?"null":"" + days_id_publish, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(own_car_age==null?"null":"" + own_car_age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_mobil==null?"null":"" + flag_mobil, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_emp_phone==null?"null":"" + flag_emp_phone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_work_phone==null?"null":"" + flag_work_phone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_cont_mobile==null?"null":"" + flag_cont_mobile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_phone==null?"null":"" + flag_phone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_email==null?"null":"" + flag_email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(occupation_type==null?"null":occupation_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cnt_fam_members==null?"null":"" + cnt_fam_members, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_rating_client==null?"null":"" + region_rating_client, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(region_rating_client_w_city==null?"null":"" + region_rating_client_w_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(weekday_appr_process_start==null?"null":weekday_appr_process_start, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hour_appr_process_start==null?"null":"" + hour_appr_process_start, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_region_not_live_region==null?"null":"" + reg_region_not_live_region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_region_not_work_region==null?"null":"" + reg_region_not_work_region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(live_region_not_work_region==null?"null":"" + live_region_not_work_region, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_city_not_live_city==null?"null":"" + reg_city_not_live_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_city_not_work_city==null?"null":"" + reg_city_not_work_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(live_city_not_work_city==null?"null":"" + live_city_not_work_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organization_type==null?"null":organization_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext_source_1==null?"null":"" + ext_source_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext_source_2==null?"null":"" + ext_source_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ext_source_3==null?"null":"" + ext_source_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(apartments_avg==null?"null":"" + apartments_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(basementarea_avg==null?"null":"" + basementarea_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(years_beginexpluatation_avg==null?"null":"" + years_beginexpluatation_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(years_build_avg==null?"null":"" + years_build_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(commonarea_avg==null?"null":"" + commonarea_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elevators_avg==null?"null":"" + elevators_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(entrances_avg==null?"null":"" + entrances_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floorsmax_avg==null?"null":"" + floorsmax_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floorsmin_avg==null?"null":"" + floorsmin_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(landarea_avg==null?"null":"" + landarea_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(livingapartments_avg==null?"null":"" + livingapartments_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(livingarea_avg==null?"null":"" + livingarea_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nonlivingapartments_avg==null?"null":"" + nonlivingapartments_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nonlivingarea_avg==null?"null":"" + nonlivingarea_avg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(apartments_mode==null?"null":"" + apartments_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(basementarea_mode==null?"null":"" + basementarea_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(years_beginexpluatation_mode==null?"null":"" + years_beginexpluatation_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(years_build_mode==null?"null":"" + years_build_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(commonarea_mode==null?"null":"" + commonarea_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elevators_mode==null?"null":"" + elevators_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(entrances_mode==null?"null":"" + entrances_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floorsmax_mode==null?"null":"" + floorsmax_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floorsmin_mode==null?"null":"" + floorsmin_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(landarea_mode==null?"null":"" + landarea_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(livingapartments_mode==null?"null":"" + livingapartments_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(livingarea_mode==null?"null":"" + livingarea_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nonlivingapartments_mode==null?"null":"" + nonlivingapartments_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nonlivingarea_mode==null?"null":"" + nonlivingarea_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(apartments_medi==null?"null":"" + apartments_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(basementarea_medi==null?"null":"" + basementarea_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(years_beginexpluatation_medi==null?"null":"" + years_beginexpluatation_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(years_build_medi==null?"null":"" + years_build_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(commonarea_medi==null?"null":"" + commonarea_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elevators_medi==null?"null":"" + elevators_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(entrances_medi==null?"null":"" + entrances_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floorsmax_medi==null?"null":"" + floorsmax_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(floorsmin_medi==null?"null":"" + floorsmin_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(landarea_medi==null?"null":"" + landarea_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(livingapartments_medi==null?"null":"" + livingapartments_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(livingarea_medi==null?"null":"" + livingarea_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nonlivingapartments_medi==null?"null":"" + nonlivingapartments_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nonlivingarea_medi==null?"null":"" + nonlivingarea_medi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fondkapremont_mode==null?"null":fondkapremont_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(housetype_mode==null?"null":housetype_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(totalarea_mode==null?"null":"" + totalarea_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wallsmaterial_mode==null?"null":wallsmaterial_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(emergencystate_mode==null?"null":emergencystate_mode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(obs_30_cnt_social_circle==null?"null":"" + obs_30_cnt_social_circle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(def_30_cnt_social_circle==null?"null":"" + def_30_cnt_social_circle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(obs_60_cnt_social_circle==null?"null":"" + obs_60_cnt_social_circle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(def_60_cnt_social_circle==null?"null":"" + def_60_cnt_social_circle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(days_last_phone_change==null?"null":"" + days_last_phone_change, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_2==null?"null":"" + flag_document_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_3==null?"null":"" + flag_document_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_4==null?"null":"" + flag_document_4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_5==null?"null":"" + flag_document_5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_6==null?"null":"" + flag_document_6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_7==null?"null":"" + flag_document_7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_8==null?"null":"" + flag_document_8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_9==null?"null":"" + flag_document_9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_10==null?"null":"" + flag_document_10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_11==null?"null":"" + flag_document_11, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_12==null?"null":"" + flag_document_12, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_13==null?"null":"" + flag_document_13, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_14==null?"null":"" + flag_document_14, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_15==null?"null":"" + flag_document_15, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_16==null?"null":"" + flag_document_16, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_17==null?"null":"" + flag_document_17, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_18==null?"null":"" + flag_document_18, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_19==null?"null":"" + flag_document_19, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_20==null?"null":"" + flag_document_20, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag_document_21==null?"null":"" + flag_document_21, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_req_credit_bureau_hour==null?"null":"" + amt_req_credit_bureau_hour, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_req_credit_bureau_day==null?"null":"" + amt_req_credit_bureau_day, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_req_credit_bureau_week==null?"null":"" + amt_req_credit_bureau_week, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_req_credit_bureau_mon==null?"null":"" + amt_req_credit_bureau_mon, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_req_credit_bureau_qrt==null?"null":"" + amt_req_credit_bureau_qrt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amt_req_credit_bureau_year==null?"null":"" + amt_req_credit_bureau_year, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sk_id_curr = null; } else {
      this.sk_id_curr = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_contract_type = null; } else {
      this.name_contract_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.code_gender = null; } else {
      this.code_gender = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flag_own_car = null; } else {
      this.flag_own_car = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flag_own_realty = null; } else {
      this.flag_own_realty = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cnt_children = null; } else {
      this.cnt_children = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_income_total = null; } else {
      this.amt_income_total = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_credit = null; } else {
      this.amt_credit = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_annuity = null; } else {
      this.amt_annuity = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_goods_price = null; } else {
      this.amt_goods_price = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_type_suite = null; } else {
      this.name_type_suite = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_income_type = null; } else {
      this.name_income_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_education_type = null; } else {
      this.name_education_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_family_status = null; } else {
      this.name_family_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_housing_type = null; } else {
      this.name_housing_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.region_population_relative = null; } else {
      this.region_population_relative = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.days_birth = null; } else {
      this.days_birth = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.days_employed = null; } else {
      this.days_employed = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.days_registration = null; } else {
      this.days_registration = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.days_id_publish = null; } else {
      this.days_id_publish = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.own_car_age = null; } else {
      this.own_car_age = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_mobil = null; } else {
      this.flag_mobil = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_emp_phone = null; } else {
      this.flag_emp_phone = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_work_phone = null; } else {
      this.flag_work_phone = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_cont_mobile = null; } else {
      this.flag_cont_mobile = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_phone = null; } else {
      this.flag_phone = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_email = null; } else {
      this.flag_email = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.occupation_type = null; } else {
      this.occupation_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cnt_fam_members = null; } else {
      this.cnt_fam_members = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.region_rating_client = null; } else {
      this.region_rating_client = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.region_rating_client_w_city = null; } else {
      this.region_rating_client_w_city = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.weekday_appr_process_start = null; } else {
      this.weekday_appr_process_start = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hour_appr_process_start = null; } else {
      this.hour_appr_process_start = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reg_region_not_live_region = null; } else {
      this.reg_region_not_live_region = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reg_region_not_work_region = null; } else {
      this.reg_region_not_work_region = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.live_region_not_work_region = null; } else {
      this.live_region_not_work_region = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reg_city_not_live_city = null; } else {
      this.reg_city_not_live_city = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reg_city_not_work_city = null; } else {
      this.reg_city_not_work_city = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.live_city_not_work_city = null; } else {
      this.live_city_not_work_city = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.organization_type = null; } else {
      this.organization_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ext_source_1 = null; } else {
      this.ext_source_1 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ext_source_2 = null; } else {
      this.ext_source_2 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ext_source_3 = null; } else {
      this.ext_source_3 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.apartments_avg = null; } else {
      this.apartments_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.basementarea_avg = null; } else {
      this.basementarea_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.years_beginexpluatation_avg = null; } else {
      this.years_beginexpluatation_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.years_build_avg = null; } else {
      this.years_build_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.commonarea_avg = null; } else {
      this.commonarea_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.elevators_avg = null; } else {
      this.elevators_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.entrances_avg = null; } else {
      this.entrances_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floorsmax_avg = null; } else {
      this.floorsmax_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floorsmin_avg = null; } else {
      this.floorsmin_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.landarea_avg = null; } else {
      this.landarea_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.livingapartments_avg = null; } else {
      this.livingapartments_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.livingarea_avg = null; } else {
      this.livingarea_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nonlivingapartments_avg = null; } else {
      this.nonlivingapartments_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nonlivingarea_avg = null; } else {
      this.nonlivingarea_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.apartments_mode = null; } else {
      this.apartments_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.basementarea_mode = null; } else {
      this.basementarea_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.years_beginexpluatation_mode = null; } else {
      this.years_beginexpluatation_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.years_build_mode = null; } else {
      this.years_build_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.commonarea_mode = null; } else {
      this.commonarea_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.elevators_mode = null; } else {
      this.elevators_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.entrances_mode = null; } else {
      this.entrances_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floorsmax_mode = null; } else {
      this.floorsmax_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floorsmin_mode = null; } else {
      this.floorsmin_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.landarea_mode = null; } else {
      this.landarea_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.livingapartments_mode = null; } else {
      this.livingapartments_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.livingarea_mode = null; } else {
      this.livingarea_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nonlivingapartments_mode = null; } else {
      this.nonlivingapartments_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nonlivingarea_mode = null; } else {
      this.nonlivingarea_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.apartments_medi = null; } else {
      this.apartments_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.basementarea_medi = null; } else {
      this.basementarea_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.years_beginexpluatation_medi = null; } else {
      this.years_beginexpluatation_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.years_build_medi = null; } else {
      this.years_build_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.commonarea_medi = null; } else {
      this.commonarea_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.elevators_medi = null; } else {
      this.elevators_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.entrances_medi = null; } else {
      this.entrances_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floorsmax_medi = null; } else {
      this.floorsmax_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floorsmin_medi = null; } else {
      this.floorsmin_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.landarea_medi = null; } else {
      this.landarea_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.livingapartments_medi = null; } else {
      this.livingapartments_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.livingarea_medi = null; } else {
      this.livingarea_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nonlivingapartments_medi = null; } else {
      this.nonlivingapartments_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nonlivingarea_medi = null; } else {
      this.nonlivingarea_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.fondkapremont_mode = null; } else {
      this.fondkapremont_mode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.housetype_mode = null; } else {
      this.housetype_mode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.totalarea_mode = null; } else {
      this.totalarea_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.wallsmaterial_mode = null; } else {
      this.wallsmaterial_mode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.emergencystate_mode = null; } else {
      this.emergencystate_mode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.obs_30_cnt_social_circle = null; } else {
      this.obs_30_cnt_social_circle = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.def_30_cnt_social_circle = null; } else {
      this.def_30_cnt_social_circle = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.obs_60_cnt_social_circle = null; } else {
      this.obs_60_cnt_social_circle = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.def_60_cnt_social_circle = null; } else {
      this.def_60_cnt_social_circle = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.days_last_phone_change = null; } else {
      this.days_last_phone_change = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_2 = null; } else {
      this.flag_document_2 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_3 = null; } else {
      this.flag_document_3 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_4 = null; } else {
      this.flag_document_4 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_5 = null; } else {
      this.flag_document_5 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_6 = null; } else {
      this.flag_document_6 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_7 = null; } else {
      this.flag_document_7 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_8 = null; } else {
      this.flag_document_8 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_9 = null; } else {
      this.flag_document_9 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_10 = null; } else {
      this.flag_document_10 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_11 = null; } else {
      this.flag_document_11 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_12 = null; } else {
      this.flag_document_12 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_13 = null; } else {
      this.flag_document_13 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_14 = null; } else {
      this.flag_document_14 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_15 = null; } else {
      this.flag_document_15 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_16 = null; } else {
      this.flag_document_16 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_17 = null; } else {
      this.flag_document_17 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_18 = null; } else {
      this.flag_document_18 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_19 = null; } else {
      this.flag_document_19 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_20 = null; } else {
      this.flag_document_20 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_21 = null; } else {
      this.flag_document_21 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_req_credit_bureau_hour = null; } else {
      this.amt_req_credit_bureau_hour = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_req_credit_bureau_day = null; } else {
      this.amt_req_credit_bureau_day = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_req_credit_bureau_week = null; } else {
      this.amt_req_credit_bureau_week = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_req_credit_bureau_mon = null; } else {
      this.amt_req_credit_bureau_mon = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_req_credit_bureau_qrt = null; } else {
      this.amt_req_credit_bureau_qrt = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_req_credit_bureau_year = null; } else {
      this.amt_req_credit_bureau_year = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sk_id_curr = null; } else {
      this.sk_id_curr = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_contract_type = null; } else {
      this.name_contract_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.code_gender = null; } else {
      this.code_gender = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flag_own_car = null; } else {
      this.flag_own_car = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.flag_own_realty = null; } else {
      this.flag_own_realty = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cnt_children = null; } else {
      this.cnt_children = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_income_total = null; } else {
      this.amt_income_total = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_credit = null; } else {
      this.amt_credit = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_annuity = null; } else {
      this.amt_annuity = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_goods_price = null; } else {
      this.amt_goods_price = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_type_suite = null; } else {
      this.name_type_suite = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_income_type = null; } else {
      this.name_income_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_education_type = null; } else {
      this.name_education_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_family_status = null; } else {
      this.name_family_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name_housing_type = null; } else {
      this.name_housing_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.region_population_relative = null; } else {
      this.region_population_relative = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.days_birth = null; } else {
      this.days_birth = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.days_employed = null; } else {
      this.days_employed = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.days_registration = null; } else {
      this.days_registration = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.days_id_publish = null; } else {
      this.days_id_publish = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.own_car_age = null; } else {
      this.own_car_age = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_mobil = null; } else {
      this.flag_mobil = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_emp_phone = null; } else {
      this.flag_emp_phone = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_work_phone = null; } else {
      this.flag_work_phone = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_cont_mobile = null; } else {
      this.flag_cont_mobile = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_phone = null; } else {
      this.flag_phone = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_email = null; } else {
      this.flag_email = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.occupation_type = null; } else {
      this.occupation_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cnt_fam_members = null; } else {
      this.cnt_fam_members = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.region_rating_client = null; } else {
      this.region_rating_client = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.region_rating_client_w_city = null; } else {
      this.region_rating_client_w_city = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.weekday_appr_process_start = null; } else {
      this.weekday_appr_process_start = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hour_appr_process_start = null; } else {
      this.hour_appr_process_start = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reg_region_not_live_region = null; } else {
      this.reg_region_not_live_region = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reg_region_not_work_region = null; } else {
      this.reg_region_not_work_region = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.live_region_not_work_region = null; } else {
      this.live_region_not_work_region = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reg_city_not_live_city = null; } else {
      this.reg_city_not_live_city = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reg_city_not_work_city = null; } else {
      this.reg_city_not_work_city = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.live_city_not_work_city = null; } else {
      this.live_city_not_work_city = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.organization_type = null; } else {
      this.organization_type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ext_source_1 = null; } else {
      this.ext_source_1 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ext_source_2 = null; } else {
      this.ext_source_2 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ext_source_3 = null; } else {
      this.ext_source_3 = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.apartments_avg = null; } else {
      this.apartments_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.basementarea_avg = null; } else {
      this.basementarea_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.years_beginexpluatation_avg = null; } else {
      this.years_beginexpluatation_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.years_build_avg = null; } else {
      this.years_build_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.commonarea_avg = null; } else {
      this.commonarea_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.elevators_avg = null; } else {
      this.elevators_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.entrances_avg = null; } else {
      this.entrances_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floorsmax_avg = null; } else {
      this.floorsmax_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floorsmin_avg = null; } else {
      this.floorsmin_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.landarea_avg = null; } else {
      this.landarea_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.livingapartments_avg = null; } else {
      this.livingapartments_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.livingarea_avg = null; } else {
      this.livingarea_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nonlivingapartments_avg = null; } else {
      this.nonlivingapartments_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nonlivingarea_avg = null; } else {
      this.nonlivingarea_avg = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.apartments_mode = null; } else {
      this.apartments_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.basementarea_mode = null; } else {
      this.basementarea_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.years_beginexpluatation_mode = null; } else {
      this.years_beginexpluatation_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.years_build_mode = null; } else {
      this.years_build_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.commonarea_mode = null; } else {
      this.commonarea_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.elevators_mode = null; } else {
      this.elevators_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.entrances_mode = null; } else {
      this.entrances_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floorsmax_mode = null; } else {
      this.floorsmax_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floorsmin_mode = null; } else {
      this.floorsmin_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.landarea_mode = null; } else {
      this.landarea_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.livingapartments_mode = null; } else {
      this.livingapartments_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.livingarea_mode = null; } else {
      this.livingarea_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nonlivingapartments_mode = null; } else {
      this.nonlivingapartments_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nonlivingarea_mode = null; } else {
      this.nonlivingarea_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.apartments_medi = null; } else {
      this.apartments_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.basementarea_medi = null; } else {
      this.basementarea_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.years_beginexpluatation_medi = null; } else {
      this.years_beginexpluatation_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.years_build_medi = null; } else {
      this.years_build_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.commonarea_medi = null; } else {
      this.commonarea_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.elevators_medi = null; } else {
      this.elevators_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.entrances_medi = null; } else {
      this.entrances_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floorsmax_medi = null; } else {
      this.floorsmax_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.floorsmin_medi = null; } else {
      this.floorsmin_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.landarea_medi = null; } else {
      this.landarea_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.livingapartments_medi = null; } else {
      this.livingapartments_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.livingarea_medi = null; } else {
      this.livingarea_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nonlivingapartments_medi = null; } else {
      this.nonlivingapartments_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.nonlivingarea_medi = null; } else {
      this.nonlivingarea_medi = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.fondkapremont_mode = null; } else {
      this.fondkapremont_mode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.housetype_mode = null; } else {
      this.housetype_mode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.totalarea_mode = null; } else {
      this.totalarea_mode = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.wallsmaterial_mode = null; } else {
      this.wallsmaterial_mode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.emergencystate_mode = null; } else {
      this.emergencystate_mode = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.obs_30_cnt_social_circle = null; } else {
      this.obs_30_cnt_social_circle = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.def_30_cnt_social_circle = null; } else {
      this.def_30_cnt_social_circle = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.obs_60_cnt_social_circle = null; } else {
      this.obs_60_cnt_social_circle = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.def_60_cnt_social_circle = null; } else {
      this.def_60_cnt_social_circle = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.days_last_phone_change = null; } else {
      this.days_last_phone_change = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_2 = null; } else {
      this.flag_document_2 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_3 = null; } else {
      this.flag_document_3 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_4 = null; } else {
      this.flag_document_4 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_5 = null; } else {
      this.flag_document_5 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_6 = null; } else {
      this.flag_document_6 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_7 = null; } else {
      this.flag_document_7 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_8 = null; } else {
      this.flag_document_8 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_9 = null; } else {
      this.flag_document_9 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_10 = null; } else {
      this.flag_document_10 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_11 = null; } else {
      this.flag_document_11 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_12 = null; } else {
      this.flag_document_12 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_13 = null; } else {
      this.flag_document_13 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_14 = null; } else {
      this.flag_document_14 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_15 = null; } else {
      this.flag_document_15 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_16 = null; } else {
      this.flag_document_16 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_17 = null; } else {
      this.flag_document_17 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_18 = null; } else {
      this.flag_document_18 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_19 = null; } else {
      this.flag_document_19 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_20 = null; } else {
      this.flag_document_20 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag_document_21 = null; } else {
      this.flag_document_21 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_req_credit_bureau_hour = null; } else {
      this.amt_req_credit_bureau_hour = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_req_credit_bureau_day = null; } else {
      this.amt_req_credit_bureau_day = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_req_credit_bureau_week = null; } else {
      this.amt_req_credit_bureau_week = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_req_credit_bureau_mon = null; } else {
      this.amt_req_credit_bureau_mon = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_req_credit_bureau_qrt = null; } else {
      this.amt_req_credit_bureau_qrt = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amt_req_credit_bureau_year = null; } else {
      this.amt_req_credit_bureau_year = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("sk_id_curr", this.sk_id_curr);
    __sqoop$field_map.put("name_contract_type", this.name_contract_type);
    __sqoop$field_map.put("code_gender", this.code_gender);
    __sqoop$field_map.put("flag_own_car", this.flag_own_car);
    __sqoop$field_map.put("flag_own_realty", this.flag_own_realty);
    __sqoop$field_map.put("cnt_children", this.cnt_children);
    __sqoop$field_map.put("amt_income_total", this.amt_income_total);
    __sqoop$field_map.put("amt_credit", this.amt_credit);
    __sqoop$field_map.put("amt_annuity", this.amt_annuity);
    __sqoop$field_map.put("amt_goods_price", this.amt_goods_price);
    __sqoop$field_map.put("name_type_suite", this.name_type_suite);
    __sqoop$field_map.put("name_income_type", this.name_income_type);
    __sqoop$field_map.put("name_education_type", this.name_education_type);
    __sqoop$field_map.put("name_family_status", this.name_family_status);
    __sqoop$field_map.put("name_housing_type", this.name_housing_type);
    __sqoop$field_map.put("region_population_relative", this.region_population_relative);
    __sqoop$field_map.put("days_birth", this.days_birth);
    __sqoop$field_map.put("days_employed", this.days_employed);
    __sqoop$field_map.put("days_registration", this.days_registration);
    __sqoop$field_map.put("days_id_publish", this.days_id_publish);
    __sqoop$field_map.put("own_car_age", this.own_car_age);
    __sqoop$field_map.put("flag_mobil", this.flag_mobil);
    __sqoop$field_map.put("flag_emp_phone", this.flag_emp_phone);
    __sqoop$field_map.put("flag_work_phone", this.flag_work_phone);
    __sqoop$field_map.put("flag_cont_mobile", this.flag_cont_mobile);
    __sqoop$field_map.put("flag_phone", this.flag_phone);
    __sqoop$field_map.put("flag_email", this.flag_email);
    __sqoop$field_map.put("occupation_type", this.occupation_type);
    __sqoop$field_map.put("cnt_fam_members", this.cnt_fam_members);
    __sqoop$field_map.put("region_rating_client", this.region_rating_client);
    __sqoop$field_map.put("region_rating_client_w_city", this.region_rating_client_w_city);
    __sqoop$field_map.put("weekday_appr_process_start", this.weekday_appr_process_start);
    __sqoop$field_map.put("hour_appr_process_start", this.hour_appr_process_start);
    __sqoop$field_map.put("reg_region_not_live_region", this.reg_region_not_live_region);
    __sqoop$field_map.put("reg_region_not_work_region", this.reg_region_not_work_region);
    __sqoop$field_map.put("live_region_not_work_region", this.live_region_not_work_region);
    __sqoop$field_map.put("reg_city_not_live_city", this.reg_city_not_live_city);
    __sqoop$field_map.put("reg_city_not_work_city", this.reg_city_not_work_city);
    __sqoop$field_map.put("live_city_not_work_city", this.live_city_not_work_city);
    __sqoop$field_map.put("organization_type", this.organization_type);
    __sqoop$field_map.put("ext_source_1", this.ext_source_1);
    __sqoop$field_map.put("ext_source_2", this.ext_source_2);
    __sqoop$field_map.put("ext_source_3", this.ext_source_3);
    __sqoop$field_map.put("apartments_avg", this.apartments_avg);
    __sqoop$field_map.put("basementarea_avg", this.basementarea_avg);
    __sqoop$field_map.put("years_beginexpluatation_avg", this.years_beginexpluatation_avg);
    __sqoop$field_map.put("years_build_avg", this.years_build_avg);
    __sqoop$field_map.put("commonarea_avg", this.commonarea_avg);
    __sqoop$field_map.put("elevators_avg", this.elevators_avg);
    __sqoop$field_map.put("entrances_avg", this.entrances_avg);
    __sqoop$field_map.put("floorsmax_avg", this.floorsmax_avg);
    __sqoop$field_map.put("floorsmin_avg", this.floorsmin_avg);
    __sqoop$field_map.put("landarea_avg", this.landarea_avg);
    __sqoop$field_map.put("livingapartments_avg", this.livingapartments_avg);
    __sqoop$field_map.put("livingarea_avg", this.livingarea_avg);
    __sqoop$field_map.put("nonlivingapartments_avg", this.nonlivingapartments_avg);
    __sqoop$field_map.put("nonlivingarea_avg", this.nonlivingarea_avg);
    __sqoop$field_map.put("apartments_mode", this.apartments_mode);
    __sqoop$field_map.put("basementarea_mode", this.basementarea_mode);
    __sqoop$field_map.put("years_beginexpluatation_mode", this.years_beginexpluatation_mode);
    __sqoop$field_map.put("years_build_mode", this.years_build_mode);
    __sqoop$field_map.put("commonarea_mode", this.commonarea_mode);
    __sqoop$field_map.put("elevators_mode", this.elevators_mode);
    __sqoop$field_map.put("entrances_mode", this.entrances_mode);
    __sqoop$field_map.put("floorsmax_mode", this.floorsmax_mode);
    __sqoop$field_map.put("floorsmin_mode", this.floorsmin_mode);
    __sqoop$field_map.put("landarea_mode", this.landarea_mode);
    __sqoop$field_map.put("livingapartments_mode", this.livingapartments_mode);
    __sqoop$field_map.put("livingarea_mode", this.livingarea_mode);
    __sqoop$field_map.put("nonlivingapartments_mode", this.nonlivingapartments_mode);
    __sqoop$field_map.put("nonlivingarea_mode", this.nonlivingarea_mode);
    __sqoop$field_map.put("apartments_medi", this.apartments_medi);
    __sqoop$field_map.put("basementarea_medi", this.basementarea_medi);
    __sqoop$field_map.put("years_beginexpluatation_medi", this.years_beginexpluatation_medi);
    __sqoop$field_map.put("years_build_medi", this.years_build_medi);
    __sqoop$field_map.put("commonarea_medi", this.commonarea_medi);
    __sqoop$field_map.put("elevators_medi", this.elevators_medi);
    __sqoop$field_map.put("entrances_medi", this.entrances_medi);
    __sqoop$field_map.put("floorsmax_medi", this.floorsmax_medi);
    __sqoop$field_map.put("floorsmin_medi", this.floorsmin_medi);
    __sqoop$field_map.put("landarea_medi", this.landarea_medi);
    __sqoop$field_map.put("livingapartments_medi", this.livingapartments_medi);
    __sqoop$field_map.put("livingarea_medi", this.livingarea_medi);
    __sqoop$field_map.put("nonlivingapartments_medi", this.nonlivingapartments_medi);
    __sqoop$field_map.put("nonlivingarea_medi", this.nonlivingarea_medi);
    __sqoop$field_map.put("fondkapremont_mode", this.fondkapremont_mode);
    __sqoop$field_map.put("housetype_mode", this.housetype_mode);
    __sqoop$field_map.put("totalarea_mode", this.totalarea_mode);
    __sqoop$field_map.put("wallsmaterial_mode", this.wallsmaterial_mode);
    __sqoop$field_map.put("emergencystate_mode", this.emergencystate_mode);
    __sqoop$field_map.put("obs_30_cnt_social_circle", this.obs_30_cnt_social_circle);
    __sqoop$field_map.put("def_30_cnt_social_circle", this.def_30_cnt_social_circle);
    __sqoop$field_map.put("obs_60_cnt_social_circle", this.obs_60_cnt_social_circle);
    __sqoop$field_map.put("def_60_cnt_social_circle", this.def_60_cnt_social_circle);
    __sqoop$field_map.put("days_last_phone_change", this.days_last_phone_change);
    __sqoop$field_map.put("flag_document_2", this.flag_document_2);
    __sqoop$field_map.put("flag_document_3", this.flag_document_3);
    __sqoop$field_map.put("flag_document_4", this.flag_document_4);
    __sqoop$field_map.put("flag_document_5", this.flag_document_5);
    __sqoop$field_map.put("flag_document_6", this.flag_document_6);
    __sqoop$field_map.put("flag_document_7", this.flag_document_7);
    __sqoop$field_map.put("flag_document_8", this.flag_document_8);
    __sqoop$field_map.put("flag_document_9", this.flag_document_9);
    __sqoop$field_map.put("flag_document_10", this.flag_document_10);
    __sqoop$field_map.put("flag_document_11", this.flag_document_11);
    __sqoop$field_map.put("flag_document_12", this.flag_document_12);
    __sqoop$field_map.put("flag_document_13", this.flag_document_13);
    __sqoop$field_map.put("flag_document_14", this.flag_document_14);
    __sqoop$field_map.put("flag_document_15", this.flag_document_15);
    __sqoop$field_map.put("flag_document_16", this.flag_document_16);
    __sqoop$field_map.put("flag_document_17", this.flag_document_17);
    __sqoop$field_map.put("flag_document_18", this.flag_document_18);
    __sqoop$field_map.put("flag_document_19", this.flag_document_19);
    __sqoop$field_map.put("flag_document_20", this.flag_document_20);
    __sqoop$field_map.put("flag_document_21", this.flag_document_21);
    __sqoop$field_map.put("amt_req_credit_bureau_hour", this.amt_req_credit_bureau_hour);
    __sqoop$field_map.put("amt_req_credit_bureau_day", this.amt_req_credit_bureau_day);
    __sqoop$field_map.put("amt_req_credit_bureau_week", this.amt_req_credit_bureau_week);
    __sqoop$field_map.put("amt_req_credit_bureau_mon", this.amt_req_credit_bureau_mon);
    __sqoop$field_map.put("amt_req_credit_bureau_qrt", this.amt_req_credit_bureau_qrt);
    __sqoop$field_map.put("amt_req_credit_bureau_year", this.amt_req_credit_bureau_year);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("sk_id_curr", this.sk_id_curr);
    __sqoop$field_map.put("name_contract_type", this.name_contract_type);
    __sqoop$field_map.put("code_gender", this.code_gender);
    __sqoop$field_map.put("flag_own_car", this.flag_own_car);
    __sqoop$field_map.put("flag_own_realty", this.flag_own_realty);
    __sqoop$field_map.put("cnt_children", this.cnt_children);
    __sqoop$field_map.put("amt_income_total", this.amt_income_total);
    __sqoop$field_map.put("amt_credit", this.amt_credit);
    __sqoop$field_map.put("amt_annuity", this.amt_annuity);
    __sqoop$field_map.put("amt_goods_price", this.amt_goods_price);
    __sqoop$field_map.put("name_type_suite", this.name_type_suite);
    __sqoop$field_map.put("name_income_type", this.name_income_type);
    __sqoop$field_map.put("name_education_type", this.name_education_type);
    __sqoop$field_map.put("name_family_status", this.name_family_status);
    __sqoop$field_map.put("name_housing_type", this.name_housing_type);
    __sqoop$field_map.put("region_population_relative", this.region_population_relative);
    __sqoop$field_map.put("days_birth", this.days_birth);
    __sqoop$field_map.put("days_employed", this.days_employed);
    __sqoop$field_map.put("days_registration", this.days_registration);
    __sqoop$field_map.put("days_id_publish", this.days_id_publish);
    __sqoop$field_map.put("own_car_age", this.own_car_age);
    __sqoop$field_map.put("flag_mobil", this.flag_mobil);
    __sqoop$field_map.put("flag_emp_phone", this.flag_emp_phone);
    __sqoop$field_map.put("flag_work_phone", this.flag_work_phone);
    __sqoop$field_map.put("flag_cont_mobile", this.flag_cont_mobile);
    __sqoop$field_map.put("flag_phone", this.flag_phone);
    __sqoop$field_map.put("flag_email", this.flag_email);
    __sqoop$field_map.put("occupation_type", this.occupation_type);
    __sqoop$field_map.put("cnt_fam_members", this.cnt_fam_members);
    __sqoop$field_map.put("region_rating_client", this.region_rating_client);
    __sqoop$field_map.put("region_rating_client_w_city", this.region_rating_client_w_city);
    __sqoop$field_map.put("weekday_appr_process_start", this.weekday_appr_process_start);
    __sqoop$field_map.put("hour_appr_process_start", this.hour_appr_process_start);
    __sqoop$field_map.put("reg_region_not_live_region", this.reg_region_not_live_region);
    __sqoop$field_map.put("reg_region_not_work_region", this.reg_region_not_work_region);
    __sqoop$field_map.put("live_region_not_work_region", this.live_region_not_work_region);
    __sqoop$field_map.put("reg_city_not_live_city", this.reg_city_not_live_city);
    __sqoop$field_map.put("reg_city_not_work_city", this.reg_city_not_work_city);
    __sqoop$field_map.put("live_city_not_work_city", this.live_city_not_work_city);
    __sqoop$field_map.put("organization_type", this.organization_type);
    __sqoop$field_map.put("ext_source_1", this.ext_source_1);
    __sqoop$field_map.put("ext_source_2", this.ext_source_2);
    __sqoop$field_map.put("ext_source_3", this.ext_source_3);
    __sqoop$field_map.put("apartments_avg", this.apartments_avg);
    __sqoop$field_map.put("basementarea_avg", this.basementarea_avg);
    __sqoop$field_map.put("years_beginexpluatation_avg", this.years_beginexpluatation_avg);
    __sqoop$field_map.put("years_build_avg", this.years_build_avg);
    __sqoop$field_map.put("commonarea_avg", this.commonarea_avg);
    __sqoop$field_map.put("elevators_avg", this.elevators_avg);
    __sqoop$field_map.put("entrances_avg", this.entrances_avg);
    __sqoop$field_map.put("floorsmax_avg", this.floorsmax_avg);
    __sqoop$field_map.put("floorsmin_avg", this.floorsmin_avg);
    __sqoop$field_map.put("landarea_avg", this.landarea_avg);
    __sqoop$field_map.put("livingapartments_avg", this.livingapartments_avg);
    __sqoop$field_map.put("livingarea_avg", this.livingarea_avg);
    __sqoop$field_map.put("nonlivingapartments_avg", this.nonlivingapartments_avg);
    __sqoop$field_map.put("nonlivingarea_avg", this.nonlivingarea_avg);
    __sqoop$field_map.put("apartments_mode", this.apartments_mode);
    __sqoop$field_map.put("basementarea_mode", this.basementarea_mode);
    __sqoop$field_map.put("years_beginexpluatation_mode", this.years_beginexpluatation_mode);
    __sqoop$field_map.put("years_build_mode", this.years_build_mode);
    __sqoop$field_map.put("commonarea_mode", this.commonarea_mode);
    __sqoop$field_map.put("elevators_mode", this.elevators_mode);
    __sqoop$field_map.put("entrances_mode", this.entrances_mode);
    __sqoop$field_map.put("floorsmax_mode", this.floorsmax_mode);
    __sqoop$field_map.put("floorsmin_mode", this.floorsmin_mode);
    __sqoop$field_map.put("landarea_mode", this.landarea_mode);
    __sqoop$field_map.put("livingapartments_mode", this.livingapartments_mode);
    __sqoop$field_map.put("livingarea_mode", this.livingarea_mode);
    __sqoop$field_map.put("nonlivingapartments_mode", this.nonlivingapartments_mode);
    __sqoop$field_map.put("nonlivingarea_mode", this.nonlivingarea_mode);
    __sqoop$field_map.put("apartments_medi", this.apartments_medi);
    __sqoop$field_map.put("basementarea_medi", this.basementarea_medi);
    __sqoop$field_map.put("years_beginexpluatation_medi", this.years_beginexpluatation_medi);
    __sqoop$field_map.put("years_build_medi", this.years_build_medi);
    __sqoop$field_map.put("commonarea_medi", this.commonarea_medi);
    __sqoop$field_map.put("elevators_medi", this.elevators_medi);
    __sqoop$field_map.put("entrances_medi", this.entrances_medi);
    __sqoop$field_map.put("floorsmax_medi", this.floorsmax_medi);
    __sqoop$field_map.put("floorsmin_medi", this.floorsmin_medi);
    __sqoop$field_map.put("landarea_medi", this.landarea_medi);
    __sqoop$field_map.put("livingapartments_medi", this.livingapartments_medi);
    __sqoop$field_map.put("livingarea_medi", this.livingarea_medi);
    __sqoop$field_map.put("nonlivingapartments_medi", this.nonlivingapartments_medi);
    __sqoop$field_map.put("nonlivingarea_medi", this.nonlivingarea_medi);
    __sqoop$field_map.put("fondkapremont_mode", this.fondkapremont_mode);
    __sqoop$field_map.put("housetype_mode", this.housetype_mode);
    __sqoop$field_map.put("totalarea_mode", this.totalarea_mode);
    __sqoop$field_map.put("wallsmaterial_mode", this.wallsmaterial_mode);
    __sqoop$field_map.put("emergencystate_mode", this.emergencystate_mode);
    __sqoop$field_map.put("obs_30_cnt_social_circle", this.obs_30_cnt_social_circle);
    __sqoop$field_map.put("def_30_cnt_social_circle", this.def_30_cnt_social_circle);
    __sqoop$field_map.put("obs_60_cnt_social_circle", this.obs_60_cnt_social_circle);
    __sqoop$field_map.put("def_60_cnt_social_circle", this.def_60_cnt_social_circle);
    __sqoop$field_map.put("days_last_phone_change", this.days_last_phone_change);
    __sqoop$field_map.put("flag_document_2", this.flag_document_2);
    __sqoop$field_map.put("flag_document_3", this.flag_document_3);
    __sqoop$field_map.put("flag_document_4", this.flag_document_4);
    __sqoop$field_map.put("flag_document_5", this.flag_document_5);
    __sqoop$field_map.put("flag_document_6", this.flag_document_6);
    __sqoop$field_map.put("flag_document_7", this.flag_document_7);
    __sqoop$field_map.put("flag_document_8", this.flag_document_8);
    __sqoop$field_map.put("flag_document_9", this.flag_document_9);
    __sqoop$field_map.put("flag_document_10", this.flag_document_10);
    __sqoop$field_map.put("flag_document_11", this.flag_document_11);
    __sqoop$field_map.put("flag_document_12", this.flag_document_12);
    __sqoop$field_map.put("flag_document_13", this.flag_document_13);
    __sqoop$field_map.put("flag_document_14", this.flag_document_14);
    __sqoop$field_map.put("flag_document_15", this.flag_document_15);
    __sqoop$field_map.put("flag_document_16", this.flag_document_16);
    __sqoop$field_map.put("flag_document_17", this.flag_document_17);
    __sqoop$field_map.put("flag_document_18", this.flag_document_18);
    __sqoop$field_map.put("flag_document_19", this.flag_document_19);
    __sqoop$field_map.put("flag_document_20", this.flag_document_20);
    __sqoop$field_map.put("flag_document_21", this.flag_document_21);
    __sqoop$field_map.put("amt_req_credit_bureau_hour", this.amt_req_credit_bureau_hour);
    __sqoop$field_map.put("amt_req_credit_bureau_day", this.amt_req_credit_bureau_day);
    __sqoop$field_map.put("amt_req_credit_bureau_week", this.amt_req_credit_bureau_week);
    __sqoop$field_map.put("amt_req_credit_bureau_mon", this.amt_req_credit_bureau_mon);
    __sqoop$field_map.put("amt_req_credit_bureau_qrt", this.amt_req_credit_bureau_qrt);
    __sqoop$field_map.put("amt_req_credit_bureau_year", this.amt_req_credit_bureau_year);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("sk_id_curr".equals(__fieldName)) {
      this.sk_id_curr = (Integer) __fieldVal;
    }
    else    if ("name_contract_type".equals(__fieldName)) {
      this.name_contract_type = (String) __fieldVal;
    }
    else    if ("code_gender".equals(__fieldName)) {
      this.code_gender = (String) __fieldVal;
    }
    else    if ("flag_own_car".equals(__fieldName)) {
      this.flag_own_car = (String) __fieldVal;
    }
    else    if ("flag_own_realty".equals(__fieldName)) {
      this.flag_own_realty = (String) __fieldVal;
    }
    else    if ("cnt_children".equals(__fieldName)) {
      this.cnt_children = (Integer) __fieldVal;
    }
    else    if ("amt_income_total".equals(__fieldName)) {
      this.amt_income_total = (Double) __fieldVal;
    }
    else    if ("amt_credit".equals(__fieldName)) {
      this.amt_credit = (Double) __fieldVal;
    }
    else    if ("amt_annuity".equals(__fieldName)) {
      this.amt_annuity = (Double) __fieldVal;
    }
    else    if ("amt_goods_price".equals(__fieldName)) {
      this.amt_goods_price = (Double) __fieldVal;
    }
    else    if ("name_type_suite".equals(__fieldName)) {
      this.name_type_suite = (String) __fieldVal;
    }
    else    if ("name_income_type".equals(__fieldName)) {
      this.name_income_type = (String) __fieldVal;
    }
    else    if ("name_education_type".equals(__fieldName)) {
      this.name_education_type = (String) __fieldVal;
    }
    else    if ("name_family_status".equals(__fieldName)) {
      this.name_family_status = (String) __fieldVal;
    }
    else    if ("name_housing_type".equals(__fieldName)) {
      this.name_housing_type = (String) __fieldVal;
    }
    else    if ("region_population_relative".equals(__fieldName)) {
      this.region_population_relative = (Double) __fieldVal;
    }
    else    if ("days_birth".equals(__fieldName)) {
      this.days_birth = (Integer) __fieldVal;
    }
    else    if ("days_employed".equals(__fieldName)) {
      this.days_employed = (Integer) __fieldVal;
    }
    else    if ("days_registration".equals(__fieldName)) {
      this.days_registration = (Double) __fieldVal;
    }
    else    if ("days_id_publish".equals(__fieldName)) {
      this.days_id_publish = (Integer) __fieldVal;
    }
    else    if ("own_car_age".equals(__fieldName)) {
      this.own_car_age = (Double) __fieldVal;
    }
    else    if ("flag_mobil".equals(__fieldName)) {
      this.flag_mobil = (Integer) __fieldVal;
    }
    else    if ("flag_emp_phone".equals(__fieldName)) {
      this.flag_emp_phone = (Integer) __fieldVal;
    }
    else    if ("flag_work_phone".equals(__fieldName)) {
      this.flag_work_phone = (Integer) __fieldVal;
    }
    else    if ("flag_cont_mobile".equals(__fieldName)) {
      this.flag_cont_mobile = (Integer) __fieldVal;
    }
    else    if ("flag_phone".equals(__fieldName)) {
      this.flag_phone = (Integer) __fieldVal;
    }
    else    if ("flag_email".equals(__fieldName)) {
      this.flag_email = (Integer) __fieldVal;
    }
    else    if ("occupation_type".equals(__fieldName)) {
      this.occupation_type = (String) __fieldVal;
    }
    else    if ("cnt_fam_members".equals(__fieldName)) {
      this.cnt_fam_members = (Double) __fieldVal;
    }
    else    if ("region_rating_client".equals(__fieldName)) {
      this.region_rating_client = (Integer) __fieldVal;
    }
    else    if ("region_rating_client_w_city".equals(__fieldName)) {
      this.region_rating_client_w_city = (Integer) __fieldVal;
    }
    else    if ("weekday_appr_process_start".equals(__fieldName)) {
      this.weekday_appr_process_start = (String) __fieldVal;
    }
    else    if ("hour_appr_process_start".equals(__fieldName)) {
      this.hour_appr_process_start = (Integer) __fieldVal;
    }
    else    if ("reg_region_not_live_region".equals(__fieldName)) {
      this.reg_region_not_live_region = (Integer) __fieldVal;
    }
    else    if ("reg_region_not_work_region".equals(__fieldName)) {
      this.reg_region_not_work_region = (Integer) __fieldVal;
    }
    else    if ("live_region_not_work_region".equals(__fieldName)) {
      this.live_region_not_work_region = (Integer) __fieldVal;
    }
    else    if ("reg_city_not_live_city".equals(__fieldName)) {
      this.reg_city_not_live_city = (Integer) __fieldVal;
    }
    else    if ("reg_city_not_work_city".equals(__fieldName)) {
      this.reg_city_not_work_city = (Integer) __fieldVal;
    }
    else    if ("live_city_not_work_city".equals(__fieldName)) {
      this.live_city_not_work_city = (Integer) __fieldVal;
    }
    else    if ("organization_type".equals(__fieldName)) {
      this.organization_type = (String) __fieldVal;
    }
    else    if ("ext_source_1".equals(__fieldName)) {
      this.ext_source_1 = (Double) __fieldVal;
    }
    else    if ("ext_source_2".equals(__fieldName)) {
      this.ext_source_2 = (Double) __fieldVal;
    }
    else    if ("ext_source_3".equals(__fieldName)) {
      this.ext_source_3 = (Double) __fieldVal;
    }
    else    if ("apartments_avg".equals(__fieldName)) {
      this.apartments_avg = (Double) __fieldVal;
    }
    else    if ("basementarea_avg".equals(__fieldName)) {
      this.basementarea_avg = (Double) __fieldVal;
    }
    else    if ("years_beginexpluatation_avg".equals(__fieldName)) {
      this.years_beginexpluatation_avg = (Double) __fieldVal;
    }
    else    if ("years_build_avg".equals(__fieldName)) {
      this.years_build_avg = (Double) __fieldVal;
    }
    else    if ("commonarea_avg".equals(__fieldName)) {
      this.commonarea_avg = (Double) __fieldVal;
    }
    else    if ("elevators_avg".equals(__fieldName)) {
      this.elevators_avg = (Double) __fieldVal;
    }
    else    if ("entrances_avg".equals(__fieldName)) {
      this.entrances_avg = (Double) __fieldVal;
    }
    else    if ("floorsmax_avg".equals(__fieldName)) {
      this.floorsmax_avg = (Double) __fieldVal;
    }
    else    if ("floorsmin_avg".equals(__fieldName)) {
      this.floorsmin_avg = (Double) __fieldVal;
    }
    else    if ("landarea_avg".equals(__fieldName)) {
      this.landarea_avg = (Double) __fieldVal;
    }
    else    if ("livingapartments_avg".equals(__fieldName)) {
      this.livingapartments_avg = (Double) __fieldVal;
    }
    else    if ("livingarea_avg".equals(__fieldName)) {
      this.livingarea_avg = (Double) __fieldVal;
    }
    else    if ("nonlivingapartments_avg".equals(__fieldName)) {
      this.nonlivingapartments_avg = (Double) __fieldVal;
    }
    else    if ("nonlivingarea_avg".equals(__fieldName)) {
      this.nonlivingarea_avg = (Double) __fieldVal;
    }
    else    if ("apartments_mode".equals(__fieldName)) {
      this.apartments_mode = (Double) __fieldVal;
    }
    else    if ("basementarea_mode".equals(__fieldName)) {
      this.basementarea_mode = (Double) __fieldVal;
    }
    else    if ("years_beginexpluatation_mode".equals(__fieldName)) {
      this.years_beginexpluatation_mode = (Double) __fieldVal;
    }
    else    if ("years_build_mode".equals(__fieldName)) {
      this.years_build_mode = (Double) __fieldVal;
    }
    else    if ("commonarea_mode".equals(__fieldName)) {
      this.commonarea_mode = (Double) __fieldVal;
    }
    else    if ("elevators_mode".equals(__fieldName)) {
      this.elevators_mode = (Double) __fieldVal;
    }
    else    if ("entrances_mode".equals(__fieldName)) {
      this.entrances_mode = (Double) __fieldVal;
    }
    else    if ("floorsmax_mode".equals(__fieldName)) {
      this.floorsmax_mode = (Double) __fieldVal;
    }
    else    if ("floorsmin_mode".equals(__fieldName)) {
      this.floorsmin_mode = (Double) __fieldVal;
    }
    else    if ("landarea_mode".equals(__fieldName)) {
      this.landarea_mode = (Double) __fieldVal;
    }
    else    if ("livingapartments_mode".equals(__fieldName)) {
      this.livingapartments_mode = (Double) __fieldVal;
    }
    else    if ("livingarea_mode".equals(__fieldName)) {
      this.livingarea_mode = (Double) __fieldVal;
    }
    else    if ("nonlivingapartments_mode".equals(__fieldName)) {
      this.nonlivingapartments_mode = (Double) __fieldVal;
    }
    else    if ("nonlivingarea_mode".equals(__fieldName)) {
      this.nonlivingarea_mode = (Double) __fieldVal;
    }
    else    if ("apartments_medi".equals(__fieldName)) {
      this.apartments_medi = (Double) __fieldVal;
    }
    else    if ("basementarea_medi".equals(__fieldName)) {
      this.basementarea_medi = (Double) __fieldVal;
    }
    else    if ("years_beginexpluatation_medi".equals(__fieldName)) {
      this.years_beginexpluatation_medi = (Double) __fieldVal;
    }
    else    if ("years_build_medi".equals(__fieldName)) {
      this.years_build_medi = (Double) __fieldVal;
    }
    else    if ("commonarea_medi".equals(__fieldName)) {
      this.commonarea_medi = (Double) __fieldVal;
    }
    else    if ("elevators_medi".equals(__fieldName)) {
      this.elevators_medi = (Double) __fieldVal;
    }
    else    if ("entrances_medi".equals(__fieldName)) {
      this.entrances_medi = (Double) __fieldVal;
    }
    else    if ("floorsmax_medi".equals(__fieldName)) {
      this.floorsmax_medi = (Double) __fieldVal;
    }
    else    if ("floorsmin_medi".equals(__fieldName)) {
      this.floorsmin_medi = (Double) __fieldVal;
    }
    else    if ("landarea_medi".equals(__fieldName)) {
      this.landarea_medi = (Double) __fieldVal;
    }
    else    if ("livingapartments_medi".equals(__fieldName)) {
      this.livingapartments_medi = (Double) __fieldVal;
    }
    else    if ("livingarea_medi".equals(__fieldName)) {
      this.livingarea_medi = (Double) __fieldVal;
    }
    else    if ("nonlivingapartments_medi".equals(__fieldName)) {
      this.nonlivingapartments_medi = (Double) __fieldVal;
    }
    else    if ("nonlivingarea_medi".equals(__fieldName)) {
      this.nonlivingarea_medi = (Double) __fieldVal;
    }
    else    if ("fondkapremont_mode".equals(__fieldName)) {
      this.fondkapremont_mode = (String) __fieldVal;
    }
    else    if ("housetype_mode".equals(__fieldName)) {
      this.housetype_mode = (String) __fieldVal;
    }
    else    if ("totalarea_mode".equals(__fieldName)) {
      this.totalarea_mode = (Double) __fieldVal;
    }
    else    if ("wallsmaterial_mode".equals(__fieldName)) {
      this.wallsmaterial_mode = (String) __fieldVal;
    }
    else    if ("emergencystate_mode".equals(__fieldName)) {
      this.emergencystate_mode = (String) __fieldVal;
    }
    else    if ("obs_30_cnt_social_circle".equals(__fieldName)) {
      this.obs_30_cnt_social_circle = (Double) __fieldVal;
    }
    else    if ("def_30_cnt_social_circle".equals(__fieldName)) {
      this.def_30_cnt_social_circle = (Double) __fieldVal;
    }
    else    if ("obs_60_cnt_social_circle".equals(__fieldName)) {
      this.obs_60_cnt_social_circle = (Double) __fieldVal;
    }
    else    if ("def_60_cnt_social_circle".equals(__fieldName)) {
      this.def_60_cnt_social_circle = (Double) __fieldVal;
    }
    else    if ("days_last_phone_change".equals(__fieldName)) {
      this.days_last_phone_change = (Double) __fieldVal;
    }
    else    if ("flag_document_2".equals(__fieldName)) {
      this.flag_document_2 = (Integer) __fieldVal;
    }
    else    if ("flag_document_3".equals(__fieldName)) {
      this.flag_document_3 = (Integer) __fieldVal;
    }
    else    if ("flag_document_4".equals(__fieldName)) {
      this.flag_document_4 = (Integer) __fieldVal;
    }
    else    if ("flag_document_5".equals(__fieldName)) {
      this.flag_document_5 = (Integer) __fieldVal;
    }
    else    if ("flag_document_6".equals(__fieldName)) {
      this.flag_document_6 = (Integer) __fieldVal;
    }
    else    if ("flag_document_7".equals(__fieldName)) {
      this.flag_document_7 = (Integer) __fieldVal;
    }
    else    if ("flag_document_8".equals(__fieldName)) {
      this.flag_document_8 = (Integer) __fieldVal;
    }
    else    if ("flag_document_9".equals(__fieldName)) {
      this.flag_document_9 = (Integer) __fieldVal;
    }
    else    if ("flag_document_10".equals(__fieldName)) {
      this.flag_document_10 = (Integer) __fieldVal;
    }
    else    if ("flag_document_11".equals(__fieldName)) {
      this.flag_document_11 = (Integer) __fieldVal;
    }
    else    if ("flag_document_12".equals(__fieldName)) {
      this.flag_document_12 = (Integer) __fieldVal;
    }
    else    if ("flag_document_13".equals(__fieldName)) {
      this.flag_document_13 = (Integer) __fieldVal;
    }
    else    if ("flag_document_14".equals(__fieldName)) {
      this.flag_document_14 = (Integer) __fieldVal;
    }
    else    if ("flag_document_15".equals(__fieldName)) {
      this.flag_document_15 = (Integer) __fieldVal;
    }
    else    if ("flag_document_16".equals(__fieldName)) {
      this.flag_document_16 = (Integer) __fieldVal;
    }
    else    if ("flag_document_17".equals(__fieldName)) {
      this.flag_document_17 = (Integer) __fieldVal;
    }
    else    if ("flag_document_18".equals(__fieldName)) {
      this.flag_document_18 = (Integer) __fieldVal;
    }
    else    if ("flag_document_19".equals(__fieldName)) {
      this.flag_document_19 = (Integer) __fieldVal;
    }
    else    if ("flag_document_20".equals(__fieldName)) {
      this.flag_document_20 = (Integer) __fieldVal;
    }
    else    if ("flag_document_21".equals(__fieldName)) {
      this.flag_document_21 = (Integer) __fieldVal;
    }
    else    if ("amt_req_credit_bureau_hour".equals(__fieldName)) {
      this.amt_req_credit_bureau_hour = (Double) __fieldVal;
    }
    else    if ("amt_req_credit_bureau_day".equals(__fieldName)) {
      this.amt_req_credit_bureau_day = (Double) __fieldVal;
    }
    else    if ("amt_req_credit_bureau_week".equals(__fieldName)) {
      this.amt_req_credit_bureau_week = (Double) __fieldVal;
    }
    else    if ("amt_req_credit_bureau_mon".equals(__fieldName)) {
      this.amt_req_credit_bureau_mon = (Double) __fieldVal;
    }
    else    if ("amt_req_credit_bureau_qrt".equals(__fieldName)) {
      this.amt_req_credit_bureau_qrt = (Double) __fieldVal;
    }
    else    if ("amt_req_credit_bureau_year".equals(__fieldName)) {
      this.amt_req_credit_bureau_year = (Double) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("sk_id_curr".equals(__fieldName)) {
      this.sk_id_curr = (Integer) __fieldVal;
      return true;
    }
    else    if ("name_contract_type".equals(__fieldName)) {
      this.name_contract_type = (String) __fieldVal;
      return true;
    }
    else    if ("code_gender".equals(__fieldName)) {
      this.code_gender = (String) __fieldVal;
      return true;
    }
    else    if ("flag_own_car".equals(__fieldName)) {
      this.flag_own_car = (String) __fieldVal;
      return true;
    }
    else    if ("flag_own_realty".equals(__fieldName)) {
      this.flag_own_realty = (String) __fieldVal;
      return true;
    }
    else    if ("cnt_children".equals(__fieldName)) {
      this.cnt_children = (Integer) __fieldVal;
      return true;
    }
    else    if ("amt_income_total".equals(__fieldName)) {
      this.amt_income_total = (Double) __fieldVal;
      return true;
    }
    else    if ("amt_credit".equals(__fieldName)) {
      this.amt_credit = (Double) __fieldVal;
      return true;
    }
    else    if ("amt_annuity".equals(__fieldName)) {
      this.amt_annuity = (Double) __fieldVal;
      return true;
    }
    else    if ("amt_goods_price".equals(__fieldName)) {
      this.amt_goods_price = (Double) __fieldVal;
      return true;
    }
    else    if ("name_type_suite".equals(__fieldName)) {
      this.name_type_suite = (String) __fieldVal;
      return true;
    }
    else    if ("name_income_type".equals(__fieldName)) {
      this.name_income_type = (String) __fieldVal;
      return true;
    }
    else    if ("name_education_type".equals(__fieldName)) {
      this.name_education_type = (String) __fieldVal;
      return true;
    }
    else    if ("name_family_status".equals(__fieldName)) {
      this.name_family_status = (String) __fieldVal;
      return true;
    }
    else    if ("name_housing_type".equals(__fieldName)) {
      this.name_housing_type = (String) __fieldVal;
      return true;
    }
    else    if ("region_population_relative".equals(__fieldName)) {
      this.region_population_relative = (Double) __fieldVal;
      return true;
    }
    else    if ("days_birth".equals(__fieldName)) {
      this.days_birth = (Integer) __fieldVal;
      return true;
    }
    else    if ("days_employed".equals(__fieldName)) {
      this.days_employed = (Integer) __fieldVal;
      return true;
    }
    else    if ("days_registration".equals(__fieldName)) {
      this.days_registration = (Double) __fieldVal;
      return true;
    }
    else    if ("days_id_publish".equals(__fieldName)) {
      this.days_id_publish = (Integer) __fieldVal;
      return true;
    }
    else    if ("own_car_age".equals(__fieldName)) {
      this.own_car_age = (Double) __fieldVal;
      return true;
    }
    else    if ("flag_mobil".equals(__fieldName)) {
      this.flag_mobil = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_emp_phone".equals(__fieldName)) {
      this.flag_emp_phone = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_work_phone".equals(__fieldName)) {
      this.flag_work_phone = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_cont_mobile".equals(__fieldName)) {
      this.flag_cont_mobile = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_phone".equals(__fieldName)) {
      this.flag_phone = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_email".equals(__fieldName)) {
      this.flag_email = (Integer) __fieldVal;
      return true;
    }
    else    if ("occupation_type".equals(__fieldName)) {
      this.occupation_type = (String) __fieldVal;
      return true;
    }
    else    if ("cnt_fam_members".equals(__fieldName)) {
      this.cnt_fam_members = (Double) __fieldVal;
      return true;
    }
    else    if ("region_rating_client".equals(__fieldName)) {
      this.region_rating_client = (Integer) __fieldVal;
      return true;
    }
    else    if ("region_rating_client_w_city".equals(__fieldName)) {
      this.region_rating_client_w_city = (Integer) __fieldVal;
      return true;
    }
    else    if ("weekday_appr_process_start".equals(__fieldName)) {
      this.weekday_appr_process_start = (String) __fieldVal;
      return true;
    }
    else    if ("hour_appr_process_start".equals(__fieldName)) {
      this.hour_appr_process_start = (Integer) __fieldVal;
      return true;
    }
    else    if ("reg_region_not_live_region".equals(__fieldName)) {
      this.reg_region_not_live_region = (Integer) __fieldVal;
      return true;
    }
    else    if ("reg_region_not_work_region".equals(__fieldName)) {
      this.reg_region_not_work_region = (Integer) __fieldVal;
      return true;
    }
    else    if ("live_region_not_work_region".equals(__fieldName)) {
      this.live_region_not_work_region = (Integer) __fieldVal;
      return true;
    }
    else    if ("reg_city_not_live_city".equals(__fieldName)) {
      this.reg_city_not_live_city = (Integer) __fieldVal;
      return true;
    }
    else    if ("reg_city_not_work_city".equals(__fieldName)) {
      this.reg_city_not_work_city = (Integer) __fieldVal;
      return true;
    }
    else    if ("live_city_not_work_city".equals(__fieldName)) {
      this.live_city_not_work_city = (Integer) __fieldVal;
      return true;
    }
    else    if ("organization_type".equals(__fieldName)) {
      this.organization_type = (String) __fieldVal;
      return true;
    }
    else    if ("ext_source_1".equals(__fieldName)) {
      this.ext_source_1 = (Double) __fieldVal;
      return true;
    }
    else    if ("ext_source_2".equals(__fieldName)) {
      this.ext_source_2 = (Double) __fieldVal;
      return true;
    }
    else    if ("ext_source_3".equals(__fieldName)) {
      this.ext_source_3 = (Double) __fieldVal;
      return true;
    }
    else    if ("apartments_avg".equals(__fieldName)) {
      this.apartments_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("basementarea_avg".equals(__fieldName)) {
      this.basementarea_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("years_beginexpluatation_avg".equals(__fieldName)) {
      this.years_beginexpluatation_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("years_build_avg".equals(__fieldName)) {
      this.years_build_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("commonarea_avg".equals(__fieldName)) {
      this.commonarea_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("elevators_avg".equals(__fieldName)) {
      this.elevators_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("entrances_avg".equals(__fieldName)) {
      this.entrances_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("floorsmax_avg".equals(__fieldName)) {
      this.floorsmax_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("floorsmin_avg".equals(__fieldName)) {
      this.floorsmin_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("landarea_avg".equals(__fieldName)) {
      this.landarea_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("livingapartments_avg".equals(__fieldName)) {
      this.livingapartments_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("livingarea_avg".equals(__fieldName)) {
      this.livingarea_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("nonlivingapartments_avg".equals(__fieldName)) {
      this.nonlivingapartments_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("nonlivingarea_avg".equals(__fieldName)) {
      this.nonlivingarea_avg = (Double) __fieldVal;
      return true;
    }
    else    if ("apartments_mode".equals(__fieldName)) {
      this.apartments_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("basementarea_mode".equals(__fieldName)) {
      this.basementarea_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("years_beginexpluatation_mode".equals(__fieldName)) {
      this.years_beginexpluatation_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("years_build_mode".equals(__fieldName)) {
      this.years_build_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("commonarea_mode".equals(__fieldName)) {
      this.commonarea_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("elevators_mode".equals(__fieldName)) {
      this.elevators_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("entrances_mode".equals(__fieldName)) {
      this.entrances_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("floorsmax_mode".equals(__fieldName)) {
      this.floorsmax_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("floorsmin_mode".equals(__fieldName)) {
      this.floorsmin_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("landarea_mode".equals(__fieldName)) {
      this.landarea_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("livingapartments_mode".equals(__fieldName)) {
      this.livingapartments_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("livingarea_mode".equals(__fieldName)) {
      this.livingarea_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("nonlivingapartments_mode".equals(__fieldName)) {
      this.nonlivingapartments_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("nonlivingarea_mode".equals(__fieldName)) {
      this.nonlivingarea_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("apartments_medi".equals(__fieldName)) {
      this.apartments_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("basementarea_medi".equals(__fieldName)) {
      this.basementarea_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("years_beginexpluatation_medi".equals(__fieldName)) {
      this.years_beginexpluatation_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("years_build_medi".equals(__fieldName)) {
      this.years_build_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("commonarea_medi".equals(__fieldName)) {
      this.commonarea_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("elevators_medi".equals(__fieldName)) {
      this.elevators_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("entrances_medi".equals(__fieldName)) {
      this.entrances_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("floorsmax_medi".equals(__fieldName)) {
      this.floorsmax_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("floorsmin_medi".equals(__fieldName)) {
      this.floorsmin_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("landarea_medi".equals(__fieldName)) {
      this.landarea_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("livingapartments_medi".equals(__fieldName)) {
      this.livingapartments_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("livingarea_medi".equals(__fieldName)) {
      this.livingarea_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("nonlivingapartments_medi".equals(__fieldName)) {
      this.nonlivingapartments_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("nonlivingarea_medi".equals(__fieldName)) {
      this.nonlivingarea_medi = (Double) __fieldVal;
      return true;
    }
    else    if ("fondkapremont_mode".equals(__fieldName)) {
      this.fondkapremont_mode = (String) __fieldVal;
      return true;
    }
    else    if ("housetype_mode".equals(__fieldName)) {
      this.housetype_mode = (String) __fieldVal;
      return true;
    }
    else    if ("totalarea_mode".equals(__fieldName)) {
      this.totalarea_mode = (Double) __fieldVal;
      return true;
    }
    else    if ("wallsmaterial_mode".equals(__fieldName)) {
      this.wallsmaterial_mode = (String) __fieldVal;
      return true;
    }
    else    if ("emergencystate_mode".equals(__fieldName)) {
      this.emergencystate_mode = (String) __fieldVal;
      return true;
    }
    else    if ("obs_30_cnt_social_circle".equals(__fieldName)) {
      this.obs_30_cnt_social_circle = (Double) __fieldVal;
      return true;
    }
    else    if ("def_30_cnt_social_circle".equals(__fieldName)) {
      this.def_30_cnt_social_circle = (Double) __fieldVal;
      return true;
    }
    else    if ("obs_60_cnt_social_circle".equals(__fieldName)) {
      this.obs_60_cnt_social_circle = (Double) __fieldVal;
      return true;
    }
    else    if ("def_60_cnt_social_circle".equals(__fieldName)) {
      this.def_60_cnt_social_circle = (Double) __fieldVal;
      return true;
    }
    else    if ("days_last_phone_change".equals(__fieldName)) {
      this.days_last_phone_change = (Double) __fieldVal;
      return true;
    }
    else    if ("flag_document_2".equals(__fieldName)) {
      this.flag_document_2 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_3".equals(__fieldName)) {
      this.flag_document_3 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_4".equals(__fieldName)) {
      this.flag_document_4 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_5".equals(__fieldName)) {
      this.flag_document_5 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_6".equals(__fieldName)) {
      this.flag_document_6 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_7".equals(__fieldName)) {
      this.flag_document_7 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_8".equals(__fieldName)) {
      this.flag_document_8 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_9".equals(__fieldName)) {
      this.flag_document_9 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_10".equals(__fieldName)) {
      this.flag_document_10 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_11".equals(__fieldName)) {
      this.flag_document_11 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_12".equals(__fieldName)) {
      this.flag_document_12 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_13".equals(__fieldName)) {
      this.flag_document_13 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_14".equals(__fieldName)) {
      this.flag_document_14 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_15".equals(__fieldName)) {
      this.flag_document_15 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_16".equals(__fieldName)) {
      this.flag_document_16 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_17".equals(__fieldName)) {
      this.flag_document_17 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_18".equals(__fieldName)) {
      this.flag_document_18 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_19".equals(__fieldName)) {
      this.flag_document_19 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_20".equals(__fieldName)) {
      this.flag_document_20 = (Integer) __fieldVal;
      return true;
    }
    else    if ("flag_document_21".equals(__fieldName)) {
      this.flag_document_21 = (Integer) __fieldVal;
      return true;
    }
    else    if ("amt_req_credit_bureau_hour".equals(__fieldName)) {
      this.amt_req_credit_bureau_hour = (Double) __fieldVal;
      return true;
    }
    else    if ("amt_req_credit_bureau_day".equals(__fieldName)) {
      this.amt_req_credit_bureau_day = (Double) __fieldVal;
      return true;
    }
    else    if ("amt_req_credit_bureau_week".equals(__fieldName)) {
      this.amt_req_credit_bureau_week = (Double) __fieldVal;
      return true;
    }
    else    if ("amt_req_credit_bureau_mon".equals(__fieldName)) {
      this.amt_req_credit_bureau_mon = (Double) __fieldVal;
      return true;
    }
    else    if ("amt_req_credit_bureau_qrt".equals(__fieldName)) {
      this.amt_req_credit_bureau_qrt = (Double) __fieldVal;
      return true;
    }
    else    if ("amt_req_credit_bureau_year".equals(__fieldName)) {
      this.amt_req_credit_bureau_year = (Double) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
