<%--
  Created by IntelliJ IDEA.
  User: rob
  Date: 3/17/23
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Create a new User" />
    </jsp:include>
</head>
<body>

<h1 class="md-6">Register</h1>

<form method="POST" class="col-md-6">
    <div class="form-group">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" class="form-control">
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <input type="email" id="email" name="email" class="form-control">
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" class="form-control">
    </div>
    <div>
        <input type="submit" class="btn-block btn-primary">
    </div>
</form>

</body>
</html>
