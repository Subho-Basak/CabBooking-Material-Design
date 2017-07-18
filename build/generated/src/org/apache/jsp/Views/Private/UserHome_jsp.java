package org.apache.jsp.Views.Private;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cb.model.User;

public final class UserHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    if( null == request.getSession(false) || null == request.getSession(false).getAttribute("account")) {
        response.sendRedirect(request.getContextPath() + "/Views/Login.jsp");
        return;
    }

      out.write('\n');
      out.write('\n');
 User user = (User) request.getSession(false).getAttribute("account"); 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>User account</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../resources/Styles/Account.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"demo-layout-waterfall mdl-layout mdl-js-layout\">\n");
      out.write("            <header class=\"mdl-layout__header mdl-layout__header--waterfall\">\n");
      out.write("                <!-- Top row, always visible -->\n");
      out.write("                <div class=\"mdl-layout__header-row\">\n");
      out.write("                    <!-- Title -->\n");
      out.write("                    <span class=\"mdl-layout-title\">Title</span>\n");
      out.write("                    <div class=\"mdl-layout-spacer\">\n");
      out.write("                        <div class=\"search-group\">\n");
      out.write("                            <div><i class=\"material-icons\">search</i></div>\n");
      out.write("                            <div class=\"input-wrapper\"><input type=\"text\" class=\"search-input\" placeholder=\"Search\"/></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"user-acc-group\">\n");
      out.write("                            <i class=\"material-icons\">account_circle</i>\n");
      out.write("                            <span>");
      out.print( user.getFirstName() );
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <!-- Bottom row, not visible on scroll -->\n");
      out.write("                <div class=\"mdl-layout__header-row\">\n");
      out.write("                    <div class=\"mdl-layout-spacer\"></div>\n");
      out.write("                    <!-- Navigation -->\n");
      out.write("                    <nav class=\"mdl-navigation\">\n");
      out.write("                        <a class=\"mdl-navigation__link\" href=\"\">Link</a>\n");
      out.write("                        <a class=\"mdl-navigation__link\" href=\"\">Link</a>\n");
      out.write("                        <a class=\"mdl-navigation__link\" href=\"\">Link</a>\n");
      out.write("                        <a class=\"mdl-navigation__link\" href=\"\">Link</a>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"mdl-layout__drawer\">\n");
      out.write("                <span class=\"mdl-layout-title\">Title</span>\n");
      out.write("                <nav class=\"mdl-navigation\">\n");
      out.write("                    <a class=\"mdl-navigation__link\" href=\"\"><i class=\"material-icons\">assignment</i> Book cab</a>\n");
      out.write("                    <a class=\"mdl-navigation__link\" href=\"\"><i class=\"material-icons\">show_chart</i> Booking status</a>\n");
      out.write("                    <a class=\"mdl-navigation__link\" href=\"\"><i class=\"material-icons\">assignment</i> Settings</a>\n");
      out.write("                    <a class=\"mdl-navigation__link\" href=\"\"><i class=\"material-icons\">history</i> History</a>\n");
      out.write("                    <hr>\n");
      out.write("                    <a class=\"mdl-navigation__link\" href=\"\"><i class=\"material-icons\">settings</i> Settings</a>\n");
      out.write("                    <a class=\"mdl-navigation__link\" href=\"\"><i class=\"material-icons\">feedback</i> Send feedback</a>\n");
      out.write("                    <a class=\"mdl-navigation__link\" href=\"\"><i class=\"material-icons\">help</i> Help</a>\n");
      out.write("                 \n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <main class=\"mdl-layout__content\">\n");
      out.write("                <div class=\"page-content main-page\">\n");
      out.write("                    <h4>Nothing here yet</h1>\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"../resources/Scripts/jquery-2.1.1.js\"></script>\n");
      out.write("        <script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
