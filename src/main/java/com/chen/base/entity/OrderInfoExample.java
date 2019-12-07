package com.chen.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoExample {
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
     * OrderInfoExample
     */
    public OrderInfoExample() {
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
     * @date 2019/11/22
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

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeIsNull() {
            addCriterion("sale_order_code is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeIsNotNull() {
            addCriterion("sale_order_code is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeEqualTo(String value) {
            addCriterion("sale_order_code =", value, "saleOrderCode");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeNotEqualTo(String value) {
            addCriterion("sale_order_code <>", value, "saleOrderCode");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeGreaterThan(String value) {
            addCriterion("sale_order_code >", value, "saleOrderCode");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sale_order_code >=", value, "saleOrderCode");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeLessThan(String value) {
            addCriterion("sale_order_code <", value, "saleOrderCode");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("sale_order_code <=", value, "saleOrderCode");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeLike(String value) {
            addCriterion("sale_order_code like", value, "saleOrderCode");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeNotLike(String value) {
            addCriterion("sale_order_code not like", value, "saleOrderCode");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeIn(List<String> values) {
            addCriterion("sale_order_code in", values, "saleOrderCode");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeNotIn(List<String> values) {
            addCriterion("sale_order_code not in", values, "saleOrderCode");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeBetween(String value1, String value2) {
            addCriterion("sale_order_code between", value1, value2, "saleOrderCode");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodeNotBetween(String value1, String value2) {
            addCriterion("sale_order_code not between", value1, value2, "saleOrderCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeIsNull() {
            addCriterion("warehouse_order_code is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeIsNotNull() {
            addCriterion("warehouse_order_code is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeEqualTo(String value) {
            addCriterion("warehouse_order_code =", value, "warehouseOrderCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeNotEqualTo(String value) {
            addCriterion("warehouse_order_code <>", value, "warehouseOrderCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeGreaterThan(String value) {
            addCriterion("warehouse_order_code >", value, "warehouseOrderCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_order_code >=", value, "warehouseOrderCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeLessThan(String value) {
            addCriterion("warehouse_order_code <", value, "warehouseOrderCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("warehouse_order_code <=", value, "warehouseOrderCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeLike(String value) {
            addCriterion("warehouse_order_code like", value, "warehouseOrderCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeNotLike(String value) {
            addCriterion("warehouse_order_code not like", value, "warehouseOrderCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeIn(List<String> values) {
            addCriterion("warehouse_order_code in", values, "warehouseOrderCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeNotIn(List<String> values) {
            addCriterion("warehouse_order_code not in", values, "warehouseOrderCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeBetween(String value1, String value2) {
            addCriterion("warehouse_order_code between", value1, value2, "warehouseOrderCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseOrderCodeNotBetween(String value1, String value2) {
            addCriterion("warehouse_order_code not between", value1, value2, "warehouseOrderCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
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

        public Criteria andAmountpaidIsNull() {
            addCriterion("amountpaid is null");
            return (Criteria) this;
        }

        public Criteria andAmountpaidIsNotNull() {
            addCriterion("amountpaid is not null");
            return (Criteria) this;
        }

        public Criteria andAmountpaidEqualTo(Float value) {
            addCriterion("amountpaid =", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidNotEqualTo(Float value) {
            addCriterion("amountpaid <>", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidGreaterThan(Float value) {
            addCriterion("amountpaid >", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidGreaterThanOrEqualTo(Float value) {
            addCriterion("amountpaid >=", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidLessThan(Float value) {
            addCriterion("amountpaid <", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidLessThanOrEqualTo(Float value) {
            addCriterion("amountpaid <=", value, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidIn(List<Float> values) {
            addCriterion("amountpaid in", values, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidNotIn(List<Float> values) {
            addCriterion("amountpaid not in", values, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidBetween(Float value1, Float value2) {
            addCriterion("amountpaid between", value1, value2, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andAmountpaidNotBetween(Float value1, Float value2) {
            addCriterion("amountpaid not between", value1, value2, "amountpaid");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNull() {
            addCriterion("subtotal is null");
            return (Criteria) this;
        }

        public Criteria andSubtotalIsNotNull() {
            addCriterion("subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andSubtotalEqualTo(Float value) {
            addCriterion("subtotal =", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotEqualTo(Float value) {
            addCriterion("subtotal <>", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThan(Float value) {
            addCriterion("subtotal >", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalGreaterThanOrEqualTo(Float value) {
            addCriterion("subtotal >=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThan(Float value) {
            addCriterion("subtotal <", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalLessThanOrEqualTo(Float value) {
            addCriterion("subtotal <=", value, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalIn(List<Float> values) {
            addCriterion("subtotal in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotIn(List<Float> values) {
            addCriterion("subtotal not in", values, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalBetween(Float value1, Float value2) {
            addCriterion("subtotal between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andSubtotalNotBetween(Float value1, Float value2) {
            addCriterion("subtotal not between", value1, value2, "subtotal");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andDateWarehouseShippingIsNull() {
            addCriterion("date_warehouse_shipping is null");
            return (Criteria) this;
        }

        public Criteria andDateWarehouseShippingIsNotNull() {
            addCriterion("date_warehouse_shipping is not null");
            return (Criteria) this;
        }

        public Criteria andDateWarehouseShippingEqualTo(Date value) {
            addCriterion("date_warehouse_shipping =", value, "dateWarehouseShipping");
            return (Criteria) this;
        }

        public Criteria andDateWarehouseShippingNotEqualTo(Date value) {
            addCriterion("date_warehouse_shipping <>", value, "dateWarehouseShipping");
            return (Criteria) this;
        }

        public Criteria andDateWarehouseShippingGreaterThan(Date value) {
            addCriterion("date_warehouse_shipping >", value, "dateWarehouseShipping");
            return (Criteria) this;
        }

        public Criteria andDateWarehouseShippingGreaterThanOrEqualTo(Date value) {
            addCriterion("date_warehouse_shipping >=", value, "dateWarehouseShipping");
            return (Criteria) this;
        }

        public Criteria andDateWarehouseShippingLessThan(Date value) {
            addCriterion("date_warehouse_shipping <", value, "dateWarehouseShipping");
            return (Criteria) this;
        }

        public Criteria andDateWarehouseShippingLessThanOrEqualTo(Date value) {
            addCriterion("date_warehouse_shipping <=", value, "dateWarehouseShipping");
            return (Criteria) this;
        }

        public Criteria andDateWarehouseShippingIn(List<Date> values) {
            addCriterion("date_warehouse_shipping in", values, "dateWarehouseShipping");
            return (Criteria) this;
        }

        public Criteria andDateWarehouseShippingNotIn(List<Date> values) {
            addCriterion("date_warehouse_shipping not in", values, "dateWarehouseShipping");
            return (Criteria) this;
        }

        public Criteria andDateWarehouseShippingBetween(Date value1, Date value2) {
            addCriterion("date_warehouse_shipping between", value1, value2, "dateWarehouseShipping");
            return (Criteria) this;
        }

        public Criteria andDateWarehouseShippingNotBetween(Date value1, Date value2) {
            addCriterion("date_warehouse_shipping not between", value1, value2, "dateWarehouseShipping");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_info
     *
     * @mbg.generated do_not_delete_during_merge Fri Nov 22 10:36:11 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @author  Generator
     * @date 2019/11/22
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