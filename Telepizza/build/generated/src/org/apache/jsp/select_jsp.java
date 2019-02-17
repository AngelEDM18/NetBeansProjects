package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.*;
import java.util.ArrayList;

public final class select_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <title>Documento sin titulo</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .inicio {\n");
      out.write("                text-align: right;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        ");

            /*String oferta = request.getParameter("oferta");
            String cantOferta = request.getParameter("cantOferta");
            String menu = request.getParameter("menu");
            String cantMenu = request.getParameter("cantMenu");
            String pizza = request.getParameter("pizza");
            String cantPizza = request.getParameter("cantPizza");
            String entrante = request.getParameter("entrante");
            String cantEntrante = request.getParameter("cantEntrante");
            String hamburguesa = request.getParameter("hamburguesa");
            String cantHamburguesa = request.getParameter("cantHamburguesa");
            String pasta = request.getParameter("pasta");
            String cantPasta = request.getParameter("cantPasta");
            String ensalada = request.getParameter("ensalada");
            String cantEnsalada = request.getParameter("cantEnsalada");
            String bebida = request.getParameter("bebida");
            String cantBebida = request.getParameter("cantBebida");
            String postre = request.getParameter("postre");
            String cantPostre = request.getParameter("cantPostre");
            HttpSession sesion = request.getSession();
            String usuario = sesion.getAttribute("usuario").toString();
            String fecha = sesion.getAttribute("fecha").toString();
            String hora = sesion.getAttribute("hora").toString();*/
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"select.jsp\" method=\"post\">\n");
      out.write("            <table width=\"100%\" border=\"0\">\n");
      out.write("                <tr bgcolor=\"#FF0000\">\n");
      out.write("                    <td width=\"4%\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("                    <td colspan=\"3\" class=\"inicio\"><a href=\"ofertas.jsp\">Inicio </a></td>\n");
      out.write("                    <td width=\"7%\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr bordercolor=\"#FF0000\" bgcolor=\"#FF0000\">\n");
      out.write("                    <td width=\"4%\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("                    <td colspan=\"3\"><img src=\"images/images_2016/logo_telepizza.gif\"  /><br />\n");
      out.write("                        <a href=\"ofertas.jsp\"><img src=\"images/images_2016/ofertas.gif\" width=\"73\" height=\"31\" longdesc=\"http://ofertas.jsp\" /></a><a href=\"menus.jsp\"><img src=\"images/images_2016/menus.gif\" width=\"66\" height=\"31\" longdesc=\"http://ASD\" /></a><a href=\"pizzas.jsp\"><img src=\"images/images_2016/pizzas.gif\" width=\"66\" height=\"31\" longdesc=\"http://SDFG\" /></a><a href=\"entrantes.jsp\"><img src=\"images/images_2016/entrantes.gif\" width=\"85\" height=\"31\" longdesc=\"http://DFGSD\" /></a><a href=\"hamburguesa.jsp\"><img src=\"images/images_2016/hamburguesa.gif\" width=\"123\" height=\"31\" longdesc=\"http://DFGDF\" /></a><a href=\"pasta.jsp\"><img src=\"images/images_2016/pasta.gif\" width=\"58\" height=\"31\" longdesc=\"http://DFGH\" /></a><a href=\"ensalada.jsp\"><img src=\"images/images_2016/ensaladas.gif\" width=\"94\" height=\"31\" longdesc=\"http://DFGH\" /></a><a href=\"bebidas.jsp\"><img src=\"images/images_2016/bebidas.gif\" width=\"76\" height=\"31\" longdesc=\"http://SFGHDF\" /></a><a href=\"postres.jsp\"><img src=\"images/images_2016/postres.gif\" width=\"70\" height=\"31\" alt=\"\" longdesc=\"http://SDF\" /></a></td>\n");
      out.write("                    <td width=\"7%\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr bordercolor=\"#FF0000\" bgcolor=\"#FF0000\">\n");
      out.write("                    <td width=\"4%\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("                    <td width=\"46%\">&nbsp;</td>\n");
      out.write("                    <td colspan=\"2\">&nbsp;</td>\n");
      out.write("                    <td width=\"7%\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td width=\"4%\" rowspan=\"5\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("                    <td width=\"46%\" align=\"center\" rowspan=\"5\" class=\"ff\">\n");
      out.write("                        Postres\n");
      out.write("                        <br/><br/><input type=\"submit\" value=\"Confirmar pedido\"/>\n");
      out.write("                    </td>\n");
      out.write("                    <td colspan=\"2\" align=\"right\">Bienvenido</td>\n");
      out.write("                    <td width=\"7%\" rowspan=\"5\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"25%\" align=\"center\"><img src=\"images/images_2016/postres.png\" width=\"549\" height=\"312\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"18%\" class=\"inicio\"></td>\n");
      out.write("                    <td width=\"25%\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td colspan=\"2\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                </tr>\n");
      out.write("                <tr bgcolor=\"#990000\" >\n");
      out.write("                    <td width=\"4%\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("                    <td align=\"left\" width=\"46%\"><img src=\"images/images_2016/telepizza_espana.gif\" width=\"133\" height=\"30\" /></td>\n");
      out.write("                    <td align=\"right\" colspan=\"2\"><img src=\"images/images_2016/ico_facebook.gif\" width=\"31\" height=\"30\" /> <img src=\"images/images_2016/ico_twitter.gif\" width=\"31\" height=\"30\" /> <img src=\"images/images_2016/ico_youtube.gif\" width=\"31\" height=\"30\" /> <img src=\"images/images_2016/ico_google.gif\" width=\"31\" height=\"30\" /> <img src=\"images/images_2016/ico_instagram.gif\" width=\"31\" height=\"30\" />&nbsp; </td>\n");
      out.write("                    <td width=\"7%\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
