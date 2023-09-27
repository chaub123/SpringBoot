package com.bootcamp.finnhub.model.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StockDTO {
    // This class combine QuoteDTO & Prifle2DTO

    private String ticker;

    private String name;

    private String country;

    private String currency;

    private String exchange;

    private String industry;

    private double currentPrice;

    private double change;

    private double precentChange;

    private double dayHighPrice;

    private double dayLowPrice;

    private double dayOpenPrice;

    private double previousClosePrice;

    private LocalDateTime timeStampLDT;
}
