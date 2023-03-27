package com.test.mvcwebapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "hello/hello_world";
    }
    @GetMapping("/goodbye")
    public String goodByePage(){
        return "hello/goodbye";
    }
}
