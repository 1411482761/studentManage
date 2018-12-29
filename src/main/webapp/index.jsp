<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/30 0030
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h2>欢迎使用学生信息系统</h2>
    <form action="/user/login.do" method="post">
        <table>
            <tr>
                <input type="text" name="username" placeholder="请输入用户名">
            </tr>
            <br>
            <tr>
                <input type="password" name="password" placeholder="请输入密码">
            </tr>
            <br>
            ${error}
            <input type="submit" value="提交">
        </table>
    </form>
</center>

</body>

</html>
