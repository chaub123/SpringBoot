package com.bootcamp.finnhub.exception;

public class StockNotFoundException extends RuntimeException {
    public StockNotFoundException(String message){
        super(message);
    }
}
