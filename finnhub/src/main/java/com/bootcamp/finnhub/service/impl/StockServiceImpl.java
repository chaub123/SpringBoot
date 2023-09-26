package com.bootcamp.finnhub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchConnectionDetails.Node.Protocol;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.bootcamp.finnhub.model.Quote;
import com.bootcamp.finnhub.service.StockService;

@Service
public class StockServiceImpl implements StockService{
    
    @Autowired
    @Qualifier(value = "apiToken")
    private String apiToken;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Quote quote(String symbol){
         String url = UriComponentsBuilder.newInstance()
                        .scheme(Protocol.HTTPS.name())
                        .host("finnhub.io")
                        .path("/api/v1")
                        .path("/quote")
                        .queryParam("symbol", symbol)
                        .queryParam("token", apiToken)
                        .build()
                        .toUriString();
        return restTemplate.getForObject(url, Quote.class);
    }
}
