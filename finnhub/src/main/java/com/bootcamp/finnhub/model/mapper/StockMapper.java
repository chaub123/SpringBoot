package com.bootcamp.finnhub.model.mapper;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.springframework.stereotype.Component;
import com.bootcamp.finnhub.model.Profile2;
import com.bootcamp.finnhub.model.Quote;
import com.bootcamp.finnhub.model.dto.Profile2DTO;
import com.bootcamp.finnhub.model.dto.QuoteDTO;
import com.bootcamp.finnhub.model.dto.StockDTO;

@Component
public class StockMapper {


    public StockDTO map(Profile2 profile, Quote quote){
        Instant instant = Instant.ofEpochSecond(quote.getTimeStamp());
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();

        StockDTO stock = StockDTO.builder()
                                    .ticker(profile.getTicker())
                                    .name(profile.getName())
                                    .country(profile.getCountry())
                                    .currency(profile.getCurrency())
                                    .exchange(profile.getExchange())
                                    .industry(profile.getFinnhubIndustry())
                                    .currentPrice(quote.getCurrentPrice())
                                    .change(quote.getChange())
                                    .precentChange(quote.getPrecentChange())
                                    .dayHighPrice(quote.getDayHighPrice())
                                    .dayLowPrice(quote.getDayLowPrice())
                                    .dayOpenPrice(quote.getDayOpenPrice())
                                    .previousClosePrice(quote.getPreviousClosePrice())
                                    .timeStampLDT(localDateTime)
                                    .build();
        return stock;                                                                    
    }


    public QuoteDTO map(Quote quote){
        Instant instant = Instant.ofEpochSecond(quote.getTimeStamp());
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();

        QuoteDTO quoteDTO = QuoteDTO.builder()
                                .currentPrice(quote.getCurrentPrice())
                                .change(quote.getChange())
                                .precentChange(quote.getPrecentChange())
                                .dayHighPrice(quote.getDayHighPrice())
                                .dayLowPrice(quote.getDayLowPrice())
                                .dayOpenPrice(quote.getDayOpenPrice())
                                .previousClosePrice(quote.getPreviousClosePrice())
                                .timeStampLDT(localDateTime)
                                .build();
        return quoteDTO;
    }

    public Profile2DTO map(Profile2 profile){
        Profile2DTO profileDTO = Profile2DTO.builder()
                                    .ticker(profile.getTicker())
                                    .name(profile.getName())
                                    .country(profile.getCountry())
                                    .currency(profile.getCurrency())
                                    .exchange(profile.getExchange())
                                    .industry(profile.getFinnhubIndustry())
                                    .build();
        return profileDTO;
    }
}
