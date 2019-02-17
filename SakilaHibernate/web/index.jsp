<%-- 
    Document   : inicio
    Created on : 17-ene-2019, 9:49:19
    Author     : alumno_2DAW
--%>

<%@page import="java.util.List"%>
<%@page import="dvdRental.Category"%>
<%@page import="dvdRental.FilmHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>inicio</title>
    </head>
    <body>
        <div>
            <p>Ejemplo 1 de Hibernate. Listado de peliculas segun la categoria</p>
            <form action="listadoCategorias.jsp" method="POST">
                <p>Categoria</p>
                <select name="idCategoria">
                    <%
                        FilmHelper fh = new FilmHelper();
                        List<Category> categorias = fh.getCategoria();
                        Category nuevo = null;
                        for (int x = 0; x < categorias.size(); x++) {
                            nuevo = categorias.get(x);
                            out.println("<option value='" + nuevo.getCategoryId() + "'>" + nuevo.getName() + "</option>");
                        }
                    %>
                </select>
                <button>Mostrar Peliculas</button>
            </form>
        </div>
    </body>
</html>
