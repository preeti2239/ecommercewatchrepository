<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Page</title>
</head>
<body>
<form method="post" action="details">
<c:if test="${not empty error}">
<h4>${error}</h4>
</c:if>
<div align="center">
<h2 style="color: Red; font-style: Gerogia"> Registration Form</h2>


<b>
Enter First Name   <input type="text" name="firstname">
</b><br><br/>
<b >
Enter Last Name   <input type="text" name="lastname">
</b><br><br/>
<b>
Enter E-mail Id  <input type="email" name="emailid" required>  
</b><br><br/>
<b >
Enter Phone Number <input type="text" name="phonenumber"  title="Phone number with 7-9 and remaing 9 digit with 0-9" pattern="[0-9]{10}"> 
</b><br><br/>
<b>
Address:
Enter Flat, House no., Building, Company, Apartment<input type="text" name="housenumber">
</b><br><br/>
Enter Area, Street, Sector, Village<input type="text" name="area">
</b><br><br/>
Enter Town/City<input type="text" name="city">
</b><br><br/>
Enter State<input type="text" name="state">
 </b><br><br/>
 Enter Pincode<input type="text" name="pincode">
<b>
 Password      <input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required/>
</b><br><br/>
<b >
Gender:  <input type="text" name="gender">
</b><br><br/>
<input type="submit" value="submit"/>
</div>
</form>

</body>
</html>