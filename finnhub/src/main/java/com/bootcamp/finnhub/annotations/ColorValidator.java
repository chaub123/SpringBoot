package com.bootcamp.finnhub.annotations;

import java.util.Arrays;
import java.util.List;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ColorValidator implements ConstraintValidator<ColorValidation, String>
{
    public boolean isValid(String colorName, ConstraintValidatorContext cxt) {
        List list = Arrays.asList(new String[]{"RED","GREEN","BLUE"});
        return list.contains(colorName);
    }
}