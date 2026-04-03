package com.internship_zorvyn.demo.service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    public User create(User user) {
        user.setStatus(Status.ACTIVE);
        return repo.save(user);
    }

    public List<User> getAll() {
        return repo.findAll();
    }
}
