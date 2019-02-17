<%-- 
    Document   : muestraVeces
    Created on : 31-ene-2019, 17:50:23
    Author     : jesus
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
            int tienda = Integer.parseInt(request.getParameter("videoclub4"));
            int t = Integer.parseInt(request.getParameter("t4"));

            Helper helper = new Helper();

            List<Inventory> consultaPelis = helper.consultaInventario(tienda, t);
            List<Inventory> consultaVeces = null;

            String titulo = "";


        %>

        <table border="solid">
            <tr>
                <td><strong>Pelicula:</strong></td>
                <td><strong>Veces vista:</strong></td>
            </tr>
            <% for (int x = 0; x < consultaPelis.size(); x++) {
                    titulo = "" + consultaPelis.get(x);
                    short id = helper.consultaPelisId(titulo);
                    consultaVeces = helper.consultaVeces(tienda, titulo);

                    if (consultaVeces.size() != 0) {
            %>
            <tr>
                <td><%=titulo%></td>
                <td><%=consultaVeces.get(0)%></td>
            </tr>
            <%
                    }
                }
            %>

        </table>

        <% if (t >= 10) {%>
        <a href="muestraVeces.jsp?t4=<%=(t - 10)%>&videoclub4=<%=tienda%>">Anterior</a>        
        <% }
            if (t < (consultaPelis.size() * 10) - 10) {%>
        <a href="muestraVeces.jsp?t4=<%=(t + 10)%>&videoclub4=<%=tienda%>">Siguiente</a> 
        <% }
        %>
    </body>
</html>
