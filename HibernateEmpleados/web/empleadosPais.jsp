<%-- 
    Document   : empleadosPais
    Created on : 03-feb-2019, 13:40:23
    Author     : Angel
--%>

<%@page import="java.util.List"%>
<%@page import="move.*"%>
<%@page import="move.Helper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Helper helper = new Helper();
            String pais = request.getParameter("pais");
            List<Empleados> emp = helper.getEmpleadosPais(pais);
        %>

        <h1>Empleados de <%=pais%></h1>
        <table>
            <tr>
                <td>Nombre y Apellidos</td>
                <td>Direccion</td>
                <td>Ciudad</td>
                <td>Telefono</td>
                <td>Fecha de contratacion</td>
            </tr>
            <%for (int i = 0; i < emp.size(); i++) {%>    
            <tr>
                <td><%=emp.get(i).getNombre()%> <%=emp.get(i).getApellidos()%></td>
                <td><%=emp.get(i).getDireccion()%></td>
                <td><%=emp.get(i).getCiudad()%></td>
                <td><%=emp.get(i).getTelDomicilio()%></td>
                <td><%=emp.get(i).getFechaContratacion()%></td>
            </tr>
            <%}%>
        </table>
        <a href="index.jsp"><button>Volver</button></a>
    </body>
</html>
