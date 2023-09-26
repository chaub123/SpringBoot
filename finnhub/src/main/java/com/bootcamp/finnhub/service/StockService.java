package com.bootcamp.finnhub.service;

import com.bootcamp.finnhub.model.Quote;

public interface StockService {
    Quote quote(String symbol);
}
