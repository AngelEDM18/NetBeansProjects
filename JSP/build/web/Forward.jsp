<%-- 
    Document   : Forward
    Created on : 05-oct-2018, 12:09:24
    Author     : alumno_2DAW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de uso de la accion forward</title>
    </head>
    <body>
        <h1>Este texto no se va a ver</h1>
        <jsp:forward page="/Delegada.jsp"/>
        ESTE TAMPOCO
    </body>
</html>
