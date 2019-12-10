package com.chen.base.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;


/**
 * 易仓开放接口测试类 -v2
 *
 * @author lsl  2019-8-19 18:03:37
 */
public class ECOpenApiService {
    /**
     * EB域名
     */
    private static String ebDomain = "http://qyEB.ez-wms.com";
    /**
     * WMS域名
     */
    private static String wmsDomain = "http://qy.ez-wms.com";
    /**
     * 账号
     */
    private static String userName = "zhouminghui";
    /**
     * 密码
     */
    private static String userPass = "hui416420";


    public static JSONObject soapRequest(String service, String systemCode) {
        return soapRequest(service, systemCode, "{}");
    }
    public static JSONObject soapRequest(String service, String systemCode, Map requestMap) {
        String requestParameterStr = new JSONObject(requestMap).toJSONString();

        return soapRequest(service, systemCode, requestParameterStr);
    }

    /**
     * Soap请求
     *
     * @param service    方法名
     * @param systemCode 所属系统代码
     * @param params     请求参数
     * @return array
     */
    public static JSONObject soapRequest(String service, String systemCode, String params) {
        JSONObject result = new JSONObject();
        systemCode = systemCode.toUpperCase();//转大写
        if (!systemCode.equals("EB") && !systemCode.equals("WMS")) {
            result.put("message", "systemCode Error");
            return result;
        }
        String domain = systemCode.equals("EB") ? ebDomain : wmsDomain;
        if (domain.isEmpty()) {
            result.put("message", "domain Empty");
            return result;
        }
        domain = domain.replaceAll("/+$", "\"");
        String wsdl = domain + "/default/svc-open/web-service-v2";
        String method = "callService";
        StringBuffer sendSoapString = getSendSoapString(params, service);
        try {
            String ret = getWebServiceAndSoap(wsdl, method, service, sendSoapString);
            Document doc = Jsoup.parse(ret);
            String json = doc.select("response").text();
            return JSON.parseObject(json);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param service 方法名
     * @param params  请求参数
     * @return StringBuffer
     */
    private static StringBuffer getSendSoapString(String params, String service) {
        // TODO Auto-generated method stub
        StringBuffer sendSoapString = new StringBuffer();
        sendSoapString.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns1=\"http://www.example.org/Ec/\">");
        sendSoapString.append("   <soapenv:Body>");
        sendSoapString.append("      <ns1:callService>");
        sendSoapString.append("        <paramsJson>" + params + "</paramsJson>");
        sendSoapString.append("         <userName>" + userName + "</userName>");
        sendSoapString.append("         <userPass>" + userPass + "</userPass>");
        sendSoapString.append("         <service>" + service + "</service>");
        sendSoapString.append("      </ns1:callService>");
        sendSoapString.append("   </soapenv:Body>");
        sendSoapString.append("</soapenv:Envelope>");
        return sendSoapString;
    }

    /*
     * 远程访问SOAP协议接口
     *
     * @param url： 服务接口地址
     * EB接入地址地址路径：http://xxx-EB.xxx.com/default/svc-open/web-service-v2
     * WMS接入地址地址路径：http://xxx.xxx.com/default/svc-open/web-service-v2
     * @param isClass：接口类名
     * @param isMethod： 接口方法名
     * @param sendSoapString： soap协议xml格式访问接口
     * @return  soap协议xml格式
     * @备注：有四种请求头格式1、SOAP 1.1； 2、SOAP 1.2 ； 3、HTTP GET； 4、HTTP POST
     */
    private static String getWebServiceAndSoap(String url, String isClass, String isMethod, StringBuffer sendSoapString) throws IOException {
        String soap = sendSoapString.toString();
        if (soap == null) {
            return null;
        }
        URL soapUrl = new URL(url);
        URLConnection conn = soapUrl.openConnection();
        conn.setConnectTimeout(30*1000);
        conn.setReadTimeout(60*1000);
        conn.setUseCaches(false);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Length",
                Integer.toString(soap.length()));
        conn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
        // 调用的接口方法是
        conn.setRequestProperty(isClass, isMethod);
        OutputStream os = conn.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
        osw.write(soap);
        osw.flush();
        osw.close();
        // 获取webserivce返回的流
        InputStream is = conn.getInputStream();
        if (is != null) {
            int hasNext;
            byte[] bytes;
            StringBuffer stringBuffer = new StringBuffer();
            do {
                bytes = new byte[1024];
                hasNext = is.read(bytes,0,bytes.length);
                stringBuffer.append(new String(bytes).trim());
            } while (hasNext != -1);

            return stringBuffer.toString();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        Map<String, Object> requestParameter = new HashMap(5);
        Map condition = new HashMap(6);

        requestParameter.put("page", 1);
        requestParameter.put("pageSize", 50);
        requestParameter.put("getDetail", 1);
        requestParameter.put("getAddress", 0);
        requestParameter.put("condition", condition);

        JSONObject result = soapRequest("getOrderList", "EB", requestParameter);

//        obj.demo();//接口调用示例
    }
}
