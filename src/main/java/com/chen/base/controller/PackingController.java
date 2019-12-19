package com.chen.base.controller;

import com.chen.base.entity.PackingDetail;
import com.chen.base.entity.PackingInfo;
import com.chen.base.entity.PageParams;
import com.chen.base.entity.vo.ResultVO;
import com.chen.base.service.ImportFileService;
import com.chen.base.service.PackingService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("packing")
public class PackingController {

    @Resource
    ImportFileService importFileService;
    @Resource
    PackingService packingService;

    @GetMapping({"/index"})
    public String index(Model model) {
        return "packing/index";
    }

    @ResponseBody
    @RequestMapping("/list")
    public PageInfo<PackingInfo> getList(PageParams params) {
        return packingService.getPackingFilesByPage(params);
    }

    @ResponseBody
    @RequestMapping("/detail")
    public PageInfo<PackingDetail> getDetailByInfo(PageParams params) {
        return packingService.getPackingDetailsByPage(params);
    }

    @ResponseBody
    @RequestMapping(value = "/upload")
    public ResultVO uploadExcel(MultipartFile file) {
        try {
            importFileService.packImport(file);
            return ResultVO.succ();
        } catch (Exception e) {
            return ResultVO.fail();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/update")
    public ResultVO update(PackingInfo packingInfo) {
        try {
            importFileService.update(packingInfo);
            return ResultVO.succ();
        } catch (Exception e) {
            return ResultVO.fail();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/uploadDeclaredValue")
    public ResultVO uploadDeclaredValue(MultipartFile file) {
        try {
            importFileService.declaredValueImport(file);
            return ResultVO.succ();
        } catch (Exception e) {
            return ResultVO.fail();
        }
    }
}
