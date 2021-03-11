package com.Otchenash.WMS.controllers;

import com.Otchenash.WMS.entities.User;
import com.Otchenash.WMS.entities.UserDto;
import com.Otchenash.WMS.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController { 
    Logger logger = LoggerFactory.getLogger(UsersController.class);
    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users")
    public List<UserDto> showAllUsers() {
        return userService.showAllUsers();
    }

    @PostMapping("users")
    public UserDto addUser(@RequestBody User user) {
        logger.info("Creating: " + user);
        return userService.addUser( user );
    }

    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser( id );

    }


}
