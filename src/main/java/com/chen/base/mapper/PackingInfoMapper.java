package com.chen.base.mapper;

import com.chen.base.entity.PackingInfo;
import com.chen.base.entity.PackingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PackingInfoMapper {
    /**
     * countByExample
     */
    long countByExample(PackingInfoExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(PackingInfoExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(PackingInfo record);

    /**
     * insertSelective
     */
    int insertSelective(PackingInfo record);
    int insertSelectiveReturnId(PackingInfo packingInfo);

    /**
     * selectByExample
     */
    List<PackingInfo> selectByExample(PackingInfoExample example);

    /**
     * selectByPrimaryKey
     */
    PackingInfo selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") PackingInfo record, @Param("example") PackingInfoExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") PackingInfo record, @Param("example") PackingInfoExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(PackingInfo record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(PackingInfo record);

}
