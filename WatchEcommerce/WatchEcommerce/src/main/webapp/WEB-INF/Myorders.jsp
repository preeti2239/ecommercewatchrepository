<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your order</title>
</head>
<body>
 
<br> 
<a href="back">
            <button>Back</button> </a>
<h2 style="color:red"><u>Your Orders</u></h2>
<br> 
<table>
<c:forEach items="${orderItemList}" var="product">
<tr>
 <td><b>Product Name</b></td><td>${product.product_name}</td></tr>
 <tr>
<td><b>Total</b></td><td>${product.amount}</td></tr>
<tr>
<td><b>Order date</b></td><td>${product.date}</td></tr>

</c:forEach>
</table>
</body>
</html>