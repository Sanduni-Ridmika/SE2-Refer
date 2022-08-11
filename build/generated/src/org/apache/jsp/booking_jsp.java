package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class booking_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Room Booking</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"CSS/booking.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class = \"banner\">\n");
      out.write("            <div class = \"card-container\">\n");
      out.write("                <div class = \"card-content\">\n");
      out.write("                    <h1>Booking Details</h1>  \n");
      out.write("                    <form action=\"AddServlet\" method=\"post\">  \n");
      out.write("                    <table>\n");
      out.write("                        <tr class = \"form-row\"><td><input type=\"text\" placeholder=\"Arrival DD/MM/YY\" name=\"checkin\" required/></td>\n");
      out.write("                            <td><input type=\"text\" placeholder=\"Depature DD/MM/YY\" name=\"checkout\" required/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr class = \"form-row\">\n");
      out.write("                            <td>  \n");
      out.write("                            <select name=\"room\" style=\"width:170px\" required>  \n");
      out.write("                                <option>Delux</option>  \n");
      out.write("                                <option>Luxury</option>  \n");
      out.write("                            </select>\n");
      out.write("                            </td>\n");
      out.write("                            <td>  \n");
      out.write("                                <select name=\"person\" style=\"width:160px\" required>  \n");
      out.write("                                    <option>1</option>  \n");
      out.write("                                    <option>2</option>  \n");
      out.write("                                    <option>3</option> \n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr> \n");
      out.write("                        <tr class = \"form-row\"><td>  \n");
      out.write("                            <select name=\"child\" style=\"width:60px\" required> \n");
      out.write("                                <option>0</option>  \n");
      out.write("                                <option>1</option>  \n");
      out.write("                                <option>2</option>  \n");
      out.write("                            </select>\n");
      out.write("                        </td></tr> \n");
      out.write("                        <tr class = \"sub\"><td><input type=\"submit\" value=\"Book\"/></td></tr>  \n");
      out.write("                    </table>  \n");
      out.write("                    </form>  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
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
