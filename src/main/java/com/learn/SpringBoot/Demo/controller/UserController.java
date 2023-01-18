package com.learn.SpringBoot.Demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserController {


    @GetMapping("users")
    public String demo(){
        return "New Api running 2";
    }

}
