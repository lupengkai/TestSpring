package com.tage.service;

import com.tage.dao.UserDAO;
import com.tage.model.User;
import com.tage.spring.BeanFactory;
import com.tage.spring.ClassPathXmlApplicationContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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




        UserService service = (UserService)factory.getBean("userService");

        User u = new User();
        service.add(u);
    }
}