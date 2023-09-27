package com.example.finnhub.demofinnhub.infra;

public enum Code {
    REDIX_SERVER_UNAVAILABLE(50002, "Redis unavailable");

    private int code;
    private String message;

    private Code(int code, String message){
        this.code = code;
        this.message = message;
    }
}
