package com.bootcamp.finnhub.controller.impl;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.finnhub.controller.ColorOperation;
import com.bootcamp.finnhub.model.Color;
import jakarta.validation.Valid;

@RestController
public class ColorOperationImpl implements ColorOperation {
    public Color getColorCode(@Valid @RequestBody Color color){

        Color colorObj = new Color();
        colorObj.setColorName(color.getColorName());
        if(color.getColorName().equals("RED")){
            colorObj.setCode("R100");
        }else if(color.getColorName().equals("GREEN")){
            colorObj.setCode("G200");
        }else{
            colorObj.setCode("B300");
        }
        return colorObj;
    }
}
