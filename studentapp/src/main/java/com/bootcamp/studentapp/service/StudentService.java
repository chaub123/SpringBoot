package com.bootcamp.studentapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.studentapp.entity.Student;
import com.bootcamp.studentapp.respository.StudentRespository;

@Service
public class StudentService {
    
    @Autowired
    private StudentRespository studentRespository;

    public Optional<Student> getStudent(long id){
        return studentRespository.findById(id);
    }

    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students = studentRespository.findAll();
        return students;
    }

        public void newStudent(String name, String age){ 
        Student student = Student.builder()
                                    .name(name)
                                    .age(Integer.parseInt(age))
                                    .build();
        studentRespository.save(student);
    }
}
