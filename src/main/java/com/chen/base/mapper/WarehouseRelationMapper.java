package com.chen.base.mapper;

import com.chen.base.entity.WarehouseRelation;
import com.chen.base.entity.WarehouseRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WarehouseRelationMapper {
    /**
     * countByExample
     */
    long countByExample(WarehouseRelationExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(WarehouseRelationExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(WarehouseRelation record);

    /**
     * insertSelective
     */
    int insertSelective(WarehouseRelation record);

    /**
     * selectByExample
     */
    List<WarehouseRelation> selectByExample(WarehouseRelationExample example);

    /**
     * selectByPrimaryKey
     */
    WarehouseRelation selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") WarehouseRelation record, @Param("example") WarehouseRelationExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") WarehouseRelation record, @Param("example") WarehouseRelationExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(WarehouseRelation record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(WarehouseRelation record);
}