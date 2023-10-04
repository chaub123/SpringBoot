package com.bootcamp.finnhub.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.bootcamp.finnhub.entity.ProfileEntity;
import com.bootcamp.finnhub.repository.ProfileRepository;

@Component
public class AppStartRunner implements CommandLineRunner {

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Importing stock list for monitoring!");
        profileRepository.save(ProfileEntity.builder().symbol("AAPL").name("Apple Inc").build());
        profileRepository.save(ProfileEntity.builder().symbol("TSM").name("Taiwan Scilicon").build());
        profileRepository.save(ProfileEntity.builder().symbol("MSFT").name("Microsoft").build());
        profileRepository.save(ProfileEntity.builder().symbol("TSLA").name("Tesla").build());
    }
}
