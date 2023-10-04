package com.bootcamp.finnhub.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.finnhub.controller.StockOperation;
import com.bootcamp.finnhub.model.Profile;
import com.bootcamp.finnhub.model.Quote;
import com.bootcamp.finnhub.model.Stock;
import com.bootcamp.finnhub.service.StockService;

@RestController
@RequestMapping("/api/v1")
public class StockOperationImpl implements StockOperation{
    @Autowired
    private StockService stockService;

    @Override
    public Quote quote(String symbol){
        return stockService.quote(symbol);
    } 

    @Override
    public Profile profile(String symbol){
        return stockService.profile(symbol);
    }

    @Override
    public Stock stock(String symbol){
        return stockService.stock(symbol);
    }
}
