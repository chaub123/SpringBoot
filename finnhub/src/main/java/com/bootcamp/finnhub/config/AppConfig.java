package com.bootcamp.finnhub.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class AppConfig {
    
    @Value("${api-token}")
    private String apiToken;

    @Bean(name = "apiToken")
    public String apiToken(){
        return this.apiToken;
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
