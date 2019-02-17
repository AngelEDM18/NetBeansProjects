<%-- 
    Document   : DelegadaConParametros
    Created on : 05-oct-2018, 12:21:23
    Author     : alumno_2DAW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Pagina jsp en la que delega la de inicio de aplicacion pasandole parametros</title>
    </head>
    <body>
        <h2>Pagina jsp en la que delega FowrardParametros.jsp</h2>
        <font color="blue">Observa que se mantiene la url del jsp de inicio</font>
        <font color="RED">BIENVENIDO</font>
        <%=request.getParameter("nombre")%><%=request.getParameter("apellidos")%>
    </body>
</html>
