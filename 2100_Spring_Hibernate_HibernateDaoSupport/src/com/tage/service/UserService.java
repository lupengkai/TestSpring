package com.tage.service;

import com.tage.dao.LogDAO;
import com.tage.dao.UserDAO;
import com.tage.dao.impl.UserDAOImpl;
import com.tage.model.Log;
import com.tage.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by tage on 3/26/16.
 */
public class UserService {


    private UserDAO userDAO;
    private LogDAO logDAO;

    public LogDAO getLogDAO() {
        return logDAO;
    }

    @Resource
    public void setLogDAO(LogDAO logDAO) {
        this.logDAO = logDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    /*   @Transactional(propagation = Propagation.REQUIRED)*/
    public void add(User user) {
        this.userDAO.save(user);
        Log log = new Log();
        log.setMsg("a user saved");
        logDAO.save(log);
    }

/*

    public UserService(UserDAO userDAO) {
        super();
        this.userDAO = userDAO;
    }
*/

}
