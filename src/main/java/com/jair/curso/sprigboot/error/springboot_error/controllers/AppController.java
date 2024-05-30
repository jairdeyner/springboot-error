package com.jair.curso.sprigboot.error.springboot_error.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jair.curso.sprigboot.error.springboot_error.exceptions.UserNotFoundException;
import com.jair.curso.sprigboot.error.springboot_error.models.domain.User;
import com.jair.curso.sprigboot.error.springboot_error.services.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService service;

    @GetMapping
    public String index() {
        // int value = 10 / 0;
        int value = Integer.parseInt("1ds0");

        System.out.println(value);
        return "Ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable Long id) {
        User user = service.findById(id).orElseThrow(() -> new UserNotFoundException("Error el usuario no existe"));
        return user;
    }
}
