package com.chen.base.mapper;

import com.chen.base.entity.WarehouseRent;
import com.chen.base.entity.WarehouseRentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WarehouseRentMapper {
    /**
     * countByExample
     */
    long countByExample(WarehouseRentExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(WarehouseRentExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(WarehouseRent record);

    /**
     * insertSelective
     */
    int insertSelective(WarehouseRent record);

    /**
     * selectByExample
     */
    List<WarehouseRent> selectByExample(WarehouseRentExample example);

    /**
     * selectByPrimaryKey
     */
    WarehouseRent selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") WarehouseRent record, @Param("example") WarehouseRentExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") WarehouseRent record, @Param("example") WarehouseRentExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(WarehouseRent record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(WarehouseRent record);
}