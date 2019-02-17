package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ayuda.Film;
import ayuda.Film;
import ayuda.Customer;
import java.util.List;
import ayuda.Store;
import ayuda.Store;
import ayuda.Ayudante;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Vídeoteca</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img src=\"imagenes/videoteca.gif\" width=\"200\" height=\"200\">\n");
      out.write("        <form action=\"peliculasAlquiladasCliente.jsp\" method=\"get\">\n");
      out.write("        <p style=\"width: 100%; background-color: darkcyan; color:white\">Listado de películas alquiladas por un cliente en un videoclub:</p>\n");
      out.write("        Videoclub:         \n");
      out.write("        <select id=\"idvideoclub\" name=\"idvideoclub\">\n");
      out.write("                            ");
 
        
                Ayudante fh=new Ayudante();
        List<Store> videoclubs=fh.getStores();
        Store nuevo=null;
        
        for (int i = 0; i < videoclubs.size(); i++) {
                nuevo=videoclubs.get(i);
                out.print("<option value='"+nuevo.getStoreId()+"'>"+nuevo.getNombre());
            }
        
        
        
      out.write("\n");
      out.write("\n");
      out.write("        </select>\n");
      out.write("         Clientes:\n");
      out.write("                <select id=\"idcliente\" name=\"idcliente\">\n");
      out.write("                            ");
 
        
                
        List<Customer> clientes=fh.getClientes();
        Customer cliente=null;
        
        for (int i = 0; i < clientes.size(); i++) {
                cliente=clientes.get(i);
                out.print("<option value='"+cliente.getCustomerId()+"'>"+cliente.getFirstName()+" "+cliente.getLastName());
            }
        
        
        
      out.write("\n");
      out.write("\n");
      out.write("        </select>\n");
      out.write("        <input type=\"hidden\" id=\"r1\" name=\"r1\" value=\"0\">\n");
      out.write("        \n");
      out.write("  <input style=\"float:right\" type=\"submit\" value=\"Mostrar\">\n");
      out.write("  </form>\n");
      out.write("        <p style=\"width: 100%; background-color: darkcyan; color:white\">Total de dinero gastado por un cliente en el alquiler de películas de un videoclub en un mes:</p>\n");
      out.write("        <form action=\"totalClienteMes.jsp\" method=\"post\">\n");
      out.write("                    Videoclub:         \n");
      out.write("        <select id=\"idvideoclub\" name=\"idvideoclub\">\n");
      out.write("                            ");
 
        
             
        
        for (int i = 0; i < videoclubs.size(); i++) {
                nuevo=videoclubs.get(i);
                out.print("<option value='"+nuevo.getStoreId()+"'>"+nuevo.getNombre());
            }
        
        
        
      out.write("\n");
      out.write("\n");
      out.write("        </select>\n");
      out.write("         Clientes:\n");
      out.write("                <select id=\"idcliente\" name=\"idcliente\">\n");
      out.write("                            ");
 
        
                
      
        
        for (int i = 0; i < clientes.size(); i++) {
                cliente=clientes.get(i);
                out.print("<option value='"+cliente.getCustomerId()+"'>"+cliente.getFirstName()+" "+cliente.getLastName());
            }
        
        
        
      out.write("\n");
      out.write("\n");
      out.write("        </select>\n");
      out.write("        \n");
      out.write("        Mes desde:\n");
      out.write("        <select id=\"desde\" name=\"desde\">\n");
      out.write("            \n");
      out.write("            <option value=\"05\">Mayo</option>\n");
      out.write("            <option value=\"06\">Junio</option>\n");
      out.write("            <option value=\"07\">Julio</option>\n");
      out.write("            <option value=\"08\">Agosto</option>\n");
      out.write("            \n");
      out.write("        </select>\n");
      out.write("        Mes hasta:\n");
      out.write("                <select id=\"hasta\" name=\"hasta\">\n");
      out.write("            \n");
      out.write("            <option value=\"05\">Mayo</option>\n");
      out.write("            <option value=\"06\">Junio</option>\n");
      out.write("            <option value=\"07\">Julio</option>\n");
      out.write("            <option value=\"08\">Agosto</option>\n");
      out.write("            \n");
      out.write("        </select>\n");
      out.write("        <input style=\"float:right\" type=\"submit\" value=\"Mostrar\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <p style=\"width: 100%; background-color: darkcyan; color:white\">Listado de clientes de un videoclub y el total gastado en el alquiler de películas:</p>\n");
      out.write("  \n");
      out.write("        <form action=\"clientesTotalGastado.jsp\" method=\"post\">\n");
      out.write("        Video club: \n");
      out.write("        <select id=\"idvideoclub\" name=\"idvideoclub\">\n");
      out.write("        ");
 
        for (int i = 0; i < videoclubs.size(); i++) {
                nuevo=videoclubs.get(i);
                out.print("<option value='"+nuevo.getStoreId()+"'>"+nuevo.getNombre());
            }
        
      out.write("\n");
      out.write("        </select>\n");
      out.write("        <input type=\"hidden\" id=\"r1\" name=\"r1\" value=\"0\">\n");
      out.write("            <input style=\"float:right\" type=\"submit\" value=\"Mostrar\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <p style=\"width: 100%; background-color: darkcyan; color:white\">Listado de películas de un videoclub y el total de veces que han sido alquiladas:</p>\n");
      out.write("    \n");
      out.write("            <form action=\"peliculasNumeroAlquiler.jsp\" method=\"post\">\n");
      out.write("        Video club: \n");
      out.write("        <select id=\"idvideoclub\" name=\"idvideoclub\">\n");
      out.write("        ");
 
        for (int i = 0; i < videoclubs.size(); i++) {
                nuevo=videoclubs.get(i);
                out.print("<option value='"+nuevo.getStoreId()+"'>"+nuevo.getNombre());
            }
        
      out.write("\n");
      out.write("        </select>\n");
      out.write("            <input style=\"float:right\" type=\"submit\" value=\"Mostrar\">\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("            <p style=\"width: 100%; background-color: darkcyan; color:white\">Listado de actores que trabajan en una película:</p>\n");
      out.write("    \n");
      out.write("                    <form action=\"listaActores.jsp\" method=\"post\">\n");
      out.write("        Película: \n");
      out.write("        <select id=\"idpelicula\" name=\"idpelicula\">\n");
      out.write("        ");
 
            List<Film> listaPeliculas=fh.listadoPeliculas();
        for (int i = 0; i < listaPeliculas.size(); i++) {
                Film nueva=listaPeliculas.get(i);
                out.print("<option value='"+nueva.getFilmId()+"'>"+nueva.getTitle());
            }
        
      out.write("\n");
      out.write("        </select>\n");
      out.write("            <input style=\"float:right\" type=\"submit\" value=\"Mostrar\">\n");
      out.write("        </form>\n");
      out.write("    \n");
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
