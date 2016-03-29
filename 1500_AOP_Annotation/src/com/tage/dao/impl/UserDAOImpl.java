package com.tage.dao.impl;

import com.tage.dao.UserDAO;
import com.tage.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by tage on 3/26/16.
 */
@Component("u")//指定名字
//@Component()
public class UserDAOImpl implements UserDAO {
    @Override
    public void save(User user) {
        System.out.println("user saved");
    }
}
