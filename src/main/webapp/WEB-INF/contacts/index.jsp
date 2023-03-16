<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rob
  Date: 3/15/23
  Time: 3:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contacts List</title>
</head>
<body>
<h1>Contacts</h1>
<c:forEach items="${contacts}" var="contact">
    <div>
        <h3>${contact.name} @ ${contact.phoneNumber}</h3>
    </div>
</c:forEach>
</body>
</html>
