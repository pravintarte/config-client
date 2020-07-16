package com.javafun.spring.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private PropertiesConfiguration configuration;

//    @Value("${hello.world}")
//    private String hello;

    @GetMapping
    public String hello(){
        return configuration.getWorld();
    }

}
