package com.example.springsecurity.controller;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/admin")
public class authcontroller {
    @GetMapping("/home")
    public String homepage(){
        return  "Welcome to home page";
    }
}
