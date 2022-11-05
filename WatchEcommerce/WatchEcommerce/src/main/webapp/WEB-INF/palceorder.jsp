<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.container{
    width: available;
    height: available;
}

    .leftpane{
        width: 33%;
        min-width: 350px;
        height: available;
        min-height: 400px;
        float: left;
        border-collapse: collapse;
    }
    
    .middlepane{
       width: 40%;
       min-width: 400px;
       height: available;
       min-height: 400px;
       float: left;
       border-collapse: collapse;
    }
    .row::after {
  content: "";
  clear: both;
  display: flex;
}
.column {
  float: left;
  flex: 33.33%;
  padding: 50px;
}
</style>
</head>
<body>
      <h2  style="text-align:center;color:red" >Thanks for placing order</h2>


 
       <a href="/homepage" class="col-md-1">            
 <input name='btnContinue' type='submit'value='Continue Shopping'>
</div>
</div>
</body>
</html>