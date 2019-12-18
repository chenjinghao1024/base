package com.chen.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdvertisementFileExample {
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
     * AdvertisementFileExample
     */
    public AdvertisementFileExample() {
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
     * @date 2019/12/16
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

        public Criteria andAdvertisementFileSysnameIsNull() {
            addCriterion("advertisement_file_sysname is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileSysnameIsNotNull() {
            addCriterion("advertisement_file_sysname is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileSysnameEqualTo(String value) {
            addCriterion("advertisement_file_sysname =", value, "advertisementFileSysname");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileSysnameNotEqualTo(String value) {
            addCriterion("advertisement_file_sysname <>", value, "advertisementFileSysname");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileSysnameGreaterThan(String value) {
            addCriterion("advertisement_file_sysname >", value, "advertisementFileSysname");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileSysnameGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_file_sysname >=", value, "advertisementFileSysname");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileSysnameLessThan(String value) {
            addCriterion("advertisement_file_sysname <", value, "advertisementFileSysname");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileSysnameLessThanOrEqualTo(String value) {
            addCriterion("advertisement_file_sysname <=", value, "advertisementFileSysname");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileSysnameLike(String value) {
            addCriterion("advertisement_file_sysname like", value, "advertisementFileSysname");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileSysnameNotLike(String value) {
            addCriterion("advertisement_file_sysname not like", value, "advertisementFileSysname");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileSysnameIn(List<String> values) {
            addCriterion("advertisement_file_sysname in", values, "advertisementFileSysname");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileSysnameNotIn(List<String> values) {
            addCriterion("advertisement_file_sysname not in", values, "advertisementFileSysname");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileSysnameBetween(String value1, String value2) {
            addCriterion("advertisement_file_sysname between", value1, value2, "advertisementFileSysname");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileSysnameNotBetween(String value1, String value2) {
            addCriterion("advertisement_file_sysname not between", value1, value2, "advertisementFileSysname");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameIsNull() {
            addCriterion("advertisement_file_name is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameIsNotNull() {
            addCriterion("advertisement_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameEqualTo(String value) {
            addCriterion("advertisement_file_name =", value, "advertisementFileName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameNotEqualTo(String value) {
            addCriterion("advertisement_file_name <>", value, "advertisementFileName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameGreaterThan(String value) {
            addCriterion("advertisement_file_name >", value, "advertisementFileName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_file_name >=", value, "advertisementFileName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameLessThan(String value) {
            addCriterion("advertisement_file_name <", value, "advertisementFileName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameLessThanOrEqualTo(String value) {
            addCriterion("advertisement_file_name <=", value, "advertisementFileName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameLike(String value) {
            addCriterion("advertisement_file_name like", value, "advertisementFileName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameNotLike(String value) {
            addCriterion("advertisement_file_name not like", value, "advertisementFileName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameIn(List<String> values) {
            addCriterion("advertisement_file_name in", values, "advertisementFileName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameNotIn(List<String> values) {
            addCriterion("advertisement_file_name not in", values, "advertisementFileName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameBetween(String value1, String value2) {
            addCriterion("advertisement_file_name between", value1, value2, "advertisementFileName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementFileNameNotBetween(String value1, String value2) {
            addCriterion("advertisement_file_name not between", value1, value2, "advertisementFileName");
            return (Criteria) this;
        }

        public Criteria andUrlFileIsNull() {
            addCriterion("url_file is null");
            return (Criteria) this;
        }

        public Criteria andUrlFileIsNotNull() {
            addCriterion("url_file is not null");
            return (Criteria) this;
        }

        public Criteria andUrlFileEqualTo(String value) {
            addCriterion("url_file =", value, "urlFile");
            return (Criteria) this;
        }

        public Criteria andUrlFileNotEqualTo(String value) {
            addCriterion("url_file <>", value, "urlFile");
            return (Criteria) this;
        }

        public Criteria andUrlFileGreaterThan(String value) {
            addCriterion("url_file >", value, "urlFile");
            return (Criteria) this;
        }

        public Criteria andUrlFileGreaterThanOrEqualTo(String value) {
            addCriterion("url_file >=", value, "urlFile");
            return (Criteria) this;
        }

        public Criteria andUrlFileLessThan(String value) {
            addCriterion("url_file <", value, "urlFile");
            return (Criteria) this;
        }

        public Criteria andUrlFileLessThanOrEqualTo(String value) {
            addCriterion("url_file <=", value, "urlFile");
            return (Criteria) this;
        }

        public Criteria andUrlFileLike(String value) {
            addCriterion("url_file like", value, "urlFile");
            return (Criteria) this;
        }

        public Criteria andUrlFileNotLike(String value) {
            addCriterion("url_file not like", value, "urlFile");
            return (Criteria) this;
        }

        public Criteria andUrlFileIn(List<String> values) {
            addCriterion("url_file in", values, "urlFile");
            return (Criteria) this;
        }

        public Criteria andUrlFileNotIn(List<String> values) {
            addCriterion("url_file not in", values, "urlFile");
            return (Criteria) this;
        }

        public Criteria andUrlFileBetween(String value1, String value2) {
            addCriterion("url_file between", value1, value2, "urlFile");
            return (Criteria) this;
        }

        public Criteria andUrlFileNotBetween(String value1, String value2) {
            addCriterion("url_file not between", value1, value2, "urlFile");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table advertisement_file
     *
     * @mbg.generated do_not_delete_during_merge Mon Dec 16 13:08:52 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @author  Generator
     * @date 2019/12/16
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