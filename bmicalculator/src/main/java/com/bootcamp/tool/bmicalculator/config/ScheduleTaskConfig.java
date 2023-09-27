package com.bootcamp.tool.bmicalculator.config;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class ScheduleTaskConfig {
    
    @Scheduled(fixedRate = 10000) // 10 sec
    public void fixedRateTask(){
        System.out.println("FxiedRate Task -" + System.currentTimeMillis());
    }

    @Scheduled(cron = "0/30 * 9-23 * * MON-FRI")
    public void fixedTimeTask(){
        System.out.println("This is cyclic job!");
    }
}
