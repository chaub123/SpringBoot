package com.bootcamp.studentapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.studentapp.entity.Student;
import com.bootcamp.studentapp.service.StudentService;

@RestController
@RequestMapping(value="/api/v1")
public class StudentController {

    
    @Autowired    
    private StudentService studentService;


    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }


    @PostMapping("/new") 
    public void newStudent(@RequestParam String name, @RequestParam String age){
        studentService.newStudent(name, age);
    }   
}
