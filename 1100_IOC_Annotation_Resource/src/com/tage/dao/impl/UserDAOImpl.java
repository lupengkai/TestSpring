package com.tage.dao.impl;

import com.tage.dao.UserDAO;
import com.tage.model.User;

/**
 * Created by tage on 3/26/16.
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void save(User user) {
        System.out.println("user saved");
    }
}
