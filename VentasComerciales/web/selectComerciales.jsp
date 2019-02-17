<%-- 
    Document   : listado
    Created on : 07-nov-2018, 9:39:55
    Author     : alumno_2DAW
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Bd"%>
<%@page import="modelo.Comercial"%>
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
    <center>
        <%@include file="index.html" %>
        <br/>
        <%
            ArrayList<Comercial> comerciales = Bd.consultaComerciales();
            out.println("<form action='listado.jsp' method='post'>");
            out.println("<select name='comercial'>");
            for (int i = 0; i < comerciales.size(); i++) {
                out.println("<option value='" + comerciales.get(i).getCodigo() + "'>" + comerciales.get(i).getNombre() + "</option>");
            }
            out.println("</select>");
            out.println("<input type='submit' value='Mostrar consulta'>");
            out.println("</form>");
        %>
    </center>
</body>
</html>
