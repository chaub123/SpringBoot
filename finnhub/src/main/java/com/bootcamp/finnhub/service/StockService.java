package com.bootcamp.finnhub.service;

import com.bootcamp.finnhub.model.Profile;
import com.bootcamp.finnhub.model.Quote;
import com.bootcamp.finnhub.model.Stock;

public interface StockService {
    Quote quote(String symbol);

    Profile profile(String symbol);

    Stock stock(String symbol);
}
