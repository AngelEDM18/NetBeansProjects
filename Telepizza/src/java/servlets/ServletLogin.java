/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
 * @author alumno_2DAW
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
        String usuario = request.getParameter("txtUsuario");
        String pass = request.getParameter("txtClave");
        ArrayList<Usuario> usuarios = Bd.consultaUsuarios(usuario, pass);
        if (usuarios.size() != 0) {
            HttpSession sesion = request.getSession();
            sesion.setMaxInactiveInterval(60);
            sesion.setAttribute("id", usuarios.get(0).getId());
            sesion.setAttribute("nombre", usuarios.get(0).getNombre());
            sesion.setAttribute("usuario", usuarios.get(0).getUser_name());
            long fecha = sesion.getCreationTime();
            Date fechaInicio = new Date(fecha);
            Date horaInicio = new Date(fecha);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat formatoHora = new SimpleDateFormat("kk:mm:ss");
            String fechaString=formato.format(fechaInicio);
            String horaString=formatoHora.format(horaInicio);
            sesion.setAttribute("fecha", fechaString);
            sesion.setAttribute("hora", horaString);

            rd = contexto.getRequestDispatcher("/ofertas.jsp");
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
