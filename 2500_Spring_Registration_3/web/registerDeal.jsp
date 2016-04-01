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
<%@ page import="com.tage.com.tage.registration.model.User" %>
<%@ page import="com.tage.com.tage.registration.service.UserManager" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String password2 = request.getParameter("password2");

    User user = new User();
    user.setUsername(username);
    user.setPassword(password);

    UserManager userManager = new UserManager();
    boolean exist = userManager.exists(user);

    if (exist) {
        response.sendRedirect("registerFail.jsp");
        return;
    } else {
        userManager.add(user);
        response.sendRedirect("registerSuccess.jsp");
    }


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
