package com.example.demo.democalculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorOperation {
    @GetMapping("/add") // http://localhost:8080/api/v1/add?salary=5000&bonus=102
    Integer add(@RequestParam(name = "salary") int x, //
    @RequestParam(name = "bonus") int y);

    @GetMapping(value = "/substract/{x}/{y}")
    Integer substract(@PathVariable int x, @PathVariable int y);

    @GetMapping("/string") // http://localhost:8080/api/v1/string
    List<String> getStrings();
}
