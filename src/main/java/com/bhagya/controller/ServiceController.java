package com.bhagya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @RequestMapping("/greeting")
    public String sayHello(){
        return "<h1> Hello spring boot </h1>";
    }
}
