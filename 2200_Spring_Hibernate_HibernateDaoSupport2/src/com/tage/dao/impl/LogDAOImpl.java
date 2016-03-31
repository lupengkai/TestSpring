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
public class LogDAOImpl extends Dao implements LogDAO {
  /*  private DataSource dataSource;*/


    @Override
    public void save(Log log) {


        this.getHibernateTemplate().save(log);
    }
}
