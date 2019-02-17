<%-- 
    Document   : clientesVideoclub
    Created on : 01-feb-2019, 11:47:40
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
        <table>
            <%
                int videoclub = Integer.parseInt(request.getParameter("videoclub3"));
                int tramo = Integer.parseInt(request.getParameter("t3"));
                Helper fh = new Helper();
                List<Customer> listaClientesVideoclub = fh.getClientesVideoclub(videoclub, tramo);
                Customer clienteDelVideoclub = null;
                long totalGastado;
                int idCliente = 0;
                for (int x = 0; x < listaClientesVideoclub.size(); x++) {
                    clienteDelVideoclub = listaClientesVideoclub.get(x);
                    idCliente = clienteDelVideoclub.getCustomerId();
                    totalGastado = fh.getTotalCliente(videoclub, idCliente);%>

            <tr>
                <td><%= clienteDelVideoclub.getFirstName()%> <%= clienteDelVideoclub.getLastName()%></td>
                <td><%= totalGastado%>€</td>
                <%}%>

            </tr>

        </table>
        <%
            if (tramo >= 10) {%>
        <a href="clientesVideoclub.jsp?t3=<%=tramo - 10%>&videoclub3=<%=videoclub%>">Anterior</a>
        <%}
            if (listaClientesVideoclub.size() == 10) {%>
        <a href="clientesVideoclub.jsp?t3=<%=tramo + 10%>&videoclub3=<%=videoclub%>">Siguiente</a>
        <%}%>
        <br/>
        <a href="index.jsp">Volver</a>
    </body>
</html>
