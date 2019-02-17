<%-- 
    Document   : listado
    Created on : 08-nov-2018, 8:44:27
    Author     : alumno_2DAW
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Venta"%>
<%@page import="modelo.Bd"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@include file="index.html" %>
        <%

        ArrayList<Venta> ventas;
        int codigo = Integer.parseInt(request.getParameter("comercial"));
        ventas = Bd.consultaVentas(codigo);

        %>
        <br/>
        <center>
            <table border="1">
                <tr>
                    <td>Comercial</td>
                    <td>Producto</td>
                    <td>Cantidad</td>
                    <td>Precio</td>
                    <td>Total</td>
                    <td>Descuento</td>
                    <td>Total Descuento</td>
                    <td>Fecha</td>
                </tr>
                <%                
                    for (int x = 0; x < ventas.size(); x++) {
                        out.println("<tr>");
                        out.println("<td>" + ventas.get(x).getNombreComercial() + "</td>");
                        out.println("<td>" + ventas.get(x).getNombreProducto() + "</td>");
                        out.println("<td>" + ventas.get(x).getCantidadProducto() + "</td>");
                        out.println("<td>" + ventas.get(x).getPrecio() + "€</td>");
                        out.println("<td>" + ventas.get(x).getTotal() + "€</td>");
                        out.println("<td>" + ventas.get(x).getDescuento() + "%</td>");
                        out.println("<td>" + ventas.get(x).getTotalDescuento() + "€</td>");
                        out.println("<td>" + ventas.get(x).getFechaCompra() + "</td>");
                        out.println("</tr>");
                    }
                %>
            </table>
        </center>
    </body>
</html>
