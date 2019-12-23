package com.chen.base.controller;

import com.chen.base.entity.*;
import com.chen.base.entity.vo.ResultVO;
import com.chen.base.service.AdvService;
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
@RequestMapping("adv")
public class AdvController {


    @Resource
    ImportFileService importFileService;
    @Resource
    AdvService advService;

    @GetMapping({"/index"})
    public String index(Model model) {
        return "adv/index";
    }

    @ResponseBody
    @RequestMapping("/list")
    public PageInfo<AdvertisementFile> getListByPage(PageParams params) {
        return advService.getListByPage(params);
    }

    @ResponseBody
    @RequestMapping("/detail")
    public PageInfo<AdvertisementDetail> getDetailByInfoPage(PageParams params) {
        return advService.getPackingDetailsByPage(params);
    }

    @ResponseBody
    @RequestMapping(value = "/upload")
    public ResultVO uploadExcel(MultipartFile file,String advType) {
        try {
            importFileService.advImport(file, advType);
            return ResultVO.succ();
        } catch (Exception e) {
            return ResultVO.fail();
        }
    }
}
