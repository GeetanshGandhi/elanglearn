package com.easybites.backend.User.controller;

import com.easybites.backend.User.model.User;
import com.easybites.backend.User.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody User user){
        return userService.LoginUser(user);
    }
}
