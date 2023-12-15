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
    // @PostMapping("/register")
    // public String registration(@ModelAttribute("email") User user ){
    //     System.out.println(user.toString());
    //     System.out.println("s");
    //     return "login";
    // }
    @PostMapping("/register")
    public String registration(@ModelAttribute User user) {
        System.out.println("Email: " + user.getEmail());
        System.out.println("Email: " + user.toString());
        return "login";
    }
    

}
