package com.duxiaoyuan.pblog.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author duxiaoyuan
 */
@Data
public class Result<T> implements Serializable {
    private boolean success;

    private int code;

    private String retMessage;

    private T data;

    public Result() {

    }

    public Result(int retCode, String retMessage) {
        this.code = retCode;
        this.retMessage = retMessage;
    }

    public Result(int retCode, String retMessage, T data) {
        this.code = retCode;
        this.retMessage = retMessage;
        this.data = data;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        result.setCode(CommonStatusCode.SUCCESS.getCode());
        result.setRetMessage(CommonStatusCode.SUCCESS.getMessage());
        result.setSuccess(true);
        return result;
    }

    public static <T> Result<T> fail() {
        Result<T> result = new Result<>();
        result.setData(null);
        result.setCode(CommonStatusCode.FAIL.getCode());
        result.setRetMessage(CommonStatusCode.FAIL.getMessage());
        result.setSuccess(false);
        return result;
    }
}
