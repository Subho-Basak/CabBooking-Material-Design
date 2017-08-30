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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Sign up</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../resources/Styles/Style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"demo-layout-waterfall mdl-layout mdl-js-layout\">\r\n");
      out.write("    <main class=\"mdl-layout__content\">\r\n");
      out.write("        <div class=\"page-content\">\r\n");
      out.write("            <div class=\"mdl-grid signup-grid\">\r\n");
      out.write("                <div class=\"mdl-cell mdl-cell--6-col signup-left-side\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <h3>Make your booking more easy by creating an account</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mdl-cell mdl-cell--6-col signup-right-side\">\r\n");
      out.write("                    <div class=\"mdl-grid signup-content\">\r\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--12-col\">\r\n");
      out.write("                            <h4 class=\"\">Create an account</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--6-col\">\r\n");
      out.write("                            <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("                                <input class=\"mdl-textfield__input\" type=\"text\" id=\"fname\">\r\n");
      out.write("                                <label class=\"mdl-textfield__label\" for=\"fname\">First name</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--6-col\">\r\n");
      out.write("                            <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("                                <input class=\"mdl-textfield__input\" type=\"text\" id=\"lname\">\r\n");
      out.write("                                <label class=\"mdl-textfield__label\" for=\"lname\">Last name</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--12-col\">\r\n");
      out.write("                            <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("                                <input class=\"mdl-textfield__input\" type=\"text\" id=\"addrs\">\r\n");
      out.write("                                <label class=\"mdl-textfield__label\" for=\"addrs\">Address</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--6-col\">\r\n");
      out.write("                            <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("                                <input class=\"mdl-textfield__input\" type=\"text\" id=\"email\" onblur=\"checkDuplicate()\">\r\n");
      out.write("                                <label class=\"mdl-textfield__label\" for=\"email\">Email</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--6-col\">\r\n");
      out.write("                            <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("                                <input class=\"mdl-textfield__input\" type=\"text\" pattern=\"-?[0-9]*(\\.[0-9]+)?\" id=\"contct\">\r\n");
      out.write("                                <label class=\"mdl-textfield__label\" for=\"contct\">Contact</label>\r\n");
      out.write("                                <span class=\"mdl-textfield__error\">Contact must be a number!</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--12-col\">\r\n");
      out.write("                            <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("                                <input class=\"mdl-textfield__input\" type=\"password\" id=\"passwd\">\r\n");
      out.write("                                <label class=\"mdl-textfield__label\" for=\"passwd\">Choose password</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--12-col\">\r\n");
      out.write("                            <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("                                <input class=\"mdl-textfield__input\" type=\"password\" id=\"passwdConfirm\">\r\n");
      out.write("                                <label class=\"mdl-textfield__label\" for=\"passwdConfirm\">Confirm password</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--12-col text-right\">\r\n");
      out.write("                            <button id=\"signup\" class=\"mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--colored\">\r\n");
      out.write("                                create\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"../resources/Scripts/jquery-2.1.1.js\"></script>\r\n");
      out.write("<script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        $('#signup').click(function () {\r\n");
      out.write("            alert();\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/session/signup.do',\r\n");
      out.write("                type: 'POST',\r\n");
      out.write("                data: {\r\n");
      out.write("                    fname: $('#fname').val(),\r\n");
      out.write("                    lname: $('#lname').val(),\r\n");
      out.write("                    addrs: $('#addrs').val(),\r\n");
      out.write("                    email: $('#email').val(),\r\n");
      out.write("                    contct: $('#contct').val(),\r\n");
      out.write("                    passwd: $('#passwd').val()\r\n");
      out.write("                },\r\n");
      out.write("\r\n");
      out.write("                success: function (response) {\r\n");
      out.write("                    alert(response);\r\n");
      out.write("                },\r\n");
      out.write("                error: function (response, error) {\r\n");
      out.write("                    alert(error + \": \" + response);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function validEmail(email) {\r\n");
      out.write("        var pattern = /^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$/;\r\n");
      out.write("        return email && email !== '' && String(email).match(pattern);\r\n");
      out.write("    }\r\n");
      out.write("    function checkDuplicate() {\r\n");
      out.write("        var email = $('#email').val();\r\n");
      out.write("        if (validEmail(email)) {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/session/signup.do',\r\n");
      out.write("                type: 'POST',\r\n");
      out.write("                data: {\r\n");
      out.write("                    email: email \r\n");
      out.write("                },\r\n");
      out.write("                success: function (response) {\r\n");
      out.write("                    alert(response);\r\n");
      out.write("                },\r\n");
      out.write("                error: function (response, error) {\r\n");
      out.write("                    alert(error + \": \" + response);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
