package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservations_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write('\n');
      out.write('\n');

    String email = (String) session.getAttribute("Email");

    if (email != null) {
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Reservations</title>\n");
      out.write("        <link href=\"http://fonts.cdnfonts.com/css/poppins\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./reservations.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./navbar.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./../navbar.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./footer.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./../footer.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"./../index.jsp\">\n");
      out.write("                    <img src=\"./../ArenaGrand Logo.png\" alt=\"Logo\" width=\"300\">\n");
      out.write("                </a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarText\" aria-controls=\"navbarText\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("            <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarText\">\n");
      out.write("            <div class=\"navbar-itemlist justify-content-end\">\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 \">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"./../Services/services.jsp\">Services</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"./../Accommodations/accommodations.jsp\">Accommodations</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"./../Gallery/gallery.jsp\">Gallery</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#footer-div\">Contact Us</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"./../Signup/signup.jsp\">Sign In</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <div class=\"reserve-header-image\">\n");
      out.write("            <h1 class=\"header-text\">Reservations</h1>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container reserve \">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-6 form-header\">\n");
      out.write("                    <span>Book Now</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container form-container \">\n");
      out.write("            <div class=\"reserve2\">\n");
      out.write("                <form class=\"form\" method=\"POST\" action=\"../reservation\" >\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Select room type</label>\n");
      out.write("                         <select class=\"browser-default custom-select select_input\" name=\"roomType\">\n");
      out.write("                            <option selected> - Select room type </option>\n");
      out.write("                            <option value=\"Regular\">Regular</option>\n");
      out.write("                            <option value=\"SemiDeluxe\">Semi Deluxe</option>\n");
      out.write("                            <option value=\"Deluxe\">Deluxe</option>\n");
      out.write("                            <option value=\"King\">King</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Number of Rooms</label>\n");
      out.write("                        <input type=\"text\" class=\"Num_input\" name=\"num_of_rooms\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Full Name</label>\n");
      out.write("                        <input type=\"text\" class=\"input\" name=\"fname\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Check In</label>\n");
      out.write("                        <input id=\"date\" type=\"date\" class=\"input\" name=\"checkIn\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Check Out</label>\n");
      out.write("                        <input id=\"date\" type=\"date\" class=\"input\" name=\"checkOut\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Phone Number</label>\n");
      out.write("                        <input type=\"text\" class=\"input\" name=\"phoneNum\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Email Address</label>\n");
      out.write("                        <input type=\"text\" class=\"input\" name=\"emailAdd\" required>\n");
      out.write("                    </div>\n");
      out.write(" \n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <label>Estimated Arrival Time</label>\n");
      out.write("                        <input type=\"time\" class=\"input\" name=\"arrTime\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-6\">\n");
      out.write("                            <div class=\"input_field\">\n");
      out.write("                                <label>Adults</label>\n");
      out.write("                                <input type=\"text\" class=\"Num_input\" name=\"adults\" value=\"0\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-6\">\n");
      out.write("                            <div class=\"input_field\">\n");
      out.write("                                <label>Kids</label>\n");
      out.write("                                <input type=\"text\" class=\"Num_input\" name=\"kids\" value=\"0\" required>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <input type=\"submit\" value=\"Check Availability\" class=\"btn\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>      \n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid footer\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <div class=\"row img-footer\">\n");
      out.write("                        <img src=\"./../ArenaGrand Logo.png\" alt=\"logo\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <p>\n");
      out.write("                            Designed to inspire rest and relaxation, our sleek, a modern hotel room features a king of facilities and incredible sea views. Designed to inspire rest and relaxation, our sleek.\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <i class=\"fab fa-facebook\"></i>\n");
      out.write("                        <i class=\"fab fa-facebook\"></i>\n");
      out.write("                        <i class=\"fab fa-facebook\"></i>\n");
      out.write("                    </div>\n");
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
      out.write("            <p>Copyright: Arena Grand 2022</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
 } else {
        response.sendRedirect("registration.jsp");
    }
      out.write('\n');
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
