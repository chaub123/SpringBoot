package com.chaub.webscraper.Serivce.Impl;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chaub.webscraper.Serivce.WebScraperService;

@Service
public class WebScraperServiceImpl implements WebScraperService{

    @Autowired
    ChromeDriver chromeDriver;

    @Override
    public String findElementByName(String url, String name){
        chromeDriver.get(url);
        return chromeDriver.findElement(By.name(name)).getText();
    }

    @Override
    public String findElementByID(String url, String id){
        chromeDriver.get(url);
        return chromeDriver.findElement(By.id(id)).getText();
    }

    @Override
    public String findElementByClass(String url, String className){
        chromeDriver.get(url);
        return chromeDriver.findElement(By.className(className)).getText();
    }
}
