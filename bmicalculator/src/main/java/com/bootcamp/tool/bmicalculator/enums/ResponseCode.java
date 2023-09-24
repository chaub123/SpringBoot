package com.bootcamp.tool.bmicalculator.enums;

public enum ResponseCode {
    OK(20000, "OK"),
    NOTOK(40400, "Page not found!"),
    ;

    private int code;
    private String message;

    private ResponseCode(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }

}
