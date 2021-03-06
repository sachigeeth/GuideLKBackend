package com.guidelk.tourism.controller;

import com.guidelk.tourism.entity.User;
import com.guidelk.tourism.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    //@PreAuthorize("hasRole('ROLE_config@user_CREATE')")
    public ResponseEntity createUser(@RequestBody User user) {
        return this.userService.createUser(user);
    }

    @PutMapping
    // @PreAuthorize("hasRole('ROLE_config@user_UPDATE')")
    public ResponseEntity updateUser(@RequestBody User user) {
        return this.userService.updateUser(user);
    }
}
