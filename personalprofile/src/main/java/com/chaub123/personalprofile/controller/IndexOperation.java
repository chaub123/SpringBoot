package com.chaub123.personalprofile.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public interface IndexOperation {
    @GetMapping("/")
    String index(Model model);
}
