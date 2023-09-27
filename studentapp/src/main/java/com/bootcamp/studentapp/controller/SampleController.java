package com.bootcamp.studentapp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("theDate", new java.util.Date());
        return "index";
    }
}
