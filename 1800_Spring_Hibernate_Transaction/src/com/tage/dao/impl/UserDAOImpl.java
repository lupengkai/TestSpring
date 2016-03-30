package com.tage.dao.impl;

import com.tage.dao.UserDAO;
import com.tage.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by tage on 3/26/16.
 */
public class UserDAOImpl implements UserDAO {
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
    public void save(User user) {
        Session session = sessionFactory.getCurrentSession();

        session.save(user);

    }


/*   @Override
    public void save(User user) {
        try {


            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO user values (null, 'zhangsan')");
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("user saved");
    }
*/
    /*  @Resource(name = "dataSource")*/
  /*  public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/


}
