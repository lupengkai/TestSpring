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
       ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");//ApplicationContext 实现 BeanFactory接口




        UserService service = (UserService)classPathXmlApplicationContext.getBean("userService");
        UserService service2 = (UserService)classPathXmlApplicationContext.getBean("userService");
       classPathXmlApplicationContext.destroy();
    }
} 