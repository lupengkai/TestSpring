package com.tage.service;

import com.tage.dao.UserDAO;
import com.tage.dao.impl.UserDAOImpl;
import com.tage.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * Created by tage on 3/26/16.
 */
public class UserService {

    private UserDAO userDAO;

    public UserService() {

    }


    public UserService(UserDAO userDAO) {
        super();
        this.userDAO = userDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Resource(name = "userDAO1")//by name 找不到再按type
    public void setUserDAO(UserDAO userDAO) {

        this.userDAO = userDAO;
    }

    public void add(User user) {
        this.userDAO.save(user);
    }


}
