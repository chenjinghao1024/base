package com.chen.base.controller;

import com.chen.base.entity.vo.ResultVO;
import com.chen.base.service.ImportFileService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;

@Controller
@RequestMapping("/import")
public class FileImportController {

    @Resource
    ImportFileService importFileService;

    @GetMapping({"/index"})
    public String index(Model model) {
        return "import/import";
    }



    @ResponseBody
    @RequestMapping(value = "/uploadAdv")
    public String uploadAdv(MultipartFile file, String advType) {
        importFileService.advImport(file, advType);
        return "";
    }

    @ResponseBody
    @RequestMapping(value = "/uploadCF")
    public String uploadCF(MultipartFile file) {
        importFileService.clickFarmingImport(file);
        return "";
    }

    @ResponseBody
    @RequestMapping(value = "/uploadDeclaredValue")
    public String uploadDeclaredValue(MultipartFile file) {
        return "";
    }

    @ResponseBody
    @RequestMapping(value = "/uploadCDRefund")
    public String uploadCDRefund(MultipartFile file) {
        importFileService.cdRefundImport(file);
        return "";
    }
}
