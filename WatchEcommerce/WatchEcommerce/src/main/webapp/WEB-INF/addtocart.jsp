<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %>
    <%@page import="java.util.Enumeration" %>
    <%@page import="javax.servlet.http.HttpSession"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add to Cart</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
<center><h3 style="color:red">Add to cart</h3><center>
<a href="back">
   <button style="float: left">Back</button> </a>
<div class="container">

  <table class="table table-striped">
   <thead class="thead-dark">
   <th>     </th>
    <th scope="row">Product Name</th>
    <th scope="row">Price</th>
    <th scope="row"> Rating</th>
    <th scope="row">DiscountPrecentage</th>
    <th scope="row">Add to cart</th>
   </thead>
   <tbody>
    <c:forEach items="${productList}" var="product" >
     <tr>
     <td><img src="./image/${product.image}" style="height: 100px;width:100px"/></td>
      <td>${product.product_name}</td>
      <td>${product.price}</td>     
      <td>${product.rating}</td>
      <td>${product.discountedpercentage}%</td>
      <td>
      <spring:url value="/addProduct/${product.id}" var="addURL" />
       <a href="${addURL}" class="col-md-1">
                <button type="button" class="btn btn-primary" name="btnAddBook">Add to cart</button>
                </a>
      </td>
      <td>
     
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  </div>
</body>
</html>