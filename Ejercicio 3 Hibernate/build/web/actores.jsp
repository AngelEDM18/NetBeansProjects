<%-- 
    Document   : actores
    Created on : 01-feb-2019, 14:28:03
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
            int peliculaId = Integer.parseInt(request.getParameter("pelicula"));
            Helper helper = new Helper();
            List<FilmActor> actores = helper.getActores(peliculaId);
            for (int i = 0; i < actores.size(); i++) {%>
            <p><%=actores.get(i).getActor().getFirstName()%> <%=actores.get(i).getActor().getLastName()%></p>
        <%}%>
    </body>
</html>
