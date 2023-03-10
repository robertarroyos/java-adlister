<%@ page import="model.Product" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%

    Product p1 = new Product("Cellphone", 1000);
    Product p2 = new Product("Laptop", 2000);
    Product p3 = new Product("Coffee Mug", 100);

    List<Product> products = new ArrayList<>(Arrays.asList(
            p1,
            p2,
            p3
    ));

    request.setAttribute("products", products);
%>

<html>
<head>
    <title>Products</title>
</head>
<body>

<%@ include file="partials/navbar.jsp" %>
<h1>Products</h1>

<c:choose>
    <c:when test="${products.isEmpty()}">
        <h3>No product</h3>
    </c:when>
    <c:otherwise>
        <c:forEach var="product" items="${products}">
            <div>
                <h3>${product.name}: ${product.costInCents}</h3>
            </div>
        </c:forEach>
    </c:otherwise>
</c:choose>

<!-- this is an HTML comment, you *will* see this in the html -->

</body>
</html>
