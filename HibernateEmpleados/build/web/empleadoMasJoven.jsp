<%-- 
    Document   : empleadoMasJoven
    Created on : 03-feb-2019, 14:19:19
    Author     : Angel
--%>

<%@page import="java.util.List"%>
<%@page import="move.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Empleado mas joven de la empresa</h1>
        <%
            Helper helper = new Helper();
            List<Empleados> emp = helper.getMasJoven();
        %>
        Nombre y Apellidos: <%=emp.get(0).getNombre()%> <%=emp.get(0).getApellidos()%>
        <br/>
        Fecha de nacimiento <%=emp.get(0).getFechaNacimiento()%>
        <br/>
        <a href="index.jsp"><button>Volver</button></a>
    </body>
</html>
