
<%--
  Created by IntelliJ IDEA.
  User: rob
  Date: 3/10/23
  Time: 9:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%

    String method = request.getMethod();
    if (method.equals("POST")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }

%>

<html>
<head>
    <title>Login</title>
</head>
<body>

<form method="POST" action="/login.jsp">
    <label for="username">Username</label>
    <input type="text" id="username" name="username">
    <label for="password">Password</label>
    <input type="text" id="password" name="password">
    <button>Login</button>
</form>

</body>
</html>
