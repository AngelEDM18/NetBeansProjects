<%-- 
    Document   : errorLogin
    Created on : 10-dic-2018, 14:26:55
    Author     : alumno_2DAW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();
            sesion.invalidate();
        %>
        <p>Sesion cerrada.</p>
    </body>
</html>
