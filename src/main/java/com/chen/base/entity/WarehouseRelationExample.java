package com.chen.base.entity;

import java.util.ArrayList;
import java.util.List;

public class WarehouseRelationExample {
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
     * WarehouseRelationExample
     */
    public WarehouseRelationExample() {
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
     * @date 2019/12/10
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

        public Criteria andVirtualWarehouseIdIsNull() {
            addCriterion("virtual_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andVirtualWarehouseIdIsNotNull() {
            addCriterion("virtual_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualWarehouseIdEqualTo(Integer value) {
            addCriterion("virtual_warehouse_id =", value, "virtualWarehouseId");
            return (Criteria) this;
        }

        public Criteria andVirtualWarehouseIdNotEqualTo(Integer value) {
            addCriterion("virtual_warehouse_id <>", value, "virtualWarehouseId");
            return (Criteria) this;
        }

        public Criteria andVirtualWarehouseIdGreaterThan(Integer value) {
            addCriterion("virtual_warehouse_id >", value, "virtualWarehouseId");
            return (Criteria) this;
        }

        public Criteria andVirtualWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("virtual_warehouse_id >=", value, "virtualWarehouseId");
            return (Criteria) this;
        }

        public Criteria andVirtualWarehouseIdLessThan(Integer value) {
            addCriterion("virtual_warehouse_id <", value, "virtualWarehouseId");
            return (Criteria) this;
        }

        public Criteria andVirtualWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("virtual_warehouse_id <=", value, "virtualWarehouseId");
            return (Criteria) this;
        }

        public Criteria andVirtualWarehouseIdIn(List<Integer> values) {
            addCriterion("virtual_warehouse_id in", values, "virtualWarehouseId");
            return (Criteria) this;
        }

        public Criteria andVirtualWarehouseIdNotIn(List<Integer> values) {
            addCriterion("virtual_warehouse_id not in", values, "virtualWarehouseId");
            return (Criteria) this;
        }

        public Criteria andVirtualWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("virtual_warehouse_id between", value1, value2, "virtualWarehouseId");
            return (Criteria) this;
        }

        public Criteria andVirtualWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("virtual_warehouse_id not between", value1, value2, "virtualWarehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Integer value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Integer value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Integer value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Integer value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Integer> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Integer> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNull() {
            addCriterion("warehouse_code is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNotNull() {
            addCriterion("warehouse_code is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeEqualTo(String value) {
            addCriterion("warehouse_code =", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotEqualTo(String value) {
            addCriterion("warehouse_code <>", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThan(String value) {
            addCriterion("warehouse_code >", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_code >=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThan(String value) {
            addCriterion("warehouse_code <", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThanOrEqualTo(String value) {
            addCriterion("warehouse_code <=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLike(String value) {
            addCriterion("warehouse_code like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotLike(String value) {
            addCriterion("warehouse_code not like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIn(List<String> values) {
            addCriterion("warehouse_code in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotIn(List<String> values) {
            addCriterion("warehouse_code not in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeBetween(String value1, String value2) {
            addCriterion("warehouse_code between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotBetween(String value1, String value2) {
            addCriterion("warehouse_code not between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescIsNull() {
            addCriterion("warehouse_desc is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescIsNotNull() {
            addCriterion("warehouse_desc is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescEqualTo(String value) {
            addCriterion("warehouse_desc =", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescNotEqualTo(String value) {
            addCriterion("warehouse_desc <>", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescGreaterThan(String value) {
            addCriterion("warehouse_desc >", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_desc >=", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescLessThan(String value) {
            addCriterion("warehouse_desc <", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescLessThanOrEqualTo(String value) {
            addCriterion("warehouse_desc <=", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescLike(String value) {
            addCriterion("warehouse_desc like", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescNotLike(String value) {
            addCriterion("warehouse_desc not like", value, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescIn(List<String> values) {
            addCriterion("warehouse_desc in", values, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescNotIn(List<String> values) {
            addCriterion("warehouse_desc not in", values, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescBetween(String value1, String value2) {
            addCriterion("warehouse_desc between", value1, value2, "warehouseDesc");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescNotBetween(String value1, String value2) {
            addCriterion("warehouse_desc not between", value1, value2, "warehouseDesc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table warehouse_relation
     *
     * @mbg.generated do_not_delete_during_merge Tue Dec 10 14:32:28 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @author  Generator
     * @date 2019/12/10
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