package org.apache.jsp.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Booking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Booking</title>\n");
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
      out.write("\n");
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
      out.write("      <ul class=\"mdl-stepper mdl-stepper--feedback mdl-stepper--horizontal\" id=\"demo-stepper-feedback\">\n");
      out.write("        <li class=\"mdl-step\" data-step-transient-message=\"Step 1 looks great! Step 2 is coming up.\">\n");
      out.write("\n");
      out.write("          <div class=\"mdl-step__content\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"mdl-step__actions\">\n");
      out.write("            <button class=\"mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--colored mdl-button--raised\" data-stepper-next>\n");
      out.write("              Continue\n");
      out.write("            </button>\n");
      out.write("            <button class=\"mdl-button mdl-js-button mdl-js-ripple-effect\" data-stepper-cancel>\n");
      out.write("              Cancel\n");
      out.write("            </button>\n");
      out.write("            <button disabled class=\"mdl-button mdl-js-button mdl-js-ripple-effect\" data-stepper-back>\n");
      out.write("              Back\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"mdl-step mdl-step--demo-with-form\" data-step-transient-message=\"Step 2 looks great! Step 3 is coming up.\">\n");
      out.write("    <span class=\"mdl-step__label\">\n");
      out.write("          <span class=\"mdl-step__title\">\n");
      out.write("            <span class=\"mdl-step__title-text\">Title longer than it should be</span>\n");
      out.write("    </span>\n");
      out.write("    </span>\n");
      out.write("          <div class=\"mdl-step__content\">\n");
      out.write("            <form action=\"#\">\n");
      out.write("              <div class=\"mdl-textfield mdl-js-textfield\">\n");
      out.write("                <input autocomplete=\"off\" class=\"mdl-textfield__input\" type=\"text\" id=\"stepper-transient-message\">\n");
      out.write("                <label class=\"mdl-textfield__label\" for=\"stepper-transient-message\">Transient message for current step</label>\n");
      out.write("                <span class=\"mdl-textfield__error\">Invalid input</span>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"mdl-step__actions\">\n");
      out.write("            <button class=\"mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--colored mdl-button--raised\" data-stepper-next>\n");
      out.write("              Continue\n");
      out.write("            </button>\n");
      out.write("            <button class=\"mdl-button mdl-js-button mdl-js-ripple-effect\" data-stepper-cancel>\n");
      out.write("              Cancel\n");
      out.write("            </button>\n");
      out.write("            <button disabled class=\"mdl-button mdl-js-button mdl-js-ripple-effect\" data-stepper-back>\n");
      out.write("              Back\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"mdl-step\" data-step-transient-message=\"Step 3 looks great! Thanks.\">\n");
      out.write("    <span class=\"mdl-step__label\">\n");
      out.write("          <span class=\"mdl-step__title\">\n");
      out.write("            <span class=\"mdl-step__title-text\">Title of step 3</span>\n");
      out.write("    </span>\n");
      out.write("    </span>\n");
      out.write("          <div class=\"mdl-step__content\"></div>\n");
      out.write("          <div class=\"mdl-step__actions\">\n");
      out.write("            <button class=\"mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--colored mdl-button--raised\" data-stepper-next>\n");
      out.write("              Continue\n");
      out.write("            </button>\n");
      out.write("            <button class=\"mdl-button mdl-js-button mdl-js-ripple-effect\" data-stepper-cancel>\n");
      out.write("              Cancel\n");
      out.write("            </button>\n");
      out.write("            <button disabled class=\"mdl-button mdl-js-button mdl-js-ripple-effect\" data-stepper-back>\n");
      out.write("              Back\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </main>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script defer src=\"https://code.getmdl.io/1.3.0/material.min.js\"></script>\n");
      out.write("<script  src=\"../resources/Scripts/mdl-stepper.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("  (function () {\n");
      out.write("    window.addEventListener('load', function () {\n");
      out.write("    var selector = '.mdl-stepper';\n");
      out.write("    // Select stepper container element\n");
      out.write("    var stepperElement = document.querySelector(selector);\n");
      out.write("    var Stepper;\n");
      out.write("    var steps;\n");
      out.write("    var componentHandler;\n");
      out.write("    var inputTransientMessage /** @type {HTMLElement} */;\n");
      out.write("    if (!stepperElement) return;\n");
      out.write("    componentHandler.upgradeElement(stepperElement);\n");
      out.write("    // Get the MaterialStepper instance of element to control it.\n");
      out.write("    Stepper = stepperElement.MaterialStepper;\n");
      out.write("\n");
      out.write("    if (!Stepper) {\n");
      out.write("      console.error('MaterialStepper instance is not available for selector: ' + selector + '.');\n");
      out.write("      return;\n");
      out.write("    }\n");
      out.write("    steps = stepperElement.querySelectorAll('.mdl-step');\n");
      out.write("    for (var i = 0; i < steps.length; i++) {\n");
      out.write("\n");
      out.write("      // When user clicks on [data-stepper-next] button of step.\n");
      out.write("      steps[i].addEventListener('onstepnext', (function (e, step) {\n");
      out.write("        return function () {\n");
      out.write("          // {element}.MaterialStepper.next() change the state of current step to \"completed\"\n");
      out.write("          // and move one step forward.\n");
      out.write("          inputTransientMessage = step.querySelector('#stepper-transient-message');\n");
      out.write("\n");
      out.write("          if (inputTransientMessage && inputTransientMessage.value.length) {\n");
      out.write("            step.setAttribute('data-step-transient-message', inputTransientMessage.value);\n");
      out.write("          }\n");
      out.write("          setTimeout(function () {\n");
      out.write("            Stepper.next();\n");
      out.write("          }, 3000);\n");
      out.write("        };\n");
      out.write("      })(event, steps[i]));\n");
      out.write("    }\n");
      out.write("    // When all steps are completed this event is dispatched.\n");
      out.write("    stepperElement.addEventListener('onsteppercomplete', function (e) {\n");
      out.write("      var toast = document.querySelector('#snackbar-stepper-complete');\n");
      out.write("      if (!toast) return;\n");
      out.write("      toast.MaterialSnackbar.showSnackbar({\n");
      out.write("        message: 'Stepper feedback are completed',\n");
      out.write("        timeout: 4000,\n");
      out.write("        actionText: 'Ok'\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("    });\n");
      out.write("  })();\n");
      out.write("  (function () {\n");
      out.write("    var toggle = document.querySelector('[href=\"#stepper-feedback-toggle\"]');\n");
      out.write("    var snippetDirections = document.querySelector('#snippet-stepper-feedback');\n");
      out.write("    var stepperElement = snippetDirections.querySelector('.mdl-stepper');\n");
      out.write("    var cssClassHorizontal = 'mdl-stepper--horizontal';\n");
      out.write("    toggle.addEventListener('click', function (event) {\n");
      out.write("      event.preventDefault();\n");
      out.write("\n");
      out.write("      if (!stepperElement) return;\n");
      out.write("      if (stepperElement.classList.contains(cssClassHorizontal)) {\n");
      out.write("        stepperElement.classList.remove(cssClassHorizontal);\n");
      out.write("      } else {\n");
      out.write("        stepperElement.classList.add(cssClassHorizontal);\n");
      out.write("      }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("  })();\n");
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
