package com.chen.base.service;

import com.chen.base.entity.*;
import com.chen.base.mapper.*;
import com.chen.base.util.CommonUtil;
import com.github.pagehelper.util.StringUtil;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.util.*;

@Service
//@Transactional(rollbackFor = Exception.class)
public class CipherService {

    @Resource
    AdvertisementDetailMapper advertisementDetailMapper;

    @Resource
    PackingInfoMapper packingInfoMapper;

    @Resource
    PackingDetailMapper packingDetailMapper;

    @Resource
    ProductBySkuMapper productBySkuMapper;

    @Resource
    OrderInfoMapper orderInfoMapper;
    @Resource
    OrderDetailMapper orderDetailMapper;
    @Resource
    CurrencyRateMapper currencyRateMapper;

    @Resource
    WarehouseRentMapper warehouseRentMapper;

    @Resource
    OutputTaxAllMapper outputTaxAllMapper;

    @Resource
    CipherResultMapper cipherResultMapper;

    @Resource
    ClickFarmingDetailMapper clickFarmingDetailMapper;

    Map<String, Set<String>> platformSite = new HashMap<>();

    /**
     * 头程运费
     *
     * @param packingInfoId
     */
    public void firstWayCipher(Integer packingInfoId) {

        // 装箱单下所有物品体积之和
        PackingInfo packingInfo = packingInfoMapper.selectByPrimaryKey(packingInfoId);
        Float firstCarrierFreightAll = packingInfo.getFirstCarrierFreightAll();

        PackingDetailExample packingDetailExample = new PackingDetailExample();
        PackingDetailExample.Criteria packingDetailExampleCriteria = packingDetailExample.createCriteria();
        packingDetailExampleCriteria.andPackingInfoIdEqualTo(packingInfoId);
        List<PackingDetail> packingDetails = packingDetailMapper.selectByExample(packingDetailExample);
        double allVolume = packingDetails.stream().mapToDouble(packingDetail -> packingDetail.getSkuNum() * getVolume(packingDetail.getEccangSku())).sum();

        for (PackingDetail packingDetail : packingDetails) {
            String sku = packingDetail.getEccangSku();

            float volume = getVolume(sku);
            System.out.println(sku + ">" + volume);

            Double firstCarrierFreight = firstCarrierFreightAll * (packingDetail.getSkuNum() * volume / allVolume);
            packingDetail.setFirstCarrierFreightUp(firstCarrierFreight.floatValue());

            packingDetailMapper.updateByPrimaryKeySelective(packingDetail);

        }
    }

    private float getVolume(String sku) {
        ProductBySku product = productBySkuMapper.selectByPrimaryKey(sku);
        Float length = Float.valueOf(product.getProductLength());
        Float height = Float.valueOf(product.getProductHeight());
        Float width = Float.valueOf(product.getProductWidth());
        System.out.println(sku + ">" + length + ">" + height + ">" + width);

        return length * height * width;
    }

    /**
     * 采购价格
     *
     * @return
     */
    public float priceCipher(Integer orderDetailId) {
        OrderDetail orderDetail = orderDetailMapper.selectByPrimaryKey(orderDetailId);
        float price = orderDetail.getPurchaseCost() + orderDetail.getPurchaseShippingFee() +
                orderDetail.getPurchaseTaxationFee();
        return price;

    }


