<%-- 
    Document   : rtdo
    Created on : 22-oct-2018, 14:31:37
    Author     : alumno_2DAW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <td>Titulo</td>
                <td>ISBN</td>
                <td>Autor</td>
                <td>Editorial</td>
                <td>Descripcion</td>
            </tr>
            <%

                for (int i = 0; i < controlador.ServletControlador.lista.size(); i++) {
                    out.println("<tr>");
                    out.println("<td>" + controlador.ServletControlador.lista.get(i).getTitulo()+ "</td>");
                    out.println("<td>" + controlador.ServletControlador.lista.get(i).getIsbn() + "</td>");
                    out.println("<td>" + controlador.ServletControlador.lista.get(i).getAutor()+ "</td>");
                    out.println("<td>" + controlador.ServletControlador.lista.get(i).getEditorial()+ "</td>");
                    out.println("<td>" + controlador.ServletControlador.lista.get(i).getDescripcion()+ "</td>");
                    out.println("</tr>");
                }

            %>
        </table>
    </body>
</html>
