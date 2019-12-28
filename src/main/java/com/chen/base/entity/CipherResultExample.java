package com.chen.base.entity;

import java.util.ArrayList;
import java.util.List;

public class CipherResultExample {
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
     * CipherResultExample
     */
    public CipherResultExample() {
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
     * @date 2019/12/25
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

        public Criteria andYearMonthIsNull() {
            addCriterion("year_and_month is null");
            return (Criteria) this;
        }

        public Criteria andYearMonthIsNotNull() {
            addCriterion("year_and_month is not null");
            return (Criteria) this;
        }

        public Criteria andYearMonthEqualTo(String value) {
            addCriterion("year_and_month =", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotEqualTo(String value) {
            addCriterion("year_and_month <>", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthGreaterThan(String value) {
            addCriterion("year_and_month >", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthGreaterThanOrEqualTo(String value) {
            addCriterion("year_and_month >=", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLessThan(String value) {
            addCriterion("year_and_month <", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLessThanOrEqualTo(String value) {
            addCriterion("year_and_month <=", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthLike(String value) {
            addCriterion("year_and_month like", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotLike(String value) {
            addCriterion("year_and_month not like", value, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthIn(List<String> values) {
            addCriterion("year_and_month in", values, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotIn(List<String> values) {
            addCriterion("year_and_month not in", values, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthBetween(String value1, String value2) {
            addCriterion("year_and_month between", value1, value2, "yearMonth");
            return (Criteria) this;
        }

        public Criteria andYearMonthNotBetween(String value1, String value2) {
            addCriterion("year_and_month not between", value1, value2, "yearMonth");
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

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
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

        public Criteria andSalesIsNull() {
            addCriterion("Sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("Sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Float value) {
            addCriterion("Sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Float value) {
            addCriterion("Sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Float value) {
            addCriterion("Sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Float value) {
            addCriterion("Sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Float value) {
            addCriterion("Sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Float value) {
            addCriterion("Sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Float> values) {
            addCriterion("Sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Float> values) {
            addCriterion("Sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Float value1, Float value2) {
            addCriterion("Sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Float value1, Float value2) {
            addCriterion("Sales not between", value1, value2, "sales");
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

        public Criteria andTariffFeeIsNull() {
            addCriterion("tariff_fee is null");
            return (Criteria) this;
        }

        public Criteria andTariffFeeIsNotNull() {
            addCriterion("tariff_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTariffFeeEqualTo(Float value) {
            addCriterion("tariff_fee =", value, "tariffFee");
            return (Criteria) this;
        }

        public Criteria andTariffFeeNotEqualTo(Float value) {
            addCriterion("tariff_fee <>", value, "tariffFee");
            return (Criteria) this;
        }

        public Criteria andTariffFeeGreaterThan(Float value) {
            addCriterion("tariff_fee >", value, "tariffFee");
            return (Criteria) this;
        }

        public Criteria andTariffFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("tariff_fee >=", value, "tariffFee");
            return (Criteria) this;
        }

        public Criteria andTariffFeeLessThan(Float value) {
            addCriterion("tariff_fee <", value, "tariffFee");
            return (Criteria) this;
        }

        public Criteria andTariffFeeLessThanOrEqualTo(Float value) {
            addCriterion("tariff_fee <=", value, "tariffFee");
            return (Criteria) this;
        }

        public Criteria andTariffFeeIn(List<Float> values) {
            addCriterion("tariff_fee in", values, "tariffFee");
            return (Criteria) this;
        }

        public Criteria andTariffFeeNotIn(List<Float> values) {
            addCriterion("tariff_fee not in", values, "tariffFee");
            return (Criteria) this;
        }

        public Criteria andTariffFeeBetween(Float value1, Float value2) {
            addCriterion("tariff_fee between", value1, value2, "tariffFee");
            return (Criteria) this;
        }

        public Criteria andTariffFeeNotBetween(Float value1, Float value2) {
            addCriterion("tariff_fee not between", value1, value2, "tariffFee");
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

        public Criteria andPaypalFeeIsNull() {
            addCriterion("paypal_fee is null");
            return (Criteria) this;
        }

        public Criteria andPaypalFeeIsNotNull() {
            addCriterion("paypal_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPaypalFeeEqualTo(Float value) {
            addCriterion("paypal_fee =", value, "paypalFee");
            return (Criteria) this;
        }

        public Criteria andPaypalFeeNotEqualTo(Float value) {
            addCriterion("paypal_fee <>", value, "paypalFee");
            return (Criteria) this;
        }

        public Criteria andPaypalFeeGreaterThan(Float value) {
            addCriterion("paypal_fee >", value, "paypalFee");
            return (Criteria) this;
        }

        public Criteria andPaypalFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("paypal_fee >=", value, "paypalFee");
            return (Criteria) this;
        }

        public Criteria andPaypalFeeLessThan(Float value) {
            addCriterion("paypal_fee <", value, "paypalFee");
            return (Criteria) this;
        }

        public Criteria andPaypalFeeLessThanOrEqualTo(Float value) {
            addCriterion("paypal_fee <=", value, "paypalFee");
            return (Criteria) this;
        }

        public Criteria andPaypalFeeIn(List<Float> values) {
            addCriterion("paypal_fee in", values, "paypalFee");
            return (Criteria) this;
        }

        public Criteria andPaypalFeeNotIn(List<Float> values) {
            addCriterion("paypal_fee not in", values, "paypalFee");
            return (Criteria) this;
        }

        public Criteria andPaypalFeeBetween(Float value1, Float value2) {
            addCriterion("paypal_fee between", value1, value2, "paypalFee");
            return (Criteria) this;
        }

        public Criteria andPaypalFeeNotBetween(Float value1, Float value2) {
            addCriterion("paypal_fee not between", value1, value2, "paypalFee");
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

        public Criteria andAdvertisementCostIsNull() {
            addCriterion("advertisement_cost is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementCostIsNotNull() {
            addCriterion("advertisement_cost is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementCostEqualTo(Float value) {
            addCriterion("advertisement_cost =", value, "advertisementCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisementCostNotEqualTo(Float value) {
            addCriterion("advertisement_cost <>", value, "advertisementCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisementCostGreaterThan(Float value) {
            addCriterion("advertisement_cost >", value, "advertisementCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisementCostGreaterThanOrEqualTo(Float value) {
            addCriterion("advertisement_cost >=", value, "advertisementCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisementCostLessThan(Float value) {
            addCriterion("advertisement_cost <", value, "advertisementCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisementCostLessThanOrEqualTo(Float value) {
            addCriterion("advertisement_cost <=", value, "advertisementCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisementCostIn(List<Float> values) {
            addCriterion("advertisement_cost in", values, "advertisementCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisementCostNotIn(List<Float> values) {
            addCriterion("advertisement_cost not in", values, "advertisementCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisementCostBetween(Float value1, Float value2) {
            addCriterion("advertisement_cost between", value1, value2, "advertisementCost");
            return (Criteria) this;
        }

        public Criteria andAdvertisementCostNotBetween(Float value1, Float value2) {
            addCriterion("advertisement_cost not between", value1, value2, "advertisementCost");
            return (Criteria) this;
        }

        public Criteria andClickFarmingFeeIsNull() {
            addCriterion("click_farming_fee is null");
            return (Criteria) this;
        }

        public Criteria andClickFarmingFeeIsNotNull() {
            addCriterion("click_farming_fee is not null");
            return (Criteria) this;
        }

        public Criteria andClickFarmingFeeEqualTo(Float value) {
            addCriterion("click_farming_fee =", value, "clickFarmingFee");
            return (Criteria) this;
        }

        public Criteria andClickFarmingFeeNotEqualTo(Float value) {
            addCriterion("click_farming_fee <>", value, "clickFarmingFee");
            return (Criteria) this;
        }

        public Criteria andClickFarmingFeeGreaterThan(Float value) {
            addCriterion("click_farming_fee >", value, "clickFarmingFee");
            return (Criteria) this;
        }

        public Criteria andClickFarmingFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("click_farming_fee >=", value, "clickFarmingFee");
            return (Criteria) this;
        }

        public Criteria andClickFarmingFeeLessThan(Float value) {
            addCriterion("click_farming_fee <", value, "clickFarmingFee");
            return (Criteria) this;
        }

        public Criteria andClickFarmingFeeLessThanOrEqualTo(Float value) {
            addCriterion("click_farming_fee <=", value, "clickFarmingFee");
            return (Criteria) this;
        }

        public Criteria andClickFarmingFeeIn(List<Float> values) {
            addCriterion("click_farming_fee in", values, "clickFarmingFee");
            return (Criteria) this;
        }

        public Criteria andClickFarmingFeeNotIn(List<Float> values) {
            addCriterion("click_farming_fee not in", values, "clickFarmingFee");
            return (Criteria) this;
        }

        public Criteria andClickFarmingFeeBetween(Float value1, Float value2) {
            addCriterion("click_farming_fee between", value1, value2, "clickFarmingFee");
            return (Criteria) this;
        }

        public Criteria andClickFarmingFeeNotBetween(Float value1, Float value2) {
            addCriterion("click_farming_fee not between", value1, value2, "clickFarmingFee");
            return (Criteria) this;
        }

        public Criteria andIsFbaIsNull() {
            addCriterion("is_fba is null");
            return (Criteria) this;
        }

        public Criteria andIsFbaIsNotNull() {
            addCriterion("is_fba is not null");
            return (Criteria) this;
        }

        public Criteria andIsFbaEqualTo(Integer value) {
            addCriterion("is_fba =", value, "isFba");
            return (Criteria) this;
        }

        public Criteria andIsFbaNotEqualTo(Integer value) {
            addCriterion("is_fba <>", value, "isFba");
            return (Criteria) this;
        }

        public Criteria andIsFbaGreaterThan(Integer value) {
            addCriterion("is_fba >", value, "isFba");
            return (Criteria) this;
        }

        public Criteria andIsFbaGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_fba >=", value, "isFba");
            return (Criteria) this;
        }

        public Criteria andIsFbaLessThan(Integer value) {
            addCriterion("is_fba <", value, "isFba");
            return (Criteria) this;
        }

        public Criteria andIsFbaLessThanOrEqualTo(Integer value) {
            addCriterion("is_fba <=", value, "isFba");
            return (Criteria) this;
        }

        public Criteria andIsFbaIn(List<Integer> values) {
            addCriterion("is_fba in", values, "isFba");
            return (Criteria) this;
        }

        public Criteria andIsFbaNotIn(List<Integer> values) {
            addCriterion("is_fba not in", values, "isFba");
            return (Criteria) this;
        }

        public Criteria andIsFbaBetween(Integer value1, Integer value2) {
            addCriterion("is_fba between", value1, value2, "isFba");
            return (Criteria) this;
        }

        public Criteria andIsFbaNotBetween(Integer value1, Integer value2) {
            addCriterion("is_fba not between", value1, value2, "isFba");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cipher_result
     *
     * @mbg.generated do_not_delete_during_merge Wed Dec 25 14:45:21 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @author  Generator
     * @date 2019/12/25
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
