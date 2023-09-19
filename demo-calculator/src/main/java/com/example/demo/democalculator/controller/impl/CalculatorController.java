package com.example.demo.democalculator.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.democalculator.controller.CalculatorOperation;
import com.example.demo.democalculator.service.CalculatorService;

@RestController
@RequestMapping(value = "/api/v1")
public class CalculatorController implements CalculatorOperation {

    @Autowired
    CalculatorService calculatorService;

    @Override
    public List<String> getStrings() {
        return calculatorService.getStrings();
    }

    @Override
    public Integer add(int x, int y) {
        return calculatorService.add(x, y);
    }

    @Override
    public Integer substract(int x, int y) {
        return calculatorService.substract(x, y);
    }



}
