package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Colores_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/FormuColores.jsp");
    _jspx_dependants.add("/FormuColoresConAviso.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Color de fondo a la carta</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        String color = request.getParameter("color");
        String nombre = request.getParameter("nombre");

        if (nombre == null) {
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Formulario de nombres y colores</h2>\n");
      out.write("        <h3>Rellena los datos indicados y pulsa ENVIAR</h3>\n");
      out.write("\n");
      out.write("        <form action=\"/Colores.jsp\">\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr><td>Introduce tu nombre:</td><td><input type=\"text\" name=\"nombre\" size=\"10\"></td></tr>\n");
      out.write("                <tr><td>Color de fondo en ingles:</td><td><input type=\"text\" name=\"colores\" size=\"10\"></td></tr>\n");
      out.write("            </table><p>\n");
      out.write("                <input type=\"submit\" value=\"Enviar\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    ");
} else if (color.length() == 0 || nombre.length() == 0) {
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Formulario de nombres y colores</h2>\n");
      out.write("        <h3>Rellena los datos indicados y pulsa ENVIAR</h3>\n");
      out.write("\n");
      out.write("        <font color=\"red\"><h3>¡¡ Debes rellenar todos los cuadros !!</h3></font>\n");
      out.write("        <form action=\"/Colores.jsp\">\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <tr><td>Introduce tu nombre:</td><td><input type=\"text\" name=\"nombre\" size=\"10\"></td></tr>\n");
      out.write("                <tr><td>Color de fondo en ingles:</td><td><input type=\"text\" name=\"colores\" size=\"10\"></td></tr>\n");
      out.write("            </table><p>\n");
      out.write("                <input type=\"submit\" value=\"Enviar\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    ");
 } else {
      out.write("\n");
      out.write("    <body  bgcolor=\"");
      out.print(color);
      out.write("\">\n");
      out.write("        <h2>Datos introducidos</h2>\n");
      out.write("        Nombre: <font color=\"red\">");
      out.print(nombre);
      out.write("</font><p>\n");
      out.write("            Color de fondo: <font color=\"red\">");
      out.print(color);
      out.write("</font>\n");
      out.write("            ");
 }
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
