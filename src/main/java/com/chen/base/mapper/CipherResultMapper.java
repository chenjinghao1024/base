package com.chen.base.mapper;

import com.chen.base.entity.CipherResult;
import com.chen.base.entity.CipherResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CipherResultMapper {
    /**
     * countByExample
     */
    long countByExample(CipherResultExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(CipherResultExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(CipherResult record);

    /**
     * insertSelective
     */
    int insertSelective(CipherResult record);
    int insertSelectiveReturnId(CipherResult record);

    /**
     * selectByExample
     */
    List<CipherResult> selectByExample(CipherResultExample example);

    /**
     * selectByPrimaryKey
     */
    CipherResult selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") CipherResult record, @Param("example") CipherResultExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") CipherResult record, @Param("example") CipherResultExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(CipherResult record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(CipherResult record);
}
