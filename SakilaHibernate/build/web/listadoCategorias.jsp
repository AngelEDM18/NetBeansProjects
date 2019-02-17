<%-- 
    Document   : listadoCategorias
    Created on : 17-ene-2019, 10:07:23
    Author     : alumno_2DAW
--%>

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
            int id = Integer.parseInt(request.getParameter("idCategoria"));
            out.println(id);
            FilmHelper fh = new FilmHelper();
            List<Film> peliculas = fh.getPeliculas(id);
            Film nuevo = null;
            for (int x = 0; x < peliculas.size(); x++) {
                nuevo = peliculas.get(x);
                out.println(nuevo.getTitle() + "<br/><br/>");
            }
        %>

    </body>
</html>
