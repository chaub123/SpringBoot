package com.example.finnhub.demofinnhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.example.finnhub.demofinnhub.entity.Stocks;
import com.example.finnhub.demofinnhub.model.Profile;
import com.example.finnhub.demofinnhub.model.Quote;
import com.example.finnhub.demofinnhub.repository.StockRepository;

@Service
public class StockService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    StockRepository stockRepository;

    @Value(value = "${api.finnhub.domain}")
    private String finnhub; // from yml

    @Value(value = "${api.finnhub.endpoints.quote}")
    private String quote; // from yml

    @Value(value = "${api.finnhub.endpoints.profile2}")
    private String profile2; // from yml

    @Value(value = "${api_key}")
    private String apiKey; // from yml

    

    public Quote quote(String symbol) {
        String url = UriComponentsBuilder.newInstance()
                .scheme("HTTPS")
                .host(finnhub)
                .path(quote)
                .queryParam("symbol", symbol)
                .queryParam("token", apiKey)
                .build().toUriString();
        Quote quote = restTemplate.getForObject(url, Quote.class);
        return quote;
    }

    public Profile profile(String symbol){
        String url = UriComponentsBuilder.newInstance()
                .scheme("HTTPS")
                .host(finnhub)
                .path(profile2)
                .queryParam("symbol", symbol)
                .queryParam("token", apiKey)
                .build().toUriString();
        Profile profile = restTemplate.getForObject(url, Profile.class);
        return profile;
    }

    public Stocks save(Stocks stocks){
        return stockRepository.save(stocks);
    }

    public void deleteById(Long id){
        stockRepository.deleteById(id);
    }
}
