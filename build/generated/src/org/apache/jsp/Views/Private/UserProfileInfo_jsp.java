package org.apache.jsp.Views.Private;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cb.model.User;

public final class UserProfileInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <title>Profile</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../resources/Styles/Style.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"../../resources/Styles/Account.css\">\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#f1f1f1\">\n");
      out.write("<div class=\"mdl-layout mdl-js-layout\">\n");
      out.write("  <header class=\"mdl-layout__header mdl-layout__header--scroll private-header\">\n");
      out.write("    <div class=\"mdl-layout__header-row\">\n");
      out.write("      <!-- Title -->\n");
      out.write("      <span class=\"mdl-layout-title\">Title</span>\n");
      out.write("      <!-- Add spacer, to align navigation to the right -->\n");
      out.write("      <div class=\"mdl-layout-spacer\"></div>\n");
      out.write("      <!-- Navigation -->\n");
      out.write("      <nav class=\"mdl-navigation\">\n");
      out.write("        <a class=\"mdl-navigation__link account-group\" href=\"\"><i class=\"material-icons\">account_circle</i><span>User Firstname</span>\n");
      out.write("\n");
      out.write("          <div class=\"profile-dropdown\">\n");
      out.write("            <div class=\"top-cap\"></div>\n");
      out.write("            <div class=\"user-avatar-bg text-center\">\n");
      out.write("              <img src=\"../../Assets/Images/avater.jpg\" />\n");
      out.write("            </div>\n");
      out.write("            <h5>Full Name</h5>\n");
      out.write("            <p>email id</p>\n");
      out.write("            <div class=\"profile-dropdown-footer\">\n");
      out.write("              <button href=\"\" class=\"text-link\">profile</button>\n");
      out.write("              <button onclick=\"logout()\" class=\"text-link\">Logout</button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("      </nav>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("  <div class=\"mdl-layout__drawer\">\n");
      out.write("    <span class=\"mdl-layout-title\">Title</span>\n");
      out.write("    <nav class=\"mdl-navigation\">\n");
      out.write("      <a class=\"mdl-navigation__link\" href=\"\">Link</a>\n");
      out.write("      <a class=\"mdl-navigation__link\" href=\"\">Link</a>\n");
      out.write("      <a class=\"mdl-navigation__link\" href=\"\">Link</a>\n");
      out.write("      <a class=\"mdl-navigation__link\" href=\"\">Link</a>\n");
      out.write("    </nav>\n");
      out.write("  </div>\n");
      out.write("  <main class=\"mdl-layout__content\">\n");
      out.write("    <div class=\"page-content\"><!-- Your content goes here -->\n");
      out.write("      <section class=\"mdl-grid profile-info\">\n");
      out.write("\n");
      out.write("          <div class=\"mdl-cell mdl-cell--6-col\">\n");
      out.write("            <h5 class=\"site-subheading\">Personal info</h5>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"mdl-cell mdl-cell--6-col text-right\">\n");
      out.write("            <h5><i class=\"material-icons\">mode_edit</i></h5>\n");
      out.write("          </div>\n");
      out.write("          <hr>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--4-col\">\n");
      out.write("          <strong>Name</strong>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--8-col\">\n");
      out.write("            <p>");
      out.print( user.getFirstName() + " " + user.getLastName() );
      out.write("</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mdl-cell mdl-cell--4-col\">\n");
      out.write("          <strong>Email</strong>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--8-col\">\n");
      out.write("            <p>");
      out.print( user.getEmail() );
      out.write("</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mdl-cell mdl-cell--4-col\">\n");
      out.write("          <strong>Birthday</strong>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--8-col\">\n");
      out.write("          <p>Not set</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mdl-cell mdl-cell--4-col\">\n");
      out.write("          <strong>Gender</strong>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--8-col\">\n");
      out.write("          <p>Not set</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mdl-cell mdl-cell--4-col\">\n");
      out.write("          <strong>Nationality</strong>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--8-col\">\n");
      out.write("          <p>Not set</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mdl-cell mdl-cell--4-col\">\n");
      out.write("          <strong>Photo</strong>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--8-col\">\n");
      out.write("          <img src=\"../../Assets/Images/avater.jpg\" />\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("      <section class=\"mdl-grid profile-info\">\n");
      out.write("\n");
      out.write("        <div class=\"mdl-cell mdl-cell--6-col\">\n");
      out.write("          <h5 class=\"site-subheading\">Contact info</h5>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--6-col text-right\">\n");
      out.write("          <h5><i class=\"material-icons\">mode_edit</i></h5>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--4-col\">\n");
      out.write("          <strong>Address</strong>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--8-col\">\n");
      out.write("          <p>");
      out.print( user.getAddress() !=null && !user.getAddress().isEmpty() ? user.getAddress() : "Not set" );
      out.write("</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mdl-cell mdl-cell--4-col\">\n");
      out.write("          <strong>Contact</strong>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--8-col\">\n");
      out.write("          <p>");
      out.print( user.getContact()!=null && !user.getContact().isEmpty() ? user.getContact(): "Not set" );
      out.write("</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mdl-cell mdl-cell--4-col\">\n");
      out.write("          <strong>Country</strong>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--8-col\">\n");
      out.write("          <p>");
      out.print( user.getCountry()!=null && !user.getCountry().isEmpty() ? user.getCountry(): "Not set" );
      out.write("</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mdl-cell mdl-cell--4-col\">\n");
      out.write("          <strong>State</strong>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--8-col\">\n");
      out.write("          <p>Not set</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("      <section class=\"mdl-grid profile-info\">\n");
      out.write("\n");
      out.write("        <div class=\"mdl-cell mdl-cell--6-col\">\n");
      out.write("          <h5 class=\"site-subheading\">Security</h5>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--6-col text-right\">\n");
      out.write("          <h5><i class=\"material-icons\">mode_edit</i></h5>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--4-col\">\n");
      out.write("          <strong>Password</strong>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--8-col\">\n");
      out.write("          <a href=\"\" class=\"text-link\">Change</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      </section>\n");
      out.write("    </div>\n");
      out.write("  </main>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery/1.9.0/jquery.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    function logout(){\n");
      out.write("        window.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/session/logout.do';\n");
      out.write("    }\n");
      out.write("</script>\n");
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
