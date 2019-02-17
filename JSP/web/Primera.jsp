<%-- 
    Document   : newjsp
    Created on : 04-oct-2018, 9:31:44
    Author     : alumno_2DAW
--%>

<%@page info="Curso de programacion J2EE" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Primera pagina jsp</title>
    </head>
    <body>
        <%
            String alumno = request.getParameter("nombre");
            if (alumno == null) {
                alumno = "mundo";
            }
        %>
        HOLA <font color="red"><b><%=alumno%></b></font>, como te va la vida?<p>
        <hr>
        <%out.println(getServletInfo());%>
    </body>
</html>
