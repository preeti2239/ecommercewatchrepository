<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Antique Vintage</title>
</head>
<style>
body {

  background-image: url("./image/Watch bg.jpg");

  background-repeat: no-repeat;

  background-attachment: fixed;

  background-size: cover;

}

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
    
    .rightpane{
       
        width: 27%;
       min-width: 250px;
       height: available;
       min-height: 400px;
       float: left;
       border-collapse: collapse;
    }
    
    .toppane{
        width: available;
        height: 100px;
        border-collapse: collapse;
    }
    </style>
</head>
<body>
    <div class="container">
        <div class="toppane">
            <a href="back">
            
            <button>Back</button> </a>
            <h2 style="text-align: center;color:red"> <u>Antique Vintage</u></h2></div>
          
        <div class="leftpane">
            <img src="./image/25.Antique Vintage.jpg" style="height :400px;width: 300px"/>
            </div>

<center>
        <div class="middlepane">
        <br/><br/><br/>
        <table>
            <tr> 
                <td><b>Brand Name:</b>${product.brand_name}</td>
                <td><b>Waterproof:</b>${product.waterproof}</td>
                  </tr>
                        
        <tr>
            <td><b>Display:</b>${product.display}</td>
            <td><b>Case Thickness:</b>${product.case_thikness}</td>
            </tr>
            <tr>
            <td><b>Case Daimeter:</b>${product.case_daimeter}</td>
            <td><b>Strap Width:</b>${product.strap_width}</td>           
        </tr>
        
        <tr>
            <td><b>Case Material:</b>${product.case_material}</td>
            <td><b>Bezel Material:</b>${product.bezel_material}</td>
            </tr>
             <tr>
            <td><b>Strap Matetrial:</b>${product.strap_material} </td>
            <td><b>Case Shape:</b>${product.case_shape}</td>
        </tr>
        <tr>
            
            <td><b> Movemnet:</b>${product.movement}</td>
            <td><b>Properties:</b>${product.properties}</td>
        </tr>
        <tr>
        <td> <h2>Price:${product.price} &#8360</h2></td>
        <td><b>&#128666 Shipping days:<b>${product.delivery_days}</td>
        </tr>
        	
  </table>
 </center>
        </div>
         <div class="rightpane" style="text-align: center;">
            <br/><br/>
             <td><h2>&#10039 Discount:</h2>${product.discountedpercentage}%</td>
             <br/><br/>
          
</div>


</body>
</html>