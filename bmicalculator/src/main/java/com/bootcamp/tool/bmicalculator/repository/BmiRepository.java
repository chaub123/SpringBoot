package com.bootcamp.tool.bmicalculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bootcamp.tool.bmicalculator.entity.BmiRecord;

@Repository
public interface BmiRepository extends JpaRepository<BmiRecord, Long> {
    
}
