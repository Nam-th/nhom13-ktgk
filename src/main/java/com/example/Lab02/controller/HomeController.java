package com.example.Lab02.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller public class HomeController {
    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "Welcome to our Book Store");
        return "/home/home";
    }
}
