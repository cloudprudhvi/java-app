package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class GreetingApp {

    @GetMapping("/")
    public String showForm() {
        return "greeting";
    }

    @PostMapping("/greet")
    public String greet(@RequestParam String name, Model model) {
        if (!name.trim().isEmpty()) {
            model.addAttribute("greeting", "Hi, " + name + "!");
        } else {
            model.addAttribute("greeting", "Please enter a name!");
        }
        return "greeting";
    }

    public static void main(String[] args) {
        SpringApplication.run(GreetingApp.class, args);
    }
}
