package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class hombres extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext contexto = getServletContext();
        RequestDispatcher rd;
        String nombre = (String) contexto.getAttribute("nombre");
        String apellidos = (String) contexto.getAttribute("apellidos");
        int telefono = (int) contexto.getAttribute("telefono");
        String ciudad = (String) contexto.getAttribute("ciudad");
        String sexo = (String) contexto.getAttribute("sexo");
        String pais = (String) contexto.getAttribute("pais");
        String comentario = (String) contexto.getAttribute("comentario");
        String[] ocio = (String[]) contexto.getAttribute("ocio");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head><title>Datos introducidos por formulario</title>"
                + "<style>body{background-color:cyan} .rojo{color:red}</style>"
                + "</head>");
        out.print("<body>");
        out.print("<h1>DATOS ENCUESTA</h1>");
        out.print("<h2 class='rojo'>Hola " + nombre + "</h2>");
        out.print("<table border=\"5\">");
        out.print("<tr><td>nombre</td><td>" + nombre + "</td></tr>");
        out.print("<tr><td>apellidos</td><td>" + apellidos + "</td></tr>");
        out.print("<tr><td>telefono</td><td>" + telefono + "</td></tr>");
        out.print("<tr><td>lugar de nacimiento</td><td>" + ciudad + "</td></tr>");
        out.print("<tr><td>sexo</td><td>" + sexo + "</td></tr>");
        out.print("<tr><td>pais de origen</td><td>" + pais + "</td></tr>");
        out.print("<tr><td>areaTexto</td><td>" + comentario + "</td></tr>");
        out.print("</table>");
        out.print("<p>" + nombre.toUpperCase() + ", tus actividades de ocio preferidas son:");
        out.print("</br></br>");

        if (ocio != null) {
            out.print("<table border=\"5\">");
            for (int i = 0; i < ocio.length; i++) {
                out.print("<tr><td>" + ocio[i] + "</td></tr>");
            }
            out.print("</table>");
        }
        out.print("<a href='/Encuesta/tomcat.html'>Sorpresa</a>");
        out.print("</body>");
        out.print("</html>");
    }

}
