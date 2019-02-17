/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Bd;
import modelo.Usuario;

/**
 *
 * @author DOCENTRO
 */
public class ServletLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ServletContext contexto = getServletContext();
        RequestDispatcher rd;
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("pass");
        ArrayList<Usuario> listaUsuarios = Bd.consultaUsuarios(usuario, pass);
        if (listaUsuarios.size() != 0) {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("usuario", usuario);
            sesion.setAttribute("pass", pass);
            long fechaSesion = sesion.getCreationTime();
            Date fecha = new Date(fechaSesion);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat formatoHora = new SimpleDateFormat("kk:mm:ss");
            String dia = formato.format(fecha);
            String hora = formatoHora.format(fecha);
            sesion.setAttribute("dia", dia);
            sesion.setAttribute("hora", hora);
            sesion.setAttribute("nombre", listaUsuarios.get(0).getNombre());
            String nombreCompleto = listaUsuarios.get(0).getNombre() + " " + listaUsuarios.get(0).getApellidos();
            sesion.setAttribute("nombreCompleto", nombreCompleto);
            rd = contexto.getRequestDispatcher("/eleccion.jsp");
            rd.forward(request, response);

        } else {
            rd = contexto.getRequestDispatcher("/errorLogin.jsp");
            rd.forward(request, response);
        }
        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet ServletLogin</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("</body>");
        out.println("</html>");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
