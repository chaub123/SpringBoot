package com.bootcamp.finnhub.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.finnhub.entity.StockPriceEntity;
import com.bootcamp.finnhub.model.Profile;
import com.bootcamp.finnhub.model.Quote;
import com.bootcamp.finnhub.model.Stock;

public interface StockOperation {
    @GetMapping("/quote")
    Quote quote(@RequestParam String symbol);

    @GetMapping("/profile")
    Profile profile(@RequestParam String symbol);

    @GetMapping("/stock")
    Stock stock(@RequestParam String symbol);

    @GetMapping("/prices")
    List<StockPriceEntity> prices(@RequestParam String symbol);
}
