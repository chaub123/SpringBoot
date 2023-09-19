package com.example.demo.demoshopping.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private long id;
    private String name;
    private String email;
    private LocalDate dob;
    private List<Order> order;

    private static int counter = 0;

    public Customer(String name, String email, LocalDate dob){
        this.id = ++counter;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.order = new ArrayList<>();
    }
}
