<%--
  Created by IntelliJ IDEA.
  User: tage
  Date: 3/31/16
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="GBK" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
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

<form method="post" action="user.action">
    �û�����<input type="text" name="username"><br/>
    ���룺<input type="password" name="password"><br/>
    ���룺<input type="password" name="password2"><br/>
    <input type="submit" value="�ύ"><br/>
</form>

</body>
</html>
