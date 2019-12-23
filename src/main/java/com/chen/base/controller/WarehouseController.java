package com.chen.base.controller;

import com.chen.base.entity.*;
import com.chen.base.service.AdvService;
import com.chen.base.service.WarehouseService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("warehouse")
public class WarehouseController {

    @Resource
    WarehouseService warehouseService;

    @GetMapping({"/index"})
    public String index(Model model) {
        return "warehouse/index";
    }

    @ResponseBody
    @RequestMapping("/list")
    public PageInfo<WarehouseVirtual> getListByPage(PageParams params) {
        return warehouseService.getListByPage(params);
    }

    @ResponseBody
    @RequestMapping("/detail")
    public PageInfo<WarehouseRelation> getDetailByInfoPage(PageParams params) {
        return warehouseService.getDetailByPage(params);
    }

    @ResponseBody
    @RequestMapping("/getWarehouse")
    public List<WarehouseRelation> getWarehouse(Integer id) {
        return warehouseService.getWarehouse(id);
    }

}
