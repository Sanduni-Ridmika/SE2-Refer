<%-- 
    Document   : welcome
    Created on : 8-Aug-2022, 4:22:46 PM
    Author     : Sanduni Ridmika
--%>

<%@page import="Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
    <link href="CSS/welcome.css" rel="stylesheet" type="text/css"/>
   </head>
<body>
    <div id="navbar-div"><%@include file="./navbar.jsp"%></div>
    <img class="img" src="img/hotel12.jpg">
  <div class="center">
    <div class="sub_title">We believe leisure is an art</div>
    <br><br>
            <button class = "button1"><a href="./reservations.jsp" > Book Now</a></button>
  </div>
    
    <div class="container">
  <div class="box">
      <a href="reservations.jsp" ><img src="img/regular.jpg"> </a>
    <span>Regular</span>
  </div>
  <div class="box">
      <a href="reservations.jsp" > <img src="img/semi-deluxe.jpg"> </a>
      <div class="centered-text"> Semi Deluxe</div>
  </div>
  <div class="box">
      <a href="reservations.jsp" > <img src="img/deluxe.jpg"> </a>
    <span>Deluxe</span>
  </div>
  <div class="box">
      <a href="reservations.jsp" > <img src="img/king.jpg"> </a>
    <span>King</span>
  </div>
</div>
    
    <div id="footer-div"><%@include file="./footer.jsp"%></div>
    
</body>
</html>

