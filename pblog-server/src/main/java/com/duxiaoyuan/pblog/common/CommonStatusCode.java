package com.duxiaoyuan.pblog.common;

/**
 * @author duxiaoyuan
 */


public enum CommonStatusCode {
    SUCCESS(20000, "成功"),
    FAIL(500, "失败");
    private final int code;

    private final String message;

    CommonStatusCode(int code, String message){
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
