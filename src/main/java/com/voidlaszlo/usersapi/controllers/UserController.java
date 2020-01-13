package com.voidlaszlo.usersapi.controllers;

import com.voidlaszlo.usersapi.model.User;
import com.voidlaszlo.usersapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/users")
    private @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

}
