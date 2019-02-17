<%-- 
    Document   : VerLista
    Created on : 11-oct-2018, 14:05:49
    Author     : alumno_2DAW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Agenda de tareas</h1>
        <table border="1">
            <tr>
                <td>Fecha</td>
                <td>Prioridad</td>
                <td>Persona de contacto</td>
                <td>Telefono</td>
                <td>Email</td>
            </tr>
            <%
                for (int i = 0; i < servlets.servlet.tar.size(); i++) {
                    out.println("<tr>");
                    out.println("<td>" + servlets.servlet.tar.get(i).getFecha() + "</td>");
                    out.println("<td>" + servlets.servlet.tar.get(i).getPrioridad() + "</td>");
                    out.println("<td>" + servlets.servlet.tar.get(i).getContacto() + "</td>");
                    out.println("<td>" + servlets.servlet.tar.get(i).getTelefono() + "</td>");
                    out.println("<td>" + servlets.servlet.tar.get(i).getEmail() + "</td>");
                    out.println("</tr>");
                }
            %>
        </table>
    </center>
</body>
</html>

