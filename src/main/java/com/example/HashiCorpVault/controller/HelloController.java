package com.example.HashiCorpVault.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${dbPassword}")
    private String password;

    @GetMapping("/hello")
    public String getPassword() {
        return "A senha do banco de dados é: " + password;
    }
}
