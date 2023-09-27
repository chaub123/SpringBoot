package com.example.demothymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
    @GetMapping("/sample")
    public String sample(Model model) {
        model.addAttribute("message", new java.util.Date());
        return "sample";
    }
}
