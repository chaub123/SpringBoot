package com.bootcamp.studentapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.studentapp.entity.Student;
import com.bootcamp.studentapp.exception.StudentNotFoundException;
import com.bootcamp.studentapp.response.StudentErrorResponse;
import com.bootcamp.studentapp.service.StudentService;

@RestController
@RequestMapping(value="/api/v1")
public class StudentController {

    
    @Autowired    
    private StudentService studentService;


    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e){
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(e.getMessage());
        error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.NOT_FOUND);
    }


    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable long id){
        if(id < 0){
            throw new StudentNotFoundException("Student id not found - " + id);
        }

        Student student = studentService.getStudent(id)
                            .orElseThrow(() -> {
                                throw new StudentNotFoundException("Student id not found in DB");}); 

        return student;
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }


    @PostMapping("/new") 
    public void newStudent(@RequestParam String name, @RequestParam String age){
        studentService.newStudent(name, age);
    }   
}
