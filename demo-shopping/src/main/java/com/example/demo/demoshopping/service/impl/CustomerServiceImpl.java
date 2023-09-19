package com.example.demo.demoshopping.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.demoshopping.model.Customer;
import com.example.demo.demoshopping.model.CustomerDatabase;
import com.example.demo.demoshopping.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
    
    @Override
    public Customer create(String name, String email, LocalDate dob){
        Customer customer = new Customer(name, email, dob);
        CustomerDatabase.add(customer);
        return customer;
    };

    @Override
    public Optional<Customer> get(long customerId){
        return CustomerDatabase.get(customerId);
    }

    @Override
    public List<Customer> findAll(){
        return CustomerDatabase.findAll();
    }

}
