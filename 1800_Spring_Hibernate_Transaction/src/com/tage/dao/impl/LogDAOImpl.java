package com.tage.dao.impl;

import com.tage.dao.LogDAO;
import com.tage.dao.UserDAO;
import com.tage.model.Log;
import com.tage.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.omg.SendingContext.RunTime;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by tage on 3/26/16.
 */
@Component("logDAO")
public class LogDAOImpl implements LogDAO {
  /*  private DataSource dataSource;*/


    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Log log) {
        Session session = sessionFactory.getCurrentSession();

        session.save(log);
 /*       throw new RuntimeException();*/
    }
}
