<%-- 
    Document   : nuevaVenta
    Created on : 08-nov-2018, 9:47:36
    Author     : alumno_2DAW
--%>

<%@page import="modelo.Producto"%>
<%@page import="modelo.Comercial"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Bd"%>
<%@page import="modelo.Bd"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%@include file="index.html" %>
        <% 
            ArrayList<Comercial> comerciales = Bd.consultaComerciales();
            ArrayList<Producto> productos = Bd.consultaProductos();
        %>
        <br/>
        <form action="/VentasComerciales/CompruebaAlta">
            <table>
                <tr>
                    <td>Comercial</td>
                    <td>
                        <select name="codComercial">
                            <%
                                for (int x = 0; x < comerciales.size(); x++) {
                                    out.println("<option value='"+comerciales.get(x).getCodigo()+"'>"+comerciales.get(x).getNombre()+"</option>");
                                }
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Producto</td>
                    <td>
                            <select name="producto">
                            <%
                                for (int x = 0; x < comerciales.size(); x++) {
                                    out.println("<option value='"+productos.get(x).getReferencia()+"'>"+productos.get(x).getNombre()+" ("+productos.get(x).getDescripcion()+")</option>");
                                }
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Cantidad</td>
                    <td><input type="number" name="cantidad"></td>
                </tr>
                <tr>
                    <td>Fecha</td>
                    <td><input type="date" name="fecha"></td>
                </tr>
            </table>
            <br>
            <input type="submit" value="Alta">
        </form>
    </center>
</body>
</html>
