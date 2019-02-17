package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Articulo;

public class servlet extends HttpServlet {

    public static ArrayList<Articulo> art = new <Articulo>ArrayList();

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext contexto = getServletContext();
        RequestDispatcher rd;
        try (PrintWriter out = response.getWriter()) {
            String nombre = request.getParameter("articulo");
            double precio = 0;
            int cantidad = Integer.parseInt(request.getParameter("uds"));
            if (nombre.equalsIgnoreCase("BotellaAgua")) {
                precio = 0.50;
            } else if (nombre.equalsIgnoreCase("BotellaCerveza")) {
                precio = 0.20;
            } else if (nombre.equalsIgnoreCase("Pan")) {
                precio = 0.10;
            } else if (nombre.equalsIgnoreCase("Leche")) {
                precio = 0.40;
            }
            double total = Math.round(cantidad * precio);

            Articulo articulo = new Articulo(nombre, cantidad, precio, total);
            art.add(articulo);
            contexto.setAttribute("lista", art);
            rd = contexto.getRequestDispatcher("/MainCompra.jsp");
            rd.forward(request, response);
        }

    }
}
