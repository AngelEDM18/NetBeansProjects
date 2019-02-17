<%-- 
    Document   : detallesPedido
    Created on : 03-feb-2019, 15:55:14
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
            String idPedido = request.getParameter("idPedido");
            String fecha = request.getParameter("fecha");
            Helper helper = new Helper();
            List<DetallePedido> detalles = helper.getPedidosDetalle(idPedido);
        %>
        <h1>Detalles del pedido: <%=idPedido%></h1>
        <table>
            <tr>
                <td>Nombre del producto</td>
                <td>Cantidad</td>
                <td>Precio</td>
                <td>Descuento</td>
                <td>Fecha Pedido</td>
                <td>Total</td>
            </tr>
            <%for (int i = 0; i < detalles.size(); i++) {
                    int id = detalles.get(i).getId().getIdProducto();
                    String nombreProducto = helper.getProductos(id);
            %>

            <tr>
                <td><%=nombreProducto%></td>
                <td><%=detalles.get(i).getCantidad()%></td>
                <td><%=detalles.get(i).getPrecioUnidad()%></td>
                <td><%=detalles.get(i).getDescuento()%></td>
                <td><%=fecha%></td>
                <%
                    double precioUnidad = Double.parseDouble(detalles.get(i).getPrecioUnidad().toString());
                    double cantidad=detalles.get(i).getCantidad();
                    double total=precioUnidad*cantidad;
                    double descuento1=detalles.get(i).getDescuento();
                    double descuento=(total*descuento1)/100;
                    double totalDescuento=total-descuento;
                %>
                <td><%=totalDescuento%></td>
            </tr>
            <%}%>
        </table>
        <a href="index.jsp"><button>Volver</button></a>
    </body>
</html>
