package com.example.finnhub.demofinnhub.model;

import lombok.Getter;

@Getter
public class Quote {
    private double c; // current price
    private double d; // change
    private double dp; // precent change
    private double h; // high price of the day
    private double l; // low price of the day
    private double o; // opening ?
    private double pc; // // previous close price
    private int t;
}
