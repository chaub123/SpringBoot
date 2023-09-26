package com.bootcamp.finnhub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Quote {
    @JsonProperty(value = "c")
    private double currentPrice;

    @JsonProperty(value = "d")
    private double change;

    @JsonProperty(value = "dp")
    private double precentChange;

    @JsonProperty(value = "h")
    private double dayHighPrice;

    @JsonProperty(value = "l")
    private double dayLowPrice;

    @JsonProperty(value = "o")
    private double dayOpenPrice;

    @JsonProperty(value = "pc")
    private double previousClosePrice;

    @JsonProperty(value = "t")
    private long timeStamp;
}
