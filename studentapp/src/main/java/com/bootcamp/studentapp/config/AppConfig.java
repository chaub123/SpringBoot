package com.bootcamp.studentapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public String classname(){
        return "Bootcamp2307";
    }
}
