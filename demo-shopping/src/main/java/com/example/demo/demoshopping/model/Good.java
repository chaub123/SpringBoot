package com.example.demo.demoshopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Good {
    private long id;
    private double price;
    private String description;

    private static int counter = 0;

    public Good (double price, String description){
        this.price = price;
        this.description = description;
        this.id = ++counter;

    }
}
