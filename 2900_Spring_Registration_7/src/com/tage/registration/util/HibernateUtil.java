package com.tage.registration.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by tage on 3/31/16.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }


    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
