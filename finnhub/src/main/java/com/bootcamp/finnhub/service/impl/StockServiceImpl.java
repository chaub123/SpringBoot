package com.bootcamp.finnhub.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.bootcamp.finnhub.entity.ProfileEntity;
import com.bootcamp.finnhub.entity.StockPriceEntity;
import com.bootcamp.finnhub.model.Profile;
import com.bootcamp.finnhub.model.Quote;
import com.bootcamp.finnhub.model.Stock;
import com.bootcamp.finnhub.model.mapper.StockMapper;
import com.bootcamp.finnhub.repository.ProfileRepository;
import com.bootcamp.finnhub.repository.StockPriceRepository;
import com.bootcamp.finnhub.service.StockService;

@Service
public class StockServiceImpl implements StockService{

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private StockPriceRepository stockPriceRepository;

    @Value(value = "${api.finnhub.domain}")
    private String finnhub; // from yml

    @Value(value = "${api.finnhub.endpoints.quote}")
    private String quote; // from yml

    @Value(value = "${api.finnhub.endpoints.profile2}")
    private String profile2; // from yml

    @Value(value = "${api_key}")
    private String apiKey; // from yml

    @Override
    public Quote quote(String symbol){
        String url = UriComponentsBuilder.newInstance()
                .scheme("HTTPS")
                .host(finnhub)
                .path(quote)
                .queryParam("symbol", symbol)
                .queryParam("token", apiKey)
                .build().toUriString();
        System.out.println(url);
        Quote quote = restTemplate.getForObject(url, Quote.class);
        return quote;
    }

    @Override
    public Profile profile(String symbol){
        String url = UriComponentsBuilder.newInstance()
                .scheme("HTTPS")
                .host(finnhub)
                .path(profile2)
                .queryParam("symbol", symbol)
                .queryParam("token", apiKey)
                .build().toUriString();
        System.out.println(url);
        Profile profile = restTemplate.getForObject(url, Profile.class);
        return profile;
    }

    @Override
    public Stock stock(String symbol){
        return StockMapper.map(quote(symbol), profile(symbol));
    }

    @Override
    public List<StockPriceEntity> prices(String symbol){
        ProfileEntity profile = profileRepository.findById(symbol).orElse(null);
        return stockPriceRepository.findAllBySymbol(profile);
    }

}
