package com.chaub123.personalprofile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.chaub123.personalprofile.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "My Personal profile")
public interface UserOperation {
    @GetMapping("/user")
    @ApiOperation(value = "This is value in ApiOper", notes = "This is note")
    @ApiResponses({
        @ApiResponse(code = 200, message = "return 200"),
        @ApiResponse(code = 201, message = "return 201")
    })
    User addUser(@RequestParam String lastname, @RequestParam String firstname, @RequestParam int age);

    
    @GetMapping("/user/{id}")
    @ApiOperation(value = "Get user by ID", notes = "Return an user.")
    User findUser(@PathVariable long age);
}
