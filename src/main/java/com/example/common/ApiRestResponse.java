package com.example.common;

public class ApiRestResponse<T> {

    private int status;
    private String msg;
    private T data;
   public static  final int code=1000;
   public static  final String  message="success";
    public int getMessage() {
        return status;
    }

    public void setMessage(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ApiRestResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ApiRestResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    public static<T> ApiRestResponse <T> success(){
        return new ApiRestResponse<>(code,message);
    }

    public static <T> ApiRestResponse <T> success(T data){
       ApiRestResponse<T> apiRestResponse=new ApiRestResponse<>(code,message);
       apiRestResponse.setData(data);
       return apiRestResponse;
    }
    public static <T> ApiRestResponse <T> error(int code ,String mesage){
        ApiRestResponse<T> apiRestResponse=new ApiRestResponse<>(code,message);
        return apiRestResponse;
    }

      public static <T> ApiRestResponse <T> error(ExeceptionEnum ex){
        return new  ApiRestResponse <>(ex.getCode(),ex.getMessage());
    }

}
