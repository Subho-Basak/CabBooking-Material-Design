package org.apache.jsp.Views.Private;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cb.model.User;

public final class BookingStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Views/Private/../../WEB-INF/private/Layout/postloginheader.jspf");
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
      out.write("\n");
      out.write("\n");

    if (null == request.getSession(false) || null == request.getSession(false).getAttribute("account")) {
        response.sendRedirect(request.getContextPath() + "/Views/Login.jsp");
        return;
    }

      out.write('\n');
      out.write('\n');
 User user = (User) request.getSession(false).getAttribute("account");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.getmdl.io/1.3.0/material.indigo-pink.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../resources/Styles/Style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../../resources/Styles/Account.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"mdl-layout mdl-js-layout\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<header class=\"mdl-layout__header mdl-layout__header--scroll private-header\">\n");
      out.write("    <div class=\"mdl-layout__header-row\">\n");
      out.write("        <!-- Title -->\n");
      out.write("        <span class=\"mdl-layout-title\">Title</span>\n");
      out.write("        <!-- Add spacer, to align navigation to the right -->\n");
      out.write("        <div class=\"mdl-layout-spacer\"></div>\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"mdl-navigation\">\n");
      out.write("            <a class=\"mdl-navigation__link account-group\" href=\"#\"><i class=\"material-icons\">account_circle</i><span>");
      out.print( user.getFirstName());
      out.write("</span>\n");
      out.write("\n");
      out.write("                <ul class=\"demo-list-item mdl-list md-profile-menu\">\n");
      out.write("                    <li class=\"mdl-list__item\">\n");
      out.write("                        <span class=\"mdl-list__item-primary-content\" onclick=\"window.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Views/Private/UserProfileInfo.jsp'\">\n");
      out.write("                            My account\n");
      out.write("                        </span>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"mdl-list__item\">\n");
      out.write("                        <span class=\"mdl-list__item-primary-content\" onclick=\"window.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/session/logout.do'\">\n");
      out.write("                            Sign out\n");
      out.write("                        </span>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </a>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("<div class=\"mdl-layout__drawer\">\n");
      out.write("    <span class=\"mdl-layout-title\">Title</span>\n");
      out.write("    <nav class=\"mdl-navigation\">\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Views/Private/Booking.jsp\"\"><i class=\"material-icons\">assignment</i> Book cab</a>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"\"><i class=\"material-icons\">show_chart</i> Booking status</a>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"\"><i class=\"material-icons\">assignment</i> Settings</a>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"\"><i class=\"material-icons\">history</i> History</a>\n");
      out.write("        <hr>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"\"><i class=\"material-icons\">settings</i> Settings</a>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"\"><i class=\"material-icons\">feedback</i> Send feedback</a>\n");
      out.write("        <a class=\"mdl-navigation__link\" href=\"\"><i class=\"material-icons\">help</i> Help</a>\n");
      out.write("    </nav>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <main class=\"mdl-layout__content\">\n");
      out.write("                <div class=\"page-content booking-status\"><!-- Your content goes here -->\n");
      out.write("                    <h4 class=\"status-heading\">Booking status</h4>\n");
      out.write("                    <section class=\"mdl-grid booking-info\">\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--12-col\">\n");
      out.write("                            <span>Trip</span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--5-col\">\n");
      out.write("                            <h4 class=\"\">123 6th St. Melbourne, FL 32904</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--2-col text-center\">\n");
      out.write("                            <h4 class=\"\"><i class=\"material-icons\">arrow_forward</i></h4>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--5-col\">\n");
      out.write("                            <h4 class=\"\">123 6th St. Melbourne, FL 32904</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <hr>\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--8-col\">\n");
      out.write("                            <label>Date</label>\n");
      out.write("                            <h6 class=\"\">12 Aug 2017</h6>\n");
      out.write("\n");
      out.write("                            <label>Class</label>\n");
      out.write("                            <h6 class=\"\">Prime</h6>\n");
      out.write("\n");
      out.write("                            <label>Cab</label>\n");
      out.write("                            <h6 class=\"\">Maruti Suzuki Swift Dezire</h6>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--4-col\">\n");
      out.write("                            <label>Total fare</label>\n");
      out.write("                            <h2 class=\"\">402.50</h2>\n");
      out.write("                            <p>Your payment is pending. <a href=\"#\" class=\"text-link\" onclick=\"openModalPopup('paymentModal');\">Pay now</a></p>\n");
      out.write("                        </div>\n");
      out.write("                        <hr>\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--12-col text-right\">\n");
      out.write("                            <a href=\"#\" class=\"text-link\" onclick=\"openModalPopup('cancelBooking');\">CANCEL BOOKING</a>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"dialog-wrapper payment-gateway\" id=\"paymentModal\">\n");
      out.write("                    <div class=\"mdl-grid dialog-main confirmation-dialog\">\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--12-col dialog-header\">\n");
      out.write("                            <h3 class=\"modal-title\">Payment gateway</h3>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--12-col dialog-body\">\n");
      out.write("                            <div class=\"mdl-textfield mdl-js-textfield time-input mdl-textfield--floating-label\">\n");
      out.write("                                <input class=\"mdl-textfield__input\" type=\"text\" id=\"mm\" onkeyup=\"getCreditCardType(this.value)\">\n");
      out.write("                                <label class=\"mdl-textfield__label\" for=\"mm\">Card number</label>\n");
      out.write("                                <div class=\"b3id-card-icon-images-row b3-card-icon-images-row\">\n");
      out.write("                                    <div class=\"b3-card-icon-image-container\"><img\n");
      out.write("                                            src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAUCAMAAADbT899AAABOFBMVEXd3d2wsLCtra3d3d0QNH7///8TN4Dg4OARNX83VZMpSYyzvtYVOIEhQ4gkRYlcdacYO4MiRIhJZJ2ms8/6+/w1VJLCy94eQIYrS43y9Pg+XJf29vZddqhiequ7xdvEzd/s7/UbPYRxhrOvu9R9kblGYptSbKLS2Od+krp6jrhHY5yxvdWImr/z9fnQ1+ZBXpltg7GdrMrm6vJNaJ+lss6uutPI0eLl6fHO1eUlRoqwvNRqga/o7POqt9F3i7Zfd6mVpcb4+fvP1uXV3OlCX5m1wNft8PUXOoI8WZZbdKcZPIOercuJm8CBlLuaqsn7/P3+/v6Elr2On8IaPISPoMPd4u3j6PBnfq2SosTZ3+tqgK9pf65mfa0sTI09WpY/XJguTY4zUpHFzuDByt4yUZGruNLu8Pb19/rublsSAAAABHRSTlPPHRzQ6ecnYAAAAN5JREFUeNq10kVuBEEQRNGa8Y+GYWYzMzMzMzPb97+BlyVZVns1sX7KRWSYkHEDYsKmoaqAVI1xFRi3PqBl4RdYTDqxrNRDYzsZZUuwIzXtMWovHNClXIKpXjqavda2kSWpE+4s6CahSSrqo3+AyqCkIYbxLVCasXEmjlNMz8SYnZPmiUa8sgXLrJBeXSMirW/A5tZ2PLdLwYJ9ihzqiJqkkwynZ5z7cS4suATnStfc3ObvH1Je4ZGnZ5+kBXrxatKr9/ZehI/PqJeXyk7pz6K+vuvwi2Bg/htMOHhyoR8v2CEWko8rOgAAAABJRU5ErkJggg==\"\n");
      out.write("                                            alt=\"Visa\" class=\"b3id-card-icon-image\"></div>\n");
      out.write("                                    <div class=\"b3-card-icon-image-container\"><img\n");
      out.write("                                            src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAUCAYAAADskT9PAAACb0lEQVR4AcWWA4zkYACFZ/ds27atODkEh+Bs2w7Otm1zbdu2zZlZt50p3m3/Y5MO0tNLXjmd9/3+VVZWVt3S09Mjs7Ky8C8tZn78+LGrqvYiiqIo/GuJmSKESqQxqWoKug/2oI5eBn3pHvSuvgDL4buEomBwCY/BRl4En/4J0FXAHInZJgH0Lj7Qdh2HUlUXict6jQX79hx076aCftRFYublUPAZ1r8PwDx9T8LkXN6+HbDYAvpzbUionLno68oB+LxCaFoMkg1XW3YBP68usFwFrLEEc7eTLADztBcEbaIygOqdRw2WvrJHaxL+3eyxlgZrQe+5XhlA+dhZBgHo8U0lAPzuRgYBmDejlAFo+0wxCMBMaywBELY3MAzwtLfCGpg2zyAANaaZtAb2NjYIoHs/SRkAdfqGQYCKDu0kAPrTrQ0CsIGHlQGAoqHtO1UWQF1rdkYDEi5sqAfmgYHqfzUMYDTK5wE2IByaloNlIbRNOoJfUB+66x3kw5/1BZ/jongekMwHFbOWQW3R9Xs4ua5avBl8SiRY/wNgHveQtrv9HAgV6cpnQgMgZA1ggyKAqhpIxNEQ1LHg870hVOVAXgoAkpKSiDMyMpCcnIzMzEyEhYUR29rakmdqtRrh4eFITU0l18HBweLvxZWOXHt5eSkHeP36NW7evIn79+/j5cuXuHPnDi5evAhPT0/io0eP4uHDh3B0dMSrV6+IrayscOLECQQEBJDnTk5OygGKioqI8/PzERsbS0rs6+srruWkdAkJCcjOzoZGo0F0dDT5nbe3N9LS0sBxHIEoKSkxDiBuCv7rhkTcFv2vLZm4HfwCIId4CGkfoe4AAAAASUVORK5CYII=\"\n");
      out.write("                                            alt=\"Mastercard\" class=\"b3id-card-icon-image\"></div>\n");
      out.write("                                    <div class=\"b3-card-icon-image-container\"><img\n");
      out.write("                                            src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAUCAYAAADskT9PAAABmklEQVR4Ae2WM7QcQBSGt++TKumLmH1s20kT27Zt284z1rbNt97Hets/c29sO3POWN/FQFJSUtI2kUi4UqkUfmakPR89etRGIgruYrGInx1oT4KQEM3HQqu1iq+O7XfpP7o27f1JgP8A/wFWPQnjtDaN9WURbCiPYGdNHIsfBLGjOo5F9wPYK03gkKIOSx8Gsb06hvP6DI85oUmhzwnrtwOsLQ1jU0UUQ8/YsbUyxnHyVTeuW3KYc8eP1SVhjL3ohCLSwu00fuIVNwOOOOf8dgCS8IgyiSfuBpauKtCEPaKt1NvI5cei/ZqAoQ0Pyut4rDzcgqOqJIafc3xfHyA1k9rHXXJRzqagSOWFIi56K64qiXw/gNbrFKz+JQJiXWmEN5h/L4BZN7yYft3D7WSmbVUxTL3mYVOsfBL+vgCnhDMeU6fYLGuE7ffJErhqznHcXZvAischlPkaGfCWLY8lj0Lf1wSDT9s5dt6jx4BTNvQ8YESP/Ub0Pm6h9pex7wkr9488/xlO+P8i+g9An4Jf+iGhb9Gv+pLRd/App7Ze61KPSBIAAAAASUVORK5CYII=\"\n");
      out.write("                                            alt=\"Amex\" class=\"b3id-card-icon-image\"></div>\n");
      out.write("                                    <div class=\"b3-card-icon-image-container\"><img\n");
      out.write("                                            src=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAUCAYAAADskT9PAAACU0lEQVR4Ae2WQ4NcWRhA+2/Etm2bbdu2jdi2rU04Gc/EZtu2VS/Fk667iG1dfFid8/x0CgoK9PLy8kpaNl94l7SwdXW0hUwm40sPLVPL1grwtYaW/Uvg+xBQq9XP9fJH8id1fW4GSqn50wgMGTAQZwdHIsMjePjwIRGhYSxdvARfL2/+//c/rly+zJyZs3B1cubetcvccZ5MhklrUl178uDsHqzMLQDYs2s3+/buZXD/AXi4uXH+3G9MHDsOO2sbkpOSXy8wf84cABbEJ7Bjxw4h4O7qyppVq6mrq2PWtOlUVVYCkLhtAbkWbajyaEdlcAfSlk7CxdGJzMxM9Ofr0tzczNiRo9i7ezfXr13Hyd6BhLh4Thw7/m4Cu3ftEgJyuZwjhw/j4+nFjKlTqa6uBiB5VwKF7u2oj+hI3cJOZG6YzKWLF9GdO49FCxYAMGXiJG7euMGD+w+EvO6cuWg0mjdfAkd7e2KiokhMTBQCbs4uONjZsX/fPnEZZs+YKc7KvWsXSV4wheL4DuSv6kvJvVMAAlRQUADw3CXw9/Vl88ZNYr/3TShJ0pO65Qie6+uLklFIDU/6xsZG3nXk3vzrKz2GshoU5+NIC+zwhQXkTSgvb0Ja1h9ZQifSAtp+IQGpDuWFdUgrBgqw2F9CQFOWguJMGNKSXk+gn19AVovq9kHkuw2fB35OAQFNPIX8qDPSou5PAO8i8IE/JBo0JYkoL24QRyot6PKu0Ce7OroDmTGDlNpfMt23/pIl3SLnn/1kHQ4jY7UuaaHdhf1HbAEvPx4c/xjfP9/8aMMZTwAAAABJRU5ErkJggg==\"\n");
      out.write("                                            alt=\"Discover\" class=\"b3id-card-icon-image\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"mdl-textfield mdl-js-textfield width40\">\n");
      out.write("                                <input class=\"mdl-textfield__input\" type=\"text\" id=\"hh\" placeholder=\"MM\">\n");
      out.write("                                <label class=\"mdl-textfield__label\" for=\"hh\"></label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdl-textfield mdl-js-textfield width40 text-center\">-</div>\n");
      out.write("                            <div class=\"mdl-textfield mdl-js-textfield width40\">\n");
      out.write("                                <input class=\"mdl-textfield__input\" type=\"text\" id=\"hh\" placeholder=\"YY\">\n");
      out.write("                                <label class=\"mdl-textfield__label\" for=\"hh\"></label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdl-textfield mdl-js-textfield width60\">\n");
      out.write("                                <input class=\"mdl-textfield__input\" type=\"text\" id=\"cvc\" placeholder=\"CVC\">\n");
      out.write("                                <label class=\"mdl-textfield__label\" for=\"cvc\"></label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mdl-textfield mdl-js-textfield mdl-textfield--floating-label\">\n");
      out.write("                                <input class=\"mdl-textfield__input\" type=\"text\" id=\"cvc\">\n");
      out.write("                                <label class=\"mdl-textfield__label\" for=\"cvc\">Cardholder name</label>\n");
      out.write("                            </div>\n");
      out.write("                            <h5>Total amount - <span>250</span></h5>\n");
      out.write("                            <hr>\n");
      out.write("                            <p class=\"payment-term\">By continuing, you agree to make payment through our payment gateway.In case your\n");
      out.write("                                transaction failed or interrupted then your amount will be refunded to your account within 2 - 3 days. </p>\n");
      out.write("                            <div class=\"mdl-cell mdl-cell--12-col text-right\">\n");
      out.write("                                <button class=\"mdl-button mdl-js-button mdl-button--raised mdl-button--colored mdl-js-ripple-effect\">\n");
      out.write("                                    pay\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--cancel booking modal confirmation-->\n");
      out.write("\n");
      out.write("                <div class=\"dialog-wrapper\" id=\"cancelBooking\">\n");
      out.write("                    <div class=\"mdl-grid dialog-main confirmation-dialog\">\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--12-col dialog-header\">\n");
      out.write("                            <h3 class=\"modal-title\">Cancel booking?</h3>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--12-col dialog-body\">\n");
      out.write("                            <p>This will remove all your selected booking history from the record.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mdl-cell mdl-cell--12-col dialog-footer text-right\">\n");
      out.write("                            <button class=\"text-link\">NO</button>\n");
      out.write("                            <button class=\"text-link\">YES,CANCEL BOOKING</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.bootcss.com/jquery/1.9.0/jquery.min.js\"></script>\n");
      out.write("        <script src=\"../../resources/Scripts/dropify.min.js\"></script>\n");
      out.write("        <script src=\"../../resources/Scripts/basic-utility.js\"></script>\n");
      out.write("        <script src=\"../../resources/Scripts/modal-script.js\"></script>\n");
      out.write("\n");
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
