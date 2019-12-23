package com.chen.base.controller;

import com.chen.base.entity.ClickFarmingDetail;
import com.chen.base.entity.ClickFarmingInfo;
import com.chen.base.entity.PageParams;
import com.chen.base.entity.vo.ResultVO;
import com.chen.base.service.CFService;
import com.chen.base.service.ImportFileService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@Controller
@RequestMapping("cf")
public class ClickFarmingController {


    @Resource
    ImportFileService importFileService;
    @Resource
    CFService cfService;

    @GetMapping({"/index"})
    public String index(Model model) {
        return "cf/index";
    }

    @ResponseBody
    @RequestMapping("/list")
    public PageInfo<ClickFarmingInfo> getListByPage(PageParams params) {
        return cfService.getListByPage(params);
    }

    @ResponseBody
    @RequestMapping("/detail")
    public PageInfo<ClickFarmingDetail> getDetailByInfoPage(PageParams params) {
        return cfService.getPackingDetailsByPage(params);
    }

    @ResponseBody
    @RequestMapping(value = "/upload")
    public ResultVO uploadExcel(MultipartFile file) {
        try {
            importFileService.clickFarmingImport(file);
            return ResultVO.succ();
        } catch (Exception e) {
            return ResultVO.fail();
        }
    }
}
