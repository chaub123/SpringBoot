package com.bootcamp.tool.bmicalculator.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.bootcamp.tool.bmicalculator.entity.User;
import com.bootcamp.tool.bmicalculator.repository.UserRepository;

@Profile("Test")
@Component
public class AppStartRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Inject an user record for testing!");
        User newUser = User.builder().firstName("Auto").lastName("Create").age(999).build();
        userRepository.save(newUser);
    }
}
