<%-- 
    Document   : pedidosClientes
    Created on : 03-feb-2019, 14:58:06
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
            String cliente = request.getParameter("cliente2");
            String desde = request.getParameter("desde");
            String hasta = request.getParameter("hasta");
            Helper helper = new Helper();
            List<Pedidos> pedidos = helper.getPedidosIntervalo(cliente, desde, hasta);
        %>
        <h1>Pedidos del cliente</h1>
        <table>
            <tr>
                <td>ID Pedido</td>
                <td>Fecha Pedido</td>
                <td>Fecha Envio</td>
                <td>Compañia Envio</td>
            </tr>
            <%for (int i = 0; i < pedidos.size(); i++) {%>
            <tr>
                <td><%=pedidos.get(i).getIdPedido()%></td>
                <td><%=pedidos.get(i).getFechaPedido()%></td>
                <td><%=pedidos.get(i).getFechaEnvio()%></td>
                <td><%=pedidos.get(i).getDestinatario()%></td>
                <td><a href="detallesPedido.jsp?idPedido=<%=pedidos.get(i).getIdPedido()%>&fecha=<%=pedidos.get(i).getFechaPedido()%>"><button>Mas informacion</button></a></td>
            </tr>
            <%}%>
        </table>
        <a href="index.jsp"><button>Volver</button></a>
    </body>
</html>
