package com.example.demo.democalculator.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.demo.democalculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Autowired
    @Qualifier(value = "arrayList")
    private List<String> strings;

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int substract(int x, int y) {
        return x - y;
    }

    @Override
    public List<String> getStrings(){
        return this.strings;
    }
}
