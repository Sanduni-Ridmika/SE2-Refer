<%-- 
    Document   : userprofile
    Created on : 11-Aug-2022, 5:04:32 PM
    Author     : Sanduni Ridmika
--%>

<%@page import="Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% User user = (User) session.getAttribute("logUser");
    if(user==null){
        response.sendRedirect("index.jsp");
    }
%>

<html><head>
        <title> Profile </title>
     <link href="CSS/userprofile.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="navbar-div"><%@include file="./navbar.jsp"%></div>
        <h3 class = "title-head"> User Profile </h3>
        <div class="row">
            <div class="column left" style="background-color:#e6e6e6;">
                <h2>Name</h2> 
            </div>
            <div class="column right" style="background-color:#f2f2f2;">
                <h3> <%= user.getName() %> </h3>
            </div>
        </div>
            <br>
        <div class="row">
            <div class="column left" style="background-color:#e6e6e6;">
                <h2>Account ID</h2> 
            </div>
            <div class="column right" style="background-color:#f2f2f2;">
                <h3> <%= user.getId() %> </h3>
            </div>
        </div>
            <br>
        <div class="row">
            <div class="column left" style="background-color:#e6e6e6;">
                <h2>Email</h2> 
            </div>
            <div class="column right" style="background-color:#f2f2f2;">
                <h3> <%= user.getEmail() %> </h3>
            </div>
        </div>
            <br>
        <div class="row">
            <div class="column left" style="background-color:#e6e6e6;">
                <h2>Password</h2> 
            </div>
            <div class="column right" style="background-color:#f2f2f2;">
                <h3 type="password" value="FakePSW" id="myInput"><%= user.getPassword() %> </h3>
               <%-- <input type="checkbox" onclick="myFunction()">&nbsp; Show Password--%>
            </div>
        </div>
            <br>
            <button class="button1"><a href="LogoutServlet">Log Out</a></button>
            <br> <br>
            <script>
                function myFunction() {
                    var x = document.getElementById("myInput");
                    if (x.type === "password") {
                        x.type = "text";
                    } else {
                        x.type = "password";
                    }
                }
                        </script>
    </body>
</html>