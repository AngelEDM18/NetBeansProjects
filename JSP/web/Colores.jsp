<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Color de fondo a la carta</title>
    </head>
    <%
        String color = request.getParameter("color");
        String nombre = request.getParameter("nombre");

        if (nombre == null) {%>
    <%@ include file="/FormuColores.jsp" %>
    <%} else if (color.length() == 0 || nombre.length() == 0) {%>
    <%@ include file="/FormuColoresConAviso.jsp" %>
    <% } else {%>
    <body  bgcolor="<%=color%>">
        <h2>Datos introducidos</h2>
        Nombre: <font><%=nombre%></font><p>
            Color de fondo: <font><%=color%></font>
            <% }%>
    </body>
</html>
