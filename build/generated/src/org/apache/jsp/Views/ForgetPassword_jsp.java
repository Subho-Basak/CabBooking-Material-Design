package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ForgetPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Forget Password</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../resources/Styles/Style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"demo-layout-waterfall mdl-layout mdl-js-layout\">\n");
      out.write("            <main class=\"mdl-layout__content\">\n");
      out.write("                <div class=\"page-content\">\n");
      out.write("                    <section class=\"mdl-grid tariff-banner\">\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--8-col \">\n");
      out.write("                            <h2 class=\"section-component-heading\">Recover your password</h2>\n");
      out.write("                            <p class=\"section-para\">Please enter your primary email address that you have with <b>site name</b>.</p>\n");
      out.write("                            <p class=\"section-para\">We will then send you an email with unique link to change your password.</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"mdl-cell mdl-cell--6-col \">\n");
      out.write("                                <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                                    <input class=\"mdl-textfield__input required\" type=\"text\" id=\"passwd\" onkeypress=\"resetError(this)\" onchange=\"resetError(this)\">\n");
      out.write("                                    <label class=\"mdl-textfield__label\" for=\"passwd\">Email</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <button class=\"mdl-button mdl-js-button  mdl-button--raised mdl-js-ripple-effect  mdl-button--colored\"  id=\"signin\">\n");
      out.write("                                send password recovery link\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--4-col forget-icon-bg\">\n");
      out.write("                            <h1>\n");
      out.write("                                <i class=\"material-icons\">lock</i>\n");
      out.write("                            </h1>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n");
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
