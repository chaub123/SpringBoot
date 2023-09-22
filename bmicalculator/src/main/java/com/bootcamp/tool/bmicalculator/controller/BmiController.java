package com.bootcamp.tool.bmicalculator.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.tool.bmicalculator.entity.User;
import com.bootcamp.tool.bmicalculator.service.BmiService;

@RestController
@RequestMapping("/api/v1")
public class BmiController {
    
    @Autowired
    private BmiService bmiService;

    @GetMapping("/bmi")
    @ResponseStatus(value = HttpStatus.OK)
    public double bmi(@RequestParam double height, @RequestParam double weight){
        return bmiService.bmi(height, weight);
    }

    @GetMapping("/users")
    @ResponseStatus(value = HttpStatus.OK)
    public List<User> findUser(){
        return bmiService.findAllUser();
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteUser(@PathVariable long id){
        bmiService.deleteUser(id);
    }

    // @PutMapping("/update/{id}")
    // @ResponseStatus(value = HttpStatus.OK)
    // public void putUser(@PathVariable long id){
    //     bmiService.putUser(id);
    // }

    @PatchMapping("/patch")
    @ResponseStatus(value = HttpStatus.OK)
    public void patchUser(@RequestParam long id, @RequestParam int age){
        bmiService.patchUser(id, age);
    }

    @PostMapping("/new")
    @ResponseStatus(value = HttpStatus.OK)
    public void newUser(@RequestParam String firstname, @RequestParam String lastname, int age){
        bmiService.newUser(firstname, lastname, age);
    }
}
