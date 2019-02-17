<%-- 
    Document   : InfoLibro
    Created on : 24-oct-2018, 11:55:54
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
        <h1>Informacion de libro</h1>
        <% int libro = Integer.parseInt(request.getParameter("libro"));%>
        <p>Codigo: <% out.println(servlets.ConsultaLibros.lista.get(libro).getCodigo());%></p>
        <p>Titulo: <% out.println(servlets.ConsultaLibros.lista.get(libro).getAutor());%></p>
        <p>Autor: <% out.println(servlets.ConsultaLibros.lista.get(libro).getAutor()); %></p>
        <p>Fecha: <% out.println(servlets.ConsultaLibros.lista.get(libro).getFecha());%></p>
        <p>Paginas: <% out.println(servlets.ConsultaLibros.lista.get(libro).getPaginas());%></p>
        <p>Precio: <% out.println(servlets.ConsultaLibros.lista.get(libro).getPrecio());%></p>
        <a href='index.html'>Volver al inicio</a>
    </body>
</html>
