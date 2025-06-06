package ru.gusev.user_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/client")
    public String check() {
        return "Welcome to client";
    }
}