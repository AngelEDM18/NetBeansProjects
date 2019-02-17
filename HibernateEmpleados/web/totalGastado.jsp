<%-- 
    Document   : totalGastado
    Created on : 03-feb-2019, 17:58:18
    Author     : Angel
--%>

<%@page import="java.util.List"%>
<%@page import="move.*"%>
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
            String id = request.getParameter("cliente3");
            String nombreCliente = helper.getNombreCliente(id);
            List<Pedidos> pedidos = helper.getPedidos(id);
            double suma = 0;
            for (int i = 0; i < pedidos.size(); i++) {
                double num=Double.parseDouble(pedidos.get(i).getCargo().toString());
                suma+=num;
            }
        %>
        Nombre y Apellidos: <%=nombreCliente%>
        <br/>
        Total gastado: <%=suma%>€ 
        <br/>
        <a href="index.jsp"><button>Volver</button></a>
    </body>
</html>
