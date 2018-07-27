package com.maven.service;

import org.junit.Test;


public class UserServiceTest {

    @Test
    public void delete() {
        UserService userService = new UserService();
        System.out.println(userService.getUserById(1));
    }
}