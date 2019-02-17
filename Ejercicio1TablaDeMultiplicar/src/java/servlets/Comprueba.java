
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Comprueba extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //RequestDispatcher rd;
        
        
        ServletContext contexto = getServletContext();
        RequestDispatcher rd;
        
        String numS = request.getParameter("num");
        int num = Integer.parseInt(numS);
        String color = request.getParameter("color");
        response.setContentType("text/html");
        //response.getWriter()
        
        if (num < 1 || num > 9) {
            rd = contexto.getRequestDispatcher("/ErrorNum.html");
            rd.forward(request, response);
        } else if (!color.equalsIgnoreCase("red") && !color.equalsIgnoreCase("yellow")
                && !color.equalsIgnoreCase("green") && !color.equalsIgnoreCase("blue")
                && !color.equalsIgnoreCase("pink") && !color.equalsIgnoreCase("black")
                && !color.equalsIgnoreCase("orange")) {
                    rd = contexto.getRequestDispatcher("/ErrorColor.html");
                    rd.forward(request, response);
        } else {
            contexto.setAttribute("numero", numS);
            contexto.setAttribute("color", color);
            rd = contexto.getRequestDispatcher("/TablaFinal");
            rd.forward(request, response);
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
