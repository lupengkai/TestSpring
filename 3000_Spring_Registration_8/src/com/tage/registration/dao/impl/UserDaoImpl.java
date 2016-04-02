package com.tage.registration.dao.impl;

import com.tage.registration.dao.UserDao;
import com.tage.registration.model.User;
import com.tage.registration.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

/**
 * Created by tage on 4/1/16.
 */
public class UserDaoImpl implements UserDao {

    HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void save(User u) {
        hibernateTemplate.save(u);
    }

    public boolean checkUserExistsWithName(String username) {
        List<User> users = (List<User>) hibernateTemplate.find("from User u where u.username = '" + username + "'");

        if (users != null && users.size() > 0) return true;
        return false;
    }
}
