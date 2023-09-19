package com.example.demo.democalculator.controller.impl;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.democalculator.DemoCalculatorApplication;
import com.example.demo.democalculator.controller.BeanDisplayer;

@RestController
@RequestMapping(value = "/api/v1")
public class BeanDisplayerController implements BeanDisplayer{

    @Autowired
    DemoCalculatorApplication app;

    @Override
    public List<String> getAllBeans() {
        return Arrays.asList(app.getBean());
    }
    
}
