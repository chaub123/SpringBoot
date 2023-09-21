package com.example.finnhub.demofinnhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.finnhub.demofinnhub.entity.Stocks;
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

    @PostMapping("/save")
    public Stocks save(@RequestBody Stocks stocks){
        return stockService.save(stocks);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        stockService.deleteById(id);
    }

}

