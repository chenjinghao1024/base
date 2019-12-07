package com.chen.base.mapper;

import com.chen.base.entity.WarehouseInfo;
import com.chen.base.entity.WarehouseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WarehouseInfoMapper {
    /**
     * countByExample
     */
    long countByExample(WarehouseInfoExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(WarehouseInfoExample example);

    /**
     * insert
     */
    int insert(WarehouseInfo record);

    /**
     * insertSelective
     */
    int insertSelective(WarehouseInfo record);

    /**
     * selectByExample
     */
    List<WarehouseInfo> selectByExample(WarehouseInfoExample example);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") WarehouseInfo record, @Param("example") WarehouseInfoExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") WarehouseInfo record, @Param("example") WarehouseInfoExample example);
}