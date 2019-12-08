package com.chen.base.mapper;

import com.chen.base.entity.TariffRate;
import com.chen.base.entity.TariffRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TariffRateMapper {
    /**
     * countByExample
     */
    long countByExample(TariffRateExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(TariffRateExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(TariffRate record);

    /**
     * insertSelective
     */
    int insertSelective(TariffRate record);

    /**
     * selectByExample
     */
    List<TariffRate> selectByExample(TariffRateExample example);

    /**
     * selectByPrimaryKey
     */
    TariffRate selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TariffRate record, @Param("example") TariffRateExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") TariffRate record, @Param("example") TariffRateExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TariffRate record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(TariffRate record);
}