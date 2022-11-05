    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Enumeration" %>
    <%@page import="javax.servlet.http.HttpSession"%>
    <%@page import="java.text.DecimalFormat" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

 
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity4">
<head>
<meta charset="ISO-8859-1">
<title>Your Cart Page</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</script>
</head>
<body>
<a href="back"> 
            <button>Back</button> </a>
 <form name='frmBooks' method='post' action="billgenerate">
<div class="container">

    <h1 class="jumbotron">
       Your Shopping Cart
    </h1>
     <table class="table table-striped">
   <thead class="thead-dark">
   <th scope="row">Product Name</th>
    <th scope="row">Price</th>
    <th scope="row">Discount Percentage</th>
    <th scope="row">Remove From Cart</th>
 </thead>
   <tbody>   
   
   
   
 <c:forEach items="${cartList}" var="cartList">
 <tr>
     
       <td> ${cartList.product_name}</td>
       <td> ${cartList.price}</td>
      <td>${cartList.discountedprice}%</td> 
      
       <spring:url value="/removeItemFromCart/${cartList.cartid}" var="removeURL" />
      <td> <a href="${removeURL}" class="col-md-1">
                <button type="button" class="btn btn-primary" name="btnremove">Remove</button>
                </a>
                </td>
     </tr>
 </c:forEach>
 </tbody>
 </table>
 
       <a href="removeItems" class="col-md-1">
                <button type="button" class="btn btn-primary">Remove All</button>
                </a>
  
  
       <a href="/addProduct/generatingbill" class="col-md-1">
                <button type="button" class="btn btn-primary">Generate Your Bill</button>
                </a>
 <table>   
</div>
</form>
</body>

</html>