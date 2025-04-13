package com.learning.springWebApp.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String welcome() {
        return "Hi Bhargav Welcome to Home Page";
    }

    @RequestMapping("/about")
    public String about() {
        return "This page was testing for!!";
    }
}
