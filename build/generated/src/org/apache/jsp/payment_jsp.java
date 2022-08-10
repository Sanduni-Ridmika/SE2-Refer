package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Reservation Payment</title>\n");
      out.write("        <link href=\"http://fonts.cdnfonts.com/css/poppins\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"CSS/footer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/payment.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"reserve-header-image\">\n");
      out.write("            <h1 class=\"header-text\">Payment Method</h1>\n");
      out.write("        </div>\n");
      out.write("        <p class=\"pro\">Proceed to Pay:</p>\n");
      out.write("        \n");
      out.write("        <div class=\"form-container\" style=\"margin-top: 5px; margin-bottom: 35px\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        <!--Paypal Integration-->\n");
      out.write("        <div id=\"smart-button-container\">\n");
      out.write("            <div style=\"text-align: center;\">\n");
      out.write("                <div id=\"paypal-button-container\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://www.paypal.com/sdk/js?client-id=AZqmVQ1MBwZ6ZwYLO4vqM5YMHPJ9TwreV8KrGt-008vefR4X3J8XfGu-6KEjRj7QUFm8ErYt4PHPzdaA\" data-sdk-integration-source=\"button-factory\"></script>\n");
      out.write("        <script>\n");
      out.write("            function initPayPalButton() {\n");
      out.write("                paypal.Buttons({\n");
      out.write("                    style: {\n");
      out.write("                        shape: 'rect',\n");
      out.write("                        color: 'gold',\n");
      out.write("                        layout: 'vertical',\n");
      out.write("                        label: 'paypal',\n");
      out.write("\n");
      out.write("                    },\n");
      out.write("\n");
      out.write("                    createOrder: function (data, actions) {\n");
      out.write("                        return actions.order.create({\n");
      out.write("                            purchase_units: [{\"amount\": {\"currency_code\": \"USD\", \"value\": 1}}]\n");
      out.write("                        });\n");
      out.write("                    },\n");
      out.write("\n");
      out.write("                    onApprove: function (data, actions) {\n");
      out.write("                        return actions.order.capture().then(function (orderData) {\n");
      out.write("\n");
      out.write("                            // Available details\n");
      out.write("                            console.log('Capture result', orderData, JSON.stringify(orderData, null, 2));\n");
      out.write("\n");
      out.write("                            // Successfull message\n");
      out.write("                            const element = document.getElementById('paypal-button-container');\n");
      out.write("                            element.innerHTML = '';\n");
      out.write("                            element.innerHTML = '<h3>Your Payment is Successful <br>Thank you for your payment!</h3>';\n");
      out.write("\n");
      out.write("                            // show thank you message\n");
      out.write("\n");
      out.write("                        });\n");
      out.write("                    },\n");
      out.write("\n");
      out.write("                    onError: function (err) {\n");
      out.write("                        console.log(err);\n");
      out.write("                    }\n");
      out.write("                }).render('#paypal-button-container');\n");
      out.write("            }\n");
      out.write("            initPayPalButton();\n");
      out.write("        </script> \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer-div\">");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("        <link href=\"http://fonts.cdnfonts.com/css/poppins\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/footer.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid footer\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <p>\n");
      out.write("                            Designed to inspire rest and relaxation, our sleek, a modern hotel room features a king of facilities and incredible sea views. Designed to inspire rest and relaxation, our sleek.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-8 footer-form\">\n");
      out.write("                    <h3>Contact Us</h3>\n");
      out.write("                    <form method=\"POST\" action=\"../ContactUsForm\">\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label for=\"inputPassword\" class=\"col-sm-4 col-form-label\">Name</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <input type=\"text\" name=\"Fname\" class=\"form-control\" id=\"inputPassword\" placeholder=\"Full Name\" required>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label for=\"inputPassword\" class=\"col-sm-4 col-form-label\">Phone Number</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <input type=\"text\" name=\"PhoneNum\" class=\"form-control\" id=\"inputPassword\" placeholder=\"07X-XXXXXXX\" required>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                            <label for=\"inputPassword\" class=\"col-sm-4 col-form-label\">Message</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <textarea class=\"form-control\" name=\"Message\" id=\"exampleFormControlTextarea1\" rows=\"3\" required></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row btn-form-group\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid footer-copyright\">\n");
      out.write("            <p>Copyright: Hotel dreamy View 2022</p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
