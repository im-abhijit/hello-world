package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/get/greeting/{name}")
    public String getGreeting(@RequestParam String name){
        return "hello " + name + "!";
    }
}
