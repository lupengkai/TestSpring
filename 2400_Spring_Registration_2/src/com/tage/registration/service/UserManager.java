package com.tage.registration.service;

import com.tage.registration.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by tage on 3/31/16.
 */
public class UserManager {
    public boolean exists(User user) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "0715");
        String sqlQuery = "select count(*) from user where username = ?";
        PreparedStatement preparedStatementQuery = connection.prepareStatement(sqlQuery);
        preparedStatementQuery.setString(1, user.getUserName());
        ResultSet resultSet = preparedStatementQuery.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);
        preparedStatementQuery.close();
        connection.close();
        if (count > 0) {

            return true;
        }
        return false;
    }


    public void add(User user) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "0715");
        String sql = "insert into user values (null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, user.getUserName());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
}
