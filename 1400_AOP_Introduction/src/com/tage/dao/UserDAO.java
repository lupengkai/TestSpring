package com.tage.dao;

import com.tage.model.User;


/**
 * Created by tage on 3/26/16.
 */
public interface UserDAO {
    public void save(User user);

    public void delete(User user);

}
