<%-- 
    Document   : Inicio
    Created on : 18-ene-2019, 10:48:24
    Author     : alumno_2DAW
--%>

<%@page import="dvdRental.Category"%>
<%@page import="java.util.List"%>
<%@page import="dvdRental.Store"%>
<%@page import="dvdRental.FilmHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div class="container clearfix">
            <img src="images/videoteca.gif">
            <hr>
            <form action="listado.jsp" method="POST">
                <select class="_select" name="idVideoClub">
                    <% FilmHelper fh = new FilmHelper();
                        List<Store> tiendas = fh.getStore();
                        Store nuevo = null;

                        for (int x = 0; x < tiendas.size(); x++) {
                            nuevo = tiendas.get(x);
                            out.print("<option value='" + nuevo.getStoreId() + "'>" + nuevo.getNombre()+ "</option>");
                        }
                    %>
                </select>
                <hr>
                <h2 style="background-color: cornflowerblue; color: white">Datos del negocio:</h2>
                <input type="radio" name="datosNegocio" value="negocio">Datos del negocio<br>
                <input type="radio" name="datosNegocio" value="empleados">Datos de los empleados<br>
                <button type="submit" name="botonNegocio" value="botonNegocio">Mostrar</button>
                <h2 style="background-color: cornflowerblue; color: white">Gestion de clientes:</h2>
                <input type="radio" name="gestionClientes" value="activos">Listado clientes activos<br>
                <input type="radio"  name="gestionClientes" value="inactivos">Listado clientes inactivos<br>
                <button type="submit" name="botonCliente" value="botonCliente">Mostrar</button>
                <h2 style="background-color: cornflowerblue; color: white">Gestion de inventario:</h2>
                Categoria de peliculas:<select name="categoria"><%

                    List <Category> categorias = fh.getCategoria();
                    Category novo = null;
                    
                    for (int x=0;x<categorias.size();x++){
                        novo = categorias.get(x);
                        out.print("<option value='"+novo.getCategoryId()+"'>"+novo.getName()+"</option>");
                    }
                %>
                </select>
                <button type="submit" name="botonCategoria" value="botonCategoria">Mostrar</button>
            </form>
        </div>
    </center>
    </body>
</html>
