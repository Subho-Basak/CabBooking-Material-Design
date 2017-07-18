package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cars_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Views/../WEB-INF/private/Layout/header.jspf");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Cars</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"../resources/Styles/Style.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"demo-layout-waterfall mdl-layout mdl-js-layout\">\n");
      out.write("\n");
      out.write("\n");
      out.write("  <header class=\"mdl-layout__header mdl-layout__header--waterfall\">\n");
      out.write("    <!-- Top row, always visible -->\n");
      out.write("    <div class=\"mdl-layout__header-row\">\n");
      out.write("      <!-- Title -->\n");
      out.write("      <span class=\"mdl-layout-title\">Google Material Design Components</span>\n");
      out.write("      <div class=\"mdl-layout-spacer\"></div>\n");
      out.write("      <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--expandable\n");
      out.write("                  mdl-textfield--floating-label mdl-textfield--align-right\">\n");
      out.write("        <label class=\"mdl-button mdl-js-button mdl-button--icon\"\n");
      out.write("               for=\"waterfall-exp\">\n");
      out.write("          <i class=\"material-icons\">search</i>\n");
      out.write("        </label>\n");
      out.write("        <div class=\"mdl-textfield__expandable-holder\">\n");
      out.write("          <input class=\"mdl-textfield__input\" type=\"text\" name=\"sample\"\n");
      out.write("                 id=\"waterfall-exp\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Bottom row, not visible on scroll -->\n");
      out.write("    <div class=\"mdl-layout__header-row\">\n");
      out.write("      <div class=\"mdl-layout-spacer\"></div>\n");
      out.write("      <!-- Navigation -->\n");
      out.write("      <nav class=\"mdl-navigation\">\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"Home.html\">home</a>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"simple.html\">services</a>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"cars.html\">cars</a>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"Tariff.html\">tariffs</a>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"Faq.html\">faq</a>\n");
      out.write("        <button class=\"mdl-button mdl-js-button  mdl-js-ripple-effect  mdl-button--colored\">\n");
      out.write("          Know us\n");
      out.write("        </button>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("  <main class=\"mdl-layout__content\">\n");
      out.write("    <div class=\"page-content\">\n");
      out.write("      <section class=\"mdl-grid cars-banner\">\n");
      out.write("        <div class=\"mdl-grid\">\n");
      out.write("          <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("            <h2 class=\"section-component-heading\">Our Cars</h2>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-grid car-type-row\">\n");
      out.write("          <div class=\"mdl-cell mdl-cell--12-col car-type-header cl29586C\">\n");
      out.write("            <h5 class=\"site-subheading \">Luxury</h5>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"mdl-cell mdl-cell--12-col card-component-row\">\n");
      out.write("            <div class=\"mdl-cell mdl-cell--3-col demo-card-square mdl-card mdl-shadow--2dp\">\n");
      out.write("              <div class=\"mdl-card__title mdl-card--expand car_bmw\">\n");
      out.write("                <h2 class=\"mdl-card__title-text\">BMW</h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-card__supporting-text\">\n");
      out.write("                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                Aenan convallis.\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\" mdl-cell mdl-cell--3-col demo-card-square mdl-card mdl-shadow--2dp\">\n");
      out.write("              <div class=\"mdl-card__title mdl-card--expand car_bmw\">\n");
      out.write("                <h2 class=\"mdl-card__title-text\">BMW</h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-card__supporting-text\">\n");
      out.write("                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                Aenan convallis.\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\" mdl-cell mdl-cell--3-col demo-card-square mdl-card mdl-shadow--2dp\">\n");
      out.write("              <div class=\"mdl-card__title mdl-card--expand car_bmw\">\n");
      out.write("                <h2 class=\"mdl-card__title-text\">BMW</h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-card__supporting-text\">\n");
      out.write("                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                Aenan convallis.\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\" mdl-cell mdl-cell--3-col demo-card-square mdl-card mdl-shadow--2dp\">\n");
      out.write("              <div class=\"mdl-card__title mdl-card--expand car_bmw\">\n");
      out.write("                <h2 class=\"mdl-card__title-text\">BMW</h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-card__supporting-text\">\n");
      out.write("                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                Aenan convallis.\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button class=\"mdl-button mdl-js-button mdl-button--fab mdl-js-ripple-effect  read-more-btn cl29586C\">\n");
      out.write("              <i class=\"material-icons\">keyboard_arrow_down</i>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <p class=\"view-all\">View all</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-grid car-type-row\">\n");
      out.write("          <div class=\"mdl-cell mdl-cell--12-col car-type-header clD2A456\">\n");
      out.write("            <h5 class=\"site-subheading\">Luxury</h5>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"mdl-cell mdl-cell--12-col card-component-row\">\n");
      out.write("            <div class=\"mdl-cell mdl-cell--3-col demo-card-square mdl-card mdl-shadow--2dp\">\n");
      out.write("              <div class=\"mdl-card__title mdl-card--expand car_bmw\">\n");
      out.write("                <h2 class=\"mdl-card__title-text\">BMW</h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-card__supporting-text\">\n");
      out.write("                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                Aenan convallis.\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\" mdl-cell mdl-cell--3-col demo-card-square mdl-card mdl-shadow--2dp\">\n");
      out.write("              <div class=\"mdl-card__title mdl-card--expand car_bmw\">\n");
      out.write("                <h2 class=\"mdl-card__title-text\">BMW</h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-card__supporting-text\">\n");
      out.write("                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                Aenan convallis.\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button class=\"mdl-button mdl-js-button mdl-button--fab mdl-js-ripple-effect clD2A456 read-more-btn\">\n");
      out.write("              <i class=\"material-icons\">keyboard_arrow_down</i>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <p class=\"view-all\">View all</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-grid car-type-row\">\n");
      out.write("          <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("            <h5 class=\"site-subheading\">Luxury</h5>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"mdl-cell mdl-cell--12-col card-component-row\">\n");
      out.write("            <div class=\"mdl-cell mdl-cell--3-col demo-card-square mdl-card mdl-shadow--2dp\">\n");
      out.write("              <div class=\"mdl-card__title mdl-card--expand car_bmw\">\n");
      out.write("                <h2 class=\"mdl-card__title-text\">BMW</h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-card__supporting-text\">\n");
      out.write("                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                Aenan convallis.\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\" mdl-cell mdl-cell--3-col demo-card-square mdl-card mdl-shadow--2dp\">\n");
      out.write("              <div class=\"mdl-card__title mdl-card--expand car_bmw\">\n");
      out.write("                <h2 class=\"mdl-card__title-text\">BMW</h2>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-card__supporting-text\">\n");
      out.write("                Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
      out.write("                Aenan convallis.\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button class=\"mdl-button mdl-js-button mdl-button--fab mdl-js-ripple-effect mdl-button--colored read-more-btn\">\n");
      out.write("              <i class=\"material-icons\">keyboard_arrow_down</i>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <p class=\"view-all\">View all</p>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("    </div>\n");
      out.write("  </main>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n");
      out.write("<script src=\"../resources/Scripts/data.js\"></script>\n");
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
