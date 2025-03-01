package com.s19.twitterBackend.service;

import com.s19.twitterBackend.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}