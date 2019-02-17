<%-- 
    Document   : VerCarro
    Created on : 10-oct-2018, 8:35:15
    Author     : alumno_2DAW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <td>Descripcion</td>
                <td>Cantidad</td>
                <td>PrecioUd</td>
                <td>Total</td>
            </tr>
            <%
                for (int i = 0; i < servlets.servlet.art.size(); i++) {
                    out.println("<tr>");
                    out.println("<td>" + servlets.servlet.art.get(i).getDesripcion() + "</td>");
                    out.println("<td>" + servlets.servlet.art.get(i).getCantidad() + "</td>");
                    out.println("<td>" + servlets.servlet.art.get(i).getPrecio() + "€</td>");
                    out.println("<td>" + servlets.servlet.art.get(i).getTotal() + "€</td>");
                    out.println("</tr>");
                }
            %>
        </table>
        <a href="MainCompra.jsp"><button>Seguir comprando</button></a>
        <a href="validar.jsp"><button>Finalizar compra</button></a>
    </body>
</html>
