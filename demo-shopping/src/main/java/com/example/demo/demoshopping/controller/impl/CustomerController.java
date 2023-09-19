package com.example.demo.demoshopping.controller.impl;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.demoshopping.controller.CustomerOperation;
import com.example.demo.demoshopping.model.Customer;
import com.example.demo.demoshopping.service.CustomerService;

@RestController
@RequestMapping(value = "/api/v1")
public class CustomerController implements CustomerOperation{
    
    @Autowired
    CustomerService customerService;

    @Override
    public Customer create(String name, String email, LocalDate dob){
        return customerService.create(name, email, dob);
    }

    @Override
    public Customer get(String customerId){
        return customerService.get(Long.valueOf(customerId)).orElse(null);
    }

    @Override
    public List<Customer> findAll(){
        return customerService.findAll();
    }
}
    // @Override
    // public Customer remove(long customerId) {
        
    // }

    // @Override
    // public Customer update(int customerId, Customer customer) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'update'");
    // }

    // @Override
    // public Customer patchEmail(int id, String email) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'patchEmail'");
    // }

    // @Override
    // public Customer patchName(int id, String name) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'patchName'");
    
