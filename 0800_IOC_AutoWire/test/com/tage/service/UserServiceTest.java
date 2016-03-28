package com.tage.service;


import com.tage.model.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");//ApplicationContext 实现 BeanFactory接口





        UserService service = (UserService)applicationContext.getBean("userService");


        User u = new User();
        service.add(u);
        System.out.println(service.getUserDAO());
    }
}