package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.User;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css\"/>\n");
      out.write("    <link href=\"CSS/welcome.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("   </head>\n");
      out.write("<body>\n");
      out.write("    <img class=\"img\" src=\"img/hotel2.jpg\">\n");
      out.write("  <div class=\"center\">\n");
      out.write("      <div class=\"title\"><h1>Hotel Dreamy View</h1></div>\n");
      out.write("    <div class=\"sub_title\">We believe leisure is an art</div>\n");
      out.write("    <div class=\"btns\">\n");
      out.write("            <button><a href=\"./reservations.jsp\" class=\"btn btn-primary\">Book Now</a></button>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("  <div class=\"box\">\n");
      out.write("    <img src=\"https://source.unsplash.com/1000x800\">\n");
      out.write("    <span>Regular</span>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"box\">\n");
      out.write("    <img src=\"https://source.unsplash.com/1000x802\">\n");
      out.write("    <span>Semi Deluxe</span>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"box\">\n");
      out.write("    <img src=\"https://source.unsplash.com/1000x804\">\n");
      out.write("    <span>Deluxe</span>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"box\">\n");
      out.write("    <img src=\"https://source.unsplash.com/1000x806\">\n");
      out.write("    <span>King</span>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    <div id=\"footer-div\">");
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
      out.write("                    <form method=\"POST\" action=\"SendEmail\">\n");
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
      out.write("                        \n");
      out.write("                        <div class=\"form-group-row\">\n");
      out.write("                        <label for=\"inputPassword\" class=\"col-sm-4 col-form-label\">Email</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <input type=\"text\" name=\"email\" class=\"form-control\" id=\"inputPassword\" placeholder=\"someone@something.com\" required>\n");
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
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
