package com.example.finnhub.demofinnhub.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyProfileDTO {
    private String country;
    private String companyName;
    private String ipoDate;
    private String logo;
    private String marketCap;
    private String curreny;
}
