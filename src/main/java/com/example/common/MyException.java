package com.example.common;

public class MyException extends RuntimeException{
    int code;
    String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MyException( int code, String message) {
        this.code = code;
        this.message = message;
    }

    public MyException(ExeceptionEnum execeptionEnum){
       this(execeptionEnum.code,execeptionEnum.message);
    }

}
