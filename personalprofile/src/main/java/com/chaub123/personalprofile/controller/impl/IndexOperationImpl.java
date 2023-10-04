package com.chaub123.personalprofile.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.chaub123.personalprofile.controller.IndexOperation;


@Controller
public class IndexOperationImpl implements IndexOperation{
    @Override
    public String index(Model model){
        return "index";
    } 
}
