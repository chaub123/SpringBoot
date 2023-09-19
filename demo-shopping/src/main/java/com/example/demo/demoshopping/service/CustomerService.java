package com.example.demo.demoshopping.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import com.example.demo.demoshopping.model.Customer;

public interface CustomerService {
    
    Customer create(String name, String email, LocalDate dob);

    Optional<Customer> get(long customerId);

    List<Customer> findAll();
}
