package com.chaub.webscraper.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface WebScrapperController {

    @GetMapping("/findElementByName")
    public String findElementByName(@RequestParam String url, @RequestParam String name);

    @GetMapping("/findElementByID")
    public String findElementByID(@RequestParam String url, @RequestParam String id);
    
    @GetMapping("/findElementByClass")
    public String findElementByClass(@RequestParam String url, @RequestParam String className);
}
