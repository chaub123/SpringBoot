package com.bootcamp.finnhub.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Profile2DTO {

    private String ticker;

    private String name;

    private String country;

    private String currency;

    private String exchange;

    private String industry;
    
}
