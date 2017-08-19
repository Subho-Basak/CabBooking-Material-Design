package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../resources/Styles/Style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" type=\"text/css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body bgcolor=\"#ececec\">\r\n");
      out.write("        <div class=\"demo-layout-waterfall mdl-layout mdl-js-layout\">\r\n");
      out.write("            <main class=\"mdl-layout__content\">\r\n");
      out.write("                <div class=\"page-content\">\r\n");
      out.write("                    <div class=\"mdl-grid login-grid\">\r\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--4-col\">\r\n");
      out.write("                            <div id=\"p1\" class=\"mdl-progress mdl-js-progress mdl-progress__indeterminate\"></div>\r\n");
      out.write("                            <div class=\"mdl-grid login-panel\">\r\n");
      out.write("                                <div class=\"mdl-cell mdl-cell--12-col\">\r\n");
      out.write("                                    <h4>Sign in with your account</h4>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mdl-cell mdl-cell--10-col\">\r\n");
      out.write("                                    <p>Please remember my password next time</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mdl-cell mdl-cell--2-col text-right\">\r\n");
      out.write("                                    <label class=\"mdl-switch mdl-js-switch mdl-js-ripple-effect\" for=\"switch-1\">\r\n");
      out.write("                                        <input type=\"checkbox\" id=\"switch-1\" class=\"mdl-switch__input\" checked>\r\n");
      out.write("                                        <span class=\"mdl-switch__label\"></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mdl-cell mdl-cell--12-col\">\r\n");
      out.write("                                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("                                        <input class=\"mdl-textfield__input required email\" type=\"text\" id=\"userid\" onkeypress=\"resetError(this)\" onchange=\"resetError(this)\">\r\n");
      out.write("                                        <label class=\"mdl-textfield__label\" for=\"userid\">Email</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <span class=\"error-msg\">Please enter a valid email</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mdl-cell mdl-cell--12-col\">\r\n");
      out.write("                                    <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\r\n");
      out.write("                                        <input class=\"mdl-textfield__input required\" type=\"password\" id=\"passwd\" onkeypress=\"resetError(this)\" onchange=\"resetError(this)\">\r\n");
      out.write("                                        <label class=\"mdl-textfield__label\" for=\"passwd\">Password</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <span class=\"error-msg\">Please enter a valid password</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mdl-cell mdl-cell--6-col\">\r\n");
      out.write("                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Views/ForgetPassword.jsp\" class=\"text-link\">Forgot password?</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mdl-cell mdl-cell--6-col text-right\">\r\n");
      out.write("                                    <button class=\"mdl-button mdl-js-button  mdl-button--raised mdl-js-ripple-effect  mdl-button--colored\"  id=\"signin\">\r\n");
      out.write("                                        LOGIN\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mdl-cell mdl-cell--12-col\">\r\n");
      out.write("                                    <p>Doesn't have an account? <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Views/Signup.jsp\" class=\"text-link\">Create one</a></p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!--error snackbar-->\r\n");
      out.write("                    <div id=\"demo-snackbar-example\" class=\"mdl-js-snackbar mdl-snackbar\">\r\n");
      out.write("                        <div class=\"mdl-snackbar__text\"></div>\r\n");
      out.write("                        <button class=\"mdl-snackbar__action\" type=\"button\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </main>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\r\n");
      out.write("        <script src=\"../resources/Scripts/jquery-2.1.1.js\"></script>\r\n");
      out.write("        <script  src=\"../resources/Scripts/validation.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                                            $(document).ready(function () {\r\n");
      out.write("                                                $('#signin').click(function () {\r\n");
      out.write("\r\n");
      out.write("                                                    if (validateLoginForm()) {\r\n");
      out.write("                                                        $('.mdl-progress').show();\r\n");
      out.write("                                                        $.ajax({\r\n");
      out.write("                                                            url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/session/login.do',\r\n");
      out.write("                                                            type: 'POST',\r\n");
      out.write("                                                            data: {\r\n");
      out.write("                                                                userid: $('#userid').val(),\r\n");
      out.write("                                                                passwd: $('#passwd').val(),\r\n");
      out.write("                                                                remember: $('#switch-1').is(':checked')\r\n");
      out.write("                                                            },\r\n");
      out.write("\r\n");
      out.write("                                                            success: function (response) {\r\n");
      out.write("                                                                if (response === true || response === 'true') {\r\n");
      out.write("                                                                    window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Views/Private/Dashboard.jsp';\r\n");
      out.write("                                                                }\r\n");
      out.write("                                                            },\r\n");
      out.write("                                                            error: function (response, error) {\r\n");
      out.write("                                                                $('.mdl-progress').hide();\r\n");
      out.write("                                                                showErrorSnackbar(response);\r\n");
      out.write("                                                               \r\n");
      out.write("                                                            }\r\n");
      out.write("                                                        });\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                });\r\n");
      out.write("\r\n");
      out.write("                                            });\r\n");
      out.write("\r\n");
      out.write("                                            function showErrorSnackbar(response) {\r\n");
      out.write("                                                \r\n");
      out.write("                                                    \r\n");
      out.write("                                                    var snackbarContainer = document.querySelector('#demo-snackbar-example');\r\n");
      out.write(" \r\n");
      out.write("                                                        var data = {\r\n");
      out.write("                                                            message: \"Invalid login credentials.Please try again\",\r\n");
      out.write("                                                            timeout: 2000,\r\n");
      out.write("                                                            actionHandler: \"\",\r\n");
      out.write("                                                            actionText: 'Undo'\r\n");
      out.write("                                                        };\r\n");
      out.write("                                                        snackbarContainer.MaterialSnackbar.showSnackbar(data);\r\n");
      out.write("                                                    \r\n");
      out.write("                                            }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
