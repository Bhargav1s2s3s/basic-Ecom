package com.learning.springWebApp.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {

    @RequestMapping("/login")
    public String login() {
        return "Login Page this is...!";
    }
}