    public Map<String, CipherResult> orderCipher() {

        OrderInfoExample orderInfoExample = new OrderInfoExample();
        OrderInfoExample.Criteria orderInfoCriteria = orderInfoExample.createCriteria();
        List<OrderInfo> orderInfos = orderInfoMapper.selectByExample(orderInfoExample);

        Map<String, CipherResult> cipherResults = new HashMap<>();

        OrderDetailExample orderDetailExample = new OrderDetailExample();
        ProductBySkuExample productBySkuExample = new ProductBySkuExample();

        for (OrderInfo orderInfo : orderInfos) {

            orderDetailExample.clear();
            OrderDetailExample.Criteria criteria = orderDetailExample.createCriteria();
            criteria.andOrderInfoIdEqualTo(orderInfo.getId());
            String site = orderInfo.getSite();

            ClickFarmingDetailExample clickFarmingDetailExample = new ClickFarmingDetailExample();
            List<OrderDetail> orderDetails = orderDetailMapper.selectByExample(orderDetailExample);
            try {
                for (OrderDetail orderDetail : orderDetails) {
                    String productSku = orderDetail.getProductSku();
                    String sku = orderDetail.getSku();
                    sku=sku.substring(0, sku.indexOf('*'));

                    clickFarmingDetailExample.clear();
                    ClickFarmingDetailExample.Criteria clickFarmingCriteria = clickFarmingDetailExample.createCriteria();
                    clickFarmingCriteria.andSaleOrderCodesEqualTo(orderInfo.getSaleOrderCode());
                    Float clickFarmingFee = 0.0f;

                    List<ClickFarmingDetail> clickFarmingDetails = clickFarmingDetailMapper.selectByExample(clickFarmingDetailExample);
                    if (clickFarmingDetails.size() > 0) {
                        ClickFarmingDetail clickFarmingDetail = clickFarmingDetails.get(0);
                        if (clickFarmingDetail.getSendFlag() == 1) {
                            sku = clickFarmingDetail.getEccangSku();
                            clickFarmingFee = clickFarmingDetail.getClickFarmingFee();
                        }
                    }

                    String yearMouth = CommonUtil.formatter(orderInfo.getDateWarehouseShipping());

                    yearMouth = "201910";
                    CipherResult cipherResult = getCipherResult(yearMouth,orderInfo.getPlatform(), sku, orderInfo.getSite(),orderDetail.getIsFba());
                    cipherResult.addToClickFarmingFee(clickFarmingFee);
                    if (cipherResult == null) {
                        cipherResults.put(orderInfo.getPlatform() + "_" + orderInfo.getSite() + "_" + productSku, cipherResult);
                    }

                    Float cost = orderDetail.getPurchaseCost();
                    if (cost == null) {
                        continue;
                    }

                    productBySkuExample.clear();
                    ProductBySkuExample.Criteria productCriteria = productBySkuExample.createCriteria();

                    productCriteria.andProductSkuEqualTo(sku);

                    List<ProductBySku> products = productBySkuMapper.selectByExample(productBySkuExample);
                    if (products.size() > 0) {
                        ProductBySku product = products.get(0);
                        cipherResult.setProductName(product.getProductTitleCn());
                        cipherResult.setCategoryName(product.getProcutCategoryName1());
                    }
                    //本订单汇率
                    Float rate = getRate(orderDetail.getCurrency());
                    // 销售数量
                    Integer quantity = orderDetail.getQuantity();
                    orderStatistics(orderDetail, cipherResult, rate, quantity);

                    buyingPrice(cipherResult, orderDetail, quantity);
                    // 清关 头程 税费
                    clearVAT(cipherResult,orderDetail,quantity);
                    // 销项
                    outputTax(orderInfo, cipherResult, site, orderDetail, quantity, 10);
                    // 仓租
                    warehouseRent(cipherResult, orderDetail);
                    // 广告
                    adv(orderInfo, cipherResult, site, orderDetail, quantity);
                    cipherResultMapper.updateByPrimaryKeySelective(cipherResult);
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(orderInfo.getId() + " > " + e.getMessage());
            }
            System.out.println("end > "+orderInfo.getId());
        }

        return cipherResults;
    }

    private void orderStatistics(OrderDetail orderDetail, CipherResult cipherResult, Float rate, Integer quantity) {
        // 销量
        cipherResult.addToQuantity(quantity);
        float refund;
        if (orderDetail.getRefund() == null) {
            refund = 0;
        }else {
            refund = orderDetail.getRefund();
        }
        cipherResult.addToRefund(refund * rate);
        cipherResult.addToPaypalFee(orderDetail.getOpPaypalFee() == null ? 0.0f :orderDetail.getOpPaypalFee());
        cipherResult.addToPlatformCost(orderDetail.getPlatformCost() == null ? 0.0f : orderDetail.getPlatformCost());
        Float shippingFeeFba = orderDetail.getShippingFeeFba();
        shippingFeeFba = shippingFeeFba == null ? 0 : shippingFeeFba;
        cipherResult.addToShippingFeeFba(shippingFeeFba * rate);
        Float shippingFee = orderDetail.getShippingFee();
        shippingFee = shippingFee == null ? 0 : shippingFee;
        cipherResult.addToShippingFee(shippingFee * rate);

        Float price = orderDetail.getPrice();
        price = price == null ? 0 : price;
        cipherResult.addToSales(price * quantity * rate);
    }

    private void adv(OrderInfo orderInfo, CipherResult cipherResult, String site, OrderDetail orderDetail, Integer quantity) {
        String platform = orderInfo.getPlatform();
        OrderInfoExample orderInfoExample = new OrderInfoExample();
        OrderInfoExample.Criteria info = orderInfoExample.createCriteria();
        info.andSiteEqualTo(site);
        info.andPlatformEqualTo(platform);
        List<OrderInfo> siteOrders = orderInfoMapper.selectByExample(orderInfoExample);
        AdvertisementDetailExample advertisementDetailExample = new AdvertisementDetailExample();
        AdvertisementDetailExample.Criteria criteria1 = advertisementDetailExample.createCriteria();
        criteria1.andSiteEqualTo(site);
        criteria1.andEccangSkuEqualTo(orderDetail.getProductSku());
        List<AdvertisementDetail> advs = advertisementDetailMapper.selectByExample(advertisementDetailExample);


        switch (platform) {
            case "amazon":
            case "ebay":
                if (advs.size() > 0) {
                    ArrayList<Integer> siteOrderIds = new ArrayList<>();
                    siteOrders.forEach(orderInfo1 -> siteOrderIds.add(orderInfo1.getId()));
                    OrderDetailExample orderDetailExample = new OrderDetailExample();
                    OrderDetailExample.Criteria detailExampleCriteria = orderDetailExample.createCriteria();
                    detailExampleCriteria.andOrderInfoIdIn(siteOrderIds);
                    List<OrderDetail> orderDetails1 = orderDetailMapper.selectByExample(orderDetailExample);
                    int skuCount = orderDetails1.stream().mapToInt(orderDetail1 -> orderDetail.getQuantity()).sum();
                    AdvertisementDetail adv = advs.get(0);
                    Float rate = getRate(adv.getCurrency());
                    cipherResult.addToAdvCost((adv.getCost() * rate / skuCount) * quantity);
                }

                break;
            case "cdiscount":
                if (advs.size() > 0) {
                    double siteSubTotal = siteOrders.stream().mapToDouble(orderDetail2 -> orderDetail2.getSubtotal()).sum();

                    AdvertisementDetail adv = advs.get(0);
                    Float rate = getRate(adv.getCurrency());
                    Double advCost = orderInfo.getSubtotal() / siteSubTotal * adv.getCost() * rate;

                    cipherResult.addToAdvCost(advCost.floatValue());
                }
                break;
            default:
        }
    }

    private void warehouseRent( CipherResult cipherResult, OrderDetail orderDetail) {
        String sku = orderDetail.getSku();
        sku=sku.substring(0, sku.indexOf("*"));
        WarehouseRentExample warehouseRentExample = new WarehouseRentExample();
        WarehouseRentExample.Criteria warehouseRentExampleCriteria = warehouseRentExample.createCriteria();
        warehouseRentExampleCriteria.andSkuEqualTo(sku);
        warehouseRentExampleCriteria.andWarehouseIdEqualTo(orderDetail.getWarehouseId());

        List<WarehouseRent> warehouseRents = warehouseRentMapper.selectByExample(warehouseRentExample);
        if (warehouseRents.size() > 0) {
            float rent = 0;
            for (WarehouseRent warehouseRent : warehouseRents) {
                Float rate = getRate(warehouseRent.getCurrency());

                rent += warehouseRent.getRent() == null ? 0 : warehouseRent.getRent() * rate;
            }
            cipherResult.addToWarehouseRental(rent / warehouseRents.size());
        }
    }

    private void outputTax( OrderInfo orderInfo, CipherResult cipherResult, String site, OrderDetail orderDetail, Integer quantity,int monthNum) {
        if (orderInfo.getPlatform().equals("amazon")) {
            int total = 0;
            OutputTaxAllExample outputTaxAllExample = new OutputTaxAllExample();
            OutputTaxAllExample.Criteria criteria = outputTaxAllExample.createCriteria();
            criteria.andSiteEqualTo(site);
            criteria.andMonthNumEqualTo(monthNum);
            List<OutputTaxAll> outputTaxAlls = outputTaxAllMapper.selectByExample(outputTaxAllExample);
            if (total > 0) {
                double unitPriceRatio = orderDetail.getPrice() / total;
                if (outputTaxAlls.size() > 0) {
                    Float outputTaxVatAll = outputTaxAlls.get(0).getOutputTaxAll();
                    if (outputTaxVatAll != null) {
                        Double outputTax = outputTaxVatAll * unitPriceRatio;
                        cipherResult.addToOutputTax(outputTax.floatValue() * quantity);
                    }
                }
            }
        }
    }

    private void clearVAT( CipherResult cipherResult,OrderDetail orderDetail, Integer quantity) {
        // 清关VAT

        PackingDetailExample packingDetailExample = new PackingDetailExample();
        PackingDetailExample.Criteria packingDetailExampleCriteria1 = packingDetailExample.createCriteria();
        packingDetailExampleCriteria1.andWarehouseIdEqualTo(String.valueOf(orderDetail.getWarehouseId()));
        packingDetailExampleCriteria1.andEccangSkuEqualTo(orderDetail.getProductSku());

        PackingDetailExample.Criteria packingDetailExampleCriteria2 = packingDetailExample.or();
        packingDetailExampleCriteria2.andWarehouseIdEqualTo(String.valueOf(orderDetail.getWarehouseId()));
        String sku = orderDetail.getSku();
        sku=sku.substring(0, sku.indexOf("*"));
        packingDetailExampleCriteria2.andEccangSkuEqualTo(sku);
        List<PackingDetail> packingDetails = packingDetailMapper.selectByExample(packingDetailExample);

        if (packingDetails.size() > 0) {
            cipherResult.addToDeclarationCustomsVat(packingDetails.get(0).getDeclarationCustomsVat() * quantity);

            cipherResult.addToFirstCarrierFreight(packingDetails.get(0).getFirstCarrierFreightUp() * quantity);

            cipherResult.addToTariff(packingDetails.get(0).getTariff() * quantity);
        }

    }

    /**
     * 计算采购价格
     * @param cipherResult
     * @param orderDetail
     * @param quantity
     */
    private void buyingPrice(CipherResult cipherResult, OrderDetail orderDetail, Integer quantity) {
        // 计算采购价格
        float purchaseCost = orderDetail.getPurchaseCost();
        Float purchaseShippingFee = orderDetail.getPurchaseShippingFee();
        Float purchaseTaxationFee = orderDetail.getPurchaseTaxationFee();

        if (purchaseTaxationFee == null) {
            purchaseTaxationFee = 0.0f;
        }if (purchaseShippingFee == null) {
            purchaseShippingFee = 0.0f;
        }
        cipherResult.addToPurchaseCost(quantity * purchaseCost);
        cipherResult.addToPurchaseShippingFee(quantity * purchaseShippingFee);
        cipherResult.addToPurchaseTaxationFee(quantity * purchaseTaxationFee);
    }

    private Map getTotalBySite(){
        Map siteTotal = new HashMap();
        List<Map> maps = orderInfoMapper.selectAMZTotalSalesGroupBySite();
        for (Map map : maps) {
            String site = (String) map.get("site");
            Double subtotal= (Double) map.get("subtotal");
            String currency= (String) map.get("currency");

            Float rate = getRate(currency);
            if (site.startsWith("Amazon")) {
                siteTotal.put(site, subtotal * rate);
            }
        }
        return siteTotal;
    }

    private Float getRate(String currency) {
        if (StringUtil.isEmpty(currency )) {
            return 0.0f;
        }
        CurrencyRate currencyRate = currencyRateMapper.selectByPrimaryKey(currency.trim());
        if (currencyRate == null) {
            System.out.println(currency);
            return 0.0f;
        } else {
            return currencyRate.getCurrencyRate();
        }
    }

    public HSSFWorkbook export() {
        List<CipherResult> cipherResults = cipherResultMapper.selectByExample(null);
        return getXls(cipherResults);
    }

    private HSSFWorkbook getXls(List<CipherResult> results){
        HSSFWorkbook workbook = new HSSFWorkbook();
        String[] headers = {
                "站点",
                "易仓SKU",
                "产品描述",
                "款式(*)",
                "品类",
                "销量",
                "库存",
                "销售额",
                "采购价",
                "头程",
                "转运费",
                "产品毛利",
                "产品毛利率",
                "关税",
                "清关VAT",
                "销项VAT",
                "Fba 派送运费",
                "自发货派送运费",
                "仓租",
                "平台佣金",
                "PayPal手续费",
                "广告",
                "刷单",
                "退款",
                "营业毛利",
                "营业毛利率",
        };
        Set<String> keySet = new HashSet<>();
        keySet.add("amazon");
        keySet.add("ebay");
        keySet.add("cdiscount");
        Map<String, HSSFSheet> sheetMap = new HashMap<>();
        for (String key : keySet) {
            HSSFSheet sheet = workbook.createSheet(key + "-各站点SKU");
            sheetMap.put(key, sheet);
            HSSFPrintSetup printSetup = sheet.getPrintSetup();
            // 横向
            printSetup.setLandscape(true);
            // 页脚
            printSetup.setFooterMargin(0.76);
            // 页眉
            printSetup.setHeaderMargin(0.71);
            // A4
            printSetup.setPaperSize(HSSFPrintSetup.A4_PAPERSIZE);
            HSSFRow headerRow = sheet.createRow(0);

            for (int i = 0; i < headers.length; i++) {
                HSSFCell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
                sheet.setColumnWidth(i, 4200);
            }
        }


        // 设置内容
        HSSFCellStyle contentStyle = workbook.createCellStyle();
        HSSFFont contentFont = workbook.createFont();
        // 12号字
        contentFont.setFontHeightInPoints((short) 12);
        contentStyle.setFont(contentFont);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        for (CipherResult result : results) {
            String platform = result.getPlatform();
            HSSFSheet sheet = sheetMap.get(platform);

            HSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
            int cellNum = 0;
            HSSFCell cell = row.createCell(cellNum++);

            cell.setCellValue(result.getSite());
            cell = row.createCell(cellNum++);

            cell.setCellValue(result.getSku());
            cell = row.createCell(cellNum++);

            cell.setCellValue(result.getProductName());
            cell = row.createCell(cellNum++);

            // 款式
            cell.setCellValue("*");
            cell = row.createCell(cellNum++);

            cell.setCellValue(result.getCategoryName());
            cell = row.createCell(cellNum++);

            cell.setCellValue(result.getQuantity());
            cell = row.createCell(cellNum++);

            // 库存
            cell.setCellValue(0);
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getSales()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getPurchasePriceExport()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getFirstCarrierFreight()));
            cell = row.createCell(cellNum++);
            // 转运费
            cell.setCellValue(0);
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.grossProfit()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.grossProfit() / result.getSales() * 100));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getTariffFee()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getDeclarationCustomsVat()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getOutputTaxUp()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getShippingFeeFba()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getShippingFee()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getWarehouseStorageCharges()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getPlatformCost()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getPaypalFee()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getAdvertisementCost()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getClickFarmingFee()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.getRefund()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.operatingMargin()));
            cell = row.createCell(cellNum++);

            cell.setCellValue(decimalFormat.format(result.operatingMargin() / result.grossProfit() * 100));
        }

        return workbook;
    }

    private CipherResult getCipherResult(String yearMouth, String platform, String sku, String site, Integer isFba){
        if (isFba == null) {
            isFba = 0;
        }
        CipherResultExample cipherResultExample = new CipherResultExample();
        CipherResultExample.Criteria criteria = cipherResultExample.createCriteria();
        criteria.andYearMonthEqualTo(yearMouth);
        criteria.andPlatformEqualTo(platform);
        criteria.andSkuEqualTo(sku);
        criteria.andSiteEqualTo(site);
        criteria.andIsFbaEqualTo(isFba);
        List<CipherResult> cipherResults = cipherResultMapper.selectByExample(cipherResultExample);
        if (cipherResults.size() > 0) {
            return cipherResults.get(0);
        }
        CipherResult cipherResult = new CipherResult();
        cipherResult.setYearMonth(yearMouth);
        cipherResult.setPlatform(platform);
        cipherResult.setSku(sku);
        cipherResult.setSite(site);
        cipherResult.setIsFba(isFba);
        cipherResultMapper.insertSelectiveReturnId(cipherResult);

        return cipherResult;
    }
}
