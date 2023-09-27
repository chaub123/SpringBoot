package com.bootcamp.finnhub.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.finnhub.controller.StockOperation;
import com.bootcamp.finnhub.model.Profile2;
import com.bootcamp.finnhub.model.Quote;
import com.bootcamp.finnhub.model.dto.Profile2DTO;
import com.bootcamp.finnhub.model.dto.QuoteDTO;
import com.bootcamp.finnhub.model.dto.StockDTO;
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
    public String index(Model model){
        return "index";
    }

    @Override
    public QuoteDTO quote(@RequestParam String symbol){
        Quote quote = stockService.quote(symbol);
        return stockMapper.map(quote);
    }

    @Override
    public Profile2DTO profile2(@RequestParam String symbol){
        Profile2 profile = stockService.profile2(symbol);
        return stockMapper.map(profile);
    }

    @Override
    public StockDTO stock(@RequestParam String symbol){
        Quote quote = stockService.quote(symbol);
        Profile2 profile = stockService.profile2(symbol);
        return stockMapper.map(profile, quote);
    }
}
