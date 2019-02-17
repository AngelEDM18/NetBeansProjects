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
        ServletContext contexto = getServletContext();
        RequestDispatcher rd;
        PrintWriter out = response.getWriter();
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        String usuario = request.getParameter("usr");
        String pass = request.getParameter("pass");
        usuarios = Bd.consultaUsuarios(usuario, pass);
        if (usuarios.size() == 0) {
            rd = contexto.getRequestDispatcher("/errorLogin.jsp");
            rd.forward(request, response);
        } else {
            long fecha;
            HttpSession sesion = request.getSession();
            sesion.setMaxInactiveInterval(60);
            sesion.setAttribute("id", usuarios.get(0).getId());
            sesion.setAttribute("nombre", usuarios.get(0).getNombre());
            sesion.setAttribute("usuario", usuarios.get(0).getUsuario());
            
            fecha = sesion.getCreationTime();
            Date fechaC = new Date(fecha);
            
            sesion.setAttribute("fecha", fechaC);
            
            rd = contexto.getRequestDispatcher("/pedido.jsp");
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
