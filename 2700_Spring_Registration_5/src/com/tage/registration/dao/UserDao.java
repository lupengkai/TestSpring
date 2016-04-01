package com.tage.registration.dao;

import com.tage.registration.model.User;

/**
 * Created by tage on 4/1/16.
 */

public interface UserDao {
    public void save(User u);

    public boolean checkUserExistsWithName(String username);
}

