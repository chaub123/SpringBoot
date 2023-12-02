package com.chaub.webscraper.Controller.Impl;

import com.chaub.webscraper.Controller.WebScrapperController;
import com.chaub.webscraper.Serivce.WebScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WebScrapperControllerImpl implements WebScrapperController {

    @Autowired
    WebScraperService webScraperService;

    @Override
    public String findElementByName(String url, String name) {
        return webScraperService.findElementByName(url, name);
    }

    @Override
    public String findElementByID(String url, String id) {
        return webScraperService.findElementByID(url, id);
    }

    @Override
    public String findElementByClass(String url, String className){
        return webScraperService.findElementByClass(url, className);
    }
}
