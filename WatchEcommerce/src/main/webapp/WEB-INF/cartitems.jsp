<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.Date" %>
    <%@page import="java.util.Enumeration" %>
    <%@page import="javax.servlet.http.HttpSession"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Cart Page</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>

<h7 align='right'><b>Date:</b><%=new Date()%></h7><br><hr>
<table style="border:0; align:center; bordercolor:maroon ;width:90%">
<tr>
<td>PRODUCT NAME</td>
<td>Your subtotal for the product</td>
<td> </td>

</tr>
    <tr>
    <ol>
    <c:set var="sum" value="${0}"/>
   <c:forEach items="${addproduct}" var="addproduct" >
 <td><li>${addproduct.product_name}</li> </td>
 <td><li> ${addproduct.price-((addproduct.discountedpercentage/100*addproduct.price))} </li> </td>
 </tr>
<c:set var="sum" value="${sum=sum+addproduct.price-((addproduct.discountedpercentage/100*addproduct.price))}"/>
  </c:forEach>
   </tr>
  <br><br><br>
 <tr>
 <h4>Including all discounted price and offers your order total</h4>
 
<td align='center' bgcolor='lightblue' height='20'>Total: ${sum } </td></td>
	             <td align='center' bgcolor='lightblue' height='20'></td>
	             
	             </tr> 
	             </table>
	             </td>
	          </tr>
	        
	         </table>
	         
	 <spring:url value="/addProduct/placeorder" var="remove" />
       <a href="/addProduct/placeorder" class="col-md-1">
                <button type="button" class="btn btn-primary"> Place order</button>
                </a>



</body>
</html>