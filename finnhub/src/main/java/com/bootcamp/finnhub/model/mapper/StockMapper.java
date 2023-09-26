package com.bootcamp.finnhub.model.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.finnhub.model.Quote;
import com.bootcamp.finnhub.model.dto.QuoteDTO;

@Component
public class StockMapper {
    public QuoteDTO map(Quote quote){
        QuoteDTO quoteDTO = QuoteDTO.builder()
                                .currentPrice(quote.getCurrentPrice())
                                .change(quote.getChange())
                                .precentChange(quote.getPrecentChange())
                                .dayHighPrice(quote.getDayHighPrice())
                                .dayLowPrice(quote.getDayLowPrice())
                                .dayOpenPrice(quote.getDayOpenPrice())
                                .previousClosePrice(quote.getPreviousClosePrice())
                                .build();
        return quoteDTO;
    }
}
