package com.tage.registration.service;

import com.tage.registration.model.User;
import com.tage.registration.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by tage on 3/31/16.
 */
public class UserManager {

    public boolean exists(User user) throws Exception {


        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        session.beginTransaction();
        long count = (Long) session.createQuery("select count(*) from User u where u.username = :username").setString("username", user.getUsername()).uniqueResult();
        session.getTransaction().commit();
        if (count > 0) {

            return true;
        }
        return false;
    }


    public void add(User user) throws Exception {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();

    }
}
