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
    <img class="img" src="img/hotel2.jpg">
  <div class="center">
      <div class="title"><h1>Hotel Dreamy View</h1></div>
    <div class="sub_title">We believe leisure is an art</div>
    <div class="btns">
            <button><a href="./reservations.jsp" class="btn btn-primary">Book Now</a></button>
    </div>
  </div>
    
    <div class="container">
  <div class="box">
    <img src="https://source.unsplash.com/1000x800">
    <span>Regular</span>
  </div>
  <div class="box">
    <img src="https://source.unsplash.com/1000x802">
    <span>Semi Deluxe</span>
  </div>
  <div class="box">
    <img src="https://source.unsplash.com/1000x804">
    <span>Deluxe</span>
  </div>
  <div class="box">
    <img src="https://source.unsplash.com/1000x806">
    <span>King</span>
  </div>
</div>
    
    <div id="footer-div"><%@include file="./footer.jsp"%></div>
    
</body>
</html>

