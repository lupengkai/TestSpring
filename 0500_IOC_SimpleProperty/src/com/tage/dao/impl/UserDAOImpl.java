package com.tage.dao.impl;

import com.tage.dao.UserDAO;
import com.tage.model.User;

/**
 * Created by tage on 3/26/16.
 */
public class UserDAOImpl implements UserDAO {

    private int daoId;
    private String daoStatus;


    public int getDaoId() {
        return daoId;
    }

    public void setDaoId(int daoId) {
        this.daoId = daoId;
    }

    public String getDaoStatus() {
        return daoStatus;
    }

    public void setDaoStatus(String daoStatus) {
        this.daoStatus = daoStatus;
    }

    @Override
    public void save(User user) {
System.out.println("user saved");
    }
}
