package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Sign up</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../resources/Styles/Style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"demo-layout-waterfall mdl-layout mdl-js-layout\">\n");
      out.write("<main class=\"mdl-layout__content\">\n");
      out.write("    <div class=\"page-content\">\n");
      out.write("        <div class=\"mdl-grid signup-grid\">\n");
      out.write("            <div class=\"mdl-cell mdl-cell--6-col signup-left-side\">\n");
      out.write("                <div>\n");
      out.write("                    <h3>Make your booking more easy by creating an account</h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mdl-cell mdl-cell--6-col signup-right-side\">\n");
      out.write("                <div class=\"mdl-grid signup-content\">\n");
      out.write("                    <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("                            <h4 class=\"\">Create an account</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mdl-cell mdl-cell--6-col\">\n");
      out.write("                        <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                            <input class=\"mdl-textfield__input\" type=\"text\" id=\"fname\">\n");
      out.write("                            <label class=\"mdl-textfield__label\" for=\"fname\">First name</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mdl-cell mdl-cell--6-col\">\n");
      out.write("                        <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                            <input class=\"mdl-textfield__input\" type=\"text\" id=\"lname\">\n");
      out.write("                            <label class=\"mdl-textfield__label\" for=\"lname\">Last name</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("                        <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                            <input class=\"mdl-textfield__input\" type=\"text\" id=\"addrs\">\n");
      out.write("                            <label class=\"mdl-textfield__label\" for=\"addrs\">Address</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mdl-cell mdl-cell--6-col\">\n");
      out.write("                        <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                            <input class=\"mdl-textfield__input\" type=\"text\" id=\"email\">\n");
      out.write("                            <label class=\"mdl-textfield__label\" for=\"email\">Email</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mdl-cell mdl-cell--6-col\">\n");
      out.write("                        <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                            <input class=\"mdl-textfield__input\" type=\"text\" pattern=\"-?[0-9]*(\\.[0-9]+)?\" id=\"contct\">\n");
      out.write("                            <label class=\"mdl-textfield__label\" for=\"contct\">Contact</label>\n");
      out.write("                            <span class=\"mdl-textfield__error\">Contact must be a number!</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("                        <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                            <input class=\"mdl-textfield__input\" type=\"password\" id=\"passwd\">\n");
      out.write("                            <label class=\"mdl-textfield__label\" for=\"passwd\">Choose password</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("                        <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                            <input class=\"mdl-textfield__input\" type=\"password\" id=\"passwdConfirm\">\n");
      out.write("                            <label class=\"mdl-textfield__label\" for=\"passwdConfirm\">Confirm password</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mdl-cell mdl-cell--12-col text-right\">\n");
      out.write("                        <button id=\"signup\" class=\"mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--colored\">\n");
      out.write("                            create\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</main>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"../resources/Scripts/jquery-2.1.1.js\"></script>\n");
      out.write("<script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(document).ready( function() {\n");
      out.write("        $('#signup').click( function() {\n");
      out.write("            alert();\n");
      out.write("            $.ajax({\n");
      out.write("                url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sesson/signup.do',\n");
      out.write("                type: 'POST',\n");
      out.write("                data: {\n");
      out.write("                    fname: $('#fname').val(),\n");
      out.write("                    lname: $('#lname').val(),\n");
      out.write("                    addrs: $('#addrs').val(),\n");
      out.write("                    email: $('#email').val(),\n");
      out.write("                    contct: $('#contct').val(),\n");
      out.write("                    passwd: $('#passwd').val()\n");
      out.write("                },\n");
      out.write("                \n");
      out.write("                success: function(response) {\n");
      out.write("                    console.log(response);\n");
      out.write("                },\n");
      out.write("                error: function(response, error) {\n");
      out.write("                    alert(error + \": \" + response);\n");
      out.write("                }   \n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
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
