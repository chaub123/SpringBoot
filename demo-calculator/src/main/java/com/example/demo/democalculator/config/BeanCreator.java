package com.example.demo.democalculator.config;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCreator {

    @Bean(name = "arrayList")
    List<String> createArrayList(){
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("efg");
        list.add("ihj");
        return list;
    }

    @Bean(name = "LinkedList")
    List<String> createLinkList(){
        return new LinkedList<>();
    }
}
