package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Tarea;

public class servlet extends HttpServlet {

    public static ArrayList<Tarea> tar = new <Tarea>ArrayList();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext contexto = getServletContext();
        RequestDispatcher rd;
        try (PrintWriter out = response.getWriter()) {
            String contacto = request.getParameter("contacto");
            if (!contacto.matches("([a-z]|[A-Z]|\\s)+")) {
                rd = contexto.getRequestDispatcher("/ErrorContacto.html");
                rd.forward(request, response);
            } else {
                String dni = request.getParameter("dni");
                if (dni.length() != 9) {
                    rd = contexto.getRequestDispatcher("/ErrorDni.html");
                    rd.forward(request, response);
                } else {
                    String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
                    String letraDni = dni.substring(8);
                    System.out.println(letraDni);
                    int numDni = Integer.parseInt(dni.substring(0, dni.length() - 1));
                    System.out.println(numDni);
                    int resto = numDni % 23;
                    System.out.println(resto);
                    char c = letrasDni.charAt(resto);
                    System.out.println(c);
                    if (letraDni.equalsIgnoreCase(Character.toString(c))) {
                        String fecha = request.getParameter("fecha");
                        String prioridad = request.getParameter("prioridad");
                        int telefono = Integer.parseInt(request.getParameter("telefono"));
                        if (Integer.toString(telefono).length() != 9) {
                            rd = contexto.getRequestDispatcher("/ErrorTelefono.html");
                            rd.forward(request, response);
                        } else {
                            String email = request.getParameter("email");
                            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                            Matcher mather = pattern.matcher(email);
                            if (mather.find() == true) {
                                String asunto = request.getParameter("asunto");
                                if (asunto.equals("")) {
                                    rd = contexto.getRequestDispatcher("/ErrorAsunto.html");
                                    rd.forward(request, response);
                                }
                                Tarea tarea = new Tarea(contacto, dni, fecha, telefono, email, prioridad, asunto);
                                tar.add(tarea);
                                contexto.setAttribute("lista", tar);
                                rd = contexto.getRequestDispatcher("/index.html");
                                rd.forward(request, response);
                            } else {
                                rd = contexto.getRequestDispatcher("/ErrorEmail.html");
                                rd.forward(request, response);
                            }
                        }

                    } else {
                        rd = contexto.getRequestDispatcher("/ErrorDni.html");
                        rd.forward(request, response);
                    }
                }

            }

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
