package com.example.finnhub.demofinnhub.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stock {
    private CompanyProfileDTO companyProfile;
    private double currentPrice; // current price
    private double dayHigh;
    private double dayLow;
    private double dayOpen;
    private double prevDayClose;
}
