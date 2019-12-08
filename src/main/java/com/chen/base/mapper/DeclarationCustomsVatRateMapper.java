package com.chen.base.mapper;

import com.chen.base.entity.DeclarationCustomsVatRate;
import com.chen.base.entity.DeclarationCustomsVatRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeclarationCustomsVatRateMapper {
    /**
     * countByExample
     */
    long countByExample(DeclarationCustomsVatRateExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(DeclarationCustomsVatRateExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer countryId);

    /**
     * insert
     */
    int insert(DeclarationCustomsVatRate record);

    /**
     * insertSelective
     */
    int insertSelective(DeclarationCustomsVatRate record);

    /**
     * selectByExample
     */
    List<DeclarationCustomsVatRate> selectByExample(DeclarationCustomsVatRateExample example);

    /**
     * selectByPrimaryKey
     */
    DeclarationCustomsVatRate selectByPrimaryKey(Integer countryId);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") DeclarationCustomsVatRate record, @Param("example") DeclarationCustomsVatRateExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") DeclarationCustomsVatRate record, @Param("example") DeclarationCustomsVatRateExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(DeclarationCustomsVatRate record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(DeclarationCustomsVatRate record);
}