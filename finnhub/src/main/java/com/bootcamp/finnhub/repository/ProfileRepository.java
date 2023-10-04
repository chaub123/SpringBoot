package com.bootcamp.finnhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bootcamp.finnhub.entity.ProfileEntity;

public interface ProfileRepository extends JpaRepository<ProfileEntity, String>{
    
}
