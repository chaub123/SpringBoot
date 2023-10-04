package com.chaub123.personalprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chaub123.personalprofile.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
