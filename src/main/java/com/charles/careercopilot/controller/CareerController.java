package com.charles.careercopilot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/career")
public class CareerController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Career Copilot!";
    }
}
