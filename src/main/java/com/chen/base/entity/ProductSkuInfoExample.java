package com.chen.base.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductSkuInfoExample {
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
     * ProductSkuInfoExample
     */
    public ProductSkuInfoExample() {
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
     * @date 2019/11/21
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

        public Criteria andProductBySkuIdIsNull() {
            addCriterion("product_by_sku_id is null");
            return (Criteria) this;
        }

        public Criteria andProductBySkuIdIsNotNull() {
            addCriterion("product_by_sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductBySkuIdEqualTo(Integer value) {
            addCriterion("product_by_sku_id =", value, "productBySkuId");
            return (Criteria) this;
        }

        public Criteria andProductBySkuIdNotEqualTo(Integer value) {
            addCriterion("product_by_sku_id <>", value, "productBySkuId");
            return (Criteria) this;
        }

        public Criteria andProductBySkuIdGreaterThan(Integer value) {
            addCriterion("product_by_sku_id >", value, "productBySkuId");
            return (Criteria) this;
        }

        public Criteria andProductBySkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_by_sku_id >=", value, "productBySkuId");
            return (Criteria) this;
        }

        public Criteria andProductBySkuIdLessThan(Integer value) {
            addCriterion("product_by_sku_id <", value, "productBySkuId");
            return (Criteria) this;
        }

        public Criteria andProductBySkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_by_sku_id <=", value, "productBySkuId");
            return (Criteria) this;
        }

        public Criteria andProductBySkuIdIn(List<Integer> values) {
            addCriterion("product_by_sku_id in", values, "productBySkuId");
            return (Criteria) this;
        }

        public Criteria andProductBySkuIdNotIn(List<Integer> values) {
            addCriterion("product_by_sku_id not in", values, "productBySkuId");
            return (Criteria) this;
        }

        public Criteria andProductBySkuIdBetween(Integer value1, Integer value2) {
            addCriterion("product_by_sku_id between", value1, value2, "productBySkuId");
            return (Criteria) this;
        }

        public Criteria andProductBySkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_by_sku_id not between", value1, value2, "productBySkuId");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuIsNull() {
            addCriterion("pcr_product_sku is null");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuIsNotNull() {
            addCriterion("pcr_product_sku is not null");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuEqualTo(String value) {
            addCriterion("pcr_product_sku =", value, "pcrProductSku");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuNotEqualTo(String value) {
            addCriterion("pcr_product_sku <>", value, "pcrProductSku");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuGreaterThan(String value) {
            addCriterion("pcr_product_sku >", value, "pcrProductSku");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuGreaterThanOrEqualTo(String value) {
            addCriterion("pcr_product_sku >=", value, "pcrProductSku");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuLessThan(String value) {
            addCriterion("pcr_product_sku <", value, "pcrProductSku");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuLessThanOrEqualTo(String value) {
            addCriterion("pcr_product_sku <=", value, "pcrProductSku");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuLike(String value) {
            addCriterion("pcr_product_sku like", value, "pcrProductSku");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuNotLike(String value) {
            addCriterion("pcr_product_sku not like", value, "pcrProductSku");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuIn(List<String> values) {
            addCriterion("pcr_product_sku in", values, "pcrProductSku");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuNotIn(List<String> values) {
            addCriterion("pcr_product_sku not in", values, "pcrProductSku");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuBetween(String value1, String value2) {
            addCriterion("pcr_product_sku between", value1, value2, "pcrProductSku");
            return (Criteria) this;
        }

        public Criteria andPcrProductSkuNotBetween(String value1, String value2) {
            addCriterion("pcr_product_sku not between", value1, value2, "pcrProductSku");
            return (Criteria) this;
        }

        public Criteria andPcrQtyIsNull() {
            addCriterion("pcr_qty is null");
            return (Criteria) this;
        }

        public Criteria andPcrQtyIsNotNull() {
            addCriterion("pcr_qty is not null");
            return (Criteria) this;
        }

        public Criteria andPcrQtyEqualTo(String value) {
            addCriterion("pcr_qty =", value, "pcrQty");
            return (Criteria) this;
        }

        public Criteria andPcrQtyNotEqualTo(String value) {
            addCriterion("pcr_qty <>", value, "pcrQty");
            return (Criteria) this;
        }

        public Criteria andPcrQtyGreaterThan(String value) {
            addCriterion("pcr_qty >", value, "pcrQty");
            return (Criteria) this;
        }

        public Criteria andPcrQtyGreaterThanOrEqualTo(String value) {
            addCriterion("pcr_qty >=", value, "pcrQty");
            return (Criteria) this;
        }

        public Criteria andPcrQtyLessThan(String value) {
            addCriterion("pcr_qty <", value, "pcrQty");
            return (Criteria) this;
        }

        public Criteria andPcrQtyLessThanOrEqualTo(String value) {
            addCriterion("pcr_qty <=", value, "pcrQty");
            return (Criteria) this;
        }

        public Criteria andPcrQtyLike(String value) {
            addCriterion("pcr_qty like", value, "pcrQty");
            return (Criteria) this;
        }

        public Criteria andPcrQtyNotLike(String value) {
            addCriterion("pcr_qty not like", value, "pcrQty");
            return (Criteria) this;
        }

        public Criteria andPcrQtyIn(List<String> values) {
            addCriterion("pcr_qty in", values, "pcrQty");
            return (Criteria) this;
        }

        public Criteria andPcrQtyNotIn(List<String> values) {
            addCriterion("pcr_qty not in", values, "pcrQty");
            return (Criteria) this;
        }

        public Criteria andPcrQtyBetween(String value1, String value2) {
            addCriterion("pcr_qty between", value1, value2, "pcrQty");
            return (Criteria) this;
        }

        public Criteria andPcrQtyNotBetween(String value1, String value2) {
            addCriterion("pcr_qty not between", value1, value2, "pcrQty");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_sku_info
     *
     * @mbg.generated do_not_delete_during_merge Thu Nov 21 13:31:16 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @author  Generator
     * @date 2019/11/21
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