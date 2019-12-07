package com.chen.base.mapper;

import com.chen.base.entity.WarehouseList;
import com.chen.base.entity.WarehouseListExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WarehouseListMapper {
    /**
     * countByExample
     */
    long countByExample(WarehouseListExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(WarehouseListExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(WarehouseList record);

    /**
     * insertSelective
     */
    int insertSelective(WarehouseList record);

    /**
     * selectByExample
     */
    List<WarehouseList> selectByExample(WarehouseListExample example);

    /**
     * selectByPrimaryKey
     */
    WarehouseList selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") WarehouseList record, @Param("example") WarehouseListExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") WarehouseList record, @Param("example") WarehouseListExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(WarehouseList record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(WarehouseList record);
}