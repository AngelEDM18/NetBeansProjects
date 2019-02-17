<%-- 
    Document   : listado
    Created on : 18-ene-2019, 11:40:01
    Author     : alumno_2DAW
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dvdRental.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Helper helper = new Helper();
            String videoClub = request.getParameter("videoClub");
            String boton1 = request.getParameter("boton1");
            String boton2 = request.getParameter("boton2");
            String boton3 = request.getParameter("boton3");
            if (boton1 != null) {
                String datosNegocio = request.getParameter("datosNegocio");
                if (datosNegocio != null) {
                    if (datosNegocio.equals("datosNegocio")) {

                        List<Store> listaTiendas = helper.datosNegocio(videoClub);
                        out.println("<h2>Datos del negocio</h2><br/>");
                        out.println("Nombre: " + listaTiendas.get(0).getNombre());
                        out.println("<br/>");
                        out.println("Direccion: " + listaTiendas.get(0).getAddress().getAddress());
                        out.println("<br/>");
                        out.println("Ciudad: " + listaTiendas.get(0).getAddress().getCity().getCity());
                        out.println("<br/>");
                        out.println("Pais: " + listaTiendas.get(0).getAddress().getCity().getCountry().getCountry());
                        out.println("<br/>");
                    }

                    if (datosNegocio.equals("datosEmpleados")) {
                        List<Staff> listaEmpleados = helper.datosEmpleado(videoClub);
                        out.println("<h2>Datos del empleado</h2><br/>");
                        out.println("Empleado: " + listaEmpleados.get(0).getFirstName() + " " + listaEmpleados.get(0).getLastName());
                        out.println("<br/>");
                        out.println("Direccion: " + listaEmpleados.get(0).getAddress().getAddress());
                        out.println("<br/>");
                        out.println("Ciudad: " + listaEmpleados.get(0).getAddress().getCity().getCity());
                        out.println("<br/>");
                        out.println("Pais: " + listaEmpleados.get(0).getAddress().getCity().getCountry().getCountry());
                        out.println("<br/>");
                    }
                } else {
                    out.println("Error. no ha seleccionado ninguna opcion.");
                }
            }
            if (boton2 != null) {
                String datosNegocio = request.getParameter("gestionClientes");
                if (datosNegocio != null) {
                    out.println("<table><tr><td>Nombre</td><td>Apellidos</td><td>Email</td></tr>");
                    if (datosNegocio.equals("clientesActivos")) {
                        List<Store> listaTiendas = helper.datosNegocio(videoClub);
                        for (Iterator it = listaTiendas.get(0).getCustomers().iterator(); it.hasNext();) {
                            Customer cliente = (Customer) it.next();
                            if (cliente.isActive()) {
                                out.println("<tr>");
                                out.println("<td>" + cliente.getFirstName() + "</td>");
                                out.println("<td>" + cliente.getLastName() + "</td>");
                                out.println("<td>" + cliente.getEmail() + "</td>");
                                out.println("</tr>");
                            }
                        }
                    }

                    if (datosNegocio.equals("clientesInactivos")) {
                        List<Store> listaTiendas = helper.datosNegocio(videoClub);
                        for (Iterator it = listaTiendas.get(0).getCustomers().iterator(); it.hasNext();) {
                            Customer cliente = (Customer) it.next();
                            if (!cliente.isActive()) {

                                out.println("<tr>");
                                out.println("<td>" + cliente.getFirstName() + "</td>");
                                out.println("<td>" + cliente.getLastName() + "</td>");
                                out.println("<td>" + cliente.getEmail() + "</td>");
                                out.println("</tr>");
                            }
                        }
                    }
                    out.println("<table>");
                } else {
                    out.println("Error. no ha seleccionado ninguna opcion.");
                }
            }
            if (boton3 != null) {
                String genero = request.getParameter("categorias");
                List<Film> listaPeliculas = helper.listaPeliculas(genero);
                Store nuevo = null;
                out.println("<form action='info.jsp' method='POST'>");
                out.println("<table><tr><td>Pelicula</td></tr>");
                for (int i = 0; i < listaPeliculas.size(); i++) {
                    out.println("<tr>");
                    out.println("<td>" + i + " - " + listaPeliculas.get(i).getTitle() + "<td>");
                    out.println("<td><a href='info.jsp'><button type='submit' value='" + listaPeliculas.get(i).getFilmId().toString() + "' name='id'>Mas informacion</button><td>");
                    out.println("</tr>");
                }
                out.println("</table>");
                out.println("</form>");
            }
        %>
        <a href="inicio.jsp"><button>Volver</button></a>
    </body>
</html>
