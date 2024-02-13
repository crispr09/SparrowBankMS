package com.sparrowbank.userservice.service;

import java.util.List;

import com.sparrowbank.userservice.entity.User;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByName(String userName);
    User saveUser(User user);
}
