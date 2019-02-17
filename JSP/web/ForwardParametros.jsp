<%-- 
    Document   : ForwardParametros
    Created on : 05-oct-2018, 12:17:24
    Author     : alumno_2DAW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo del uso de la accion forward con parametros</title>
    </head>
    <body>
        <jsp:forward page="/DelegadaConParametros.jsp">
            <jsp:param name="nombre" value="Jose "/>
            <jsp:param name="apellidos" value="Fernandez Cucu"/>
        </jsp:forward>
    </body>
</html>
