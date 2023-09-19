package com.example.demo.demoshopping.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.demoshopping.model.Customer;

public interface CustomerOperation {

    @GetMapping(value = "/customers")
    List<Customer> findAll();


    @PostMapping(value = "/customer")
    Customer create(@RequestParam String name, 
                    @RequestParam String email, 
                    @RequestParam LocalDate dob);

    @GetMapping(value = "/customer/{id}")
    Customer get(@PathVariable(name = "id") String customerId);

    // @DeleteMapping(value = "/customer/{id}")
    // Customer remove(@PathVariable(name = "id") long customerId);

    // @PutMapping(value = "/customer/{id}")
    // Customer update(@PathVariable(name = "id") int customerId, @RequestBody Customer customer);

    // @PatchMapping(value = "/customer/id/{id}/email/{email}")
    // Customer patchEmail(@PathVariable int id, @PathVariable String email);

    // @PatchMapping(value = "/customer/id/{id}/name/{name}")
    // Customer patchName(@PathVariable int id, @PathVariable String name);
}
