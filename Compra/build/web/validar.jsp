<%-- 
    Document   : validar
    Created on : 10-oct-2018, 12:02:59
    Author     : alumno_2DAW
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            double total = 0;
            for (int i = 0; i < servlets.servlet.art.size(); i++) {
                total = total + servlets.servlet.art.get(i).getTotal();
            }
            servlets.servlet.art = new ArrayList();
        %>
        <div>
            El total de su compra es: <%=total%>€
        </div>
    </body>
</html>
