package com.example.demodatascraper.service;

import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


@Service
public class MarkSixService {

    public Set<Integer> marksix(){
        Set<Integer> marksix = new HashSet<>();
        Random random = new Random();
        while(marksix.size() < 6){
            marksix.add(random.nextInt(49) + 1);
        }
        return marksix;
    }
}
