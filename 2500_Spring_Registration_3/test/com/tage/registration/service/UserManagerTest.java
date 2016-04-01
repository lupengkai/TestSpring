package com.tage.registration.service;

import com.tage.registration.model.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tage on 3/31/16.
 */
public class UserManagerTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testExists() throws Exception {
        UserManager userManager = new UserManager();
        User user = new User();
        user.setUsername("110");


        boolean exists = userManager.exists(user);
        Assert.assertEquals(true, exists);
    }

    @Test
    public void testAdd() throws Exception {
        UserManager userManager = new UserManager();
        User user = new User();
        user.setUsername("b");
        user.setPassword("b");
        boolean exists = userManager.exists(user);
        if (!exists) {
            userManager.add(user);
            ;
            Assert.assertEquals(true, userManager.exists(user));
        } else {
            Assert.fail("not add");
        }
    }
}