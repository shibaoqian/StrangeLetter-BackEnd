package com.example.strangeLetter.commonResponse;


import java.io.Serializable;

public class ComResponse implements Serializable {

    private Integer code; //状态码 0成功 1处理中 -1处理失败
    private Object  data; //数据
    private String  msg;  //描述

    public ComResponse(){

    }

    public ComResponse(Integer code, Object data,String msg) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    // 成功，传入数据
    public static ComResponse buildSuccess() {
        return new ComResponse(0, null, null);
    }

    // 成功，传入数据
    public static ComResponse buildSuccess(Object data) {
        return new ComResponse(0, data, null);
    }

    // 失败，传入描述信息
    public static ComResponse buildError(String msg) {
        return new ComResponse(-1, null, msg);
    }

    // 失败，传入描述信息,状态码
    public static ComResponse buildError(String msg, Integer code) {
        return new ComResponse(code, null, msg);
    }

    // 成功，传入数据,及描述信息
    public static ComResponse buildSuccess(Object data, String msg) {
        return new ComResponse(0, data, msg);
    }

    // 成功，传入数据,及状态码
    public static ComResponse buildSuccess(Object data, int code) {
        return new ComResponse(code, data, null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
