package com.bootcamp.finnhub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchConnectionDetails.Node.Protocol;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.bootcamp.finnhub.model.Profile2;
import com.bootcamp.finnhub.model.Quote;
import com.bootcamp.finnhub.service.StockService;

@Service
public class StockServiceImpl implements StockService{
    
    @Autowired
    @Qualifier(value = "apiToken")
    private String apiToken;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.finnhub.domain}")
    private String hostname;

    @Value("${api.finnhub.path}")
    private String path;

    @Value("${api.finnhub.endpoints.quote}")
    private String quote;

    @Value("${api.finnhub.endpoints.profile2}")
    private String profile2;   

    @Override
    public Quote quote(String symbol){
         String url = UriComponentsBuilder.newInstance()
                        .scheme(Protocol.HTTPS.name())
                        .host(hostname)
                        .path(path)
                        .path(quote)
                        .queryParam("symbol", symbol)
                        .queryParam("token", apiToken)
                        .build()
                        .toUriString();
        return restTemplate.getForObject(url, Quote.class);
    }

    @Override
    public Profile2 profile2(String symbol){
         String url = UriComponentsBuilder.newInstance()
                        .scheme(Protocol.HTTPS.name())
                        .host(hostname)
                        .path(path)
                        .path(profile2)
                        .queryParam("symbol", symbol)
                        .queryParam("token", apiToken)
                        .build()
                        .toUriString();
        return restTemplate.getForObject(url, Profile2.class);
    }
}
