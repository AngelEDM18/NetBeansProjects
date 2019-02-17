<%-- 
    Document   : peliculasAlquiladas
    Created on : 29-ene-2019, 18:43:37
    Author     : Angel
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
        <table>
            <%
                String videoclub = request.getParameter("videoclub");
                String cliente = request.getParameter("cliente");
                Helper helper = new Helper();
                int tramo = Integer.parseInt(request.getParameter("t"));
                List<Rental> peli_alq = helper.getListado1(videoclub, cliente, tramo);
                for (int i = 0; i < peli_alq.size(); i++) {%>
            <tr>
                <td><%=peli_alq.get(i).getInventory().getFilm().getTitle()%> </td>
                <td><%=peli_alq.get(i).getRentalDate()%> </td>
                <td><%=peli_alq.get(i).getReturnDate()%> </td>
            </tr>
            <%}%>
        </table>
        <%
            if (tramo >= 10) {%>
        <a href="peliculasAlquiladas.jsp?t=<%=tramo - 10%>&cliente=<%=cliente%>&videoclub=<%=videoclub%>">Anterior</a>
        <%}
            if (peli_alq.size() == 10) {%>
        <a href="peliculasAlquiladas.jsp?t=<%=tramo + 10%>&cliente=<%=cliente%>&videoclub=<%=videoclub%>">Siguiente</a>
        <%}%>
        <br/>
        <a href="index.jsp">Volver</a>
    </body>
</html>
