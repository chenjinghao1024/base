package com.chen.base.service;

import com.chen.base.entity.*;
import com.chen.base.mapper.CountryMapper;
import com.chen.base.mapper.WarehouseRelationMapper;
import com.chen.base.mapper.WarehouseVirtualMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class WarehouseService {

    @Resource
    WarehouseVirtualMapper warehouseVirtualMapper;
    @Resource
    WarehouseRelationMapper warehouseRelationMapper;
    @Resource
    CountryMapper countryMapper;


    public PageInfo<WarehouseVirtual> getListByPage(PageParams params) {
        WarehouseVirtualExample example = new WarehouseVirtualExample();
        WarehouseVirtualExample.Criteria criteria = example.createCriteria();
        return PageHelper.startPage(params.getPageNumber(), params.getPageSize()).
                doSelectPageInfo(() -> warehouseVirtualMapper.selectByExample(example));
    }

    public PageInfo<WarehouseRelation> getDetailByPage(PageParams params) {
        WarehouseRelationExample example = new WarehouseRelationExample();
        WarehouseRelationExample.Criteria criteria = example.createCriteria();
        String infoId = params.getSearchMap().get("infoId");
        System.out.println(infoId);
        criteria.andVirtualWarehouseIdEqualTo(Integer.valueOf(infoId));

        example.setOrderByClause("id");
        return PageHelper.startPage(params.getPageNumber(), params.getPageSize()).
                doSelectPageInfo(() -> warehouseRelationMapper.selectByExample(example));
    }

    public List<WarehouseRelation> getWarehouse(Integer id) {

        WarehouseRelationExample example = new WarehouseRelationExample();
        example.createCriteria().andVirtualWarehouseIdIsNull();
        example.or().andVirtualWarehouseIdEqualTo(-1);
        if (id != null) {
            example.or().andVirtualWarehouseIdEqualTo(id);
        }
        example.setOrderByClause("warehouse_code");
        return warehouseRelationMapper.selectByExample(example);
    }

    public void createOrUpdate(WarehouseVirtual warehouseVirtual, List<Integer> warehouseIds) {
        WarehouseRelation relation = new WarehouseRelation();
        WarehouseRelationExample example = new WarehouseRelationExample();

        if (warehouseVirtual.getId() == null) {
            warehouseVirtualMapper.insertSelectiveReturnId(warehouseVirtual);
            Integer virtualId = warehouseVirtual.getId();
            relation.setVirtualWarehouseId(virtualId);
            example.createCriteria().andWarehouseIdIn(warehouseIds);
            warehouseRelationMapper.updateByExampleSelective(relation, example);
        } else {
            relation.setVirtualWarehouseId(-1);
            Integer virtualId = warehouseVirtual.getId();
            example.createCriteria().andVirtualWarehouseIdEqualTo(virtualId);
            warehouseRelationMapper.updateByExampleSelective(relation, example);

            warehouseVirtualMapper.updateByPrimaryKeySelective(warehouseVirtual);
            example.clear();
            relation.setVirtualWarehouseId(virtualId);
            example.createCriteria().andWarehouseIdIn(warehouseIds);
            warehouseRelationMapper.updateByExampleSelective(relation, example);
        }
    }

    public WarehouseVirtual getWarehouseVirtualById(Integer id) {
        WarehouseVirtual warehouseVirtual = warehouseVirtualMapper.selectByPrimaryKey(id);
        WarehouseRelationExample example = new WarehouseRelationExample();
        example.createCriteria().andVirtualWarehouseIdEqualTo(id);
        warehouseVirtual.setWarehouseRelations(warehouseRelationMapper.selectByExample(example));
        return warehouseVirtualMapper.selectByPrimaryKey(id);
    }
}
