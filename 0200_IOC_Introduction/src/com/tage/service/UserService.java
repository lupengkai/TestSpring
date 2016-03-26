package com.tage.service;

import com.tage.dao.UserDAO;
import com.tage.dao.impl.UserDAOImpl;
import com.tage.model.User;

/**
 * Created by tage on 3/26/16.
 */
public class UserService {

    private UserDAO userDAO ;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void add(User user) {
        this.userDAO.save(user);
    }
}
