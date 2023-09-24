package com.bootcamp.tool.bmicalculator.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.tool.bmicalculator.entity.User;
import com.bootcamp.tool.bmicalculator.enums.ResponseCode;
import com.bootcamp.tool.bmicalculator.infra.ApiResponse;
import com.bootcamp.tool.bmicalculator.service.BmiService;

@RestController
@RequestMapping("/api/v1")
public class BmiController {
    
    @Autowired
    private BmiService bmiService;

    char c = '1';

    @GetMapping("/bmi")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<ApiResponse<Double>> bmi(@RequestParam double height, @RequestParam double weight){
        Double bmi = bmiService.bmi(height, weight);
        ApiResponse<Double> response = ApiResponse.<Double>builder().data(bmi).status(ResponseCode.OK).build();
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/users")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<ApiResponse<List<User>>> findUsers(){
        List<User> users = bmiService.findAllUser();
        ApiResponse<List<User>> response = ApiResponse.<List<User>>builder()
                                                .status(ResponseCode.OK)
                                                .data(users)
                                                .build();
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteUser(@PathVariable long id){
        bmiService.deleteUser(id);
    }

    

    @PatchMapping("/patch")
    @ResponseStatus(value = HttpStatus.OK)
    public void patchUser(@RequestParam long id, @RequestParam int age){
        bmiService.patchUser(id, age);
    }

    @PostMapping("/new")
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<ApiResponse<Long>> newUser(@RequestParam String firstname, @RequestParam String lastname, int age){
        Long Id = bmiService.newUser(firstname, lastname, age);
        ApiResponse<Long> response = ApiResponse.<Long>builder().data(Id).status(ResponseCode.OK).build();
        return ResponseEntity.ok().body(response);
    }
}
