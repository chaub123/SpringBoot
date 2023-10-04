package com.bootcamp.finnhub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Quote {

    @JsonProperty("c")
    private double current; // current price

    @JsonProperty("d")
    private double change; // change

    @JsonProperty("dp")
    private double precentChange; // precent change

    @JsonProperty("h")
    private double dayHigh; // high price of the day

    @JsonProperty("l")
    private double dayLow; // low price of the day

    @JsonProperty("o")
    private double opening; // opening ?

    @JsonProperty("pc")
    private double previousClose; // // previous close price

    @JsonProperty("t")
    private int timestamp; // timestamp
}