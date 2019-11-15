package com.chen.base.service;

import com.alibaba.fastjson.JSONObject;
import com.chen.base.util.ECOpenApiService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.chen.base.util.ECOpenApiService.soapRequest;


/**
 * 对接易仓接口服务类
 * @author Chen_Sharp
 */
@Service
public class InterfaceService {

    public void syncOrder(){

        Map<String, Object> requestParameter = new HashMap(5);
        Map condition = new HashMap(6);

        requestParameter.put("page", 1);
        requestParameter.put("pageSize", 50);
        requestParameter.put("getDetail", 1);
        requestParameter.put("getAddress", 0);
        requestParameter.put("condition", condition);

        JSONObject result = soapRequest("getOrderList", "EB", requestParameter);
        System.out.println(result.toJSONString());

    }

    public void productSync(){
        Map<String, Object> requestParameter = new HashMap(5);
        JSONObject result = soapRequest("getProductList", "WMS", requestParameter);

        result.getString("");

        
    }

}
