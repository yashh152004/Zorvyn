package com.internship_zorvyn.demo.controller;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository repo;
    private final JwtUtil jwt;

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
