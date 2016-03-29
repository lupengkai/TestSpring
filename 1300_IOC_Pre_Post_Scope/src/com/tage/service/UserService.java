package com.tage.service;

import com.tage.dao.UserDAO;
import com.tage.dao.impl.UserDAOImpl;
import com.tage.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by tage on 3/26/16.
 */
@Component("userService")
@Scope(value = "prototype")
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

    @Resource(name = "u")
    public void setUserDAO(UserDAO userDAO) {

        this.userDAO = userDAO;
    }

    public void add(User user) {
        this.userDAO.save(user);
    }

    @PostConstruct//构造完成之后
    public void init() {
        System.out.println("init");
    }

    @PreDestroy//对象销毁之前
    public void destroy() {
        System.out.println("destroy");
    }

}
