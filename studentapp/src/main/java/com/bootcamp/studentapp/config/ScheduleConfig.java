package com.bootcamp.studentapp.config;

import java.time.LocalDateTime;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class ScheduleConfig {

    @Scheduled(fixedDelay = 60000)
    public void timer(){
        System.out.println(LocalDateTime.now().toString() + ", System is alive!");
    }
}
