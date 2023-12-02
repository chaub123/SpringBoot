package com.chaub.webscraper.Serivce;

public interface WebScraperService {

    public String findElementByName(String url, String name);

    public String findElementByID(String url, String id);

    public String findElementByClass(String url, String className);

}
