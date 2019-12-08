package com.chen.base.entity;

import java.util.ArrayList;
import java.util.List;

public class TariffRateExample {
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
     * TariffRateExample
     */
    public TariffRateExample() {
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

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andEccangSkuIsNull() {
            addCriterion("eccang_sku is null");
            return (Criteria) this;
        }

        public Criteria andEccangSkuIsNotNull() {
            addCriterion("eccang_sku is not null");
            return (Criteria) this;
        }

        public Criteria andEccangSkuEqualTo(String value) {
            addCriterion("eccang_sku =", value, "eccangSku");
            return (Criteria) this;
        }

        public Criteria andEccangSkuNotEqualTo(String value) {
            addCriterion("eccang_sku <>", value, "eccangSku");
            return (Criteria) this;
        }

        public Criteria andEccangSkuGreaterThan(String value) {
            addCriterion("eccang_sku >", value, "eccangSku");
            return (Criteria) this;
        }

        public Criteria andEccangSkuGreaterThanOrEqualTo(String value) {
            addCriterion("eccang_sku >=", value, "eccangSku");
            return (Criteria) this;
        }

        public Criteria andEccangSkuLessThan(String value) {
            addCriterion("eccang_sku <", value, "eccangSku");
            return (Criteria) this;
        }

        public Criteria andEccangSkuLessThanOrEqualTo(String value) {
            addCriterion("eccang_sku <=", value, "eccangSku");
            return (Criteria) this;
        }

        public Criteria andEccangSkuLike(String value) {
            addCriterion("eccang_sku like", value, "eccangSku");
            return (Criteria) this;
        }

        public Criteria andEccangSkuNotLike(String value) {
            addCriterion("eccang_sku not like", value, "eccangSku");
            return (Criteria) this;
        }

        public Criteria andEccangSkuIn(List<String> values) {
            addCriterion("eccang_sku in", values, "eccangSku");
            return (Criteria) this;
        }

        public Criteria andEccangSkuNotIn(List<String> values) {
            addCriterion("eccang_sku not in", values, "eccangSku");
            return (Criteria) this;
        }

        public Criteria andEccangSkuBetween(String value1, String value2) {
            addCriterion("eccang_sku between", value1, value2, "eccangSku");
            return (Criteria) this;
        }

        public Criteria andEccangSkuNotBetween(String value1, String value2) {
            addCriterion("eccang_sku not between", value1, value2, "eccangSku");
            return (Criteria) this;
        }

        public Criteria andTariffRateIsNull() {
            addCriterion("tariff_rate is null");
            return (Criteria) this;
        }

        public Criteria andTariffRateIsNotNull() {
            addCriterion("tariff_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTariffRateEqualTo(Float value) {
            addCriterion("tariff_rate =", value, "tariffRate");
            return (Criteria) this;
        }

        public Criteria andTariffRateNotEqualTo(Float value) {
            addCriterion("tariff_rate <>", value, "tariffRate");
            return (Criteria) this;
        }

        public Criteria andTariffRateGreaterThan(Float value) {
            addCriterion("tariff_rate >", value, "tariffRate");
            return (Criteria) this;
        }

        public Criteria andTariffRateGreaterThanOrEqualTo(Float value) {
            addCriterion("tariff_rate >=", value, "tariffRate");
            return (Criteria) this;
        }

        public Criteria andTariffRateLessThan(Float value) {
            addCriterion("tariff_rate <", value, "tariffRate");
            return (Criteria) this;
        }

        public Criteria andTariffRateLessThanOrEqualTo(Float value) {
            addCriterion("tariff_rate <=", value, "tariffRate");
            return (Criteria) this;
        }

        public Criteria andTariffRateIn(List<Float> values) {
            addCriterion("tariff_rate in", values, "tariffRate");
            return (Criteria) this;
        }

        public Criteria andTariffRateNotIn(List<Float> values) {
            addCriterion("tariff_rate not in", values, "tariffRate");
            return (Criteria) this;
        }

        public Criteria andTariffRateBetween(Float value1, Float value2) {
            addCriterion("tariff_rate between", value1, value2, "tariffRate");
            return (Criteria) this;
        }

        public Criteria andTariffRateNotBetween(Float value1, Float value2) {
            addCriterion("tariff_rate not between", value1, value2, "tariffRate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tariff_rate
     *
     * @mbg.generated do_not_delete_during_merge Sat Dec 07 10:01:23 CST 2019
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