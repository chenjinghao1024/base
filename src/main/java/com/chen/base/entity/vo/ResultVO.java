package com.chen.base.entity.vo;

import java.util.HashMap;

/**
 *
 * @author CaiBaoHong
 * @date 2017/2/15
 *
 */
public class ResultVO extends HashMap<String, Object> {

    /////////////////////// 默认的键 ///////////////////////
    private static final String KEY_OPER = "oper";
    private static final String KEY_SUCC = "succ";
    private static final String KEY_CODE = "code";
    private static final String KEY_MSG = "msg";
    private static final String KEY_DATA = "data";

    /////////////////////// 默认的值 ///////////////////////
    private static final String DEFAULT_OPER_VAL = "default";
    private static final int DEFAULT_SUCC_CODE = 1;
    private static final int DEFAULT_FAIL_CODE = -1;
    private static final String DEFAULT_SUCC_MSG = "ok";
    private static final String DEFAULT_FAIL_MSG = "fail";


    /////////////////////// 最通用的两个构造函数 ///////////////////////

    /**
     * 无参构造：操作成功返回的响应信息
     */
    public ResultVO() {
        this.put(KEY_OPER,DEFAULT_OPER_VAL);
        this.put(KEY_SUCC,true);
        this.put(KEY_CODE,DEFAULT_SUCC_CODE);
        this.put(KEY_MSG,DEFAULT_SUCC_MSG);
    }

    /**
     * 操作成功返回的响应信息
     */
    public ResultVO(String oper) {
        this.put(KEY_OPER,oper);
        this.put(KEY_SUCC,true);
        this.put(KEY_CODE,DEFAULT_SUCC_CODE);
        this.put(KEY_MSG,DEFAULT_SUCC_MSG);
    }

    /**
     * 全参构造
     * @param operate
     * @param success
     * @param code
     * @param msg
     * @param data
     */
    public ResultVO(String operate, boolean success, int code, String msg, Object data) {
        this.put(KEY_OPER,operate);
        this.put(KEY_SUCC,success);
        this.put(KEY_CODE,code);
        this.put(KEY_MSG,msg);
        if (data!=null){
            this.put(KEY_DATA,data);
        }
    }

    /////////////////////// 各种简便的静态工厂方法 ///////////////////////

    ////// 操作成功的：

    public static ResultVO succ() {
        return new ResultVO();
    }

    public static ResultVO succ(String operate) {
        return new ResultVO(operate,true, DEFAULT_SUCC_CODE, DEFAULT_SUCC_MSG,null);
    }

    public static ResultVO succ(String operate, String message) {
        return new ResultVO(operate,true, DEFAULT_SUCC_CODE, message,null);
    }

    public static ResultVO succ(String operate, Object data) {
        return new ResultVO(operate,true, DEFAULT_SUCC_CODE, DEFAULT_SUCC_MSG,data);
    }

    public static ResultVO succ(String operate, String dataKey, Object dataVal) {
        return new ResultVO(operate,true, DEFAULT_SUCC_CODE, DEFAULT_SUCC_MSG,null)
                .data(dataKey,dataVal);
    }

    ////// 操作失败的：

    public static ResultVO fail() {
        return new ResultVO(DEFAULT_OPER_VAL,false,DEFAULT_FAIL_CODE,DEFAULT_FAIL_MSG,null);
    }

    public static ResultVO fail(String operate) {
        return new ResultVO(operate,false, DEFAULT_FAIL_CODE, DEFAULT_FAIL_MSG,null);
    }

    public static ResultVO fail(String operate, String message) {
        return new ResultVO(operate,false, DEFAULT_FAIL_CODE, message,null);
    }

    public static ResultVO fail(String operate, Object data) {
        return new ResultVO(operate,false, DEFAULT_FAIL_CODE, DEFAULT_FAIL_MSG,data);
    }

    public static ResultVO fail(String operate, String dataKey, Object dataVal) {
        return new ResultVO(operate,false, DEFAULT_FAIL_CODE, DEFAULT_FAIL_MSG,null)
                .data(dataKey,dataVal);
    }

    ////// 操作动态判定成功或失败的：

    public static ResultVO result(String operate, boolean success) {
        return new ResultVO(
                operate,
                success,
                (success?DEFAULT_SUCC_CODE:DEFAULT_FAIL_CODE),
                (success?DEFAULT_SUCC_MSG:DEFAULT_FAIL_MSG),
                null);
    }

    public static ResultVO result(String operate, boolean success, Object data) {
        return new ResultVO(
                operate,
                success,
                (success?DEFAULT_SUCC_CODE:DEFAULT_FAIL_CODE),
                (success?DEFAULT_SUCC_MSG:DEFAULT_FAIL_MSG),
                data);
    }

    public static ResultVO result(String operate, boolean success, String dataKey, Object dataVal) {
        return new ResultVO(
                operate,
                success,
                (success?DEFAULT_SUCC_CODE:DEFAULT_FAIL_CODE),
                (success?DEFAULT_SUCC_MSG:DEFAULT_FAIL_MSG),
                null)
                .data(dataKey,dataVal);
    }

    /////////////////////// 各种链式调用方法 ///////////////////////

    /** 设置操作名称 */
    public ResultVO oper(String operate){
        this.put(KEY_OPER,operate);
        return this;
    }

    /** 设置操作结果是否成功的标记 */
    public ResultVO succ(boolean success){
        this.put(KEY_SUCC,success);
        return this;
    }

    /** 设置操作结果的代码 */
    public ResultVO code(int code){
        this.put(KEY_CODE,code);
        return this;
    }

    /** 设置操作结果的信息 */
    public ResultVO msg(String message){
        this.put(KEY_MSG,message);
        return this;
    }

    /** 设置操作返回的数据 */
    public ResultVO data(Object dataVal){
        this.put(KEY_DATA,dataVal);
        return this;
    }

    /** 设置操作返回的数据，数据使用自定义的key存储 */
    public ResultVO data(String dataKey, Object dataVal){
        this.put(dataKey,dataVal);
        return this;
    }

}
