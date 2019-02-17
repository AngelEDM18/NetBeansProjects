<%-- 
    Document   : CatalogoLibros
    Created on : 24-oct-2018, 12:59:58
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
        <h1>Catalogo de libros:</h1>
        <table border="1">
            <tr>
                <td>Codigo</td>
                <td>Titulo</td>
                <td>Autor</td>
                <td>Fecha</td>
                <td>Paginas</td>
                <td>Precio</td>
            </tr>
            <%

                for (int i = 0; i < servlets.ConsultaLibros.lista.size(); i++) {
                    out.println("<tr>");
                    out.println("<td>" + servlets.ConsultaLibros.lista.get(i).getCodigo() + "</td>");
                    out.println("<td>" + servlets.ConsultaLibros.lista.get(i).getTitulo() + "</td>");
                    out.println("<td>" + servlets.ConsultaLibros.lista.get(i).getAutor() + "</td>");
                    out.println("<td>" + servlets.ConsultaLibros.lista.get(i).getFecha() + "</td>");
                    out.println("<td>" + servlets.ConsultaLibros.lista.get(i).getPaginas() + "</td>");
                    out.println("<td>" + servlets.ConsultaLibros.lista.get(i).getPrecio() + "€</td>");
                    out.println("</tr>");
                }

            %>
        </table>
        <a href='index.html'>Volver al inicio</a>
    </body>
</html>
