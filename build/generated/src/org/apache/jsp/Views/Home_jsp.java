package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Title</title>\n");
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
      out.write("        <a class=\"mdl-navigation__link\" href=\"Home.jsp\">home</a>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"#\">services</a>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"Cars.jsp\">cars</a>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"Tariff.jsp\">tariffs</a>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"Faq.jsp\">faq</a>\n");
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
      out.write("  <main class=\"mdl-layout__content\">\n");
      out.write("    <div class=\"page-content\">\n");
      out.write("\n");
      out.write("      <div class=\"mdl-grid welcome-banner\">\n");
      out.write("        <div class=\"mdl-cell mdl-cell--12-col \">\n");
      out.write("\n");
      out.write("          <h3>Welcome to google material design</h3>\n");
      out.write("          <p class=\"banner-sub-heading\">Explore the varieties of components</p>\n");
      out.write("          <button class=\"mdl-button mdl-js-button mdl-button--fab mdl-button--colored read-more-btn\">\n");
      out.write("            <i class=\"material-icons\">keyboard_arrow_down</i>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"mdl-grid components-wrapper\">\n");
      out.write("        <div class=\"mdl-cell mdl-cell--6-col  section\">\n");
      out.write("          <h2 class=\"section-component-heading\">Make your journey <br> quick, easy and affordable</h2>\n");
      out.write("          <p></p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--6-col  section\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"mdl-grid grid-2\">\n");
      out.write("        <div class=\"mdl-cell mdl-cell--6-col travel-section section\">\n");
      out.write("          <h2 class=\"section-component-heading\">Longest distance <br> in shortest time</h2>\n");
      out.write("          <p class=\"section-para\">Our cab follows the shortest route to your destination saving both your valuable time and money.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--6-col  travel-section section\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"mdl-grid \">\n");
      out.write("        <div class=\"mdl-cell mdl-cell--6-col   section\">\n");
      out.write("            <img src=\"../resources/Assets/Images/Untitled collage.jpg\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--6-col   section\">\n");
      out.write("          <h2 class=\"section-component-heading\">Choose your own car</h2>\n");
      out.write("          <p class=\"section-para\">Choose your favourite car from our wide range of collections.We also provide extra amenities like Music/MP3, Wifi, Charging point etc.</p>\n");
      out.write("          <p class=\"section-para\">You can also track your cab from anywhere.</p>\n");
      out.write("          <button class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--colored\">\n");
      out.write("            visit our gallery\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"mdl-grid grid-3\">\n");
      out.write("        <div class=\"mdl-cell mdl-cell--12-col text-center  section\">\n");
      out.write("          <h2 class=\"section-component-heading\">Pay only for your journey. No waiting charge</h2>\n");
      out.write("          <p class=\"section-para\">Choose your favourite car from our wide range of collections.We also provide extra amenities like Music/MP3, Wifi, Charging point etc.</p>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"mdl-grid \">\n");
      out.write("        <div class=\"mdl-cell mdl-cell--6-col section text-center\">\n");
      out.write("            <img src=\"../resources/Assets/Images/Capture.PNG\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mdl-cell mdl-cell--6-col   section\">\n");
      out.write("          <h2 class=\"section-component-heading\">Go cashless</h2>\n");
      out.write("          <p class=\"section-para\">Make your payment more easy and safe with our payment gateway.</p>\n");
      out.write("          <p class=\"section-para\">You can pay your ride with Credit/Debit.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("  </main>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n");
      out.write("<script src=\"../resources/Scripts/data.js\"></script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("  document.querySelector('#p3').addEventListener('mdl-componentupgraded', function() {\n");
      out.write("    this.MaterialProgress.setProgress(33);\n");
      out.write("    this.MaterialProgress.setBuffer(87);\n");
      out.write("  });\n");
      out.write("/* script for snackbar*/\n");
      out.write("  (function() {\n");
      out.write("    'use strict';\n");
      out.write("    var snackbarContainer = document.querySelector('#demo-snackbar-example');\n");
      out.write("    var showSnackbarButton = document.querySelector('#demo-show-snackbar');\n");
      out.write("    var handler = function(event) {\n");
      out.write("      showSnackbarButton.style.backgroundColor = '';\n");
      out.write("    };\n");
      out.write("    showSnackbarButton.addEventListener('click', function() {\n");
      out.write("      'use strict';\n");
      out.write("      showSnackbarButton.style.backgroundColor = '#' +\n");
      out.write("        Math.floor(Math.random() * 0xFFFFFF).toString(16);\n");
      out.write("      var data = {\n");
      out.write("        message: 'Button color changed.',\n");
      out.write("        timeout: 2000,\n");
      out.write("        actionHandler: handler,\n");
      out.write("        actionText: 'Undo'\n");
      out.write("      };\n");
      out.write("      snackbarContainer.MaterialSnackbar.showSnackbar(data);\n");
      out.write("    });\n");
      out.write("  }());\n");
      out.write("\n");
      out.write("  window.onload = function() {\n");
      out.write("    buildTBody(table_data);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function buildTBody(data) {\n");
      out.write("    data.forEach( function(o) {\n");
      out.write("      var _tr = document.createElement('tr');\n");
      out.write("      Object.keys(o).forEach( function(h) {\n");
      out.write("        var _td = document.createElement('td');\n");
      out.write("        _td.innerHTML = o[h];\n");
      out.write("        _tr.appendChild(_td);\n");
      out.write("      });\n");
      out.write("      document.getElementsByTagName('tbody')[0].appendChild(_tr);\n");
      out.write("    })\n");
      out.write("  }\n");
      out.write("</script>\n");
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
