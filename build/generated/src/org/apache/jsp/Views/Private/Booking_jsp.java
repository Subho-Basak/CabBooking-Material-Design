package org.apache.jsp.Views.Private;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Booking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Booking</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/Styles/Style.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/Styles/calendar.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" type=\"text/css\">\n");
      out.write("\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("    html {\n");
      out.write("      font: 500 14px \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n");
      out.write("      color: #333;\n");
      out.write("      height: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    body {\n");
      out.write("      height: 100%;\n");
      out.write("      margin: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    a {\n");
      out.write("      text-decoration: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    ul,\n");
      out.write("    ol,\n");
      out.write("    li {\n");
      out.write("      list-style: none;\n");
      out.write("      padding: 0;\n");
      out.write("      margin: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #demo {\n");
      out.write("      width: 400px;\n");
      out.write("      margin: 30px auto;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    p {\n");
      out.write("      margin: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input {\n");
      out.write("      margin: 10px 0;\n");
      out.write("      height: 28px;\n");
      out.write("      width: 200px;\n");
      out.write("      padding: 0 6px;\n");
      out.write("      border: 1px solid #ccc;\n");
      out.write("      outline: none;\n");
      out.write("    }\n");
      out.write("    #two{\n");
      out.write("      top:-40% !important;\n");
      out.write("      left:calc(50% - 170px) !important;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#f3f3f3\">\n");
      out.write("\n");
      out.write("<div class=\"demo-layout-waterfall mdl-layout mdl-js-layout\">\n");
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
      out.write("  <main class=\"mdl-layout__content\">\n");
      out.write("    <div class=\"page-content\">\n");
      out.write("\n");
      out.write("      <section class=\"mdl-grid booking-banner\">\n");
      out.write("        <div class=\"mdl-grid\">\n");
      out.write("          <div class=\"mdl-cell mdl-cell--12-col text-center\">\n");
      out.write("            <h2 class=\"section-component-heading \">Book your trip</h2>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"mdl-cell mdl-cell--12-col text-center stepper\">\n");
      out.write("            <p class=\"step-name\">Step one</p>\n");
      out.write("            <a class=\"active\"></a> <a></a> <a></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"booking-stepper\">\n");
      out.write("          <div class=\"spinner-wrapper\"><div class=\"mdl-spinner mdl-js-spinner is-active\"></div></div>\n");
      out.write("\n");
      out.write("          <fieldset>\n");
      out.write("            <div class=\"mdl-grid\">\n");
      out.write("              <div class=\"mdl-cell mdl-cell--3-col \">\n");
      out.write("                  <h6 class=\"stepper-heading\">Location</h6>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-cell mdl-cell--4-col pad_rt\">\n");
      out.write("                <h6 class=\"stepper-subheading\">Select start location</h6>\n");
      out.write("                <div class=\"mdl-textfield mdl-js-textfield\">\n");
      out.write("                  <input class=\"mdl-textfield__input\" type=\"text\" id=\"pick-loc\" placeholder=\"Pick location\">\n");
      out.write("                  <label class=\"mdl-textfield__label\" for=\"pick-loc\"></label>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-cell mdl-cell--1-col v_bar\">\n");
      out.write("                <button class=\"mdl-button mdl-js-button mdl-button--fab\" onclick=\"swapLocation();\">\n");
      out.write("                  <i class=\"material-icons\">swap_horiz</i>\n");
      out.write("                </button>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-cell mdl-cell--4-col pad_lt\">\n");
      out.write("                <h6 class=\"stepper-subheading\">Select drop location</h6>\n");
      out.write("                <div class=\"mdl-textfield mdl-js-textfield\">\n");
      out.write("                  <input class=\"mdl-textfield__input\" type=\"text\" id=\"drop-loc\" placeholder=\"Pick location\">\n");
      out.write("                  <label class=\"mdl-textfield__label\" for=\"drop-loc\"></label>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mdl-grid\">\n");
      out.write("              <div class=\"mdl-cell mdl-cell--3-col \">\n");
      out.write("                <h6 class=\"stepper-heading\">Date</h6>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-cell mdl-cell--2-col\">\n");
      out.write("                <h6 class=\"stepper-subheading\">Set journey date:</h6>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-cell mdl-cell--2-col\">\n");
      out.write("                <span class=\"date\">Not set</span>\n");
      out.write("                <button class=\"calendar-btn\">\n");
      out.write("                  <i class=\"material-icons\" id=\"dt\">today</i>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"two\"></div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mdl-grid\">\n");
      out.write("              <div class=\"mdl-cell mdl-cell--3-col \">\n");
      out.write("                <h6 class=\"stepper-heading\">Time</h6>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-cell mdl-cell--2-col\">\n");
      out.write("                <h6 class=\"stepper-subheading\">Set pickup time:</h6>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-cell mdl-cell--2-col\">\n");
      out.write("                <span class=\"date\">Not set</span>\n");
      out.write("                <button class=\"calendar-btn\">\n");
      out.write("                  <i class=\"material-icons\">schedule</i>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"two\"></div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mdl-grid\">\n");
      out.write("              <div class=\"mdl-cell mdl-cell--12-col text-right\">\n");
      out.write("                <button class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--colored mdl-js-ripple-effect\" onclick=\"goToNext(this);\">\n");
      out.write("                  next\n");
      out.write("                </button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </fieldset>\n");
      out.write("          <fieldset>\n");
      out.write("            <div class=\"mdl-grid\">\n");
      out.write("              <div class=\"mdl-cell mdl-cell--3-col \">\n");
      out.write("                <h6 class=\"stepper-heading\">Choose car</h6>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-cell mdl-cell--4-col pad_rt\">\n");
      out.write("                <h6 class=\"stepper-subheading\">Select car type</h6>\n");
      out.write("                <i class=\"material-icons car-icon\">directions_car</i>\n");
      out.write("                <div class=\"md-select\">\n");
      out.write("\n");
      out.write("                  <label for=\"ul-id\"><button type=\"button\" class=\"ng-binding\">Choose car type</button></label>\n");
      out.write("                  <ul role=\"listbox\" id=\"ul-id\" class=\"md-whiteframe-z1\" aria-activedescendant=\"state2_AK\" name=\"ul-id\">\n");
      out.write("                    <li role=\"option\" id=\"state2_AK\" class=\"ng-binding ng-scope active\" tabindex=\"-1\" aria-selected=\"true\">Mini</li>\n");
      out.write("                    <li role=\"option\" id=\"state2_AL\" class=\"ng-binding ng-scope\" tabindex=\"-1\" aria-selected=\"false\">Prime</li>\n");
      out.write("                    <li role=\"option\" id=\"state2_AR\" class=\"ng-binding ng-scope\" tabindex=\"-1\" aria-selected=\"false\">Luxury</li>\n");
      out.write("                    <li role=\"option\" id=\"state2_AS\" class=\"ng-binding ng-scope\" tabindex=\"-1\" aria-selected=\"false\">Royal</li>\n");
      out.write("                  </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-cell mdl-cell--1-col v_bar\">\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-cell mdl-cell--4-col pad_lt\">\n");
      out.write("                <h6 class=\"stepper-subheading\">Select your car</h6>\n");
      out.write("                <ul class=\"demo-list-icon mdl-list\" id=\"car\">\n");
      out.write("                  <!--<li class=\"mdl-list__item\">-->\n");
      out.write("                  <!--<span class=\"mdl-list__item-primary-content\">-->\n");
      out.write("                    <!--<img src=\"\" class=\"mdl-list__item-icon\" />-->\n");
      out.write("                    <!--Bryan Cranston-->\n");
      out.write("                  <!--</span>-->\n");
      out.write("                  <!--</li>-->\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"mdl-grid\">\n");
      out.write("              <div class=\"mdl-cell mdl-cell--12-col text-right\">\n");
      out.write("                <button class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--colored mdl-js-ripple-effect\" onclick=\"goToNext(this);\">\n");
      out.write("                  next\n");
      out.write("                </button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </fieldset>\n");
      out.write("          <fieldset>\n");
      out.write("            <div class=\"mdl-grid\">\n");
      out.write("              <div class=\"mdl-cell mdl-cell--6-col \">\n");
      out.write("                <h6 class=\"stepper-heading\">Booking summary</h6>\n");
      out.write("                <div>\n");
      out.write("                  <h5>User Name</h5>\n");
      out.write("                  <p> +91 - 8583866670</p>\n");
      out.write("                  <br>\n");
      out.write("                  <p class=\"pay-heading\">Pickup location</p>\n");
      out.write("                  <p>123 6th St. Melbourne, FL 32904</p>\n");
      out.write("                  <p class=\"pay-heading\">Drop location</p>\n");
      out.write("                  <p>123 6th St. Melbourne, FL 32904</p>\n");
      out.write("                  <hr>\n");
      out.write("                  <p class=\"pay-heading\">Distance <span class=\"pay-data\">25 KM</span></p>\n");
      out.write("                  <p class=\"pay-heading\">Estimated time <span class=\"pay-data\">1 hr 12 min</span></p>\n");
      out.write("                  <div class=\"mdl-cell mdl-cell--6-col\"><i class=\"material-icons\">today</i> 12 Jul 2017</div>\n");
      out.write("\n");
      out.write("                  <hr>\n");
      out.write("                  <p class=\"pay-heading\">Base fare <span class=\"pay-data\">25</span></p>\n");
      out.write("                  <p class=\"pay-heading\">Distance fare <span class=\"pay-data\">352</span></p>\n");
      out.write("                  <p class=\"pay-heading\">Other charges <span class=\"pay-data\">35</span></p>\n");
      out.write("                  <hr>\n");
      out.write("                  <h5>Subtotal <span class=\"pay-data\">412</span></h5>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-cell mdl-cell--1-col v_bar\">\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mdl-cell mdl-cell--5-col pad_lt\">\n");
      out.write("                <h6 class=\"stepper-heading\">Payment mode</h6>\n");
      out.write("                <div class=\"payment-mode-section\">\n");
      out.write("                  <h1><i class=\"material-icons car-icon\">directions_car</i></h1>\n");
      out.write("                  <p>Please select your payment mode</p>\n");
      out.write("\n");
      out.write("                  <div>\n");
      out.write("                    <label class=\"mdl-radio mdl-js-radio mdl-js-ripple-effect\" for=\"option-1\">\n");
      out.write("                      <input type=\"radio\" id=\"option-1\" class=\"mdl-radio__button\" name=\"options\" value=\"1\" checked>\n");
      out.write("                      <span class=\"mdl-radio__label\">Credit/Debit</span>\n");
      out.write("                    </label>\n");
      out.write("\n");
      out.write("                    <label class=\"mdl-radio mdl-js-radio mdl-js-ripple-effect\" for=\"option-1\">\n");
      out.write("                      <input type=\"radio\" id=\"option-1\" class=\"mdl-radio__button\" name=\"options\" value=\"1\" checked>\n");
      out.write("                      <span class=\"mdl-radio__label\">Net Banking</span>\n");
      out.write("                    </label>\n");
      out.write("\n");
      out.write("                    <label class=\"mdl-radio mdl-js-radio mdl-js-ripple-effect\" for=\"option-1\">\n");
      out.write("                      <input type=\"radio\" id=\"option-1\" class=\"mdl-radio__button\" name=\"options\" value=\"1\" checked>\n");
      out.write("                      <span class=\"mdl-radio__label\">Cash</span>\n");
      out.write("                    </label>\n");
      out.write("\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"mdl-grid\">\n");
      out.write("              <div class=\"mdl-cell mdl-cell--12-col text-right\">\n");
      out.write("                <button class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--colored mdl-js-ripple-effect\" onclick=\"goToNext(this);\">\n");
      out.write("                  next\n");
      out.write("                </button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </fieldset>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("      <footer class=\"mdl-mega-footer\">\n");
      out.write("        <div class=\"mdl-mega-footer__middle-section\">\n");
      out.write("\n");
      out.write("          <div class=\"mdl-mega-footer__drop-down-section\">\n");
      out.write("            <input class=\"mdl-mega-footer__heading-checkbox\" type=\"checkbox\" checked>\n");
      out.write("            <h1 class=\"mdl-mega-footer__heading\">Features</h1>\n");
      out.write("            <ul class=\"mdl-mega-footer__link-list\">\n");
      out.write("              <li><a href=\"#\">About</a></li>\n");
      out.write("              <li><a href=\"#\">Terms</a></li>\n");
      out.write("              <li><a href=\"#\">Partners</a></li>\n");
      out.write("              <li><a href=\"#\">Updates</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"mdl-mega-footer__drop-down-section\">\n");
      out.write("            <input class=\"mdl-mega-footer__heading-checkbox\" type=\"checkbox\" checked>\n");
      out.write("            <h1 class=\"mdl-mega-footer__heading\">Details</h1>\n");
      out.write("            <ul class=\"mdl-mega-footer__link-list\">\n");
      out.write("              <li><a href=\"#\">Specs</a></li>\n");
      out.write("              <li><a href=\"#\">Tools</a></li>\n");
      out.write("              <li><a href=\"#\">Resources</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"mdl-mega-footer__drop-down-section\">\n");
      out.write("            <input class=\"mdl-mega-footer__heading-checkbox\" type=\"checkbox\" checked>\n");
      out.write("            <h1 class=\"mdl-mega-footer__heading\">Technology</h1>\n");
      out.write("            <ul class=\"mdl-mega-footer__link-list\">\n");
      out.write("              <li><a href=\"#\">How it works</a></li>\n");
      out.write("              <li><a href=\"#\">Patterns</a></li>\n");
      out.write("              <li><a href=\"#\">Usage</a></li>\n");
      out.write("              <li><a href=\"#\">Products</a></li>\n");
      out.write("              <li><a href=\"#\">Contracts</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"mdl-mega-footer__drop-down-section\">\n");
      out.write("            <input class=\"mdl-mega-footer__heading-checkbox\" type=\"checkbox\" checked>\n");
      out.write("            <h1 class=\"mdl-mega-footer__heading\">FAQ</h1>\n");
      out.write("            <ul class=\"mdl-mega-footer__link-list\">\n");
      out.write("              <li><a href=\"#\">Questions</a></li>\n");
      out.write("              <li><a href=\"#\">Answers</a></li>\n");
      out.write("              <li><a href=\"#\">Contact us</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"mdl-mega-footer__bottom-section\">\n");
      out.write("          <div class=\"mdl-logo\">Title</div>\n");
      out.write("          <ul class=\"mdl-mega-footer__link-list fl-left\">\n");
      out.write("            <li><a href=\"#\">Help</a></li>\n");
      out.write("            <li><a href=\"Terms.html\">Privacy & Terms</a></li>\n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("          <ul class=\"mdl-mega-footer__link-list fl-right\">\n");
      out.write("            <li><div class=\"mdl-logo\">Follow us</div></li>\n");
      out.write("            <li><i class=\"fa fa-facebook-square\" aria-hidden=\"true\"></i></li>\n");
      out.write("            <li><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></li>\n");
      out.write("            <li><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></li>\n");
      out.write("            <li><i class=\"fa fa-youtube-play\" aria-hidden=\"true\"></i></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </footer>\n");
      out.write("    </div>\n");
      out.write("  </main>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery/1.9.0/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.17.1/moment.min.js\"></script>\n");
      out.write("<script src=\"../../resources/Scripts/basic-utility.js\"></script>\n");
      out.write("<script src=\"../../resources/Scripts/data.js\"></script>\n");
      out.write("<script src=\"../../resources/Scripts/calendar.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("  var now = new Date();\n");
      out.write("  var year = now.getFullYear();\n");
      out.write("  var month = now.getMonth() + 1;\n");
      out.write("  var date = now.getDate();\n");
      out.write("\n");
      out.write("\n");
      out.write("  var data = [{\n");
      out.write("    date: year + '-' + month + '-' + (date - 1),\n");
      out.write("    value: 'hello'\n");
      out.write("  }, {\n");
      out.write("    date: year + '-' + month + '-' + date,\n");
      out.write("    value: '上班'\n");
      out.write("  }, {\n");
      out.write("    date: new Date(year, month - 1, date + 1),\n");
      out.write("    value: '吃饭睡觉打豆豆'\n");
      out.write("  }, {\n");
      out.write("    date: '2016-10-31',\n");
      out.write("    value: '2016-10-31'\n");
      out.write("  }];\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  // picker\n");
      out.write("  $('#two').calendar({\n");
      out.write("    trigger: '#dt',\n");
      out.write("    width: 340,\n");
      out.write("    height: 340,\n");
      out.write("    next: '<i class=\"material-icons\">keyboard_arrow_right</i>',\n");
      out.write("    prev: '<i class=\"material-icons\">keyboard_arrow_left</i>',\n");
      out.write("    offset: [0, 1],\n");
      out.write("    zIndex: 999,\n");
      out.write("    format: 'dd/mm/yyyy',\n");
      out.write("    weekArray: ['S', 'M', 'T', 'W', 'T', 'F', 'S'],\n");
      out.write("    data: data,\n");
      out.write("    onSelected: function (view, date, data) {\n");
      out.write("      console.log('event: onSelected');\n");
      out.write("      date = moment(date).format(\"DD MMM YYYY\")\n");
      out.write("      //alert('date:' + date);\n");
      out.write("      $('.date').text(date);\n");
      out.write("    },\n");
      out.write("    onClose: function (view, date, data) {\n");
      out.write("      console.log('event: onClose')\n");
      out.write("      console.log('view:' + view)\n");
      out.write("      console.log('date:' + date)\n");
      out.write("      console.log('data:' + (data || '无'));\n");
      out.write("    }\n");
      out.write("  });\n");
      out.write("  window.onload = function() {\n");
      out.write("    populateList(car_list);\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function populateList(cars){\n");
      out.write("    var _ul = document.getElementById('car');\n");
      out.write("    [].forEach.call(cars, function(_car) {\n");
      out.write("      var _li = document.createElement('li');\n");
      out.write("      _li.className = 'mdl-list__item';\n");
      out.write("      var _span = document.createElement('span');\n");
      out.write("      _span.className = 'mdl-list__item-primary-content ';\n");
      out.write("      var _img = document.createElement('img');\n");
      out.write("      _img.className = 'mdl-list__item-icon';\n");
      out.write("      _img.src = _car.car_image;\n");
      out.write("      _span.innerText = _car.car_name;\n");
      out.write("\n");
      out.write("      _span.prepend(_img)\n");
      out.write("      _li.appendChild(_span);\n");
      out.write("      _ul.appendChild(_li);\n");
      out.write("    });\n");
      out.write("  }\n");
      out.write("\n");
      out.write("\n");
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