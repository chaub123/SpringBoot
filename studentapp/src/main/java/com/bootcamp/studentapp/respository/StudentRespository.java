package com.bootcamp.studentapp.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bootcamp.studentapp.entity.Student;

@Repository
public interface StudentRespository extends JpaRepository<Student, Long>{
    
}
