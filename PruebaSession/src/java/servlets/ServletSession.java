/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alumno_2DAW
 */
public class ServletSession extends HttpServlet {

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
        int visitas = 1;
        long fecha;
        HttpSession sesion = request.getSession();
        sesion.setMaxInactiveInterval(60);
        if (sesion.getAttribute("visitas") == null) {
            sesion.setAttribute("visitas", visitas);
        } else {
            visitas = Integer.parseInt(sesion.getAttribute("visitas").toString());
            visitas++;
            sesion.setAttribute("visitas", visitas);
        }

        fecha = sesion.getCreationTime();
        Date fechaC = new Date(fecha);

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
        fecha = sesion.getLastAccessedTime();
        Date fechaA = new Date(fecha);

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Sesiones</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("ID: <b>" + sesion.getId() + "</b><br/>");
        if (sesion.isNew()) {
            out.println("La sesion es nueva.<br/>");
        } else {
            out.println("La sesion no es nueva.<br/>");
        }
        out.println("Visitas: "+visitas+"<br/>");
        out.println("Fecha creacion: "+formatoFecha.format(fechaC)+"<br/>");
        out.println("Ultimo acceso: "+formatoFecha.format(fechaA)+"<br/>");
        
        out.println("<form method='post' action='cerrarSesion'");
        out.println("<input type='submit' value='Cerrar sesion'");
        out.println("</form>");
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
