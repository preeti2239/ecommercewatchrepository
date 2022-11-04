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
 <a href="back">
            <button>Back</button> </a>
<h2>Items you order</h2>
<br> 
<c:forEach items="${addproduct}" var="product">
<td><li>${product.product_name}</li> </td>
 </tr>
<c:set var="sum" value="${sum=sum+product.price-((product.discountedpercentage/100*product.price))}"/>
  </c:forEach>

Total: ${sum }
</body>
</html>