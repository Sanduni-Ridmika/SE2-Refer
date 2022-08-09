<%-- 
    Document   : booking
    Created on : 9-Aug-2022, 12:27:37 AM
    Author     : Sanduni Ridmika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Room Booking</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="CSS/booking.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <section class = "banner">
            <div class = "card-container">
                <div class = "card-content">
                    <h1>Booking Details</h1>  
                    <form action="AddServlet" method="post">  
                    <table>
                        <tr class = "form-row"><td><input type="text" placeholder="Arrival DD/MM/YY" name="checkin" required/></td>
                            <td><input type="text" placeholder="Depature DD/MM/YY" name="checkout" required/></td>
                        </tr>
                        <tr class = "form-row">
                            <td>  
                            <select name="room" style="width:170px" required>  
                                <option>Delux</option>  
                                <option>Luxury</option>  
                            </select>
                            </td>
                            <td>  
                                <select name="person" style="width:160px" required>  
                                    <option>1</option>  
                                    <option>2</option>  
                                    <option>3</option> 
                                </select>
                            </td>
                        </tr> 
                        <tr class = "form-row"><td>  
                            <select name="child" style="width:60px" required> 
                                <option>0</option>  
                                <option>1</option>  
                                <option>2</option>  
                            </select>
                        </td></tr> 
                        <tr class = "sub"><td><input type="submit" value="Book"/></td></tr>  
                    </table>  
                    </form>  
                </div>
            </div>
        </section>
    </body>
</html>
