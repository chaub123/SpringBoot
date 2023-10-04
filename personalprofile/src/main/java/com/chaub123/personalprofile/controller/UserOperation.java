package com.chaub123.personalprofile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.chaub123.personalprofile.entity.User;

public interface UserOperation {
    @GetMapping("/user")
    User addUser(@RequestParam String lastname, @RequestParam String firstname, @RequestParam int age);

    @GetMapping("/user/{id}")
    User findUser(@PathVariable long age);
}
