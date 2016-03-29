package com.tage.dao.impl;

import com.tage.dao.UserDAO;
import com.tage.model.User;

/**
 * Created by tage on 3/26/16.
 */
public class UserDAOImpl2 extends UserDAOImpl {
    @Override
    public void save(User user) {
        System.out.println("begin save");
        super.save(user);
        System.out.println("user saved");
    }
}
