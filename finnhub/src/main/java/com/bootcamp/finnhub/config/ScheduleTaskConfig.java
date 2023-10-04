package com.bootcamp.finnhub.config;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.bootcamp.finnhub.entity.ProfileEntity;
import com.bootcamp.finnhub.entity.StockPriceEntity;
import com.bootcamp.finnhub.model.Quote;
import com.bootcamp.finnhub.repository.ProfileRepository;
import com.bootcamp.finnhub.repository.StockPriceRepository;
import com.bootcamp.finnhub.service.StockService;

@Component
@EnableScheduling
public class ScheduleTaskConfig {
    
    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private StockPriceRepository stockPriceRepository;

    @Autowired
    private StockService stockService;

    @Scheduled(fixedRate = 300000) // 5 mins
    public void fixedRateTask(){
        System.out.println("System is alive.");
    }

    @Scheduled(cron = "0 * 21-23 * * ?")
    public void storePricePerMinute(){
        System.out.println("Storing current price to DB.");
        List<ProfileEntity> list = profileRepository.findAll();
        for(ProfileEntity profile : list){
            Quote quote = stockService.quote(profile.getSymbol());

            Instant instant = Instant.ofEpochSecond(quote.getTimestamp());
            ZoneId zoneId = ZoneId.systemDefault();
            LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
            stockPriceRepository.save(StockPriceEntity.builder()
                                                    .symbol(profile)
                                                    .current(quote.getCurrent())
                                                    .timestamp(localDateTime)
                                                    .build());
        }
    }

}
