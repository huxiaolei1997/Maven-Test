package com.maven.dao;

import com.maven.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * UserDao
 *
 * version 1.0
 *
 * @create 2018-07-27 11:08
 *
 * @copyright huxiaolei1997@gmail.com
 */
public class UserDao {
    private List<User> userList = new ArrayList<User>();

    public UserDao() {
        User user;
        for (int i = 0; i < 3; i++) {
            user = new User();
            user.setId(i);
            user.setUserName("test");
            user.setAge(20);
            userList.add(user);
        }
    }

    public User getUserById(int i) {
        User user = userList.get(i);
        return user;
    }

    public void deleteUserById(int i) {
        userList.remove(i);
    }

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.userList.toString());
    }
}
