package com.bootcamp.finnhub.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stock {
    private String symbol;
    private String currency;
    private String country;
    private String marketCap;
    private double current;
    private double change;
    private double precentChange;
    private double dayHigh;
    private double dayLow;
    private double opening;
    private double previousClose;
    private LocalDateTime timestamp;
}
