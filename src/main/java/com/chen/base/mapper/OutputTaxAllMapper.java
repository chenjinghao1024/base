package com.chen.base.mapper;

import com.chen.base.entity.OutputTaxAll;
import com.chen.base.entity.OutputTaxAllExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OutputTaxAllMapper {
    /**
     * countByExample
     */
    long countByExample(OutputTaxAllExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(OutputTaxAllExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(OutputTaxAll record);

    /**
     * insertSelective
     */
    int insertSelective(OutputTaxAll record);

    /**
     * selectByExample
     */
    List<OutputTaxAll> selectByExample(OutputTaxAllExample example);

    /**
     * selectByPrimaryKey
     */
    OutputTaxAll selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") OutputTaxAll record, @Param("example") OutputTaxAllExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") OutputTaxAll record, @Param("example") OutputTaxAllExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(OutputTaxAll record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(OutputTaxAll record);
}