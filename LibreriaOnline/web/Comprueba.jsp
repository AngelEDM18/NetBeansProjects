<%-- 
    Document   : Comprueba
    Created on : 24-oct-2018, 13:57:07
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
    <body style="background-color:#ffb3e6;">
        <%
            ServletContext contexto = getServletContext();
            RequestDispatcher rd;
            response.setContentType("text/html;charset=UTF-8");
            String usuario = request.getParameter("usuario");
            String pass = request.getParameter("pass");
            if (usuario.equals("admin") && pass.equals("trebujena")) {
                rd = contexto.getRequestDispatcher("/NuevoLibro.html");
                rd.forward(request, response);
            } else {
                out.println("<h1>Error. El usuario o la contraseña introducidos son incorrectos</h1>");
                out.println("<a href='index.html'>Volver al inicio</a>");
            }
        %>
    </body>
</html>
