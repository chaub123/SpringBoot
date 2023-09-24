package com.bootcamp.tool.bmicalculator.infra;

import com.bootcamp.tool.bmicalculator.enums.ResponseCode;

public class ApiResponse <T> {
    private int code;
    private String message;
    private T data;

    public int getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }

    public T getData(){
        return this.data;
    }

    public ApiResponse (ApiResponseBuilder<T> builder){
        this.code = builder.code;
        this.message = builder.message;
        this.data = builder.data;
    }

    public static <T> ApiResponseBuilder<T> builder(){
        return new ApiResponseBuilder<>();
    }

    public static class ApiResponseBuilder<T>{
        private int code;
        private String message;
        private T data;

        public ApiResponseBuilder<T> status(ResponseCode code){
        this.code = code.getCode();
        this.message = code.getMessage();
        return this;
        }

        public ApiResponseBuilder<T> data(T data){
        this.data = data;
        return this;
        }

        public ApiResponse<T> build(){
            if(this.code == 0 || this.message == null){
                throw new RuntimeException("Unknown response status");
            }
            return new ApiResponse<>(this);
        }
    }


}
