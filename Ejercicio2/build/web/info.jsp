<%-- 
    Document   : info
    Created on : 28-ene-2019, 19:25:31
    Author     : Angel
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
            String id=request.getParameter("id");
            Helper helper = new Helper();
            List<Film> listaPeliculas = helper.selectPelicula(id);
        %>
        <h1><%=listaPeliculas.get(0).getTitle()%></h1>
        <p>-<%=listaPeliculas.get(0).getDescription() %></p>
        <p>-Valoracion: <%=listaPeliculas.get(0).getRating() %></p>
        <p>-<%=listaPeliculas.get(0).getSpecialFeatures() %></p>
        <a href="inicio.jsp"><button>Volver</button></a>
    </body>
</html>
