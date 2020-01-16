package com.chen.base.mapper;

import com.chen.base.entity.CipherResult;
import com.chen.base.entity.MeasureResult;
import com.chen.base.entity.MeasureResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MeasureResultMapper {
    /**
     * countByExample
     */
    long countByExample(MeasureResultExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(MeasureResultExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(MeasureResult record);

    /**
     * insertSelective
     */
    int insertSelective(MeasureResult record);
    int insertSelectiveReturnId(MeasureResult cipherResult);

    /**
     * selectByExample
     */
    List<MeasureResult> selectByExample(MeasureResultExample example);

    /**
     * selectByPrimaryKey
     */
    MeasureResult selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") MeasureResult record, @Param("example") MeasureResultExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") MeasureResult record, @Param("example") MeasureResultExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(MeasureResult record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(MeasureResult record);

}
