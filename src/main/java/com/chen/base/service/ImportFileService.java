package com.chen.base.service;

import com.chen.base.entity.*;
import com.chen.base.mapper.*;
import com.github.pagehelper.util.StringUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * 文件导入
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ImportFileService {

    @Resource
    WarehouseRelationMapper warehouseRelationMapper;
    @Resource
    PackingInfoMapper packingInfoMapper;
    @Resource
    PackingDetailMapper packingDetailMapper;

    @Resource
    AdvertisementFileMapper advertisementFileMapper;
    @Resource
    AdvertisementDetailMapper advertisementDetailMapper;
    @Resource
    ClickFarmingInfoMapper clickFarmingInfoMapper;
    @Resource
    ClickFarmingDetailMapper clickFarmingDetailMapper;

    @Resource
    OrderInfoMapper orderInfoMapper;
    @Resource
    OrderDetailMapper orderDetailMapper;

    OrderInfoExample orderInfoExample = new OrderInfoExample();
    OrderDetailExample orderDetailExample = new OrderDetailExample();

    WarehouseRelationExample warehouseRelationExample = new WarehouseRelationExample();
    PackingInfoExample packingInfoExample = new PackingInfoExample();
    PackingDetailExample packingDetailExample = new PackingDetailExample();

    public void advImport(MultipartFile mFile, String advType) {

        Date updateDate = new Date();
        //将file 转换成MultipartFile
        try{
            String fileName = mFile.getOriginalFilename();

            AdvertisementFile advertisementFile = new AdvertisementFile();
            advertisementFile.setAdvertisementFileName(fileName);
            advertisementFile.setPcraddTime(updateDate);
            advertisementFileMapper.insertSelectiveReturnId(advertisementFile);
            Iterator<Sheet> sheetIterator = getSheetIterator(mFile);

            Integer advertisementFileId = advertisementFile.getId();
            while (sheetIterator.hasNext()){
                Sheet sheet = sheetIterator.next();
                //遍历获取每行
                int firstRowNum = sheet.getFirstRowNum();
                int lastRowNum = sheet.getLastRowNum();
                for (int i =firstRowNum+1;i <= lastRowNum;i++) {
                    Row row = sheet.getRow(i);
                    AdvertisementDetail advertisementDetail = new AdvertisementDetail();
                    advertisementDetail.setAdvertisementFileId(advertisementFileId);
                    switch (advType){
                        case "amz":
                            advertisementDetail.setUserAccount(getValue(row, 0));
                            advertisementDetail.setSite(getValue(row, 1));
                            advertisementDetail.setCurrency(getValue(row, 5));
                            advertisementDetail.setEccangSku(getValue(row, 8));
                            advertisementDetail.setCost(Float.valueOf(getValue(row, 14)));
                            break;
                        case "cd":
                            advertisementDetail.setCost(Float.valueOf(getValue(row, 0)));
                            advertisementDetail.setEccangSku(getValue(row, 1));
                            advertisementDetail.setUserAccount(getValue(row, 2));
                            advertisementDetail.setSite(getValue(row, 3));
                            advertisementDetail.setCurrency("EUR");
                            break;
                        case "ebay":
                            advertisementDetail.setCurrency("RMB");
                            advertisementDetail.setUserAccount(getValue(row, 0));
                            advertisementDetail.setSite(getValue(row, 1));
                            advertisementDetail.setCost(Float.valueOf(getValue(row, 2)));
                            break;
                        default:
                    }
                    advertisementDetailMapper.insertSelective(advertisementDetail);
                }
            }
        } catch (Exception  e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private Iterator<Sheet> getSheetIterator(MultipartFile mFile) throws IOException {
        InputStream is = mFile.getInputStream();
        //获取文件名
        String fileName = mFile.getOriginalFilename();

        Workbook workbook = null;
        if (fileName.endsWith("xls")) {
            workbook = new HSSFWorkbook(is);
        } else if (fileName.endsWith("xlsx")) {
            workbook = new XSSFWorkbook(is);
        } else {
            System.out.println("workBoot 创建失败");
        }

        //获得当前页
        return workbook.sheetIterator();
    }

    /**
     * 装箱单
     * @return
     */
    public void packImport(MultipartFile mFile){

        Date updateDate = new Date();
        //将file 转换成MultipartFile
        try{
            Iterator<Sheet> sheetIterator = getSheetIterator(mFile);
            while (sheetIterator.hasNext()){
                Sheet sheet = sheetIterator.next();
                //遍历获取每行
                int firstRowNum = sheet.getFirstRowNum();
                int lastRowNum = sheet.getLastRowNum();
                for (int i =firstRowNum+1;i <= lastRowNum;i++) {
                    Row row = sheet.getRow(i);
                    String packingId = getValue(row, 4);
                    Integer packingInfoId = getPackingInfo(packingId);

                    String warehouseName = getValue(row, 1);
                    Integer warehouseId = getWarehouseIdByName(warehouseName);
                    if (packingInfoId == -1) {
                        PackingInfo packingInfo = new PackingInfo();
                        packingInfo.setPackingId(getValue(row, 4));

                        packingInfo.setTargetWarehouseId(warehouseId);
                        packingInfo.setPcraddTime(updateDate);
                        packingInfoMapper.insertSelectiveReturnId(packingInfo);
                        packingInfoId = packingInfo.getId();
                    }

                    PackingDetail packingDetail = new PackingDetail();
                    packingDetail.setPackingInfoId(packingInfoId);
                    packingDetail.setEccangSku(getStringValue(row, 9));
                    Double skuNum = Double.valueOf(getValue(row, 13));
                    packingDetail.setSkuNum(skuNum.intValue());
                    packingDetail.setCreateTime(updateDate);
                    packingDetail.setWarehouseId(String.valueOf(warehouseId));
                    packingDetailMapper.insertSelective(packingDetail);
                }
            }
        } catch (Exception  e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private String getValue(Row row, int cellIndex) {
        DecimalFormat df = new DecimalFormat("0");
        //遍历每行获取每列的数据
        Cell cell = row.getCell(cellIndex);
        if (cell == null) {
            return null;
        }
        CellType cellType = cell.getCellType();
        //判断单元格value 调用不同的返回值获取数据
        String value = null;

        switch (cellType) {
            case NUMERIC:
                value = String.valueOf(cell.getNumericCellValue());

                break;
            case STRING:
                value = cell.getStringCellValue();
                break;
            default:
                break;
        }
        return value;
    }


    private String getStringValue(Row row, int cellIndex) {
        DecimalFormat df = new DecimalFormat("0");
        //遍历每行获取每列的数据
        Cell cell = row.getCell(cellIndex);
        if (cell == null) {
            return null;
        }
        CellType cellType = cell.getCellType();
        //判断单元格value 调用不同的返回值获取数据
        String value = null;

        switch (cellType) {
            case NUMERIC:
                value = df.format(cell.getNumericCellValue());
                break;
            case STRING:
                value = cell.getStringCellValue();
                break;
            default:
                break;
        }
        return value;
    }

    private Integer getPackingInfo(String packingId){
        packingInfoExample.clear();
        PackingInfoExample.Criteria criteria = packingInfoExample.createCriteria();
        criteria.andPackingIdEqualTo(packingId);
        List<PackingInfo> packingInfo = packingInfoMapper.selectByExample(packingInfoExample);
        if (packingInfo.size() > 0) {
            return packingInfo.get(0).getId();
        } else {
            return -1;
        }

    }

    private Integer getWarehouseIdByName(String warehouseName){

        warehouseRelationExample.clear();
        WarehouseRelationExample.Criteria criteria = warehouseRelationExample.createCriteria();
        criteria.andWarehouseDescEqualTo(warehouseName);
        List<WarehouseRelation> warehouseRelations = warehouseRelationMapper.selectByExample(warehouseRelationExample);
        if (warehouseRelations.size() > 0) {
            return warehouseRelations.get(0).getId();
        }else {
            return 0;
        }
    }

    public void clickFarmingImport(MultipartFile file) {
        Date updateDate = new Date();
        try{
            String fileName = file.getOriginalFilename();
            ClickFarmingInfo clickFarmingInfo = new ClickFarmingInfo();
            clickFarmingInfo.setClickFarmingFileName(fileName);
            clickFarmingInfo.setPcraddTime(updateDate);

            clickFarmingInfoMapper.insertSelective(clickFarmingInfo);

            Iterator<Sheet> sheetIterator = getSheetIterator(file);
            Integer clickFarmingInfoId = clickFarmingInfo.getId();
            while (sheetIterator.hasNext()){
                Sheet sheet = sheetIterator.next();
                //遍历获取每行
                int firstRowNum = sheet.getFirstRowNum();
                int lastRowNum = sheet.getLastRowNum();
                for (int i =firstRowNum+1;i <= lastRowNum;i++) {
                    Row row = sheet.getRow(i);
                    ClickFarmingDetail clickFarmingDetail = new ClickFarmingDetail();
                    clickFarmingDetail.setInfoId(clickFarmingInfoId);
                    clickFarmingDetail.setSite(getValue(row, 1));
                    clickFarmingDetail.setSaleOrderCodes(getValue(row, 4));
                    clickFarmingDetail.setEccangSku(getValue(row, 5));
                    clickFarmingDetail.setEccangSku(getValue(row, 5));
                    clickFarmingDetail.setSendFlag("已发货".equals(getValue(row, 9)) ? 1 : 0);
                    clickFarmingDetail.setClickFarmingFee(Float.valueOf(getValue(row, 10)));
                    clickFarmingDetailMapper.insertSelective(clickFarmingDetail);
                }
            }
        } catch (Exception  e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public void declaredValueImport(MultipartFile file) {
        try{
            Iterator<Sheet> sheetIterator = getSheetIterator(file);
            while (sheetIterator.hasNext()){
                Sheet sheet = sheetIterator.next();
                //遍历获取每行
                int firstRowNum = sheet.getFirstRowNum();
                int lastRowNum = sheet.getLastRowNum();
                for (int i =firstRowNum+1;i <= lastRowNum;i++) {
                    Row row = sheet.getRow(i);
                    String packingId = getValue(row, 0);
                    String sku = getStringValue(row, 1);
                    String cost = getValue(row, 2);
                    String currency = getValue(row, 3);
                    if (StringUtil.isEmpty(sku)) {
                        continue;
                    }
                    if ("#N/A".equals(cost)){
                        cost = "0";
                    }
                    packingInfoExample.clear();
                    PackingInfoExample.Criteria infoExampleCriteria = packingInfoExample.createCriteria();
                    infoExampleCriteria.andPackingIdEqualTo(packingId);
                    List<PackingInfo> packingInfos = packingInfoMapper.selectByExample(packingInfoExample);
                    if (packingInfos.size() > 0) {
                        PackingInfo packingInfo = packingInfos.get(0);
                        Integer packingInfoId = packingInfo.getId();
                        packingDetailExample.clear();
                        PackingDetailExample.Criteria criteria = packingDetailExample.createCriteria();
                        criteria.andPackingInfoIdEqualTo(packingInfoId);
                        criteria.andEccangSkuEqualTo(sku);
                        List<PackingDetail> packingDetails = packingDetailMapper.selectByExample(packingDetailExample);
                        if (packingDetails.size() > 0) {
                            PackingDetail packingDetail = packingDetails.get(0);
                            packingDetail.setOpDeclaredCurrency(currency);
                            packingDetail.setOpDeclaredValue(Float.valueOf(cost));
                            packingDetailMapper.updateByPrimaryKeySelective(packingDetail);
                        }
                    }
                }
            }
        } catch (Exception  e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public void cdRefundImport(MultipartFile file) {
        try{

            Iterator<Sheet> sheetIterator = getSheetIterator(file);
            while (sheetIterator.hasNext()){
                Sheet sheet = sheetIterator.next();
                //遍历获取每行
                int firstRowNum = sheet.getFirstRowNum();
                int lastRowNum = sheet.getLastRowNum();
                for (int i =firstRowNum+1;i <= lastRowNum;i++) {
                    Row row = sheet.getRow(i);
                    String orderCode = getValue(row, 1);
                    orderInfoExample.clear();
                    OrderInfoExample.Criteria criteria = orderInfoExample.createCriteria();
                    criteria.andSaleOrderCodeEqualTo(orderCode);

                    List<OrderInfo> orderInfos = orderInfoMapper.selectByExample(orderInfoExample);
                    if (orderInfos.size() > 0) {
                        String sku = getValue(row, 3);

                        Integer orderId = orderInfos.get(0).getId();
                        orderDetailExample.clear();
                        OrderDetailExample.Criteria detailExampleCriteria1 = orderDetailExample.createCriteria();
                        detailExampleCriteria1.andOrderInfoIdEqualTo(orderId);
                        detailExampleCriteria1.andProductSkuEqualTo(sku);

                        OrderDetailExample.Criteria detailExampleCriteria2 = orderDetailExample.or();
                        detailExampleCriteria2.andOrderInfoIdEqualTo(orderId);
                        detailExampleCriteria2.andSkuLike(sku + "%");

                        List<OrderDetail> orderDetails = orderDetailMapper.selectByExample(orderDetailExample);
                        if (orderDetails.size() > 0) {
                            OrderDetail orderDetail = orderDetails.get(0);
                            orderDetail.setRefund(Float.valueOf(getValue(row,10)));
                            orderDetailMapper.updateByPrimaryKey(orderDetail);
                        }

                    }
                }
            }
        } catch (Exception  e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public void update(PackingInfo packingInfo) {
        packingInfoMapper.updateByPrimaryKeySelective(packingInfo);
    }
}
