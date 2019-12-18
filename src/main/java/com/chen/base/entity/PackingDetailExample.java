package com.chen.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PackingDetailExample {
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
     * PackingDetailExample
     */
    public PackingDetailExample() {
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

        public Criteria andPackingInfoIdIsNull() {
            addCriterion("packing_info_id is null");
            return (Criteria) this;
        }

        public Criteria andPackingInfoIdIsNotNull() {
            addCriterion("packing_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackingInfoIdEqualTo(Integer value) {
            addCriterion("packing_info_id =", value, "packingInfoId");
            return (Criteria) this;
        }

        public Criteria andPackingInfoIdNotEqualTo(Integer value) {
            addCriterion("packing_info_id <>", value, "packingInfoId");
            return (Criteria) this;
        }

        public Criteria andPackingInfoIdGreaterThan(Integer value) {
            addCriterion("packing_info_id >", value, "packingInfoId");
            return (Criteria) this;
        }

        public Criteria andPackingInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("packing_info_id >=", value, "packingInfoId");
            return (Criteria) this;
        }

        public Criteria andPackingInfoIdLessThan(Integer value) {
            addCriterion("packing_info_id <", value, "packingInfoId");
            return (Criteria) this;
        }

        public Criteria andPackingInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("packing_info_id <=", value, "packingInfoId");
            return (Criteria) this;
        }

        public Criteria andPackingInfoIdIn(List<Integer> values) {
            addCriterion("packing_info_id in", values, "packingInfoId");
            return (Criteria) this;
        }

        public Criteria andPackingInfoIdNotIn(List<Integer> values) {
            addCriterion("packing_info_id not in", values, "packingInfoId");
            return (Criteria) this;
        }

        public Criteria andPackingInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("packing_info_id between", value1, value2, "packingInfoId");
            return (Criteria) this;
        }

        public Criteria andPackingInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("packing_info_id not between", value1, value2, "packingInfoId");
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

        public Criteria andWarehouseIdEqualTo(String value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(String value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(String value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(String value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(String value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLike(String value) {
            addCriterion("warehouse_id like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotLike(String value) {
            addCriterion("warehouse_id not like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<String> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<String> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(String value1, String value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(String value1, String value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
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

        public Criteria andSkuNumIsNull() {
            addCriterion("sku_num is null");
            return (Criteria) this;
        }

        public Criteria andSkuNumIsNotNull() {
            addCriterion("sku_num is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNumEqualTo(Integer value) {
            addCriterion("sku_num =", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotEqualTo(Integer value) {
            addCriterion("sku_num <>", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumGreaterThan(Integer value) {
            addCriterion("sku_num >", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_num >=", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumLessThan(Integer value) {
            addCriterion("sku_num <", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumLessThanOrEqualTo(Integer value) {
            addCriterion("sku_num <=", value, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumIn(List<Integer> values) {
            addCriterion("sku_num in", values, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotIn(List<Integer> values) {
            addCriterion("sku_num not in", values, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumBetween(Integer value1, Integer value2) {
            addCriterion("sku_num between", value1, value2, "skuNum");
            return (Criteria) this;
        }

        public Criteria andSkuNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_num not between", value1, value2, "skuNum");
            return (Criteria) this;
        }

        public Criteria andTariffIsNull() {
            addCriterion("tariff is null");
            return (Criteria) this;
        }

        public Criteria andTariffIsNotNull() {
            addCriterion("tariff is not null");
            return (Criteria) this;
        }

        public Criteria andTariffEqualTo(Float value) {
            addCriterion("tariff =", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotEqualTo(Float value) {
            addCriterion("tariff <>", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffGreaterThan(Float value) {
            addCriterion("tariff >", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffGreaterThanOrEqualTo(Float value) {
            addCriterion("tariff >=", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffLessThan(Float value) {
            addCriterion("tariff <", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffLessThanOrEqualTo(Float value) {
            addCriterion("tariff <=", value, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffIn(List<Float> values) {
            addCriterion("tariff in", values, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotIn(List<Float> values) {
            addCriterion("tariff not in", values, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffBetween(Float value1, Float value2) {
            addCriterion("tariff between", value1, value2, "tariff");
            return (Criteria) this;
        }

        public Criteria andTariffNotBetween(Float value1, Float value2) {
            addCriterion("tariff not between", value1, value2, "tariff");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightUpIsNull() {
            addCriterion("first_carrier_freight_up is null");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightUpIsNotNull() {
            addCriterion("first_carrier_freight_up is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightUpEqualTo(Float value) {
            addCriterion("first_carrier_freight_up =", value, "firstCarrierFreightUp");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightUpNotEqualTo(Float value) {
            addCriterion("first_carrier_freight_up <>", value, "firstCarrierFreightUp");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightUpGreaterThan(Float value) {
            addCriterion("first_carrier_freight_up >", value, "firstCarrierFreightUp");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightUpGreaterThanOrEqualTo(Float value) {
            addCriterion("first_carrier_freight_up >=", value, "firstCarrierFreightUp");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightUpLessThan(Float value) {
            addCriterion("first_carrier_freight_up <", value, "firstCarrierFreightUp");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightUpLessThanOrEqualTo(Float value) {
            addCriterion("first_carrier_freight_up <=", value, "firstCarrierFreightUp");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightUpIn(List<Float> values) {
            addCriterion("first_carrier_freight_up in", values, "firstCarrierFreightUp");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightUpNotIn(List<Float> values) {
            addCriterion("first_carrier_freight_up not in", values, "firstCarrierFreightUp");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightUpBetween(Float value1, Float value2) {
            addCriterion("first_carrier_freight_up between", value1, value2, "firstCarrierFreightUp");
            return (Criteria) this;
        }

        public Criteria andFirstCarrierFreightUpNotBetween(Float value1, Float value2) {
            addCriterion("first_carrier_freight_up not between", value1, value2, "firstCarrierFreightUp");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredValueIsNull() {
            addCriterion("op_declared_value is null");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredValueIsNotNull() {
            addCriterion("op_declared_value is not null");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredValueEqualTo(Float value) {
            addCriterion("op_declared_value =", value, "opDeclaredValue");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredValueNotEqualTo(Float value) {
            addCriterion("op_declared_value <>", value, "opDeclaredValue");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredValueGreaterThan(Float value) {
            addCriterion("op_declared_value >", value, "opDeclaredValue");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredValueGreaterThanOrEqualTo(Float value) {
            addCriterion("op_declared_value >=", value, "opDeclaredValue");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredValueLessThan(Float value) {
            addCriterion("op_declared_value <", value, "opDeclaredValue");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredValueLessThanOrEqualTo(Float value) {
            addCriterion("op_declared_value <=", value, "opDeclaredValue");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredValueIn(List<Float> values) {
            addCriterion("op_declared_value in", values, "opDeclaredValue");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredValueNotIn(List<Float> values) {
            addCriterion("op_declared_value not in", values, "opDeclaredValue");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredValueBetween(Float value1, Float value2) {
            addCriterion("op_declared_value between", value1, value2, "opDeclaredValue");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredValueNotBetween(Float value1, Float value2) {
            addCriterion("op_declared_value not between", value1, value2, "opDeclaredValue");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredCurrencyIsNull() {
            addCriterion("op_declared_currency is null");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredCurrencyIsNotNull() {
            addCriterion("op_declared_currency is not null");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredCurrencyEqualTo(Float value) {
            addCriterion("op_declared_currency =", value, "opDeclaredCurrency");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredCurrencyNotEqualTo(Float value) {
            addCriterion("op_declared_currency <>", value, "opDeclaredCurrency");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredCurrencyGreaterThan(Float value) {
            addCriterion("op_declared_currency >", value, "opDeclaredCurrency");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredCurrencyGreaterThanOrEqualTo(Float value) {
            addCriterion("op_declared_currency >=", value, "opDeclaredCurrency");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredCurrencyLessThan(Float value) {
            addCriterion("op_declared_currency <", value, "opDeclaredCurrency");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredCurrencyLessThanOrEqualTo(Float value) {
            addCriterion("op_declared_currency <=", value, "opDeclaredCurrency");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredCurrencyIn(List<Float> values) {
            addCriterion("op_declared_currency in", values, "opDeclaredCurrency");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredCurrencyNotIn(List<Float> values) {
            addCriterion("op_declared_currency not in", values, "opDeclaredCurrency");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredCurrencyBetween(Float value1, Float value2) {
            addCriterion("op_declared_currency between", value1, value2, "opDeclaredCurrency");
            return (Criteria) this;
        }

        public Criteria andOpDeclaredCurrencyNotBetween(Float value1, Float value2) {
            addCriterion("op_declared_currency not between", value1, value2, "opDeclaredCurrency");
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

        public Criteria andSkuTaxesIsNull() {
            addCriterion("sku_taxes is null");
            return (Criteria) this;
        }

        public Criteria andSkuTaxesIsNotNull() {
            addCriterion("sku_taxes is not null");
            return (Criteria) this;
        }

        public Criteria andSkuTaxesEqualTo(Float value) {
            addCriterion("sku_taxes =", value, "skuTaxes");
            return (Criteria) this;
        }

        public Criteria andSkuTaxesNotEqualTo(Float value) {
            addCriterion("sku_taxes <>", value, "skuTaxes");
            return (Criteria) this;
        }

        public Criteria andSkuTaxesGreaterThan(Float value) {
            addCriterion("sku_taxes >", value, "skuTaxes");
            return (Criteria) this;
        }

        public Criteria andSkuTaxesGreaterThanOrEqualTo(Float value) {
            addCriterion("sku_taxes >=", value, "skuTaxes");
            return (Criteria) this;
        }

        public Criteria andSkuTaxesLessThan(Float value) {
            addCriterion("sku_taxes <", value, "skuTaxes");
            return (Criteria) this;
        }

        public Criteria andSkuTaxesLessThanOrEqualTo(Float value) {
            addCriterion("sku_taxes <=", value, "skuTaxes");
            return (Criteria) this;
        }

        public Criteria andSkuTaxesIn(List<Float> values) {
            addCriterion("sku_taxes in", values, "skuTaxes");
            return (Criteria) this;
        }

        public Criteria andSkuTaxesNotIn(List<Float> values) {
            addCriterion("sku_taxes not in", values, "skuTaxes");
            return (Criteria) this;
        }

        public Criteria andSkuTaxesBetween(Float value1, Float value2) {
            addCriterion("sku_taxes between", value1, value2, "skuTaxes");
            return (Criteria) this;
        }

        public Criteria andSkuTaxesNotBetween(Float value1, Float value2) {
            addCriterion("sku_taxes not between", value1, value2, "skuTaxes");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table packing_detail
     *
     * @mbg.generated do_not_delete_during_merge Tue Dec 17 12:45:41 CST 2019
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