package com.chaub123.personalprofile.service;

import java.util.Optional;
import com.chaub123.personalprofile.entity.User;

public interface UserService {
    User addUser(String lastName, String firstName, int age);

    Optional<User> findUser(long id);
}
