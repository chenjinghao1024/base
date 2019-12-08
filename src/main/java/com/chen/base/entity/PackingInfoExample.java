package com.chen.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PackingInfoExample {
    /**
     * orderByClause
     */
    protected String orderByClause;

    /**
     * distinct
     */
    protected boolean distinct;

    /**
     * oredCriteria
     */
    protected List<Criteria> oredCriteria;

    /**
     * PackingInfoExample
     */
    public PackingInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * setOrderByClause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * getOrderByClause
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * setDistinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * isDistinct
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * getOredCriteria
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * or
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * or
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * createCriteria
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * createCriteriaInternal
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * clear
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @author  Generator
     * @date 2019/12/07
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(String value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(String value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(String value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(String value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(String value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(String value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLike(String value) {
            addCriterion("country_id like", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotLike(String value) {
            addCriterion("country_id not like", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<String> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<String> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(String value1, String value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(String value1, String value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andPackingIdIsNull() {
            addCriterion("packing_id is null");
            return (Criteria) this;
        }

        public Criteria andPackingIdIsNotNull() {
            addCriterion("packing_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackingIdEqualTo(String value) {
            addCriterion("packing_id =", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdNotEqualTo(String value) {
            addCriterion("packing_id <>", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdGreaterThan(String value) {
            addCriterion("packing_id >", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdGreaterThanOrEqualTo(String value) {
            addCriterion("packing_id >=", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdLessThan(String value) {
            addCriterion("packing_id <", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdLessThanOrEqualTo(String value) {
            addCriterion("packing_id <=", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdLike(String value) {
            addCriterion("packing_id like", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdNotLike(String value) {
            addCriterion("packing_id not like", value, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdIn(List<String> values) {
            addCriterion("packing_id in", values, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdNotIn(List<String> values) {
            addCriterion("packing_id not in", values, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdBetween(String value1, String value2) {
            addCriterion("packing_id between", value1, value2, "packingId");
            return (Criteria) this;
        }

        public Criteria andPackingIdNotBetween(String value1, String value2) {
            addCriterion("packing_id not between", value1, value2, "packingId");
            return (Criteria) this;
        }

        public Criteria andTargetWarehouseidIsNull() {
            addCriterion("target_warehouseId is null");
            return (Criteria) this;
        }

        public Criteria andTargetWarehouseidIsNotNull() {
            addCriterion("target_warehouseId is not null");
            return (Criteria) this;
        }

        public Criteria andTargetWarehouseidEqualTo(Integer value) {
            addCriterion("target_warehouseId =", value, "targetWarehouseid");
            return (Criteria) this;
        }

        public Criteria andTargetWarehouseidNotEqualTo(Integer value) {
            addCriterion("target_warehouseId <>", value, "targetWarehouseid");
            return (Criteria) this;
        }

        public Criteria andTargetWarehouseidGreaterThan(Integer value) {
            addCriterion("target_warehouseId >", value, "targetWarehouseid");
            return (Criteria) this;
        }

        public Criteria andTargetWarehouseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_warehouseId >=", value, "targetWarehouseid");
            return (Criteria) this;
        }

        public Criteria andTargetWarehouseidLessThan(Integer value) {
            addCriterion("target_warehouseId <", value, "targetWarehouseid");
            return (Criteria) this;
        }

        public Criteria andTargetWarehouseidLessThanOrEqualTo(Integer value) {
            addCriterion("target_warehouseId <=", value, "targetWarehouseid");
            return (Criteria) this;
        }

        public Criteria andTargetWarehouseidIn(List<Integer> values) {
            addCriterion("target_warehouseId in", values, "targetWarehouseid");
            return (Criteria) this;
        }

        public Criteria andTargetWarehouseidNotIn(List<Integer> values) {
            addCriterion("target_warehouseId not in", values, "targetWarehouseid");
            return (Criteria) this;
        }

        public Criteria andTargetWarehouseidBetween(Integer value1, Integer value2) {
            addCriterion("target_warehouseId between", value1, value2, "targetWarehouseid");
            return (Criteria) this;
        }

        public Criteria andTargetWarehouseidNotBetween(Integer value1, Integer value2) {
            addCriterion("target_warehouseId not between", value1, value2, "targetWarehouseid");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightAllIsNull() {
            addCriterion("first_carrier_freight_all is null");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightAllIsNotNull() {
            addCriterion("first_carrier_freight_all is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightAllEqualTo(Float value) {
            addCriterion("first_carrier_freight_all =", value, "firstCarrierFreightAll");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightAllNotEqualTo(Float value) {
            addCriterion("first_carrier_freight_all <>", value, "firstCarrierFreightAll");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightAllGreaterThan(Float value) {
            addCriterion("first_carrier_freight_all >", value, "firstCarrierFreightAll");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightAllGreaterThanOrEqualTo(Float value) {
            addCriterion("first_carrier_freight_all >=", value, "firstCarrierFreightAll");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightAllLessThan(Float value) {
            addCriterion("first_carrier_freight_all <", value, "firstCarrierFreightAll");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightAllLessThanOrEqualTo(Float value) {
            addCriterion("first_carrier_freight_all <=", value, "firstCarrierFreightAll");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightAllIn(List<Float> values) {
            addCriterion("first_carrier_freight_all in", values, "firstCarrierFreightAll");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightAllNotIn(List<Float> values) {
            addCriterion("first_carrier_freight_all not in", values, "firstCarrierFreightAll");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightAllBetween(Float value1, Float value2) {
            addCriterion("first_carrier_freight_all between", value1, value2, "firstCarrierFreightAll");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightAllNotBetween(Float value1, Float value2) {
            addCriterion("first_carrier_freight_all not between", value1, value2, "firstCarrierFreightAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxVatAllIsNull() {
            addCriterion("output_tax_vat_all is null");
            return (Criteria) this;
        }

        public Criteria andOutputTaxVatAllIsNotNull() {
            addCriterion("output_tax_vat_all is not null");
            return (Criteria) this;
        }

        public Criteria andOutputTaxVatAllEqualTo(Float value) {
            addCriterion("output_tax_vat_all =", value, "outputTaxVatAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxVatAllNotEqualTo(Float value) {
            addCriterion("output_tax_vat_all <>", value, "outputTaxVatAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxVatAllGreaterThan(Float value) {
            addCriterion("output_tax_vat_all >", value, "outputTaxVatAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxVatAllGreaterThanOrEqualTo(Float value) {
            addCriterion("output_tax_vat_all >=", value, "outputTaxVatAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxVatAllLessThan(Float value) {
            addCriterion("output_tax_vat_all <", value, "outputTaxVatAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxVatAllLessThanOrEqualTo(Float value) {
            addCriterion("output_tax_vat_all <=", value, "outputTaxVatAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxVatAllIn(List<Float> values) {
            addCriterion("output_tax_vat_all in", values, "outputTaxVatAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxVatAllNotIn(List<Float> values) {
            addCriterion("output_tax_vat_all not in", values, "outputTaxVatAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxVatAllBetween(Float value1, Float value2) {
            addCriterion("output_tax_vat_all between", value1, value2, "outputTaxVatAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxVatAllNotBetween(Float value1, Float value2) {
            addCriterion("output_tax_vat_all not between", value1, value2, "outputTaxVatAll");
            return (Criteria) this;
        }

        public Criteria andPcraddTimeIsNull() {
            addCriterion("pcradd_time is null");
            return (Criteria) this;
        }

        public Criteria andPcraddTimeIsNotNull() {
            addCriterion("pcradd_time is not null");
            return (Criteria) this;
        }

        public Criteria andPcraddTimeEqualTo(Date value) {
            addCriterion("pcradd_time =", value, "pcraddTime");
            return (Criteria) this;
        }

        public Criteria andPcraddTimeNotEqualTo(Date value) {
            addCriterion("pcradd_time <>", value, "pcraddTime");
            return (Criteria) this;
        }

        public Criteria andPcraddTimeGreaterThan(Date value) {
            addCriterion("pcradd_time >", value, "pcraddTime");
            return (Criteria) this;
        }

        public Criteria andPcraddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pcradd_time >=", value, "pcraddTime");
            return (Criteria) this;
        }

        public Criteria andPcraddTimeLessThan(Date value) {
            addCriterion("pcradd_time <", value, "pcraddTime");
            return (Criteria) this;
        }

        public Criteria andPcraddTimeLessThanOrEqualTo(Date value) {
            addCriterion("pcradd_time <=", value, "pcraddTime");
            return (Criteria) this;
        }

        public Criteria andPcraddTimeIn(List<Date> values) {
            addCriterion("pcradd_time in", values, "pcraddTime");
            return (Criteria) this;
        }

        public Criteria andPcraddTimeNotIn(List<Date> values) {
            addCriterion("pcradd_time not in", values, "pcraddTime");
            return (Criteria) this;
        }

        public Criteria andPcraddTimeBetween(Date value1, Date value2) {
            addCriterion("pcradd_time between", value1, value2, "pcraddTime");
            return (Criteria) this;
        }

        public Criteria andPcraddTimeNotBetween(Date value1, Date value2) {
            addCriterion("pcradd_time not between", value1, value2, "pcraddTime");
            return (Criteria) this;
        }

        public Criteria andFlieNameIsNull() {
            addCriterion("flie_name is null");
            return (Criteria) this;
        }

        public Criteria andFlieNameIsNotNull() {
            addCriterion("flie_name is not null");
            return (Criteria) this;
        }

        public Criteria andFlieNameEqualTo(String value) {
            addCriterion("flie_name =", value, "flieName");
            return (Criteria) this;
        }

        public Criteria andFlieNameNotEqualTo(String value) {
            addCriterion("flie_name <>", value, "flieName");
            return (Criteria) this;
        }

        public Criteria andFlieNameGreaterThan(String value) {
            addCriterion("flie_name >", value, "flieName");
            return (Criteria) this;
        }

        public Criteria andFlieNameGreaterThanOrEqualTo(String value) {
            addCriterion("flie_name >=", value, "flieName");
            return (Criteria) this;
        }

        public Criteria andFlieNameLessThan(String value) {
            addCriterion("flie_name <", value, "flieName");
            return (Criteria) this;
        }

        public Criteria andFlieNameLessThanOrEqualTo(String value) {
            addCriterion("flie_name <=", value, "flieName");
            return (Criteria) this;
        }

        public Criteria andFlieNameLike(String value) {
            addCriterion("flie_name like", value, "flieName");
            return (Criteria) this;
        }

        public Criteria andFlieNameNotLike(String value) {
            addCriterion("flie_name not like", value, "flieName");
            return (Criteria) this;
        }

        public Criteria andFlieNameIn(List<String> values) {
            addCriterion("flie_name in", values, "flieName");
            return (Criteria) this;
        }

        public Criteria andFlieNameNotIn(List<String> values) {
            addCriterion("flie_name not in", values, "flieName");
            return (Criteria) this;
        }

        public Criteria andFlieNameBetween(String value1, String value2) {
            addCriterion("flie_name between", value1, value2, "flieName");
            return (Criteria) this;
        }

        public Criteria andFlieNameNotBetween(String value1, String value2) {
            addCriterion("flie_name not between", value1, value2, "flieName");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameIsNull() {
            addCriterion("file_name_sysname is null");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameIsNotNull() {
            addCriterion("file_name_sysname is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameEqualTo(String value) {
            addCriterion("file_name_sysname =", value, "fileNameSysname");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameNotEqualTo(String value) {
            addCriterion("file_name_sysname <>", value, "fileNameSysname");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameGreaterThan(String value) {
            addCriterion("file_name_sysname >", value, "fileNameSysname");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name_sysname >=", value, "fileNameSysname");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameLessThan(String value) {
            addCriterion("file_name_sysname <", value, "fileNameSysname");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameLessThanOrEqualTo(String value) {
            addCriterion("file_name_sysname <=", value, "fileNameSysname");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameLike(String value) {
            addCriterion("file_name_sysname like", value, "fileNameSysname");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameNotLike(String value) {
            addCriterion("file_name_sysname not like", value, "fileNameSysname");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameIn(List<String> values) {
            addCriterion("file_name_sysname in", values, "fileNameSysname");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameNotIn(List<String> values) {
            addCriterion("file_name_sysname not in", values, "fileNameSysname");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameBetween(String value1, String value2) {
            addCriterion("file_name_sysname between", value1, value2, "fileNameSysname");
            return (Criteria) this;
        }

        public Criteria andFileNameSysnameNotBetween(String value1, String value2) {
            addCriterion("file_name_sysname not between", value1, value2, "fileNameSysname");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNull() {
            addCriterion("file_url is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNotNull() {
            addCriterion("file_url is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("file_url =", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("file_url <>", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("file_url >", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("file_url >=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThan(String value) {
            addCriterion("file_url <", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("file_url <=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLike(String value) {
            addCriterion("file_url like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotLike(String value) {
            addCriterion("file_url not like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("file_url in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("file_url not in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("file_url between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("file_url not between", value1, value2, "fileUrl");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table packing_info
     *
     * @mbg.generated do_not_delete_during_merge Sat Dec 07 09:56:32 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @author  Generator
     * @date 2019/12/07
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}