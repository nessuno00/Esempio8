package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HomeController {

@Autowired
private Environment environment;


    @Autowired
    @Value("${welcomeMsg}")
     String welcomeMsg;
    @GetMapping("/welcome")
    public String getWelcomeMsg() {

        String var1 = environment.getProperty("welcomeMsg");
        return var1;
    }

    }

