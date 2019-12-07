package com.chen.base.mapper;

import com.chen.base.entity.OrderInfo;
import com.chen.base.entity.OrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderInfoMapper {
    /**
     * countByExample
     */
    long countByExample(OrderInfoExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(OrderInfoExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(OrderInfo record);

    /**
     * insertSelective
     */
    int insertSelective(OrderInfo record);

    /**
     *
     * @param orderInfo
     * @return
     */
//    @Options(useGeneratedKeys = true, keyProperty = "save_id")
    int insertSelectiveReturnId(OrderInfo orderInfo);

    /**
     * selectByExample
     */
    List<OrderInfo> selectByExample(OrderInfoExample example);

    /**
     * selectByPrimaryKey
     */
    OrderInfo selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(OrderInfo record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(OrderInfo record);

}
