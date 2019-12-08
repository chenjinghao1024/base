package com.chen.base.mapper;

import com.chen.base.entity.PackingDetail;
import com.chen.base.entity.PackingDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PackingDetailMapper {
    /**
     * countByExample
     */
    long countByExample(PackingDetailExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(PackingDetailExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(PackingDetail record);

    /**
     * insertSelective
     */
    int insertSelective(PackingDetail record);

    /**
     * selectByExample
     */
    List<PackingDetail> selectByExample(PackingDetailExample example);

    /**
     * selectByPrimaryKey
     */
    PackingDetail selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") PackingDetail record, @Param("example") PackingDetailExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") PackingDetail record, @Param("example") PackingDetailExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(PackingDetail record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(PackingDetail record);
}