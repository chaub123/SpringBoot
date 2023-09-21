package com.example.finnhub.demofinnhub.mapper;

import com.example.finnhub.demofinnhub.model.CompanyProfileDTO;
import com.example.finnhub.demofinnhub.model.Profile;
import com.example.finnhub.demofinnhub.model.Quote;
import com.example.finnhub.demofinnhub.model.Stock;

public class StockMapper {
    public static Stock map(Profile profile, Quote quote){
        CompanyProfileDTO companyProfile = CompanyProfileDTO.builder()
                                            .country(profile.getCountry())
                                            .companyName(profile.getName())
                                            .ipoDate(profile.getIpo())
                                            .logo(profile.getLogo())
                                            .marketCap(profile.getMarketCapitalization())
                                            .currency(profile.getCurrency())
                                            .build();
                                            
        return Stock.builder()
                        .companyProfile(companyProfile)
                        .currentPrice(quote.getC())
                        .dayHigh(quote.getH())
                        .dayLow(quote.getL())
                        .dayOpen(quote.getO())
                        .prevDayClose(quote.getPc())
                        .build();
        
    }
}
