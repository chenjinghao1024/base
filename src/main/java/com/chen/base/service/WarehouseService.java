package com.chen.base.service;

import com.chen.base.entity.*;
import com.chen.base.mapper.WarehouseRelationMapper;
import com.chen.base.mapper.WarehouseVirtualMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.java.swing.plaf.windows.WindowsDesktopManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class WarehouseService {

    @Resource
    WarehouseVirtualMapper warehouseVirtualMapper;
    @Resource
    WarehouseRelationMapper warehouseRelationMapper;

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
        WarehouseRelationExample.Criteria criteria = example.createCriteria();
        criteria.andVirtualWarehouseIdIsNull();

        if (id != null) {
            criteria.andVirtualWarehouseIdEqualTo(id);
        }
        example.setOrderByClause("warehouse_code");
        return warehouseRelationMapper.selectByExample(example);
    }
}
