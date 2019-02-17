/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumno_2DAW
 */
public class Operaciones extends HttpServlet {

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
            out.println("<title>Servlet Operaciones</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Operaciones at " + request.getContextPath() + "</h1>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int num = Integer.parseInt(request.getParameter("numero"));
            String operacion = request.getParameter("operacion");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Operaciones</title>");
            out.println("</head>");
            out.println("<body>");
            out.print("<table border=\"5\">");
            if (num > 1 && num < 20) {
                if (operacion.equalsIgnoreCase("multiplicar")) {
                    out.print("<h1>Tabla de multiplicar del: " + num + "</h1>");
                    for (int x = 1; x <= 10; x++) {
                        out.print("<tr><td>" + num + "</td><td>x" + x + " = </td><td>" + (num * x) + "</</td></tr>");
                    }
                } else if (operacion.equalsIgnoreCase("dividir")) {
                    out.print("<h1>Tabla de dividir del: " + num + "</h1>");
                    double numDouble = Double.parseDouble(Integer.toString(num));
                    for (int x = 1; x <= 10; x++) {
                        out.print("<tr><td>" + num + "</td><td>/" + x + " = </td><td>" + (numDouble / x) + "</</td></tr>");
                    }
                } else if (operacion.equalsIgnoreCase("factorial")) {
                    out.print("<h1>Factorial de: " + num + "</h1>");
                    long result = 1;
                    for (int x = 0; x <= num; x++) {
                        result = result * x;
                        if (result == 0) {
                            result = 1;
                        }
                        out.println("<tr><td>" + x + "!=" + result + "</td></tr>");
                    }
                }

                out.print("</table>");
                out.println("</body>");
                out.println("</html>");
            } else {
                out.println("Error, el numero introducido no esta comprendido entre el 1 y el 20");
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
