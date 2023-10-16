package com.bootcamp.demo_jsp_gradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String home(Model model){
        model.addAttribute("message", "Hello, Spring Boot with JSP!"); 
        return "index";
    }
}
