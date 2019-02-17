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
 * @author Angel
 */
public class ServletFinal extends HttpServlet {

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
        String oferta = request.getParameter("oferta");
        String cantOferta = request.getParameter("cantOferta");
        String menu = request.getParameter("menu");
        String cantMenu = request.getParameter("cantMenu");
        String pizza = request.getParameter("pizza");
        String cantPizza = request.getParameter("cantPizza");
        String entrante = request.getParameter("entrante");
        String cantEntrante = request.getParameter("cantEntrante");
        String hamburguesa = request.getParameter("hamburguesa");
        String cantHamburguesa = request.getParameter("cantHamburguesa");
        String pasta = request.getParameter("pasta");
        String cantPasta = request.getParameter("cantPasta");
        String ensalada = request.getParameter("ensalada");
        String cantEnsalada = request.getParameter("cantEnsalada");
        String bebida = request.getParameter("bebida");
        String cantBebida = request.getParameter("cantBebida");
        String postre = request.getParameter("postre");
        String cantPostre = request.getParameter("cantPostre");
        String tipo = request.getParameter("pedido");
        HttpSession sesion = request.getSession();
        String usuario = sesion.getAttribute("usuario").toString();
        String fecha = sesion.getAttribute("fecha").toString();
        String hora = sesion.getAttribute("hora").toString();
        if (oferta.equals("0") && menu.equals("0") && pizza.equals("0") && entrante.equals("0") && hamburguesa.equals("0")
                && pasta.equals("0") && ensalada.equals("0") && bebida.equals("0") && postre.equals("0")) {
            rd = contexto.getRequestDispatcher("/errorPedido.jsp");
            rd.forward(request, response);
        } else if (tipo.equals("domicilio")) {
            rd = contexto.getRequestDispatcher("/domicilio.jsp");
            rd.forward(request, response);
        } else {
            rd = contexto.getRequestDispatcher("/tienda.jsp");
            rd.forward(request, response);
        }
        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet ServletFinal</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet ServletFinal at " + request.getContextPath() + "</h1>");
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
