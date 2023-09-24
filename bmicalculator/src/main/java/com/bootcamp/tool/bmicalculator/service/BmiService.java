package com.bootcamp.tool.bmicalculator.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.tool.bmicalculator.entity.User;
import com.bootcamp.tool.bmicalculator.repository.BmiRepository;
import com.bootcamp.tool.bmicalculator.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class BmiService {
    
    @Autowired
    private BmiRepository bmiRepository;

    @Autowired
    private UserRepository userRepository;

    public double bmi(double height, double weight){
        return Math.round((weight / Math.pow(height / 100.0, 2)) * 100.0) / 100.0;
    }

    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    public void deleteUser(long id){
        User user = userRepository.findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("No this user."));
        System.out.println("Deleting user with id: "+ id);
        userRepository.deleteById(id);
    }


    public void patchUser(long id, int age){
        User user = userRepository.findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Entity Stock ID not Found!!"));
        user.setAge(age);
        userRepository.save(user);
    }

    public Long newUser(String firstname, String lastname, int age){
        User user = User.builder()
                        .firstName(firstname)
                        .lastName(lastname)
                        .age(age)
                        .build();
        User savedUser = userRepository.save(user);
        return savedUser.getId();
    }


}