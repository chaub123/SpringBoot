package com.bootcamp.finnhub.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class QuoteDTO {

    private double currentPrice;

    private double change;

    private double precentChange;

    private double dayHighPrice;

    private double dayLowPrice;

    private double dayOpenPrice;

    private double previousClosePrice;

}
