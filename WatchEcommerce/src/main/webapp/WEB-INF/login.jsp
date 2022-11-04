<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<div align="center">
<h1>Please Login Here</h1>
<form action="authenticate" method="post" name="login">
<input type="hidden" name="action" value="login"/>
<c:if test="${not empty error}">
<h4>${error}</h4>
</c:if>
Enter UserName (EmailId)    <input type="email" name="emailid" required/><br><br>
Enter Password      <input type="password" name="password"pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required/><br><br>

<input type="submit" name="Login"/>

</form>
</div>

</body>
</html>