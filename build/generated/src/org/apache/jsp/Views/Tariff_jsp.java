package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Tariff_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <title>Tariff</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/Styles/Style.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#f3f3f3\">\n");
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
      out.write("\n");
      out.write("  <main class=\"mdl-layout__content\">\n");
      out.write("    <div class=\"page-content\">\n");
      out.write("      <section class=\"mdl-grid tariff-banner\">\n");
      out.write("        <div class=\"mdl-grid\">\n");
      out.write("          <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("            <h2 class=\"section-component-heading\">Our Tariff</h2>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("            <span class=\"city-name\">Chennai</span>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <!--Standard fare grid-->\n");
      out.write("          <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("            <h5 class=\"site-subheading\">Standard fare</h5>\n");
      out.write("            <table class=\"mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp\">\n");
      out.write("              <thead>\n");
      out.write("              <tr>\n");
      out.write("                <th class=\"mdl-data-table__cell--non-numeric\">Categorie</th>\n");
      out.write("                <th>Base fare</th>\n");
      out.write("                <th>Distance fare</th>\n");
      out.write("                <th>Ride time fare</th>\n");
      out.write("                <th>Cancellation fee</th>\n");
      out.write("              </tr>\n");
      out.write("              </thead>\n");
      out.write("              <tbody></tbody>\n");
      out.write("            </table>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <!--special fare grid-->\n");
      out.write("          <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("            <h5 class=\"site-subheading\">Special fare</h5>\n");
      out.write("            <table class=\"mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp\">\n");
      out.write("              <thead>\n");
      out.write("              <tr>\n");
      out.write("                <th class=\"mdl-data-table__cell--non-numeric\">Categorie</th>\n");
      out.write("                <th>Base fare</th>\n");
      out.write("                <th>Distance fare</th>\n");
      out.write("                <th>Ride time fare</th>\n");
      out.write("                <th>Cancellation fee</th>\n");
      out.write("              </tr>\n");
      out.write("              </thead>\n");
      out.write("              <tbody></tbody>\n");
      out.write("            </table>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"dialog-wrapper\">\n");
      out.write("\n");
      out.write("      <div class=\"mdl-grid dialog-main\">\n");
      out.write("        <div class=\"mdl-cell mdl-cell--12-col dialog-header\">\n");
      out.write("          <h3 class=\"modal-title\">Select a city</h3>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mdl-cell mdl-cell--12-col dialog-body\">\n");
      out.write("          <ul class=\"demo-list-item mdl-list\" id=\"city\">\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <button class=\"mdl-button mdl-js-button mdl-button--fab mdl-js-ripple-effect more-filter\">\n");
      out.write("      <i class=\"material-icons\">filter_list</i>\n");
      out.write("    </button>\n");
      out.write("  </main>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"../resources/Scripts/jquery-2.1.1.js\"></script>\n");
      out.write("<script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n");
      out.write("<script src=\"../resources/Scripts/data.js\"></script>\n");
      out.write("<script src=\"../resources/Scripts/basic-utility.js\"></script>\n");
      out.write("<script>\n");
      out.write("  window.onload = function() {\n");
      out.write("    //(table_data);\n");
      out.write("    populateList(city_list);\n");
      out.write("  };\n");
      out.write("  \n");
      out.write("  $(document).ready( function() {\n");
      out.write("     $.ajax({\n");
      out.write("         url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/farechart.do',\n");
      out.write("         success: function(response) {\n");
      out.write("             buildTBody(response.0);\n");
      out.write("         },\n");
      out.write("         error: function(response, error) {\n");
      out.write("             alert(error);\n");
      out.write("         }\n");
      out.write("     }); \n");
      out.write("  });\n");
      out.write("\n");
      out.write("  function buildTBody(data) {\n");
      out.write("    var tbodys = document.getElementsByTagName('tbody');\n");
      out.write("    for(var i=0;i<tbodys.length;i++) {\n");
      out.write("    [].forEach.call(data, function(o) {\n");
      out.write("      var _tr = document.createElement('tr');\n");
      out.write("      [].forEach.call(Object.keys(o), function(h) {\n");
      out.write("          if(h !== 'city') {\n");
      out.write("            var _td = document.createElement('td');\n");
      out.write("            _td.innerHTML = o[h];\n");
      out.write("            _tr.appendChild(_td);\n");
      out.write("        }\n");
      out.write("      });\n");
      out.write("      tbodys[i].appendChild(_tr);\n");
      out.write("      });\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function populateList(cities){\n");
      out.write("    var _ul = document.getElementById('city');\n");
      out.write("    [].forEach.call(cities, function(_city) {\n");
      out.write("      var _li = document.createElement('li');\n");
      out.write("      _li.className = 'mdl-list__item mdl-js-ripple-effect';\n");
      out.write("      var _span = document.createElement('span');\n");
      out.write("      _span.className = 'mdl-list__item-primary-content ';\n");
      out.write("      _span.innerText = _city.city.name;\n");
      out.write("\n");
      out.write("      _li.appendChild(_span);\n");
      out.write("      _ul.appendChild(_li);\n");
      out.write("    });\n");
      out.write("  }\n");
      out.write("\n");
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
