package com.internship_zorvyn.demo.controller;

import com.internship_zorvyn.demo.model.User;
import com.internship_zorvyn.demo.repository.UserRepository;
import com.internship_zorvyn.demo.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;  


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository repo;
    private final JwtUtil jwt = null;

    public AuthController() {
        this.repo = null;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody User user) {

        User db = repo.findByEmail(user.getEmail()).orElseThrow();

        if (!db.getPassword().equals(user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwt.generateToken(db.getEmail(), db.getRole().name());

        return Map.of("token", token);
    }
}