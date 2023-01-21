package com.charliekriska.userdatardb.controller;

import com.charliekriska.userdatardb.model.User;
import com.charliekriska.userdatardb.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class UserController {

    private UserService userService;

    @GetMapping("/users")
    List<User> getAllUsers() {
        log.info("UserController.getAllUsers: GET /users");
        return userService.getAllUsers();
    }

}
