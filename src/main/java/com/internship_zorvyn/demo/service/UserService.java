package com.internship_zorvyn.demo.service;

import com.internship_zorvyn.demo.model.Status;
import com.internship_zorvyn.demo.model.User;
import com.internship_zorvyn.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo = null;

    public User create(User user) {
        user.setStatus(Status.ACTIVE);
        return repo.save(user);
    }

    public List<User> getAll() {
        return repo.findAll();
    }
}