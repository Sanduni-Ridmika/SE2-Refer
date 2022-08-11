<%-- 
    Document   : payment
    Created on : 9-Aug-2022, 6:50:06 PM
    Author     : Sanduni Ridmika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Reservation Payment</title>
        <link href="http://fonts.cdnfonts.com/css/poppins" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <link href="CSS/footer.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/payment.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        <div id="navbar-div"><%@include file="./navbar.jsp"%></div>
        <br><br><br><br>
        <div class="reserve-header-image">
            <h1 class="header-text">Payment Method</h1>
        </div>
        <p class="pro">Proceed to Pay:</p>
        
        <div class="form-container" style="margin-top: 5px; margin-bottom: 35px">
            
            
        <!--Paypal Integration-->
        <div id="smart-button-container">
            <div style="text-align: center;">
                <div id="paypal-button-container"></div>
            </div>
        </div>
        <script src="https://www.paypal.com/sdk/js?client-id=AZqmVQ1MBwZ6ZwYLO4vqM5YMHPJ9TwreV8KrGt-008vefR4X3J8XfGu-6KEjRj7QUFm8ErYt4PHPzdaA" data-sdk-integration-source="button-factory"></script>
        <script>
            function initPayPalButton() {
                paypal.Buttons({
                    style: {
                        shape: 'rect',
                        color: 'gold',
                        layout: 'vertical',
                        label: 'paypal',

                    },

                    createOrder: function (data, actions) {
                        return actions.order.create({
                            purchase_units: [{"amount": {"currency_code": "USD", "value": 1}}]
                        });
                    },

                    onApprove: function (data, actions) {
                        return actions.order.capture().then(function (orderData) {

                            // Available details
                            console.log('Capture result', orderData, JSON.stringify(orderData, null, 2));

                            // Successfull message
                            const element = document.getElementById('paypal-button-container');
                            element.innerHTML = '';
                            element.innerHTML = '<h3>Your Payment is Successful <br>Thank you for your payment!</h3>';

                            // show thank you message

                        });
                    },

                    onError: function (err) {
                        console.log(err);
                    }
                }).render('#paypal-button-container');
            }
            initPayPalButton();
        </script> 
        
        </div>
        <div id="footer-div"><%@ include file="./footer.jsp"%></div>
</body>
</html>
