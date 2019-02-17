<%-- 
    Document   : final
    Created on : 04-dic-2018, 13:35:50
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
        <%
            HttpSession sesion = request.getSession();
            String nombre = sesion.getAttribute("nombre").toString();
            String apellidos = sesion.getAttribute("apellidos").toString();
            String email = sesion.getAttribute("email").toString();
        %>
        <p>nombre: <%=nombre%></p><br/>
        <p>apellidos: <%=apellidos%></p><br/>
        <p>email: <%=email%></p><br/>
    </body>
</html>
