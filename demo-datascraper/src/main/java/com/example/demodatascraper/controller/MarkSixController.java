package com.example.demodatascraper.controller;

import com.example.demodatascraper.service.MarkSixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/v1")
public class MarkSixController {

    @Autowired
    MarkSixService markSixService;

    @GetMapping("/marksix")
    public Set<Integer> marksix(){
        return markSixService.marksix();
    }

}
