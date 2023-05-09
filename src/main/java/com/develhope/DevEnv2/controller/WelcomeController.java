package com.develhope.DevEnv2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {

    @Autowired
    Environment environment;

    @GetMapping
    public String welcomeMsg(){
        String prof=environment.getProperty("environment");
        return "Hello from "+prof;
    }
}
