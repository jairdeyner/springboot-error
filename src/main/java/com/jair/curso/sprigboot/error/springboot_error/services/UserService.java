package com.jair.curso.sprigboot.error.springboot_error.services;

import java.util.List;
import java.util.Optional;

import com.jair.curso.sprigboot.error.springboot_error.models.domain.User;

public interface UserService {
    List<User> findAll();

    Optional<User> findById(Long id);
}
