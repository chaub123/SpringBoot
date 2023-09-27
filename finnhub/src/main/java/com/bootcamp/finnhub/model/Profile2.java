package com.bootcamp.finnhub.model;

import java.time.LocalDate;
import lombok.Getter;


@Getter
public class Profile2 {
    private String country;

    private String currency;

    private String exchange;

    private LocalDate ipo;

    private int marketCapitalization;
    
    private String name;

    private String phone;

    private String shareOutstanding;

    private String ticker;

    private String weburl;

    private String logo;
    
    private String finnhubIndustry;
}
