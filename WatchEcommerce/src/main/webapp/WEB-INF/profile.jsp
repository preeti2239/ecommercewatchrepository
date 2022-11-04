<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile page</title>
</head>
<body>
<a href="back">
   <button>Back</button> </a>
<u><h1 style="color: red">My profile page</h1></u>

 <center>
<table>
   <tbody>
     <tr>
      <td><b>First Name</b></td><td> ${firstname}</td> 
      </tr>
      <tr>
      <td><b>Last Name</b></td><td>${lastname}</td>
       </tr>
       <tr>
      <td><b>Mobile Number</b></td><td>${phonenumber}</td>
      </tr>
      <tr>
      <td><b>Email-Id</b></td><td>${emailid}</td>
       </tr>
       <tr>
      <td><b>Flat / House no.</b></td><td>${housenumber}</td>
       </tr>
       <tr>
      <td><b>Area,Street,Sector,Village:</b></td><td>${area}</td>
       </tr>
       <tr>
      <td><b>Town/City</b></td><td>${city}</td>
       </tr>
       <tr>
      <td><b>State</b></td><td>${state}</td>
       </tr>
       <tr>
     <td><b>Pincode</b></td><td>${pincode}</td>
      </tr>
      </table>
         
         <c:forEach items="${list}" var="li">
         <h2>li</h2>
         
         </c:forEach>
       <spring:url value="/addCustomer" var="addURL" />
  <a href="${addURL}" role="button" ><button type="button" class="btn btn-primary">Update</button></a>
     </center>
   </body>
</html>