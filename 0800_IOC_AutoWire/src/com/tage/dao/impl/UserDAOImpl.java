package com.tage.dao.impl;

import com.tage.dao.UserDAO;
import com.tage.model.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by tage on 3/26/16.
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void save(User user) {
        System.out.println("user saved");
    }


   private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "";
    }
}
