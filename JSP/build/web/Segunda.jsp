<%-- 
    Document   : newjsp1
    Created on : 04-oct-2018, 9:50:09
    Author     : alumno_2DAW
--%>

<%@page info="Curso de Programacion J2EE" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*,java.text.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Segunda pagina jsp</title>
    </head>
    <body>
        <%
            Date hoy = new Date();
            DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());
        %>
        fecha en castellano y con formato medio: <%=df.format(hoy)%><p>
        <hr>
        <%
            String alumno = request.getParameter("nombre");
            if (alumno == null) {
                alumno = "mundo";
            }
        %>
        HOLA <font color="red"><b><%=alumno%></b></font>, como te va la vida?<p>
        <hr>
        <%
            out.println(getServletInfo());
        %>
    </body>
</html>
