<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Update</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<a href="backprofile">
   <button>Back</button> </a>

 <spring:url value="/addCustomer" var="addURL" />
<div class="container">
 <table class="table table-bordered" style=color:"blue";>
 <tbody>
  <h2>Edit your details</h2>
  <form:form modelAttribute="customerForm" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label>First Name</label>   
    <form:input path="firstname" cssClass="form-control" id="firstname" />
   </div>
   <div class="form-group">
    <label>Last Name</label>
    <form:input path="lastname" cssClass="form-control" id="lastname" />
   </div>
   <div class="form-group">
    <label>Email ID</label>
    <form:input path="emailid" cssClass="form-control" id="emailid"/>
   </div>
   <div class="form-group">
    <label>Phonenumber</label>
    <form:input path="phonenumber" cssClass="form-control" id="phonenumber"/>
   </div>
   <div class="form-group">
    <label>Change Password</label>
    <form:input path="password" cssClass="form-control" id="password"/>
   </div>
   <div class="form-group">
   <h3>Address</h3>
    <label>Enter Flat, House no., Building, Company, Apartment</label>
    <form:input path="housenumber" cssClass="form-control" id="housenumber" />
   </div>
   <div class="form-group">
    <label>Enter Area, Street, Sector, Village</label>
    <form:input path="area" cssClass="form-control" id="area" />
   </div>
   
   <div class="form-group">
    <label>Enter Town/City</label>
    <form:input path="city" cssClass="form-control" id="city" />
   </div>
   
   <div class="form-group">
    <label>Enter State</label>
    <form:input path="state" cssClass="form-control" id="state" />
   </div>
   
   <div class="form-group">
    <label>Enter Pincode</label>
    <form:input path="pincode" cssClass="form-control" id="pincode" />
   </div>
   <a href="/updatemessage">
   <button type="submit" class="btn btn-info">Update</button>
   </a>
  
  </form:form>
   </tbody>
  </table>
 </div>
</body>
</html>