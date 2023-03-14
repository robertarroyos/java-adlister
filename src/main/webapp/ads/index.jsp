<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rob
  Date: 3/14/23
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads Index View</title>
</head>
<body>

<h1>Ads Index View</h1>

<c:forEach items="${ads}" var="ad">
    <li>${ad.title}</li>
</c:forEach>

</body>
</html>
