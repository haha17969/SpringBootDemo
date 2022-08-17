package com.example.common;

public enum ExeceptionEnum {
   NAME_EXIT(10001,"姓名已存在"),
    WRONG_MESSAGE(10002,"账号或密码错误"),
    PRODUCT_NAME_MESSAGE(20003,"商品名重复");

    int code;
   String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ExeceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
