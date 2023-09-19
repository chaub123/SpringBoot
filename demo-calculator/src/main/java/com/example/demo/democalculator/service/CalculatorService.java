package com.example.demo.democalculator.service;

import java.util.List;

public interface CalculatorService {
    /**
     * 
     * @param x
     * @param y
     * @return
     */
    int add(int x, int y);

    /**
     * 
     * @param x
     * @param y
     * @return
     */
    int substract(int x, int y);

    List<String> getStrings();
}
