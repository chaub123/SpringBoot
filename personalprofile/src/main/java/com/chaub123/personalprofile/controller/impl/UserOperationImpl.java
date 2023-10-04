package com.chaub123.personalprofile.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.chaub123.personalprofile.controller.UserOperation;
import com.chaub123.personalprofile.entity.User;
import com.chaub123.personalprofile.service.UserService;

@RestController
public class UserOperationImpl implements UserOperation {
    @Autowired
    private UserService userService;

    @Override
    public User addUser(String lastname, String firstname, int age) {
        return userService.addUser(lastname, firstname, age);
    }

    @Override
    public User findUser(long id) {
        return userService.findUser(id).orElse(null);
    }
}
