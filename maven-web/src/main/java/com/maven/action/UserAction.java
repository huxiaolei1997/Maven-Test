package com.maven.action;

import com.maven.model.User;
import com.maven.service.UserService;

/**
 * UserAction
 *
 * version 1.0
 *
 * @create 2018-07-27 13:50
 *
 * @copyright huxiaolei1997@gmail.com
 */
public class UserAction {
    private UserService userService;

    public void Test() {
        User user = userService.getUserById(1);
    }
}
