package com.bootcamp.finnhub.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bootcamp.finnhub.model.dto.Profile2DTO;
import com.bootcamp.finnhub.model.dto.QuoteDTO;
import com.bootcamp.finnhub.model.dto.StockDTO;

public interface StockOperation {

    @GetMapping("/")
    String index(Model model);

    @GetMapping("/quote")
    QuoteDTO quote(String symbol);

    @GetMapping("/profile2")
    Profile2DTO profile2(String symbol);

    @GetMapping("/stock")
    StockDTO stock(String symbol);
}
