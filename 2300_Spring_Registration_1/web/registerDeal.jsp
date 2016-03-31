<%--
  Created by IntelliJ IDEA.
  User: tage
  Date: 3/31/16
  Time: 4:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="GBK" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    String userName = request.getParameter("username");
    String password = request.getParameter("password");
    String password2 = request.getParameter("password2");
    Class.forName("com.mysql.jdbc.Driver");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "0715");
    String sqlQuery = "select count(*) from user where username = ?";
    PreparedStatement preparedStatementQuery = connection.prepareStatement(sqlQuery);
    preparedStatementQuery.setString(1, userName);
    ResultSet resultSet = preparedStatementQuery.executeQuery();
    resultSet.next();
    int count = resultSet.getInt(1);
    if (count > 0) {
        response.sendRedirect("registerFail.jsp");
        preparedStatementQuery.close();
        connection.close();
        return;
    }


    String sql = "insert into user values (null, ?, ?)";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, userName);
    preparedStatement.setString(2, password);
    preparedStatement.executeUpdate();
    preparedStatement.close();
    connection.close();

    response.sendRedirect("registerSuccess.jsp");
%>

<!DOCTYPE HTML>
<html>
<head>
    <base href="<%=basePath%>">

    <title></title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>

</body>
</html>
