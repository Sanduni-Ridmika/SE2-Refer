<%-- 
    Document   : footer
    Created on : 9-Aug-2022, 12:00:56 AM
    Author     : Sanduni Ridmika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/footer.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container-fluid footer">
            <div class="row">
                <div class="col-4">
                    <div class="row">
                        <p>
                            Designed to inspire rest and relaxation, our sleek, a modern hotel room features a king of facilities and incredible sea views. Designed to inspire rest and relaxation, our sleek.
                        </p>
                    </div>
                </div>
                <div class="col-8 footer-form">
                    <h3>Contact Us</h3>
                    <form method="POST" action="ContactUsForm">
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-4 col-form-label">Name</label>
                        <div class="col-sm-8">
                            <input type="text" name="Fname" class="form-control" id="inputPassword" placeholder="Full Name" required>
                        </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-4 col-form-label">Phone Number</label>
                        <div class="col-sm-8">
                            <input type="text" name="PhoneNum" class="form-control" id="inputPassword" placeholder="07X-XXXXXXX" required>
                        </div>
                        </div>
                        <div class="form-group row">
                            <label for="inputPassword" class="col-sm-4 col-form-label">Message</label>
                        <div class="col-sm-8">
                            <textarea class="form-control" name="Message" id="exampleFormControlTextarea1" rows="3" required></textarea>
                        </div>
                        </div>
                        <div class="form-group row btn-form-group">
                            <div class="col-sm-12">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="container-fluid footer-copyright">
            <p>Copyright: Hotel Dreamy View 2022</p>
        </div>
    </body>
</html>
