<%-- 
    Document   : reservations
    Created on : 9-Aug-2022, 1:09:29 PM
    Author     : Sanduni Ridmika
--%>

    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Reservations</title>
        <link href="http://fonts.cdnfonts.com/css/poppins" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link href="CSS/reservations.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/footer.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container reserve ">
            <div class="row">
                <div class="col-6 form-header">
                    <span>Book Yours Now!</span>
                </div>
            </div>
        </div>

        <div class="container form-container ">
            <div class="reserve2">
                <form class="form" method="POST" action="../reservation" >
                    <div class="input_field">
                        <label>Select room type</label>
                         <select class="browser-default custom-select select_input" name="roomType">
                            <option selected> - Select room type </option>
                            <option value="Regular">Regular</option>
                            <option value="SemiDeluxe">Semi Deluxe</option>
                            <option value="Deluxe">Deluxe</option>
                            <option value="King">King</option>
                        </select>
                    </div>
                    <div class="input_field">
                        <label>Number of Rooms</label>
                        <input type="text" class="Num_input" name="num_of_rooms" required>
                    </div>
                    <div class="input_field">
                        <label>Full Name</label>
                        <input type="text" class="input" name="fname" required>
                    </div>
                    <div class="input_field">
                        <label>Check In</label>
                        <input id="date" type="date" class="input" name="checkIn" required>
                    </div>
                    <div class="input_field">
                        <label>Check Out</label>
                        <input id="date" type="date" class="input" name="checkOut" required>
                    </div>
                    <div class="input_field">
                        <label>Phone Number</label>
                        <input type="text" class="input" name="phoneNum" required>
                    </div>
                    <div class="input_field">
                        <label>Email Address</label>
                        <input type="text" class="input" name="emailAdd" required>
                    </div>
                    </div>
                    <div class="input_field">
                        <button><a href="./payment.jsp" class="btn">Proceed To Pay</a></button>
                    </div>
                    
                </form>
            </div>
        </div>   
        <br><br>
        
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
                    <form method="POST" action="../ContactUsForm">
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
            <p>Copyright: Hotel dreamy View 2022</p>
        </div>
        
        
    </body>
</html>
