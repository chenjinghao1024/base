package com.chen.base.mapper;

import com.chen.base.entity.ProductSkuInfo;
import com.chen.base.entity.ProductSkuInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductSkuInfoMapper {
    /**
     * countByExample
     */
    long countByExample(ProductSkuInfoExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(ProductSkuInfoExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(ProductSkuInfo record);

    /**
     * insertSelective
     */
    int insertSelective(ProductSkuInfo record);

    /**
     * selectByExample
     */
    List<ProductSkuInfo> selectByExample(ProductSkuInfoExample example);

    /**
     * selectByPrimaryKey
     */
    ProductSkuInfo selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") ProductSkuInfo record, @Param("example") ProductSkuInfoExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") ProductSkuInfo record, @Param("example") ProductSkuInfoExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(ProductSkuInfo record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(ProductSkuInfo record);
}