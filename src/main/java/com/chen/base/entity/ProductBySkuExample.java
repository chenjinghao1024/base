package com.chen.base.entity;

import java.util.ArrayList;
import java.util.List;

public class ProductBySkuExample {
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
     * ProductBySkuExample
     */
    public ProductBySkuExample() {
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

        public Criteria andProductTitleCnIsNull() {
            addCriterion("product_title_cn is null");
            return (Criteria) this;
        }

        public Criteria andProductTitleCnIsNotNull() {
            addCriterion("product_title_cn is not null");
            return (Criteria) this;
        }

        public Criteria andProductTitleCnEqualTo(String value) {
            addCriterion("product_title_cn =", value, "productTitleCn");
            return (Criteria) this;
        }

        public Criteria andProductTitleCnNotEqualTo(String value) {
            addCriterion("product_title_cn <>", value, "productTitleCn");
            return (Criteria) this;
        }

        public Criteria andProductTitleCnGreaterThan(String value) {
            addCriterion("product_title_cn >", value, "productTitleCn");
            return (Criteria) this;
        }

        public Criteria andProductTitleCnGreaterThanOrEqualTo(String value) {
            addCriterion("product_title_cn >=", value, "productTitleCn");
            return (Criteria) this;
        }

        public Criteria andProductTitleCnLessThan(String value) {
            addCriterion("product_title_cn <", value, "productTitleCn");
            return (Criteria) this;
        }

        public Criteria andProductTitleCnLessThanOrEqualTo(String value) {
            addCriterion("product_title_cn <=", value, "productTitleCn");
            return (Criteria) this;
        }

        public Criteria andProductTitleCnLike(String value) {
            addCriterion("product_title_cn like", value, "productTitleCn");
            return (Criteria) this;
        }

        public Criteria andProductTitleCnNotLike(String value) {
            addCriterion("product_title_cn not like", value, "productTitleCn");
            return (Criteria) this;
        }

        public Criteria andProductTitleCnIn(List<String> values) {
            addCriterion("product_title_cn in", values, "productTitleCn");
            return (Criteria) this;
        }

        public Criteria andProductTitleCnNotIn(List<String> values) {
            addCriterion("product_title_cn not in", values, "productTitleCn");
            return (Criteria) this;
        }

        public Criteria andProductTitleCnBetween(String value1, String value2) {
            addCriterion("product_title_cn between", value1, value2, "productTitleCn");
            return (Criteria) this;
        }

        public Criteria andProductTitleCnNotBetween(String value1, String value2) {
            addCriterion("product_title_cn not between", value1, value2, "productTitleCn");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnIsNull() {
            addCriterion("product_title_en is null");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnIsNotNull() {
            addCriterion("product_title_en is not null");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnEqualTo(String value) {
            addCriterion("product_title_en =", value, "productTitleEn");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnNotEqualTo(String value) {
            addCriterion("product_title_en <>", value, "productTitleEn");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnGreaterThan(String value) {
            addCriterion("product_title_en >", value, "productTitleEn");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnGreaterThanOrEqualTo(String value) {
            addCriterion("product_title_en >=", value, "productTitleEn");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnLessThan(String value) {
            addCriterion("product_title_en <", value, "productTitleEn");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnLessThanOrEqualTo(String value) {
            addCriterion("product_title_en <=", value, "productTitleEn");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnLike(String value) {
            addCriterion("product_title_en like", value, "productTitleEn");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnNotLike(String value) {
            addCriterion("product_title_en not like", value, "productTitleEn");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnIn(List<String> values) {
            addCriterion("product_title_en in", values, "productTitleEn");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnNotIn(List<String> values) {
            addCriterion("product_title_en not in", values, "productTitleEn");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnBetween(String value1, String value2) {
            addCriterion("product_title_en between", value1, value2, "productTitleEn");
            return (Criteria) this;
        }

        public Criteria andProductTitleEnNotBetween(String value1, String value2) {
            addCriterion("product_title_en not between", value1, value2, "productTitleEn");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNull() {
            addCriterion("product_weight is null");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNotNull() {
            addCriterion("product_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProductWeightEqualTo(String value) {
            addCriterion("product_weight =", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotEqualTo(String value) {
            addCriterion("product_weight <>", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThan(String value) {
            addCriterion("product_weight >", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThanOrEqualTo(String value) {
            addCriterion("product_weight >=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThan(String value) {
            addCriterion("product_weight <", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThanOrEqualTo(String value) {
            addCriterion("product_weight <=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLike(String value) {
            addCriterion("product_weight like", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotLike(String value) {
            addCriterion("product_weight not like", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightIn(List<String> values) {
            addCriterion("product_weight in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotIn(List<String> values) {
            addCriterion("product_weight not in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightBetween(String value1, String value2) {
            addCriterion("product_weight between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotBetween(String value1, String value2) {
            addCriterion("product_weight not between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductLengthIsNull() {
            addCriterion("product_length is null");
            return (Criteria) this;
        }

        public Criteria andProductLengthIsNotNull() {
            addCriterion("product_length is not null");
            return (Criteria) this;
        }

        public Criteria andProductLengthEqualTo(String value) {
            addCriterion("product_length =", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthNotEqualTo(String value) {
            addCriterion("product_length <>", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthGreaterThan(String value) {
            addCriterion("product_length >", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthGreaterThanOrEqualTo(String value) {
            addCriterion("product_length >=", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthLessThan(String value) {
            addCriterion("product_length <", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthLessThanOrEqualTo(String value) {
            addCriterion("product_length <=", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthLike(String value) {
            addCriterion("product_length like", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthNotLike(String value) {
            addCriterion("product_length not like", value, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthIn(List<String> values) {
            addCriterion("product_length in", values, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthNotIn(List<String> values) {
            addCriterion("product_length not in", values, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthBetween(String value1, String value2) {
            addCriterion("product_length between", value1, value2, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductLengthNotBetween(String value1, String value2) {
            addCriterion("product_length not between", value1, value2, "productLength");
            return (Criteria) this;
        }

        public Criteria andProductWidthIsNull() {
            addCriterion("product_width is null");
            return (Criteria) this;
        }

        public Criteria andProductWidthIsNotNull() {
            addCriterion("product_width is not null");
            return (Criteria) this;
        }

        public Criteria andProductWidthEqualTo(String value) {
            addCriterion("product_width =", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthNotEqualTo(String value) {
            addCriterion("product_width <>", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthGreaterThan(String value) {
            addCriterion("product_width >", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthGreaterThanOrEqualTo(String value) {
            addCriterion("product_width >=", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthLessThan(String value) {
            addCriterion("product_width <", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthLessThanOrEqualTo(String value) {
            addCriterion("product_width <=", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthLike(String value) {
            addCriterion("product_width like", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthNotLike(String value) {
            addCriterion("product_width not like", value, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthIn(List<String> values) {
            addCriterion("product_width in", values, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthNotIn(List<String> values) {
            addCriterion("product_width not in", values, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthBetween(String value1, String value2) {
            addCriterion("product_width between", value1, value2, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductWidthNotBetween(String value1, String value2) {
            addCriterion("product_width not between", value1, value2, "productWidth");
            return (Criteria) this;
        }

        public Criteria andProductHeightIsNull() {
            addCriterion("product_height is null");
            return (Criteria) this;
        }

        public Criteria andProductHeightIsNotNull() {
            addCriterion("product_height is not null");
            return (Criteria) this;
        }

        public Criteria andProductHeightEqualTo(String value) {
            addCriterion("product_height =", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightNotEqualTo(String value) {
            addCriterion("product_height <>", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightGreaterThan(String value) {
            addCriterion("product_height >", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightGreaterThanOrEqualTo(String value) {
            addCriterion("product_height >=", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightLessThan(String value) {
            addCriterion("product_height <", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightLessThanOrEqualTo(String value) {
            addCriterion("product_height <=", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightLike(String value) {
            addCriterion("product_height like", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightNotLike(String value) {
            addCriterion("product_height not like", value, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightIn(List<String> values) {
            addCriterion("product_height in", values, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightNotIn(List<String> values) {
            addCriterion("product_height not in", values, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightBetween(String value1, String value2) {
            addCriterion("product_height between", value1, value2, "productHeight");
            return (Criteria) this;
        }

        public Criteria andProductHeightNotBetween(String value1, String value2) {
            addCriterion("product_height not between", value1, value2, "productHeight");
            return (Criteria) this;
        }

        public Criteria andIsCombinationIsNull() {
            addCriterion("is_combination is null");
            return (Criteria) this;
        }

        public Criteria andIsCombinationIsNotNull() {
            addCriterion("is_combination is not null");
            return (Criteria) this;
        }

        public Criteria andIsCombinationEqualTo(String value) {
            addCriterion("is_combination =", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationNotEqualTo(String value) {
            addCriterion("is_combination <>", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationGreaterThan(String value) {
            addCriterion("is_combination >", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationGreaterThanOrEqualTo(String value) {
            addCriterion("is_combination >=", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationLessThan(String value) {
            addCriterion("is_combination <", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationLessThanOrEqualTo(String value) {
            addCriterion("is_combination <=", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationLike(String value) {
            addCriterion("is_combination like", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationNotLike(String value) {
            addCriterion("is_combination not like", value, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationIn(List<String> values) {
            addCriterion("is_combination in", values, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationNotIn(List<String> values) {
            addCriterion("is_combination not in", values, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationBetween(String value1, String value2) {
            addCriterion("is_combination between", value1, value2, "isCombination");
            return (Criteria) this;
        }

        public Criteria andIsCombinationNotBetween(String value1, String value2) {
            addCriterion("is_combination not between", value1, value2, "isCombination");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(Float value) {
            addCriterion("product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(Float value) {
            addCriterion("product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(Float value) {
            addCriterion("product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(Float value) {
            addCriterion("product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(Float value) {
            addCriterion("product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<Float> values) {
            addCriterion("product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<Float> values) {
            addCriterion("product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(Float value1, Float value2) {
            addCriterion("product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(Float value1, Float value2) {
            addCriterion("product_price not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1IsNull() {
            addCriterion("procut_category_code1 is null");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1IsNotNull() {
            addCriterion("procut_category_code1 is not null");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1EqualTo(String value) {
            addCriterion("procut_category_code1 =", value, "procutCategoryCode1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1NotEqualTo(String value) {
            addCriterion("procut_category_code1 <>", value, "procutCategoryCode1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1GreaterThan(String value) {
            addCriterion("procut_category_code1 >", value, "procutCategoryCode1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1GreaterThanOrEqualTo(String value) {
            addCriterion("procut_category_code1 >=", value, "procutCategoryCode1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1LessThan(String value) {
            addCriterion("procut_category_code1 <", value, "procutCategoryCode1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1LessThanOrEqualTo(String value) {
            addCriterion("procut_category_code1 <=", value, "procutCategoryCode1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1Like(String value) {
            addCriterion("procut_category_code1 like", value, "procutCategoryCode1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1NotLike(String value) {
            addCriterion("procut_category_code1 not like", value, "procutCategoryCode1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1In(List<String> values) {
            addCriterion("procut_category_code1 in", values, "procutCategoryCode1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1NotIn(List<String> values) {
            addCriterion("procut_category_code1 not in", values, "procutCategoryCode1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1Between(String value1, String value2) {
            addCriterion("procut_category_code1 between", value1, value2, "procutCategoryCode1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode1NotBetween(String value1, String value2) {
            addCriterion("procut_category_code1 not between", value1, value2, "procutCategoryCode1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2IsNull() {
            addCriterion("procut_category_code2 is null");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2IsNotNull() {
            addCriterion("procut_category_code2 is not null");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2EqualTo(String value) {
            addCriterion("procut_category_code2 =", value, "procutCategoryCode2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2NotEqualTo(String value) {
            addCriterion("procut_category_code2 <>", value, "procutCategoryCode2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2GreaterThan(String value) {
            addCriterion("procut_category_code2 >", value, "procutCategoryCode2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2GreaterThanOrEqualTo(String value) {
            addCriterion("procut_category_code2 >=", value, "procutCategoryCode2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2LessThan(String value) {
            addCriterion("procut_category_code2 <", value, "procutCategoryCode2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2LessThanOrEqualTo(String value) {
            addCriterion("procut_category_code2 <=", value, "procutCategoryCode2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2Like(String value) {
            addCriterion("procut_category_code2 like", value, "procutCategoryCode2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2NotLike(String value) {
            addCriterion("procut_category_code2 not like", value, "procutCategoryCode2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2In(List<String> values) {
            addCriterion("procut_category_code2 in", values, "procutCategoryCode2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2NotIn(List<String> values) {
            addCriterion("procut_category_code2 not in", values, "procutCategoryCode2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2Between(String value1, String value2) {
            addCriterion("procut_category_code2 between", value1, value2, "procutCategoryCode2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode2NotBetween(String value1, String value2) {
            addCriterion("procut_category_code2 not between", value1, value2, "procutCategoryCode2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3IsNull() {
            addCriterion("procut_category_code3 is null");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3IsNotNull() {
            addCriterion("procut_category_code3 is not null");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3EqualTo(String value) {
            addCriterion("procut_category_code3 =", value, "procutCategoryCode3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3NotEqualTo(String value) {
            addCriterion("procut_category_code3 <>", value, "procutCategoryCode3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3GreaterThan(String value) {
            addCriterion("procut_category_code3 >", value, "procutCategoryCode3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3GreaterThanOrEqualTo(String value) {
            addCriterion("procut_category_code3 >=", value, "procutCategoryCode3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3LessThan(String value) {
            addCriterion("procut_category_code3 <", value, "procutCategoryCode3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3LessThanOrEqualTo(String value) {
            addCriterion("procut_category_code3 <=", value, "procutCategoryCode3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3Like(String value) {
            addCriterion("procut_category_code3 like", value, "procutCategoryCode3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3NotLike(String value) {
            addCriterion("procut_category_code3 not like", value, "procutCategoryCode3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3In(List<String> values) {
            addCriterion("procut_category_code3 in", values, "procutCategoryCode3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3NotIn(List<String> values) {
            addCriterion("procut_category_code3 not in", values, "procutCategoryCode3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3Between(String value1, String value2) {
            addCriterion("procut_category_code3 between", value1, value2, "procutCategoryCode3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryCode3NotBetween(String value1, String value2) {
            addCriterion("procut_category_code3 not between", value1, value2, "procutCategoryCode3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1IsNull() {
            addCriterion("procut_category_name1 is null");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1IsNotNull() {
            addCriterion("procut_category_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1EqualTo(String value) {
            addCriterion("procut_category_name1 =", value, "procutCategoryName1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1NotEqualTo(String value) {
            addCriterion("procut_category_name1 <>", value, "procutCategoryName1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1GreaterThan(String value) {
            addCriterion("procut_category_name1 >", value, "procutCategoryName1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1GreaterThanOrEqualTo(String value) {
            addCriterion("procut_category_name1 >=", value, "procutCategoryName1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1LessThan(String value) {
            addCriterion("procut_category_name1 <", value, "procutCategoryName1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1LessThanOrEqualTo(String value) {
            addCriterion("procut_category_name1 <=", value, "procutCategoryName1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1Like(String value) {
            addCriterion("procut_category_name1 like", value, "procutCategoryName1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1NotLike(String value) {
            addCriterion("procut_category_name1 not like", value, "procutCategoryName1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1In(List<String> values) {
            addCriterion("procut_category_name1 in", values, "procutCategoryName1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1NotIn(List<String> values) {
            addCriterion("procut_category_name1 not in", values, "procutCategoryName1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1Between(String value1, String value2) {
            addCriterion("procut_category_name1 between", value1, value2, "procutCategoryName1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName1NotBetween(String value1, String value2) {
            addCriterion("procut_category_name1 not between", value1, value2, "procutCategoryName1");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2IsNull() {
            addCriterion("procut_category_name2 is null");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2IsNotNull() {
            addCriterion("procut_category_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2EqualTo(String value) {
            addCriterion("procut_category_name2 =", value, "procutCategoryName2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2NotEqualTo(String value) {
            addCriterion("procut_category_name2 <>", value, "procutCategoryName2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2GreaterThan(String value) {
            addCriterion("procut_category_name2 >", value, "procutCategoryName2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2GreaterThanOrEqualTo(String value) {
            addCriterion("procut_category_name2 >=", value, "procutCategoryName2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2LessThan(String value) {
            addCriterion("procut_category_name2 <", value, "procutCategoryName2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2LessThanOrEqualTo(String value) {
            addCriterion("procut_category_name2 <=", value, "procutCategoryName2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2Like(String value) {
            addCriterion("procut_category_name2 like", value, "procutCategoryName2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2NotLike(String value) {
            addCriterion("procut_category_name2 not like", value, "procutCategoryName2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2In(List<String> values) {
            addCriterion("procut_category_name2 in", values, "procutCategoryName2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2NotIn(List<String> values) {
            addCriterion("procut_category_name2 not in", values, "procutCategoryName2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2Between(String value1, String value2) {
            addCriterion("procut_category_name2 between", value1, value2, "procutCategoryName2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName2NotBetween(String value1, String value2) {
            addCriterion("procut_category_name2 not between", value1, value2, "procutCategoryName2");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3IsNull() {
            addCriterion("procut_category_name3 is null");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3IsNotNull() {
            addCriterion("procut_category_name3 is not null");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3EqualTo(String value) {
            addCriterion("procut_category_name3 =", value, "procutCategoryName3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3NotEqualTo(String value) {
            addCriterion("procut_category_name3 <>", value, "procutCategoryName3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3GreaterThan(String value) {
            addCriterion("procut_category_name3 >", value, "procutCategoryName3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3GreaterThanOrEqualTo(String value) {
            addCriterion("procut_category_name3 >=", value, "procutCategoryName3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3LessThan(String value) {
            addCriterion("procut_category_name3 <", value, "procutCategoryName3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3LessThanOrEqualTo(String value) {
            addCriterion("procut_category_name3 <=", value, "procutCategoryName3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3Like(String value) {
            addCriterion("procut_category_name3 like", value, "procutCategoryName3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3NotLike(String value) {
            addCriterion("procut_category_name3 not like", value, "procutCategoryName3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3In(List<String> values) {
            addCriterion("procut_category_name3 in", values, "procutCategoryName3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3NotIn(List<String> values) {
            addCriterion("procut_category_name3 not in", values, "procutCategoryName3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3Between(String value1, String value2) {
            addCriterion("procut_category_name3 between", value1, value2, "procutCategoryName3");
            return (Criteria) this;
        }

        public Criteria andProcutCategoryName3NotBetween(String value1, String value2) {
            addCriterion("procut_category_name3 not between", value1, value2, "procutCategoryName3");
            return (Criteria) this;
        }

        public Criteria andPuNameIsNull() {
            addCriterion("pu_name is null");
            return (Criteria) this;
        }

        public Criteria andPuNameIsNotNull() {
            addCriterion("pu_name is not null");
            return (Criteria) this;
        }

        public Criteria andPuNameEqualTo(String value) {
            addCriterion("pu_name =", value, "puName");
            return (Criteria) this;
        }

        public Criteria andPuNameNotEqualTo(String value) {
            addCriterion("pu_name <>", value, "puName");
            return (Criteria) this;
        }

        public Criteria andPuNameGreaterThan(String value) {
            addCriterion("pu_name >", value, "puName");
            return (Criteria) this;
        }

        public Criteria andPuNameGreaterThanOrEqualTo(String value) {
            addCriterion("pu_name >=", value, "puName");
            return (Criteria) this;
        }

        public Criteria andPuNameLessThan(String value) {
            addCriterion("pu_name <", value, "puName");
            return (Criteria) this;
        }

        public Criteria andPuNameLessThanOrEqualTo(String value) {
            addCriterion("pu_name <=", value, "puName");
            return (Criteria) this;
        }

        public Criteria andPuNameLike(String value) {
            addCriterion("pu_name like", value, "puName");
            return (Criteria) this;
        }

        public Criteria andPuNameNotLike(String value) {
            addCriterion("pu_name not like", value, "puName");
            return (Criteria) this;
        }

        public Criteria andPuNameIn(List<String> values) {
            addCriterion("pu_name in", values, "puName");
            return (Criteria) this;
        }

        public Criteria andPuNameNotIn(List<String> values) {
            addCriterion("pu_name not in", values, "puName");
            return (Criteria) this;
        }

        public Criteria andPuNameBetween(String value1, String value2) {
            addCriterion("pu_name between", value1, value2, "puName");
            return (Criteria) this;
        }

        public Criteria andPuNameNotBetween(String value1, String value2) {
            addCriterion("pu_name not between", value1, value2, "puName");
            return (Criteria) this;
        }

        public Criteria andUserOrganizationIdIsNull() {
            addCriterion("user_organization_id is null");
            return (Criteria) this;
        }

        public Criteria andUserOrganizationIdIsNotNull() {
            addCriterion("user_organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrganizationIdEqualTo(Integer value) {
            addCriterion("user_organization_id =", value, "userOrganizationId");
            return (Criteria) this;
        }

        public Criteria andUserOrganizationIdNotEqualTo(Integer value) {
            addCriterion("user_organization_id <>", value, "userOrganizationId");
            return (Criteria) this;
        }

        public Criteria andUserOrganizationIdGreaterThan(Integer value) {
            addCriterion("user_organization_id >", value, "userOrganizationId");
            return (Criteria) this;
        }

        public Criteria andUserOrganizationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_organization_id >=", value, "userOrganizationId");
            return (Criteria) this;
        }

        public Criteria andUserOrganizationIdLessThan(Integer value) {
            addCriterion("user_organization_id <", value, "userOrganizationId");
            return (Criteria) this;
        }

        public Criteria andUserOrganizationIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_organization_id <=", value, "userOrganizationId");
            return (Criteria) this;
        }

        public Criteria andUserOrganizationIdIn(List<Integer> values) {
            addCriterion("user_organization_id in", values, "userOrganizationId");
            return (Criteria) this;
        }

        public Criteria andUserOrganizationIdNotIn(List<Integer> values) {
            addCriterion("user_organization_id not in", values, "userOrganizationId");
            return (Criteria) this;
        }

        public Criteria andUserOrganizationIdBetween(Integer value1, Integer value2) {
            addCriterion("user_organization_id between", value1, value2, "userOrganizationId");
            return (Criteria) this;
        }

        public Criteria andUserOrganizationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_organization_id not between", value1, value2, "userOrganizationId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product_by_sku
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