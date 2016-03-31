package com.tage.dao.impl;

import com.tage.dao.UserDAO;
import com.tage.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

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

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Resource
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void save(User user) {
        hibernateTemplate.save(user);

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
