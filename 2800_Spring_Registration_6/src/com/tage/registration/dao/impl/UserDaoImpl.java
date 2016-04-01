package com.tage.registration.dao.impl;

import com.tage.registration.dao.UserDao;
import com.tage.registration.model.User;
import com.tage.registration.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by tage on 4/1/16.
 */
public class UserDaoImpl implements UserDao {
    public void save(User u) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        s.save(u);
        s.getTransaction().commit();
    }

    public boolean checkUserExistsWithName(String username) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        long count = (Long) s.createQuery("select count(*) from User u where u.username = :username")
                .setString("username", username)
                .uniqueResult();
        s.getTransaction().commit();
        if (count > 0) return true;
        return false;
    }
}
