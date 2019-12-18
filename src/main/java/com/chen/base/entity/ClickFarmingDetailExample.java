package com.chen.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClickFarmingDetailExample {
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
     * ClickFarmingDetailExample
     */
    public ClickFarmingDetailExample() {
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

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Integer value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(Integer value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(Integer value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(Integer value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<Integer> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<Integer> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andUserAccountsIsNull() {
            addCriterion("user_accounts is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountsIsNotNull() {
            addCriterion("user_accounts is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountsEqualTo(String value) {
            addCriterion("user_accounts =", value, "userAccounts");
            return (Criteria) this;
        }

        public Criteria andUserAccountsNotEqualTo(String value) {
            addCriterion("user_accounts <>", value, "userAccounts");
            return (Criteria) this;
        }

        public Criteria andUserAccountsGreaterThan(String value) {
            addCriterion("user_accounts >", value, "userAccounts");
            return (Criteria) this;
        }

        public Criteria andUserAccountsGreaterThanOrEqualTo(String value) {
            addCriterion("user_accounts >=", value, "userAccounts");
            return (Criteria) this;
        }

        public Criteria andUserAccountsLessThan(String value) {
            addCriterion("user_accounts <", value, "userAccounts");
            return (Criteria) this;
        }

        public Criteria andUserAccountsLessThanOrEqualTo(String value) {
            addCriterion("user_accounts <=", value, "userAccounts");
            return (Criteria) this;
        }

        public Criteria andUserAccountsLike(String value) {
            addCriterion("user_accounts like", value, "userAccounts");
            return (Criteria) this;
        }

        public Criteria andUserAccountsNotLike(String value) {
            addCriterion("user_accounts not like", value, "userAccounts");
            return (Criteria) this;
        }

        public Criteria andUserAccountsIn(List<String> values) {
            addCriterion("user_accounts in", values, "userAccounts");
            return (Criteria) this;
        }

        public Criteria andUserAccountsNotIn(List<String> values) {
            addCriterion("user_accounts not in", values, "userAccounts");
            return (Criteria) this;
        }

        public Criteria andUserAccountsBetween(String value1, String value2) {
            addCriterion("user_accounts between", value1, value2, "userAccounts");
            return (Criteria) this;
        }

        public Criteria andUserAccountsNotBetween(String value1, String value2) {
            addCriterion("user_accounts not between", value1, value2, "userAccounts");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesIsNull() {
            addCriterion("sale_order_codes is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesIsNotNull() {
            addCriterion("sale_order_codes is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesEqualTo(String value) {
            addCriterion("sale_order_codes =", value, "saleOrderCodes");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesNotEqualTo(String value) {
            addCriterion("sale_order_codes <>", value, "saleOrderCodes");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesGreaterThan(String value) {
            addCriterion("sale_order_codes >", value, "saleOrderCodes");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesGreaterThanOrEqualTo(String value) {
            addCriterion("sale_order_codes >=", value, "saleOrderCodes");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesLessThan(String value) {
            addCriterion("sale_order_codes <", value, "saleOrderCodes");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesLessThanOrEqualTo(String value) {
            addCriterion("sale_order_codes <=", value, "saleOrderCodes");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesLike(String value) {
            addCriterion("sale_order_codes like", value, "saleOrderCodes");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesNotLike(String value) {
            addCriterion("sale_order_codes not like", value, "saleOrderCodes");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesIn(List<String> values) {
            addCriterion("sale_order_codes in", values, "saleOrderCodes");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesNotIn(List<String> values) {
            addCriterion("sale_order_codes not in", values, "saleOrderCodes");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesBetween(String value1, String value2) {
            addCriterion("sale_order_codes between", value1, value2, "saleOrderCodes");
            return (Criteria) this;
        }

        public Criteria andSaleOrderCodesNotBetween(String value1, String value2) {
            addCriterion("sale_order_codes not between", value1, value2, "saleOrderCodes");
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

        public Criteria andSendFlagIsNull() {
            addCriterion("send_flag is null");
            return (Criteria) this;
        }

        public Criteria andSendFlagIsNotNull() {
            addCriterion("send_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSendFlagEqualTo(Integer value) {
            addCriterion("send_flag =", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagNotEqualTo(Integer value) {
            addCriterion("send_flag <>", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagGreaterThan(Integer value) {
            addCriterion("send_flag >", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_flag >=", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagLessThan(Integer value) {
            addCriterion("send_flag <", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagLessThanOrEqualTo(Integer value) {
            addCriterion("send_flag <=", value, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagIn(List<Integer> values) {
            addCriterion("send_flag in", values, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagNotIn(List<Integer> values) {
            addCriterion("send_flag not in", values, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagBetween(Integer value1, Integer value2) {
            addCriterion("send_flag between", value1, value2, "sendFlag");
            return (Criteria) this;
        }

        public Criteria andSendFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("send_flag not between", value1, value2, "sendFlag");
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

        public Criteria andClickFarmingTimeIsNull() {
            addCriterion("click_farming_time is null");
            return (Criteria) this;
        }

        public Criteria andClickFarmingTimeIsNotNull() {
            addCriterion("click_farming_time is not null");
            return (Criteria) this;
        }

        public Criteria andClickFarmingTimeEqualTo(Date value) {
            addCriterion("click_farming_time =", value, "clickFarmingTime");
            return (Criteria) this;
        }

        public Criteria andClickFarmingTimeNotEqualTo(Date value) {
            addCriterion("click_farming_time <>", value, "clickFarmingTime");
            return (Criteria) this;
        }

        public Criteria andClickFarmingTimeGreaterThan(Date value) {
            addCriterion("click_farming_time >", value, "clickFarmingTime");
            return (Criteria) this;
        }

        public Criteria andClickFarmingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("click_farming_time >=", value, "clickFarmingTime");
            return (Criteria) this;
        }

        public Criteria andClickFarmingTimeLessThan(Date value) {
            addCriterion("click_farming_time <", value, "clickFarmingTime");
            return (Criteria) this;
        }

        public Criteria andClickFarmingTimeLessThanOrEqualTo(Date value) {
            addCriterion("click_farming_time <=", value, "clickFarmingTime");
            return (Criteria) this;
        }

        public Criteria andClickFarmingTimeIn(List<Date> values) {
            addCriterion("click_farming_time in", values, "clickFarmingTime");
            return (Criteria) this;
        }

        public Criteria andClickFarmingTimeNotIn(List<Date> values) {
            addCriterion("click_farming_time not in", values, "clickFarmingTime");
            return (Criteria) this;
        }

        public Criteria andClickFarmingTimeBetween(Date value1, Date value2) {
            addCriterion("click_farming_time between", value1, value2, "clickFarmingTime");
            return (Criteria) this;
        }

        public Criteria andClickFarmingTimeNotBetween(Date value1, Date value2) {
            addCriterion("click_farming_time not between", value1, value2, "clickFarmingTime");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table click_farming_detail
     *
     * @mbg.generated do_not_delete_during_merge Mon Dec 16 16:14:29 CST 2019
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