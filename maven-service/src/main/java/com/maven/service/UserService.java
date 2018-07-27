package com.maven.service;

import com.maven.dao.UserDao;
import com.maven.model.User;

/**
 * UserService
 *
 * version 1.0
 *
 * @create 2018-07-27 11:14
 *
 * @copyright huxiaolei1997@gmail.com
 */
public class UserService {
    private UserDao userDao = new UserDao();

    public void delete(int i) {
        userDao.deleteUserById(i);
    }

    public User getUserById(int i) {
        return userDao.getUserById(i);
    }
}
