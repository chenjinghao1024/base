package com.chen.base.controller;

import com.chen.base.entity.PageParams;
import com.chen.base.entity.WarehouseRelation;
import com.chen.base.entity.WarehouseVirtual;
import com.chen.base.entity.vo.ResultVO;
import com.chen.base.service.TaxService;
import com.chen.base.service.UtilServcie;
import com.chen.base.service.WarehouseService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("warehouse")
public class WarehouseController {

    @Resource
    WarehouseService warehouseService;
    @Resource
    UtilServcie utilServcie;

    @GetMapping({"/index"})
    public String index(Model model) {
        model.addAttribute("countries",utilServcie.getCountry());
        model.addAttribute("currencyRates",utilServcie.getCurrencyRate());
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

    @ResponseBody
    @RequestMapping("/createOrUpdate")
    public ResultVO createOrUpdate(WarehouseVirtual warehouseVirtual,String warehouseIds) {
        try {
            List<String> idStrings = java.util.Arrays.asList(warehouseIds.split(","));
            List<Integer> ids = idStrings.stream().map(Integer::parseInt).collect(Collectors.toList());

            warehouseService.createOrUpdate(warehouseVirtual, ids);
            return ResultVO.succ();
        } catch (Exception e) {
            return ResultVO.fail();
        }
    }

    @ResponseBody
    @RequestMapping("/getById")
    public ResultVO getWarehouseVirtualById(Integer id) {
        try {
            return ResultVO.succ().data(warehouseService.getWarehouseVirtualById(id));
        } catch (Exception e) {
            return ResultVO.fail();
        }
    }

}
