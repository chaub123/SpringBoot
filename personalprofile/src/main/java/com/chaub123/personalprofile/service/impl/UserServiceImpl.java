package com.chaub123.personalprofile.service.impl;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chaub123.personalprofile.entity.User;
import com.chaub123.personalprofile.repository.UserRepository;
import com.chaub123.personalprofile.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(String lastName, String firstName, int age){
        return userRepository.save(User.builder().firstName(firstName).lastName(lastName).age(age).build());
    }

    @Override
    public Optional<User> findUser(long id){
        return userRepository.findById(id);
    }
}
