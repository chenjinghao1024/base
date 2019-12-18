package com.chen.base.entity;

import java.util.ArrayList;
import java.util.List;

public class OutputTaxAllExample {
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
     * OutputTaxAllExample
     */
    public OutputTaxAllExample() {
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
     * @date 2019/12/17
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

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andMonthNumIsNull() {
            addCriterion("month_num is null");
            return (Criteria) this;
        }

        public Criteria andMonthNumIsNotNull() {
            addCriterion("month_num is not null");
            return (Criteria) this;
        }

        public Criteria andMonthNumEqualTo(Integer value) {
            addCriterion("month_num =", value, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumNotEqualTo(Integer value) {
            addCriterion("month_num <>", value, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumGreaterThan(Integer value) {
            addCriterion("month_num >", value, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_num >=", value, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumLessThan(Integer value) {
            addCriterion("month_num <", value, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumLessThanOrEqualTo(Integer value) {
            addCriterion("month_num <=", value, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumIn(List<Integer> values) {
            addCriterion("month_num in", values, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumNotIn(List<Integer> values) {
            addCriterion("month_num not in", values, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumBetween(Integer value1, Integer value2) {
            addCriterion("month_num between", value1, value2, "monthNum");
            return (Criteria) this;
        }

        public Criteria andMonthNumNotBetween(Integer value1, Integer value2) {
            addCriterion("month_num not between", value1, value2, "monthNum");
            return (Criteria) this;
        }

        public Criteria andOutputTaxAllIsNull() {
            addCriterion("output_tax_all is null");
            return (Criteria) this;
        }

        public Criteria andOutputTaxAllIsNotNull() {
            addCriterion("output_tax_all is not null");
            return (Criteria) this;
        }

        public Criteria andOutputTaxAllEqualTo(Float value) {
            addCriterion("output_tax_all =", value, "outputTaxAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxAllNotEqualTo(Float value) {
            addCriterion("output_tax_all <>", value, "outputTaxAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxAllGreaterThan(Float value) {
            addCriterion("output_tax_all >", value, "outputTaxAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxAllGreaterThanOrEqualTo(Float value) {
            addCriterion("output_tax_all >=", value, "outputTaxAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxAllLessThan(Float value) {
            addCriterion("output_tax_all <", value, "outputTaxAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxAllLessThanOrEqualTo(Float value) {
            addCriterion("output_tax_all <=", value, "outputTaxAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxAllIn(List<Float> values) {
            addCriterion("output_tax_all in", values, "outputTaxAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxAllNotIn(List<Float> values) {
            addCriterion("output_tax_all not in", values, "outputTaxAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxAllBetween(Float value1, Float value2) {
            addCriterion("output_tax_all between", value1, value2, "outputTaxAll");
            return (Criteria) this;
        }

        public Criteria andOutputTaxAllNotBetween(Float value1, Float value2) {
            addCriterion("output_tax_all not between", value1, value2, "outputTaxAll");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table output_tax_all
     *
     * @mbg.generated do_not_delete_during_merge Tue Dec 17 14:01:27 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @author  Generator
     * @date 2019/12/17
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