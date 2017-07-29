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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <title>Login</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"../resources/Styles/Style.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#ececec\">\n");
      out.write("<div class=\"demo-layout-waterfall mdl-layout mdl-js-layout\">\n");
      out.write("  <main class=\"mdl-layout__content\">\n");
      out.write("    <div class=\"page-content\">\n");
      out.write("      <div class=\"mdl-grid login-grid\">\n");
      out.write("        <div class=\"mdl-cell mdl-cell--4-col\">\n");
      out.write("          <div id=\"p1\" class=\"mdl-progress mdl-js-progress mdl-progress__indeterminate\"></div>\n");
      out.write("          <div class=\"mdl-grid login-panel\">\n");
      out.write("            <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("              <h4>Sign in with your account</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mdl-cell mdl-cell--10-col\">\n");
      out.write("              <p>Please remember my password next time</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mdl-cell mdl-cell--2-col text-right\">\n");
      out.write("              <label class=\"mdl-switch mdl-js-switch mdl-js-ripple-effect\" for=\"switch-1\">\n");
      out.write("                <input type=\"checkbox\" id=\"switch-1\" class=\"mdl-switch__input\" checked>\n");
      out.write("                <span class=\"mdl-switch__label\"></span>\n");
      out.write("              </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("              <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                <input class=\"mdl-textfield__input required email\" type=\"text\" id=\"userid\" onkeypress=\"resetError(this)\" onchange=\"resetError(this)\">\n");
      out.write("                <label class=\"mdl-textfield__label\" for=\"userid\">Email</label>\n");
      out.write("              </div>\n");
      out.write("              <span class=\"error-msg\">Please enter a valid email</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("              <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                  <input class=\"mdl-textfield__input required\" type=\"password\" id=\"passwd\" onkeypress=\"resetError(this)\" onchange=\"resetError(this)\">\n");
      out.write("                <label class=\"mdl-textfield__label\" for=\"passwd\">Password</label>\n");
      out.write("              </div>\n");
      out.write("              <span class=\"error-msg\">Please enter a valid password</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mdl-cell mdl-cell--6-col\">\n");
      out.write("              <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Views/ForgetPassword.jsp\" class=\"text-link\">Forgot password?</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mdl-cell mdl-cell--6-col text-right\">\n");
      out.write("              <button class=\"mdl-button mdl-js-button  mdl-button--raised mdl-js-ripple-effect  mdl-button--colored\"  id=\"signin\">\n");
      out.write("                LOGIN\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("              <p>Doesn't have an account? <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Views/Signup.jsp\" class=\"text-link\">Create one</a></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </main>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n");
      out.write("<script src=\"../resources/Scripts/jquery-2.1.1.js\"></script>\n");
      out.write("<script  src=\"../resources/Scripts/validation.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready( function() {\n");
      out.write("        $('#signin').click( function() {\n");
      out.write("            \n");
      out.write("            if(validateLoginForm()){\n");
      out.write("                $('.mdl-progress').show();\n");
      out.write("                $.ajax({\n");
      out.write("                    url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/session/login.do',\n");
      out.write("                    type: 'POST',\n");
      out.write("                    data: {\n");
      out.write("                        userid: $('#userid').val(),\n");
      out.write("                        passwd: $('#passwd').val(),\n");
      out.write("                        remember: $('#switch-1').is(':checked')\n");
      out.write("                    },\n");
      out.write("\n");
      out.write("                    success: function(response) {\n");
      out.write("                        if(response === true || response === 'true') {\n");
      out.write("                            window.location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Views/Private/Dashboard.jsp';\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    error: function(response, error) {\n");
      out.write("                         $('.mdl-progress').hide();\n");
      out.write("                        alert(error + \": \" + response);\n");
      out.write("                    }   \n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("       \n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
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
