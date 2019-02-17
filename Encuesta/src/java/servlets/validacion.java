/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumno_2DAW
 */
public class validacion extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet validacion</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet validacion at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext contexto = getServletContext();
        RequestDispatcher rd;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nombre = request.getParameter("nombre");
            if (nombre.equals("")) {
                rd = contexto.getRequestDispatcher("/errorCampo.html");
                rd.forward(request, response);
            }
            String apellidos = request.getParameter("apellidos");
            if (apellidos.equals("")) {
                rd = contexto.getRequestDispatcher("/errorCampo.html");
                rd.forward(request, response);
            }
            int telefono = Integer.parseInt(request.getParameter("tlf"));

            if (Integer.toString(telefono).length() != 9) {
                rd = contexto.getRequestDispatcher("/errorTelefono.html");
                rd.forward(request, response);
            }

            String ciudad = request.getParameter("ciudad");
            if (ciudad.equals("")) {
                rd = contexto.getRequestDispatcher("/errorCampo.html");
                rd.forward(request, response);
            }
            String sexo = request.getParameter("sexo");
            if (sexo.equals("")) {
                rd = contexto.getRequestDispatcher("/errorCampo.html");
                rd.forward(request, response);
            }
            String pais = request.getParameter("pais");
            String[] ocio = request.getParameterValues("ocio");
            String comentario = request.getParameter("comentario");
            if (comentario.equals("")) {
                comentario = "No tengo ningun comentario que mostrar";
            }

            contexto.setAttribute("nombre", nombre);
            contexto.setAttribute("apellidos", apellidos);
            contexto.setAttribute("telefono", telefono);
            contexto.setAttribute("ciudad", ciudad);
            contexto.setAttribute("sexo", sexo);
            contexto.setAttribute("pais", pais);
            contexto.setAttribute("ocio", ocio);
            contexto.setAttribute("comentario", comentario);

            if (sexo.equalsIgnoreCase("hombre")) {
                rd = contexto.getRequestDispatcher("/hombres");
                rd.forward(request, response);
            }

            if (sexo.equalsIgnoreCase("mujer")) {
                rd = contexto.getRequestDispatcher("/mujeres");
                rd.forward(request, response);
            }
        }
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
