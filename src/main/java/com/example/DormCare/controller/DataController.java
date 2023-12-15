package com.example.DormCare.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.DormCare.user.User;

@Controller
public class DataController {
    @GetMapping("/")
    public String login(){

        return "login";
    }

    @PostMapping("/register")
    public String email_registration( @ModelAttribute() User user){
        System.out.println("Received request for email registration");
        System.out.println(user.toString());
        return "login";
    }
}
