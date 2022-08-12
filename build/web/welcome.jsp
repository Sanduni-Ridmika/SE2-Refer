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
      <title> Home </title>
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
    <div class="container11">
        <a href="reservations.jsp" >
            <div class="card11">
                <div class="face face1">
                    <div class="content11">
                        <p class="cardinside">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="face face2">
                    <h2>Regular</h2>
                </div>
            </div>
        </a>
        
        <a href="reservations.jsp" >
            <div class="card11">
                <div class="face face1">
                    <div class="content11">
                        <p class="cardinside">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="face face2">
                    <h2>Semi-Deluxe</h2>
                </div>
            </div>
        </a>
        
        <a href="reservations.jsp" >
            <div class="card11">
                <div class="face face1">
                    <div class="content11">
                        <p class="cardinside">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="face face2">
                    <h2>Deluxe</h2>
                </div>
            </div>
        </a>
        
        <a href="reservations.jsp" >
            <div class="card11">
                <div class="face face1">
                    <div class="content11">
                        <p class="cardinside">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>
                </div>
                <div class="face face2">
                    <h2>King</h2>
                </div>
            </div>
        </a>
    </div>    
    <div id="footer-div"><%@include file="./footer.jsp"%></div>
    
</body>
</html>

