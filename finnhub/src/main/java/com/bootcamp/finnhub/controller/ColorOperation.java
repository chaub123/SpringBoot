package com.bootcamp.finnhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bootcamp.finnhub.model.Color;
import jakarta.validation.Valid;

public interface ColorOperation {
    @GetMapping("/color")
    Color getColorCode(@Valid @RequestBody Color color);
}
