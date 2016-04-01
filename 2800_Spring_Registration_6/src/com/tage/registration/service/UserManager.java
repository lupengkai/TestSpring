package com.tage.registration.service;

import com.tage.registration.model.User;
import com.tage.registration.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by tage on 3/31/16.
 */
public interface UserManager {

    public abstract boolean exists(User u) throws Exception;

    public abstract void add(User u) throws Exception;

}