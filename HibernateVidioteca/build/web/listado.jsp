<%-- 
    Document   : listado
    Created on : 18-ene-2019, 11:52:40
    Author     : alumno_2DAW
--%>

<%@page import="dvdRental.Film"%>
<%@page import="java.util.Iterator"%>
<%@page import="dvdRental.Customer"%>
<%@page import="dvdRental.Staff"%>
<%@page import="java.util.List"%>
<%@page import="dvdRental.Store"%>
<%@page import="dvdRental.FilmHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <img src="images/videoteca.gif">
    <center>
        <hr>
        <%
            String botonNegocio = request.getParameter("botonNegocio");
            String negocio = request.getParameter("datosNegocio");
            String cliente = request.getParameter("gestionClientes");
            String botonCliente = request.getParameter("botonCliente");
            String botonCategoria = request.getParameter("botonCategoria");
            String categoria = request.getParameter("categoria");

            if (botonNegocio != null && negocio.equals("negocio")) {
                String idNegocio = request.getParameter("idVideoClub");
                FilmHelper fh = new FilmHelper();
                List<Store> tiendas = fh.getDatosNegocio(idNegocio);
                Store nuevo = null;

                nuevo = tiendas.get(0);
                out.print("Nombre:" + nuevo.getNombre() + "<br>");
                out.print("Direccion:" + nuevo.getAddress().getAddress() + " " + nuevo.getAddress().getCity().getCity() + "<br>");
                out.print("Ciudad:" + nuevo.getAddress().getCity().getCity() + "<br>");
                out.print("Pais:" + nuevo.getAddress().getCity().getCountry().getCountry());

            }

            if (botonNegocio != null && negocio.equals("empleados")) {
                String idNegocio = request.getParameter("idVideoClub");
                FilmHelper fh = new FilmHelper();
                List<Staff> empleados = fh.getDatosEmpleado(idNegocio);
                Staff nuevo = null;

                nuevo = empleados.get(0);
                out.print("Empleado:" + nuevo.getFirstName() + " " + nuevo.getLastName() + "<br>");
                out.print("Direccion:" + nuevo.getAddress().getAddress() + " " + nuevo.getAddress().getCity().getCity() + "<br>");
                out.print("Ciudad:" + nuevo.getAddress().getCity().getCity() + "<br>");
                out.print("Pais:" + nuevo.getAddress().getCity().getCountry().getCountry());

            }

            if (botonCliente != null && cliente.equals("activos")) {
                String idNegocio = request.getParameter("idVideoClub");
                FilmHelper fh = new FilmHelper();
                List<Store> clientes = fh.getDatosNegocio(idNegocio);
                Store nuevo = null;

                out.print("<table border=solid><tr><td>Nombre</td><td>Apellidos</td><td>Email</td></tr>");
                for (Iterator it = clientes.get(0).getCustomers().iterator(); it.hasNext();) {
                    Customer client = (Customer) it.next();
                    if (client.isActive()) {
                        out.print("<tr><td>" + client.getFirstName() + "</td><td>" + client.getLastName() + "</td><td>" + client.getEmail() + "</td></tr>");
                    }
                }

            }

            if (botonCliente != null && cliente.equals("inactivos")) {
                String idNegocio = request.getParameter("idVideoClub");
                FilmHelper fh = new FilmHelper();
                List<Store> clientes = fh.getDatosNegocio(idNegocio);
                Store nuevo = null;
                out.print("<table border=solid><tr><td>Nombre</td><td>Apellidos</td><td>Email</td></tr>");
                for (Iterator it = clientes.get(0).getCustomers().iterator(); it.hasNext();) {
                    Customer client = (Customer) it.next();
                    if (!client.isActive()) {
                        out.print("<tr><td>" + client.getFirstName() + "</td><td>" + client.getLastName() + "</td><td>" + client.getEmail() + "</td></tr>");
                    }
                }
                out.print("</table>");
            }
            
            %>
            <form method="POST" action="InformacionP.jsp">
        <%
            if (botonCategoria != null && categoria!=null) {
                FilmHelper fh = new FilmHelper();
                List<Film> peliculas = fh.getPeliculas(categoria);
                Store nuevo = null;

                for(int i=0;i<peliculas.size();i++){
                   out.print(peliculas.get(i).getTitle()+"<button type='submit' id='name' value='"+peliculas.get(i).getFilmId()+"'>Mas informacion</button><br>");
                }

            }
            
        %>
            </form>
        <hr>
    </center>
</body>
</html>
