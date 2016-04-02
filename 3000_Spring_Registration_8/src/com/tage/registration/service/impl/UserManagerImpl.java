package com.tage.registration.service.impl;

import com.tage.registration.dao.UserDao;
import com.tage.registration.dao.impl.UserDaoImpl;
import com.tage.registration.model.User;
import com.tage.registration.service.UserManager;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by tage on 4/1/16.
 */
public class UserManagerImpl implements UserManager {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public boolean exists(User u) throws Exception {
        return userDao.checkUserExistsWithName(u.getUsername());

    }


    public void add(User u) throws Exception {
        userDao.save(u);
    }
}
