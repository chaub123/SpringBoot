package com.bootcamp.finnhub.model.mapper;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import com.bootcamp.finnhub.model.Profile;
import com.bootcamp.finnhub.model.Quote;
import com.bootcamp.finnhub.model.Stock;
import lombok.Builder;

@Builder
public class StockMapper {
    public static Stock map(Quote quote, Profile profile){

        // Convert finnhub timestamp to JAVA LocalDateTime
        Instant instant = Instant.ofEpochSecond(quote.getTimestamp());
        ZoneId zoneId = ZoneId.systemDefault();
        // LocalDate localDate = instant.atZone(zoneId).toLocalDate();
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();

        return Stock.builder()
                    .symbol(profile.getTicker())
                    .currency(profile.getCurrency())
                    .country(profile.getCountry())
                    .marketCap(profile.getMarketCapitalization())
                    .current(quote.getCurrent())
                    .change(quote.getChange())
                    .precentChange(quote.getPrecentChange())
                    .dayHigh(quote.getDayHigh())
                    .dayLow(quote.getDayLow())
                    .opening(quote.getOpening())
                    .previousClose(quote.getPreviousClose())
                    .timestamp(localDateTime)
                    .build();
    }
}
