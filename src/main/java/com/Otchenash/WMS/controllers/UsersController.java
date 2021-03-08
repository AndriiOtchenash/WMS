package com.Otchenash.WMS.controllers;

import com.Otchenash.WMS.entities.User;
import com.Otchenash.WMS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users")
    public List<User> showAllUsers() {
        return userService.showAllUsers();
    }

    @PostMapping("users")
    public User addUser(User user) {
        return userService.addUser( user );
    }

    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser( id );

    }


}
