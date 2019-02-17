<%@page import="java.util.*"%>
<%@page import="java.text.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Segunda pagina jsp</title>
    </head>
    <body>

        <% Date hoy = new Date();
            DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());
        %>


        <p>Fecha en castellano y con formato medio:</p>
        <hr>
        <%
            String alumno = request.getParameter("nomre");
            if (alumno == null) 
                alumno = "mundo";
        %>
        HOLA <font color="red"><b><%=alumno%><b></font>, como te va la vida?<p>
                <hr>
                <% out.println(getServletInfo());%>
                
    </body>
</html>
