package com.betrybe.acc.java.springbootsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
   
    @GetMapping
    public String helloWorld() {
        return "Hello World!! ";
    }
}