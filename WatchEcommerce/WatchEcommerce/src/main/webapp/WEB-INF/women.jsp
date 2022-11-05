<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Women Watches</title>
<style>
body {

  background-image: url("./image/Watch bg.jpg");

  background-repeat: no-repeat;

  background-attachment: fixed;

  background-size: cover;

}
.row::after {
  content: "";
  clear: both;
  display: flex;
}

.column {
  float: left;
  flex: 33.33%;
  padding: 30px;
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
    }
</style>
</head>
<body>
   <a href="logout">
    <button style=" float: right;">Logout</button>
    </a>
<a href="back">
   <button>Back</button> </a>
<center>
<h1 style="color:red"><u>Women Watches</u></h1>
</center>
<div class="container">
 <div class="leftpane">
 <h3><u>Product Name</u></h3>
 <ol>
<c:forEach items="${listOfWomen}" var="product" >
 <h4><li> ${product}</li></h4><br><br>
</c:forEach>
</ol>
</div>
<center>
<div class="middlepane">
 <center>
 <div class="row">
  
  <img src="./image/13.Fossil.jpg" style="height: 100px;"/>
  </a>
  </div>
  <div class="row">
  
    <img src="./image/14.Titan Raga Aurora - Copy.jpg" style="height:100px ;"/>
    </a>
   
  </div>
    <div class="row">
   
      <img src="./image/15.Raga-titan.jpg" style="height:100px ;"/>
      </a>
    </div>
    
     <div class="row">
   
      <img src="./image/16.Swiss_eagle.jpg" style="height:100px ;"/>
      </a>
    </div>
   
    <div class="row">
     
    <img src="./image/17.timex-original.jpg" style="height:100px ;"/>
    </a>
    
    <div class="row">
  
      <img src="./image/18.Fastrack Trendies Analog.jpg" style="height: 100px;"/>  
      </a>
    </div>
      <div class="row">
           
           <img src="./image/31.Samsung_sportswear.webp" style="height: 100px;"/>   
          
         </a>
 
  </div>
   </div>
             <div class="row">
            
            <img src="./image/32.G-shock sports.jpg" style="height: 100px;"/>
            
           </a>
          </div>
          
   <div class="row">
   
   <img src="./image/42.Daniel.jpg" style="height:100px ;"/>
  </a>
  
  </div>
   <div class="row">
    
      <img src="./image/43.Titan White.jpg" style="height:100px ;"/>
    
      </a>
      
    </div>



       
         
<div class="row">
         
          <img src="./image/44.corum.jpg" style="height:100px;"/>
         
        </a>
       </a>
        </div>
        

</div>
</center>

   <div class="rightpane">
             <center>
             <br><br><br>
            
            </center>
             </div>
</body>
</html>