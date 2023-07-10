package com.charliekriska.userdatardb.service;

import com.charliekriska.userdatardb.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAllUsers() {
        log.info("UserServiceImpl.getAllUsers: Getting List of Users");
        return List.of(
                User.builder()
                        .firstName("Charlie")
                        .lastName("Bucket")
                        .email("charliebucket2@gmail.com")
                        .build(),
                User.builder()
                        .firstName("Happy")
                        .lastName("Gilmore")
                        .email("happygilmore2@yahoo.com")
                        .build(),
                User.builder()
                        .firstName("Bob")
                        .lastName("Barker")
                        .email("bobbarker@yahoo.com")
                        .build()
        );
    }
}
