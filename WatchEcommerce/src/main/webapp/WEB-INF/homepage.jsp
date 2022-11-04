<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
  <title>TikTik</title>
  <style>

 body {

  background-image: url("./mainpage.jpg");

  background-repeat: no-repeat;

  background-attachment: fixed;

  background-size: cover;

} 


.navbar {
  overflow: hidden;
  background-color: aqua;
}

.navbar a {
  float: left;
  font-size: 16px;
  color: black;
  background-color: aqua;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.subnav {
  float: left;
  overflow: hidden;
}

.subnav .subnavbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: black;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .subnav:hover .subnavbtn {
  background-color: red;
}

.subnav-content {
  display: none;
  position: absolute;
  left: 0;
  background-color:white;
  width: 100%;
  z-index: 1;
}

.subnav-content a {
  float: left;
  color: #2c2222;
  text-decoration: none;
}

.subnav-content a:hover {
  background-color:red;
  color: black;
}

.subnav:hover .subnav-content {
  display: block;
}
         
.search{
 float:right;
 margin:7px;
 }
.search button{
        
 background-color: hsla(213, 31%, 6%, 0.541);
 color:black;
 float: right;
 padding: 5px 10px;
 margin-right: 16px;
 font-size: 12px;
 border: none;
 cursor: pointer;
         }
         #list{
    font-size:  1.5em;
    margin-left: 90px;
   }
 
.watches{
   display: list-item;    
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
navbar.input[type=text] {
    border: 1px solid #ccc;  
  }
  
</style>
</head>
<body>
  
 
  <div>
     <a href="logout">
    <button style=" float: right;">Logout</button>
    </a>
    <center>
  <h1 style="color:#ff8400;"> Welcome to Tik-Tik</h1>
</center>
</div>
<br/>
<br/>
<br/>
  <div class="navbar">
    <div class="subnav">
      <button class="subnavbtn">Sort By<i class="fa fa-caret-down"></i></button>
            <div class="subnav-content">
        <a href="sortvintage">Vinatge Colllection</a>
        <a href="sortlimited">Limited Edition</a>
        <a href="sortnewarrival">New Arrivals</a>
     <button class="subnav">Brand<i class="fa fa-caret-down"></i></button>
       <div class="subnav-content">
       <a href="sorttitan">Titan</a>
       <a href="sortfastrack">Fastrack</a>
       <a href="sortgshock">G-shock</a>
       <a href="sortcasio">Casio</a>
       <a href="sorthumut">Humut</a>
       <a href="sortlimitedstock">Limited Stock</a>
        </div>
        </div>
        </div>
        <div class="subnav">
          <button class="subnavbtn">Categories<i class="fa fa-caret-down"></i></button>
          <div class="subnav-content">
            <a href="sortmen">Men</a>
             <a href="sortwomen">Women</a>
            <a href="sortboys">Kids-Boys</a>
            <a href="sortgirls">Kids-Girls</a>
            <a href=sortunisex>Unisex</a>
            <a href="sortcasual">Casual Wear</a>
         <a href="sortformal">Formal Wear</a>
        <a href="sortparty">Party Wear</a>
        <a href="sortsmart">SmartWatches</a>
        <a href="sortsport">Sports Wear</a>
        <a href="sorthermetic">Hermetic Watches(waterproof)</a>
            </div>
            </div>
           
            <div class="navbar">
            <a href="list">Profile</a>
            <a href="myorders">Your orders</a>
            <a href="productlist">Add to cart</a>
            </div>
        </div>
     <form action="/searchList" method="post" style="float:right">
<input type="text" name="keyword" placeholder="search for watches">
<input type="submit" value="search">
</form>
<c:forEach items="${searchList}" var="product" >
    <div class="column">
    <tr>
  <a href="watch1?id=${product.id}">
  <img src="./image/${product.image}" style="height: 300px;width:200px"/>
  </a>
    <h4> Product Name:${product.product_name}</h4>
    <h4>Brand Name:${product.brand_name}</h4>
    <h4>  Price:${product.price}</h4>
     <h4> Ratings:${product.rating}</h4>
     <h4> Discount Avaliable:${product.discountedpercentage}%</h4>
      </tr>
     <div class="column">
     </div>
  </div>
</c:forEach>
            </div>
        </div>

<center>  
 <c:forEach items="${productList}" var="product" >
    <div class="column">
    <tr>
  <a href="watch1?id=${product.id}">
  <img src="./image/${product.image}" style="height: 300px;width:200px"/>
  </a>
    <h4> Product Name:${product.product_name}</h4>
    <h4>Brand Name:${product.brand_name}</h4>
    <h4>  Price:${product.price}</h4>
     <h4> Ratings:${product.rating}</h4>
     <h4> Discount Avaliable:${product.discountedpercentage}%</h4>
      </tr>
     <div class="column">
     </div>
  </div>
</c:forEach>
</center>
       
</body>
</html>