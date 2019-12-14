package com.chen.base.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailExample {
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
     * OrderDetailExample
     */
    public OrderDetailExample() {
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
     * @date 2019/12/14
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

        public Criteria andOrderInfoIdIsNull() {
            addCriterion("order_info_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdIsNotNull() {
            addCriterion("order_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdEqualTo(Integer value) {
            addCriterion("order_info_id =", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotEqualTo(Integer value) {
            addCriterion("order_info_id <>", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdGreaterThan(Integer value) {
            addCriterion("order_info_id >", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_info_id >=", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdLessThan(Integer value) {
            addCriterion("order_info_id <", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_info_id <=", value, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdIn(List<Integer> values) {
            addCriterion("order_info_id in", values, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotIn(List<Integer> values) {
            addCriterion("order_info_id not in", values, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("order_info_id between", value1, value2, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andOrderInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_info_id not between", value1, value2, "orderInfoId");
            return (Criteria) this;
        }

        public Criteria andProductSkuIsNull() {
            addCriterion("product_sku is null");
            return (Criteria) this;
        }

        public Criteria andProductSkuIsNotNull() {
            addCriterion("product_sku is not null");
            return (Criteria) this;
        }

        public Criteria andProductSkuEqualTo(String value) {
            addCriterion("product_sku =", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuNotEqualTo(String value) {
            addCriterion("product_sku <>", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuGreaterThan(String value) {
            addCriterion("product_sku >", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuGreaterThanOrEqualTo(String value) {
            addCriterion("product_sku >=", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuLessThan(String value) {
            addCriterion("product_sku <", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuLessThanOrEqualTo(String value) {
            addCriterion("product_sku <=", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuLike(String value) {
            addCriterion("product_sku like", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuNotLike(String value) {
            addCriterion("product_sku not like", value, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuIn(List<String> values) {
            addCriterion("product_sku in", values, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuNotIn(List<String> values) {
            addCriterion("product_sku not in", values, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuBetween(String value1, String value2) {
            addCriterion("product_sku between", value1, value2, "productSku");
            return (Criteria) this;
        }

        public Criteria andProductSkuNotBetween(String value1, String value2) {
            addCriterion("product_sku not between", value1, value2, "productSku");
            return (Criteria) this;
        }

        public Criteria andSkuIsNull() {
            addCriterion("sku is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsNotNull() {
            addCriterion("sku is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(String value) {
            addCriterion("sku =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(String value) {
            addCriterion("sku <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(String value) {
            addCriterion("sku >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(String value) {
            addCriterion("sku >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(String value) {
            addCriterion("sku <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(String value) {
            addCriterion("sku <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLike(String value) {
            addCriterion("sku like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotLike(String value) {
            addCriterion("sku not like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<String> values) {
            addCriterion("sku in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<String> values) {
            addCriterion("sku not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(String value1, String value2) {
            addCriterion("sku between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(String value1, String value2) {
            addCriterion("sku not between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDeclaredValueIsNull() {
            addCriterion("declared_value is null");
            return (Criteria) this;
        }

        public Criteria andDeclaredValueIsNotNull() {
            addCriterion("declared_value is not null");
            return (Criteria) this;
        }

        public Criteria andDeclaredValueEqualTo(Float value) {
            addCriterion("declared_value =", value, "declaredValue");
            return (Criteria) this;
        }

        public Criteria andDeclaredValueNotEqualTo(Float value) {
            addCriterion("declared_value <>", value, "declaredValue");
            return (Criteria) this;
        }

        public Criteria andDeclaredValueGreaterThan(Float value) {
            addCriterion("declared_value >", value, "declaredValue");
            return (Criteria) this;
        }

        public Criteria andDeclaredValueGreaterThanOrEqualTo(Float value) {
            addCriterion("declared_value >=", value, "declaredValue");
            return (Criteria) this;
        }

        public Criteria andDeclaredValueLessThan(Float value) {
            addCriterion("declared_value <", value, "declaredValue");
            return (Criteria) this;
        }

        public Criteria andDeclaredValueLessThanOrEqualTo(Float value) {
            addCriterion("declared_value <=", value, "declaredValue");
            return (Criteria) this;
        }

        public Criteria andDeclaredValueIn(List<Float> values) {
            addCriterion("declared_value in", values, "declaredValue");
            return (Criteria) this;
        }

        public Criteria andDeclaredValueNotIn(List<Float> values) {
            addCriterion("declared_value not in", values, "declaredValue");
            return (Criteria) this;
        }

        public Criteria andDeclaredValueBetween(Float value1, Float value2) {
            addCriterion("declared_value between", value1, value2, "declaredValue");
            return (Criteria) this;
        }

        public Criteria andDeclaredValueNotBetween(Float value1, Float value2) {
            addCriterion("declared_value not between", value1, value2, "declaredValue");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Float value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Float value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Float value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Float value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Float value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Float value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Float> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Float> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Float value1, Float value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Float value1, Float value2) {
            addCriterion("weight not between", value1, value2, "weight");
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

        public Criteria andCurrencyRateIsNull() {
            addCriterion("currency_rate is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyRateIsNotNull() {
            addCriterion("currency_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyRateEqualTo(Float value) {
            addCriterion("currency_rate =", value, "currencyRate");
            return (Criteria) this;
        }

        public Criteria andCurrencyRateNotEqualTo(Float value) {
            addCriterion("currency_rate <>", value, "currencyRate");
            return (Criteria) this;
        }

        public Criteria andCurrencyRateGreaterThan(Float value) {
            addCriterion("currency_rate >", value, "currencyRate");
            return (Criteria) this;
        }

        public Criteria andCurrencyRateGreaterThanOrEqualTo(Float value) {
            addCriterion("currency_rate >=", value, "currencyRate");
            return (Criteria) this;
        }

        public Criteria andCurrencyRateLessThan(Float value) {
            addCriterion("currency_rate <", value, "currencyRate");
            return (Criteria) this;
        }

        public Criteria andCurrencyRateLessThanOrEqualTo(Float value) {
            addCriterion("currency_rate <=", value, "currencyRate");
            return (Criteria) this;
        }

        public Criteria andCurrencyRateIn(List<Float> values) {
            addCriterion("currency_rate in", values, "currencyRate");
            return (Criteria) this;
        }

        public Criteria andCurrencyRateNotIn(List<Float> values) {
            addCriterion("currency_rate not in", values, "currencyRate");
            return (Criteria) this;
        }

        public Criteria andCurrencyRateBetween(Float value1, Float value2) {
            addCriterion("currency_rate between", value1, value2, "currencyRate");
            return (Criteria) this;
        }

        public Criteria andCurrencyRateNotBetween(Float value1, Float value2) {
            addCriterion("currency_rate not between", value1, value2, "currencyRate");
            return (Criteria) this;
        }

        public Criteria andPaymentPlatformFreeIsNull() {
            addCriterion("payment_platform_free is null");
            return (Criteria) this;
        }

        public Criteria andPaymentPlatformFreeIsNotNull() {
            addCriterion("payment_platform_free is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentPlatformFreeEqualTo(Float value) {
            addCriterion("payment_platform_free =", value, "paymentPlatformFree");
            return (Criteria) this;
        }

        public Criteria andPaymentPlatformFreeNotEqualTo(Float value) {
            addCriterion("payment_platform_free <>", value, "paymentPlatformFree");
            return (Criteria) this;
        }

        public Criteria andPaymentPlatformFreeGreaterThan(Float value) {
            addCriterion("payment_platform_free >", value, "paymentPlatformFree");
            return (Criteria) this;
        }

        public Criteria andPaymentPlatformFreeGreaterThanOrEqualTo(Float value) {
            addCriterion("payment_platform_free >=", value, "paymentPlatformFree");
            return (Criteria) this;
        }

        public Criteria andPaymentPlatformFreeLessThan(Float value) {
            addCriterion("payment_platform_free <", value, "paymentPlatformFree");
            return (Criteria) this;
        }

        public Criteria andPaymentPlatformFreeLessThanOrEqualTo(Float value) {
            addCriterion("payment_platform_free <=", value, "paymentPlatformFree");
            return (Criteria) this;
        }

        public Criteria andPaymentPlatformFreeIn(List<Float> values) {
            addCriterion("payment_platform_free in", values, "paymentPlatformFree");
            return (Criteria) this;
        }

        public Criteria andPaymentPlatformFreeNotIn(List<Float> values) {
            addCriterion("payment_platform_free not in", values, "paymentPlatformFree");
            return (Criteria) this;
        }

        public Criteria andPaymentPlatformFreeBetween(Float value1, Float value2) {
            addCriterion("payment_platform_free between", value1, value2, "paymentPlatformFree");
            return (Criteria) this;
        }

        public Criteria andPaymentPlatformFreeNotBetween(Float value1, Float value2) {
            addCriterion("payment_platform_free not between", value1, value2, "paymentPlatformFree");
            return (Criteria) this;
        }

        public Criteria andFbaFeeIsNull() {
            addCriterion("fba_fee is null");
            return (Criteria) this;
        }

        public Criteria andFbaFeeIsNotNull() {
            addCriterion("fba_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFbaFeeEqualTo(Float value) {
            addCriterion("fba_fee =", value, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeNotEqualTo(Float value) {
            addCriterion("fba_fee <>", value, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeGreaterThan(Float value) {
            addCriterion("fba_fee >", value, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("fba_fee >=", value, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeLessThan(Float value) {
            addCriterion("fba_fee <", value, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeLessThanOrEqualTo(Float value) {
            addCriterion("fba_fee <=", value, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeIn(List<Float> values) {
            addCriterion("fba_fee in", values, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeNotIn(List<Float> values) {
            addCriterion("fba_fee not in", values, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeBetween(Float value1, Float value2) {
            addCriterion("fba_fee between", value1, value2, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andFbaFeeNotBetween(Float value1, Float value2) {
            addCriterion("fba_fee not between", value1, value2, "fbaFee");
            return (Criteria) this;
        }

        public Criteria andRefundIsNull() {
            addCriterion("refund is null");
            return (Criteria) this;
        }

        public Criteria andRefundIsNotNull() {
            addCriterion("refund is not null");
            return (Criteria) this;
        }

        public Criteria andRefundEqualTo(Float value) {
            addCriterion("refund =", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotEqualTo(Float value) {
            addCriterion("refund <>", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThan(Float value) {
            addCriterion("refund >", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThanOrEqualTo(Float value) {
            addCriterion("refund >=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThan(Float value) {
            addCriterion("refund <", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThanOrEqualTo(Float value) {
            addCriterion("refund <=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundIn(List<Float> values) {
            addCriterion("refund in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotIn(List<Float> values) {
            addCriterion("refund not in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundBetween(Float value1, Float value2) {
            addCriterion("refund between", value1, value2, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotBetween(Float value1, Float value2) {
            addCriterion("refund not between", value1, value2, "refund");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostIsNull() {
            addCriterion("purchase_cost is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostIsNotNull() {
            addCriterion("purchase_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostEqualTo(Float value) {
            addCriterion("purchase_cost =", value, "purchaseCost");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostNotEqualTo(Float value) {
            addCriterion("purchase_cost <>", value, "purchaseCost");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostGreaterThan(Float value) {
            addCriterion("purchase_cost >", value, "purchaseCost");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostGreaterThanOrEqualTo(Float value) {
            addCriterion("purchase_cost >=", value, "purchaseCost");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostLessThan(Float value) {
            addCriterion("purchase_cost <", value, "purchaseCost");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostLessThanOrEqualTo(Float value) {
            addCriterion("purchase_cost <=", value, "purchaseCost");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostIn(List<Float> values) {
            addCriterion("purchase_cost in", values, "purchaseCost");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostNotIn(List<Float> values) {
            addCriterion("purchase_cost not in", values, "purchaseCost");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostBetween(Float value1, Float value2) {
            addCriterion("purchase_cost between", value1, value2, "purchaseCost");
            return (Criteria) this;
        }

        public Criteria andPurchaseCostNotBetween(Float value1, Float value2) {
            addCriterion("purchase_cost not between", value1, value2, "purchaseCost");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightIsNull() {
            addCriterion("first_carrier_freight is null");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightIsNotNull() {
            addCriterion("first_carrier_freight is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightEqualTo(Float value) {
            addCriterion("first_carrier_freight =", value, "firstCarrierFreight");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightNotEqualTo(Float value) {
            addCriterion("first_carrier_freight <>", value, "firstCarrierFreight");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightGreaterThan(Float value) {
            addCriterion("first_carrier_freight >", value, "firstCarrierFreight");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightGreaterThanOrEqualTo(Float value) {
            addCriterion("first_carrier_freight >=", value, "firstCarrierFreight");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightLessThan(Float value) {
            addCriterion("first_carrier_freight <", value, "firstCarrierFreight");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightLessThanOrEqualTo(Float value) {
            addCriterion("first_carrier_freight <=", value, "firstCarrierFreight");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightIn(List<Float> values) {
            addCriterion("first_carrier_freight in", values, "firstCarrierFreight");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightNotIn(List<Float> values) {
            addCriterion("first_carrier_freight not in", values, "firstCarrierFreight");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightBetween(Float value1, Float value2) {
            addCriterion("first_carrier_freight between", value1, value2, "firstCarrierFreight");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightNotBetween(Float value1, Float value2) {
            addCriterion("first_carrier_freight not between", value1, value2, "firstCarrierFreight");
            return (Criteria) this;
        }

        public Criteria andDeclarationCustomsVatIsNull() {
            addCriterion("declaration_customs_vat is null");
            return (Criteria) this;
        }

        public Criteria andDeclarationCustomsVatIsNotNull() {
            addCriterion("declaration_customs_vat is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarationCustomsVatEqualTo(Float value) {
            addCriterion("declaration_customs_vat =", value, "declarationCustomsVat");
            return (Criteria) this;
        }

        public Criteria andDeclarationCustomsVatNotEqualTo(Float value) {
            addCriterion("declaration_customs_vat <>", value, "declarationCustomsVat");
            return (Criteria) this;
        }

        public Criteria andDeclarationCustomsVatGreaterThan(Float value) {
            addCriterion("declaration_customs_vat >", value, "declarationCustomsVat");
            return (Criteria) this;
        }

        public Criteria andDeclarationCustomsVatGreaterThanOrEqualTo(Float value) {
            addCriterion("declaration_customs_vat >=", value, "declarationCustomsVat");
            return (Criteria) this;
        }

        public Criteria andDeclarationCustomsVatLessThan(Float value) {
            addCriterion("declaration_customs_vat <", value, "declarationCustomsVat");
            return (Criteria) this;
        }

        public Criteria andDeclarationCustomsVatLessThanOrEqualTo(Float value) {
            addCriterion("declaration_customs_vat <=", value, "declarationCustomsVat");
            return (Criteria) this;
        }

        public Criteria andDeclarationCustomsVatIn(List<Float> values) {
            addCriterion("declaration_customs_vat in", values, "declarationCustomsVat");
            return (Criteria) this;
        }

        public Criteria andDeclarationCustomsVatNotIn(List<Float> values) {
            addCriterion("declaration_customs_vat not in", values, "declarationCustomsVat");
            return (Criteria) this;
        }

        public Criteria andDeclarationCustomsVatBetween(Float value1, Float value2) {
            addCriterion("declaration_customs_vat between", value1, value2, "declarationCustomsVat");
            return (Criteria) this;
        }

        public Criteria andDeclarationCustomsVatNotBetween(Float value1, Float value2) {
            addCriterion("declaration_customs_vat not between", value1, value2, "declarationCustomsVat");
            return (Criteria) this;
        }

        public Criteria andOutputTaxUpIsNull() {
            addCriterion("output_tax_up is null");
            return (Criteria) this;
        }

        public Criteria andOutputTaxUpIsNotNull() {
            addCriterion("output_tax_up is not null");
            return (Criteria) this;
        }

        public Criteria andOutputTaxUpEqualTo(Float value) {
            addCriterion("output_tax_up =", value, "outputTaxUp");
            return (Criteria) this;
        }

        public Criteria andOutputTaxUpNotEqualTo(Float value) {
            addCriterion("output_tax_up <>", value, "outputTaxUp");
            return (Criteria) this;
        }

        public Criteria andOutputTaxUpGreaterThan(Float value) {
            addCriterion("output_tax_up >", value, "outputTaxUp");
            return (Criteria) this;
        }

        public Criteria andOutputTaxUpGreaterThanOrEqualTo(Float value) {
            addCriterion("output_tax_up >=", value, "outputTaxUp");
            return (Criteria) this;
        }

        public Criteria andOutputTaxUpLessThan(Float value) {
            addCriterion("output_tax_up <", value, "outputTaxUp");
            return (Criteria) this;
        }

        public Criteria andOutputTaxUpLessThanOrEqualTo(Float value) {
            addCriterion("output_tax_up <=", value, "outputTaxUp");
            return (Criteria) this;
        }

        public Criteria andOutputTaxUpIn(List<Float> values) {
            addCriterion("output_tax_up in", values, "outputTaxUp");
            return (Criteria) this;
        }

        public Criteria andOutputTaxUpNotIn(List<Float> values) {
            addCriterion("output_tax_up not in", values, "outputTaxUp");
            return (Criteria) this;
        }

        public Criteria andOutputTaxUpBetween(Float value1, Float value2) {
            addCriterion("output_tax_up between", value1, value2, "outputTaxUp");
            return (Criteria) this;
        }

        public Criteria andOutputTaxUpNotBetween(Float value1, Float value2) {
            addCriterion("output_tax_up not between", value1, value2, "outputTaxUp");
            return (Criteria) this;
        }

        public Criteria andShippingFeeFbaIsNull() {
            addCriterion("shipping_fee_fba is null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeFbaIsNotNull() {
            addCriterion("shipping_fee_fba is not null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeFbaEqualTo(Float value) {
            addCriterion("shipping_fee_fba =", value, "shippingFeeFba");
            return (Criteria) this;
        }

        public Criteria andShippingFeeFbaNotEqualTo(Float value) {
            addCriterion("shipping_fee_fba <>", value, "shippingFeeFba");
            return (Criteria) this;
        }

        public Criteria andShippingFeeFbaGreaterThan(Float value) {
            addCriterion("shipping_fee_fba >", value, "shippingFeeFba");
            return (Criteria) this;
        }

        public Criteria andShippingFeeFbaGreaterThanOrEqualTo(Float value) {
            addCriterion("shipping_fee_fba >=", value, "shippingFeeFba");
            return (Criteria) this;
        }

        public Criteria andShippingFeeFbaLessThan(Float value) {
            addCriterion("shipping_fee_fba <", value, "shippingFeeFba");
            return (Criteria) this;
        }

        public Criteria andShippingFeeFbaLessThanOrEqualTo(Float value) {
            addCriterion("shipping_fee_fba <=", value, "shippingFeeFba");
            return (Criteria) this;
        }

        public Criteria andShippingFeeFbaIn(List<Float> values) {
            addCriterion("shipping_fee_fba in", values, "shippingFeeFba");
            return (Criteria) this;
        }

        public Criteria andShippingFeeFbaNotIn(List<Float> values) {
            addCriterion("shipping_fee_fba not in", values, "shippingFeeFba");
            return (Criteria) this;
        }

        public Criteria andShippingFeeFbaBetween(Float value1, Float value2) {
            addCriterion("shipping_fee_fba between", value1, value2, "shippingFeeFba");
            return (Criteria) this;
        }

        public Criteria andShippingFeeFbaNotBetween(Float value1, Float value2) {
            addCriterion("shipping_fee_fba not between", value1, value2, "shippingFeeFba");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNull() {
            addCriterion("shipping_fee is null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNotNull() {
            addCriterion("shipping_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeEqualTo(Float value) {
            addCriterion("shipping_fee =", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotEqualTo(Float value) {
            addCriterion("shipping_fee <>", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThan(Float value) {
            addCriterion("shipping_fee >", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("shipping_fee >=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThan(Float value) {
            addCriterion("shipping_fee <", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThanOrEqualTo(Float value) {
            addCriterion("shipping_fee <=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIn(List<Float> values) {
            addCriterion("shipping_fee in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotIn(List<Float> values) {
            addCriterion("shipping_fee not in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeBetween(Float value1, Float value2) {
            addCriterion("shipping_fee between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotBetween(Float value1, Float value2) {
            addCriterion("shipping_fee not between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andOpPaypalFeeIsNull() {
            addCriterion("op_paypal_fee is null");
            return (Criteria) this;
        }

        public Criteria andOpPaypalFeeIsNotNull() {
            addCriterion("op_paypal_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOpPaypalFeeEqualTo(Float value) {
            addCriterion("op_paypal_fee =", value, "opPaypalFee");
            return (Criteria) this;
        }

        public Criteria andOpPaypalFeeNotEqualTo(Float value) {
            addCriterion("op_paypal_fee <>", value, "opPaypalFee");
            return (Criteria) this;
        }

        public Criteria andOpPaypalFeeGreaterThan(Float value) {
            addCriterion("op_paypal_fee >", value, "opPaypalFee");
            return (Criteria) this;
        }

        public Criteria andOpPaypalFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("op_paypal_fee >=", value, "opPaypalFee");
            return (Criteria) this;
        }

        public Criteria andOpPaypalFeeLessThan(Float value) {
            addCriterion("op_paypal_fee <", value, "opPaypalFee");
            return (Criteria) this;
        }

        public Criteria andOpPaypalFeeLessThanOrEqualTo(Float value) {
            addCriterion("op_paypal_fee <=", value, "opPaypalFee");
            return (Criteria) this;
        }

        public Criteria andOpPaypalFeeIn(List<Float> values) {
            addCriterion("op_paypal_fee in", values, "opPaypalFee");
            return (Criteria) this;
        }

        public Criteria andOpPaypalFeeNotIn(List<Float> values) {
            addCriterion("op_paypal_fee not in", values, "opPaypalFee");
            return (Criteria) this;
        }

        public Criteria andOpPaypalFeeBetween(Float value1, Float value2) {
            addCriterion("op_paypal_fee between", value1, value2, "opPaypalFee");
            return (Criteria) this;
        }

        public Criteria andOpPaypalFeeNotBetween(Float value1, Float value2) {
            addCriterion("op_paypal_fee not between", value1, value2, "opPaypalFee");
            return (Criteria) this;
        }

        public Criteria andPlatformCostIsNull() {
            addCriterion("platform_cost is null");
            return (Criteria) this;
        }

        public Criteria andPlatformCostIsNotNull() {
            addCriterion("platform_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformCostEqualTo(Float value) {
            addCriterion("platform_cost =", value, "platformCost");
            return (Criteria) this;
        }

        public Criteria andPlatformCostNotEqualTo(Float value) {
            addCriterion("platform_cost <>", value, "platformCost");
            return (Criteria) this;
        }

        public Criteria andPlatformCostGreaterThan(Float value) {
            addCriterion("platform_cost >", value, "platformCost");
            return (Criteria) this;
        }

        public Criteria andPlatformCostGreaterThanOrEqualTo(Float value) {
            addCriterion("platform_cost >=", value, "platformCost");
            return (Criteria) this;
        }

        public Criteria andPlatformCostLessThan(Float value) {
            addCriterion("platform_cost <", value, "platformCost");
            return (Criteria) this;
        }

        public Criteria andPlatformCostLessThanOrEqualTo(Float value) {
            addCriterion("platform_cost <=", value, "platformCost");
            return (Criteria) this;
        }

        public Criteria andPlatformCostIn(List<Float> values) {
            addCriterion("platform_cost in", values, "platformCost");
            return (Criteria) this;
        }

        public Criteria andPlatformCostNotIn(List<Float> values) {
            addCriterion("platform_cost not in", values, "platformCost");
            return (Criteria) this;
        }

        public Criteria andPlatformCostBetween(Float value1, Float value2) {
            addCriterion("platform_cost between", value1, value2, "platformCost");
            return (Criteria) this;
        }

        public Criteria andPlatformCostNotBetween(Float value1, Float value2) {
            addCriterion("platform_cost not between", value1, value2, "platformCost");
            return (Criteria) this;
        }

        public Criteria andWarehouseStorageChargesIsNull() {
            addCriterion("warehouse_storage_charges is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseStorageChargesIsNotNull() {
            addCriterion("warehouse_storage_charges is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseStorageChargesEqualTo(Float value) {
            addCriterion("warehouse_storage_charges =", value, "warehouseStorageCharges");
            return (Criteria) this;
        }

        public Criteria andWarehouseStorageChargesNotEqualTo(Float value) {
            addCriterion("warehouse_storage_charges <>", value, "warehouseStorageCharges");
            return (Criteria) this;
        }

        public Criteria andWarehouseStorageChargesGreaterThan(Float value) {
            addCriterion("warehouse_storage_charges >", value, "warehouseStorageCharges");
            return (Criteria) this;
        }

        public Criteria andWarehouseStorageChargesGreaterThanOrEqualTo(Float value) {
            addCriterion("warehouse_storage_charges >=", value, "warehouseStorageCharges");
            return (Criteria) this;
        }

        public Criteria andWarehouseStorageChargesLessThan(Float value) {
            addCriterion("warehouse_storage_charges <", value, "warehouseStorageCharges");
            return (Criteria) this;
        }

        public Criteria andWarehouseStorageChargesLessThanOrEqualTo(Float value) {
            addCriterion("warehouse_storage_charges <=", value, "warehouseStorageCharges");
            return (Criteria) this;
        }

        public Criteria andWarehouseStorageChargesIn(List<Float> values) {
            addCriterion("warehouse_storage_charges in", values, "warehouseStorageCharges");
            return (Criteria) this;
        }

        public Criteria andWarehouseStorageChargesNotIn(List<Float> values) {
            addCriterion("warehouse_storage_charges not in", values, "warehouseStorageCharges");
            return (Criteria) this;
        }

        public Criteria andWarehouseStorageChargesBetween(Float value1, Float value2) {
            addCriterion("warehouse_storage_charges between", value1, value2, "warehouseStorageCharges");
            return (Criteria) this;
        }

        public Criteria andWarehouseStorageChargesNotBetween(Float value1, Float value2) {
            addCriterion("warehouse_storage_charges not between", value1, value2, "warehouseStorageCharges");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxationFeeIsNull() {
            addCriterion("purchase_taxation_fee is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxationFeeIsNotNull() {
            addCriterion("purchase_taxation_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxationFeeEqualTo(Float value) {
            addCriterion("purchase_taxation_fee =", value, "purchaseTaxationFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxationFeeNotEqualTo(Float value) {
            addCriterion("purchase_taxation_fee <>", value, "purchaseTaxationFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxationFeeGreaterThan(Float value) {
            addCriterion("purchase_taxation_fee >", value, "purchaseTaxationFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxationFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("purchase_taxation_fee >=", value, "purchaseTaxationFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxationFeeLessThan(Float value) {
            addCriterion("purchase_taxation_fee <", value, "purchaseTaxationFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxationFeeLessThanOrEqualTo(Float value) {
            addCriterion("purchase_taxation_fee <=", value, "purchaseTaxationFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxationFeeIn(List<Float> values) {
            addCriterion("purchase_taxation_fee in", values, "purchaseTaxationFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxationFeeNotIn(List<Float> values) {
            addCriterion("purchase_taxation_fee not in", values, "purchaseTaxationFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxationFeeBetween(Float value1, Float value2) {
            addCriterion("purchase_taxation_fee between", value1, value2, "purchaseTaxationFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseTaxationFeeNotBetween(Float value1, Float value2) {
            addCriterion("purchase_taxation_fee not between", value1, value2, "purchaseTaxationFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseShippingFeeIsNull() {
            addCriterion("purchase_shipping_fee is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseShippingFeeIsNotNull() {
            addCriterion("purchase_shipping_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseShippingFeeEqualTo(Float value) {
            addCriterion("purchase_shipping_fee =", value, "purchaseShippingFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseShippingFeeNotEqualTo(Float value) {
            addCriterion("purchase_shipping_fee <>", value, "purchaseShippingFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseShippingFeeGreaterThan(Float value) {
            addCriterion("purchase_shipping_fee >", value, "purchaseShippingFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseShippingFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("purchase_shipping_fee >=", value, "purchaseShippingFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseShippingFeeLessThan(Float value) {
            addCriterion("purchase_shipping_fee <", value, "purchaseShippingFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseShippingFeeLessThanOrEqualTo(Float value) {
            addCriterion("purchase_shipping_fee <=", value, "purchaseShippingFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseShippingFeeIn(List<Float> values) {
            addCriterion("purchase_shipping_fee in", values, "purchaseShippingFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseShippingFeeNotIn(List<Float> values) {
            addCriterion("purchase_shipping_fee not in", values, "purchaseShippingFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseShippingFeeBetween(Float value1, Float value2) {
            addCriterion("purchase_shipping_fee between", value1, value2, "purchaseShippingFee");
            return (Criteria) this;
        }

        public Criteria andPurchaseShippingFeeNotBetween(Float value1, Float value2) {
            addCriterion("purchase_shipping_fee not between", value1, value2, "purchaseShippingFee");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_detail
     *
     * @mbg.generated do_not_delete_during_merge Sat Dec 14 10:32:29 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @author  Generator
     * @date 2019/12/14
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