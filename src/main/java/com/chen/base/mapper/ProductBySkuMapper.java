package com.chen.base.mapper;

import com.chen.base.entity.ProductBySku;
import com.chen.base.entity.ProductBySkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductBySkuMapper {
    /**
     * countByExample
     */
    long countByExample(ProductBySkuExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(ProductBySkuExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(String productSku);

    /**
     * insert
     */
    int insert(ProductBySku record);

    /**
     * insertSelective
     */
    int insertSelective(ProductBySku record);

    /**
     * selectByExample
     */
    List<ProductBySku> selectByExample(ProductBySkuExample example);

    /**
     * selectByPrimaryKey
     */
    ProductBySku selectByPrimaryKey(String productSku);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") ProductBySku record, @Param("example") ProductBySkuExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") ProductBySku record, @Param("example") ProductBySkuExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(ProductBySku record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(ProductBySku record);
}