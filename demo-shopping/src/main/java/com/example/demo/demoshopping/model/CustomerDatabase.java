package com.example.demo.demoshopping.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerDatabase {
    private static List<Customer> customers = new ArrayList<>();

    public static void add(Customer customer){
        customers.add(customer);
    }

    public static Optional<Customer> get(long customerId){
        return customers.stream().filter(e -> e.getId() == customerId).findFirst();
    }

    public static List<Customer> findAll(){
        return CustomerDatabase.customers;
    }
}
