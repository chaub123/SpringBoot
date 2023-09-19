package com.example.finnhub.demofinnhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.finnhub.demofinnhub.mapper.StockMapper;
import com.example.finnhub.demofinnhub.model.Stock;
import com.example.finnhub.demofinnhub.service.StockService;


@RestController
@RequestMapping("/api/v1")
public class StockController {

    @Autowired
    private StockService stockService;


    @GetMapping("/stock")
    public Stock stock(@RequestParam String symbol){
        return StockMapper.map(stockService.profile(symbol), stockService.quote(symbol));
    }
}

