package com.chen.base.mapper;

import com.chen.base.entity.OrderDetail;
import com.chen.base.entity.OrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDetailMapper {
    /**
     * countByExample
     */
    long countByExample(OrderDetailExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(OrderDetailExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(OrderDetail record);

    /**
     * insertSelective
     */
    int insertSelective(OrderDetail record);

    /**
     * selectByExample
     */
    List<OrderDetail> selectByExample(OrderDetailExample example);

    /**
     * selectByPrimaryKey
     */
    OrderDetail selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(OrderDetail record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(OrderDetail record);
}