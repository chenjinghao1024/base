package com.chen.base.mapper;

import com.chen.base.entity.Country;
import com.chen.base.entity.CountryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CountryMapper {
    /**
     * countByExample
     */
    long countByExample(CountryExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(CountryExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(Country record);

    /**
     * insertSelective
     */
    int insertSelective(Country record);

    /**
     * selectByExample
     */
    List<Country> selectByExample(CountryExample example);

    /**
     * selectByPrimaryKey
     */
    Country selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") Country record, @Param("example") CountryExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") Country record, @Param("example") CountryExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(Country record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(Country record);
}