package com.chen.base.controller;

import com.chen.base.entity.CipherResult;
import com.chen.base.service.CipherService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("cipher")
public class CipherController {

    @Resource
    CipherService cipherService;

    @GetMapping({"/index"})
    public String index(Model model) {
        return "cipher/index";
    }

    @RequestMapping("/cipher")
    public Map<String, CipherResult> cipher() {
        return cipherService.orderCipher(null);
    }

    @GetMapping("/export")
    public void exportOrder( HttpServletResponse response) throws IOException {

        ServletOutputStream outputStream = null;
        try {
            HSSFWorkbook workbook = cipherService.export("201911");
            outputStream = response.getOutputStream();

            SimpleDateFormat sdf = new SimpleDateFormat();
            sdf.applyPattern("yyyyMMddHHmmss");
            String s = sdf.format(new Date());
            String fileName = "计算结果"+s+".xls";
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-disposition", "attachment;filename=" + new String(fileName.getBytes("UTF-8"), "ISO8859-1"));
            workbook.write(outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
