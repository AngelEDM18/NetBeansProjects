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
import javax.servlet.http.HttpSession;

/**
 *
 * @author DOCENTRO
 */
public class CompruebaEleccion extends HttpServlet {

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
        /* TODO output your page here. You may use following sample code. */
        if (request.getParameter("amCarne").equals("0") && request.getParameter("amCarneCant").equals("0")
                && request.getParameter("ques").equals("0") && request.getParameter("quesCant").equals("0")
                && request.getParameter("clas").equals("0") && request.getParameter("clasCant").equals("0")
                && request.getParameter("sing").equals("0") && request.getParameter("singCant").equals("0")
                && request.getParameter("inf").equals("0") && request.getParameter("infCant").equals("0")) {
            rd = contexto.getRequestDispatcher("/errorEleccion.html");
            rd.forward(request, response);
        } else if (request.getParameter("amCarneCant").equals("0") && request.getParameter("quesCant").equals("0")
                && request.getParameter("clasCant").equals("0") && request.getParameter("singCant").equals("0")
                && request.getParameter("infCant").equals("0")) {
            rd = contexto.getRequestDispatcher("/errorEleccion.html");
            rd.forward(request, response);
        } else if (request.getParameter("amCarne").equals("0") && request.getParameter("ques").equals("0")
                && request.getParameter("clas").equals("0") && request.getParameter("sing").equals("0")
                && request.getParameter("inf").equals("0")) {
            rd = contexto.getRequestDispatcher("/errorEleccion.html");
            rd.forward(request, response);
        } else {
            HttpSession sesion = request.getSession();
            sesion.setAttribute("amCarne", request.getParameter("amCarne"));
            sesion.setAttribute("amCarneCant", request.getParameter("amCarneCant"));
            sesion.setAttribute("ques", request.getParameter("ques"));
            sesion.setAttribute("quesCant", request.getParameter("quesCant"));
            sesion.setAttribute("clas", request.getParameter("clas"));
            sesion.setAttribute("clasCant", request.getParameter("clasCant"));
            sesion.setAttribute("sing", request.getParameter("sing"));
            sesion.setAttribute("singCant", request.getParameter("singCant"));
            sesion.setAttribute("inf", request.getParameter("inf"));
            sesion.setAttribute("infCant", request.getParameter("infCant"));
            rd = contexto.getRequestDispatcher("/tipoEnvio.html");
            rd.forward(request, response);
        }
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet CompruebaEleccion</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet CompruebaEleccion at " + request.getContextPath() + "</h1>");
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
