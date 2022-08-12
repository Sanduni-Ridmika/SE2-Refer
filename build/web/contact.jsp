<%-- 
    Document   : contact
    Created on : 11-Aug-2022, 9:20:54 PM
    Author     : Sanduni Ridmika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Contact </title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="http://fonts.cdnfonts.com/css/poppins" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="CSS/contact.css" />
    </head>
    <body>
        <div id="navbar-div"><%@include file="./navbar.jsp"%></div>
        <div class="container">
	<div class="row">
			<h2 style="text-align:center">We'd love to hear from you!</h2>
	</div>
            <form method="POST" action="SendEmail">
                <div class="row input-container">
                    <div class="col-xs-12">
                        <div class="styled-input wide">
					<input type="text" name="Fname" id="inputPassword"  required />
					<label for="inputPassword">Name</label> 
				</div>
			</div>
			<div class="col-md-6 col-sm-12">
				<div class="styled-input">
					<input type="text" name="PhoneNum" id="inputPassword"  required />
					<label for="inputPassword">Phone Number</label> 
				</div>
			</div>
			<div class="col-md-6 col-sm-12">
				<div class="styled-input" style="float:right;">
					<input type="text" name="email" id="inputPassword"  required />
					<label for="inputPassword">Email</label> 
				</div>
			</div>
			<div class="col-xs-12">
				<div class="styled-input wide">
					<textarea name="Message" id="exampleFormControlTextarea1" rows="3" required></textarea>
					<label for="inputPassword">Message</label>
				</div>
			</div>
			<div class="col-xs-12">
                                <button type="submit" class="button1">Submit</button>
			</div>
                </div>
            </form>
        </div>
    </body>
</html>
