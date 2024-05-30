package com.jair.curso.sprigboot.error.springboot_error;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jair.curso.sprigboot.error.springboot_error.models.domain.User;

@Configuration
public class AppConfig {

    @Bean
    List<User> users() {
        return Arrays.asList(
                new User(1L, "Pepe", "Gonzales"),
                new User(2L, "Gimena", "Perez"),
                new User(3L, "Maria", "Carmona"),
                new User(4L, "Pedro", "Pariona"),
                new User(5L, "Jair", "Tello"));
    }
}
