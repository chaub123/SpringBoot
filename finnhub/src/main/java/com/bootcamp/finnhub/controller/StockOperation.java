package com.bootcamp.finnhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.finnhub.model.dto.QuoteDTO;

public interface StockOperation {
    @GetMapping("/quote")
    QuoteDTO quote(String symbol);
}
