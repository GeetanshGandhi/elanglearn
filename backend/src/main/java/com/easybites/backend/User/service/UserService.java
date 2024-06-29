package com.easybites.backend.User.service;

import com.easybites.backend.User.model.User;

public interface UserService {
    String saveUser(User user);
    String getUserById(String id);
    String LoginUser(User user);
}
