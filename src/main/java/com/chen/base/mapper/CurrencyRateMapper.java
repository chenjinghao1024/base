package com.chen.base.mapper;

import com.chen.base.entity.CurrencyRate;
import com.chen.base.entity.CurrencyRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CurrencyRateMapper {
    /**
     * countByExample
     */
    long countByExample(CurrencyRateExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(CurrencyRateExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(String currencyCode);

    /**
     * insert
     */
    int insert(CurrencyRate record);

    /**
     * insertSelective
     */
    int insertSelective(CurrencyRate record);

    /**
     * selectByExample
     */
    List<CurrencyRate> selectByExample(CurrencyRateExample example);

    /**
     * selectByPrimaryKey
     */
    CurrencyRate selectByPrimaryKey(String currencyCode);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") CurrencyRate record, @Param("example") CurrencyRateExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") CurrencyRate record, @Param("example") CurrencyRateExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(CurrencyRate record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(CurrencyRate record);
}