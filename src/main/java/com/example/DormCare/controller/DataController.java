package com.example.DormCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.DormCare.user.User;


@Controller
public class DataController {
     @Autowired
    private EmailService emailService;

    @GetMapping("/")
    public String login(){
        return "login";
    }
    
    @PostMapping("/register")
    public String registration(@ModelAttribute User user) {
        String email = user.getEmail();
        emailService.getmail(email);
        return "Admin";
    }
    

}
