package com.chen.base.mapper;

import com.chen.base.entity.WarehouseVirtual;
import com.chen.base.entity.WarehouseVirtualExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WarehouseVirtualMapper {
    /**
     * countByExample
     */
    long countByExample(WarehouseVirtualExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(WarehouseVirtualExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(WarehouseVirtual record);

    /**
     * insertSelective
     */
    int insertSelective(WarehouseVirtual record);
    int insertSelectiveReturnId(WarehouseVirtual record);

    /**
     * selectByExample
     */
    List<WarehouseVirtual> selectByExample(WarehouseVirtualExample example);

    /**
     * selectByPrimaryKey
     */
    WarehouseVirtual selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") WarehouseVirtual record, @Param("example") WarehouseVirtualExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") WarehouseVirtual record, @Param("example") WarehouseVirtualExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(WarehouseVirtual record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(WarehouseVirtual record);
}
