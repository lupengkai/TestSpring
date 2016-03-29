package com.tage.dao.impl;

import com.tage.aop.LogInterceptor;
import com.tage.dao.UserDAO;
import com.tage.model.User;

/**
 * Created by tage on 3/26/16.
 */
public class UserDAOImpl3 implements UserDAO {


    private UserDAO userDAO = new UserDAOImpl();

    public void save(User user) {
        new LogInterceptor().beforeMethod(null);
        userDAO.save(user);
    }

    @Override
    public void delete(User user) {

    }
}
