package com.bootcamp.finnhub.service;

import com.bootcamp.finnhub.model.Profile2;
import com.bootcamp.finnhub.model.Quote;

public interface StockService {

    Quote quote(String symbol);

    Profile2 profile2(String symbol);
    
}
