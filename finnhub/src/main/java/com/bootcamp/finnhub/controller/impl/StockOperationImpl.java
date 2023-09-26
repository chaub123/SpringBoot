package com.bootcamp.finnhub.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.finnhub.controller.StockOperation;
import com.bootcamp.finnhub.model.Quote;
import com.bootcamp.finnhub.model.dto.QuoteDTO;
import com.bootcamp.finnhub.model.mapper.StockMapper;
import com.bootcamp.finnhub.service.StockService;


@RestController
@RequestMapping("/api/v1")
public class StockOperationImpl implements StockOperation{
    
    @Autowired
    private StockService stockService;

    @Autowired
    private StockMapper stockMapper;

    @Override
    public QuoteDTO quote(@RequestParam String symbol){
        Quote quote = stockService.quote(symbol);
        return stockMapper.map(quote);
    }
}
