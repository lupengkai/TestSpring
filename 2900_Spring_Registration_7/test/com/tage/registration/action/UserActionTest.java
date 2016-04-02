package com.tage.registration.action;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tage on 4/1/16.
 */
public class UserActionTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testExecute() throws Exception {
        UserAction userAction = new UserAction();
        userAction.setUsername("121");
        userAction.setPasseword("121");

        String ret = userAction.execute();
        assertEquals("success", ret);
    }
}