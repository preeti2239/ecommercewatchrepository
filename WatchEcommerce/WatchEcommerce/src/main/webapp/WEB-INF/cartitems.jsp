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
<td><h4>PRODUCT NAME</h4></td>
<td><h4>SUBTOTAL</h4></td>
<td> </td>

</tr>
    <tr>
     <c:set var="total" value="${0}"/>
   <c:forEach items="${cartItemsList}" var="addproduct" >
 <td>${addproduct.product_name}</td>
 
 <td>${addproduct.price-((addproduct.discountedprice/100*addproduct.price))} </td>
 </tr>
 <c:set var="total" value="${total=total+addproduct.price-((addproduct.discountedprice/100*addproduct.price))}"/>
 
 </c:forEach>
     </tr>
 <tr>
 <h4>Including all discounted price and offers your order summary</h4>
 
<td align='center' bgcolor='lightblue' height='20'>Total: ${total } </td></td>
	             <td align='center' bgcolor='lightblue' height='20'></td>
	             
	             </tr> 
	             </table>
	             </td>
	          </tr>
	        
	         </table>

    <a href="placingorder" class="col-md-1">
                <button type="button" class="btn btn-primary">Place Order</button>
                </a>
</body>
</html>