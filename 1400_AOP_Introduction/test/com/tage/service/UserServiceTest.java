package com.tage.service;

import com.tage.aop.LogInterceptor;
import com.tage.dao.UserDAO;
import com.tage.dao.impl.UserDAOImpl;
import com.tage.model.User;
import com.tage.spring.BeanFactory;
import com.tage.spring.ClassPathXmlApplicationContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

/**
 * Created by tage on 3/26/16.
 */
public class UserServiceTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {
        BeanFactory factory = new ClassPathXmlApplicationContext();


        UserService service = (UserService) factory.getBean("userService");

        User u = new User();
        service.add(u);
    }

    @Test
    public void testProxy() {
        UserDAO userDAO = new UserDAOImpl();
        LogInterceptor logInterceptor = new LogInterceptor();
        logInterceptor.setTarget(userDAO);

        UserDAO userDAOProxy = (UserDAO) Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), new Class[]{UserDAO.class}, logInterceptor);
        System.out.println(userDAOProxy.getClass());
        userDAOProxy.save(new User());
        userDAOProxy.delete(new User());

    }


}