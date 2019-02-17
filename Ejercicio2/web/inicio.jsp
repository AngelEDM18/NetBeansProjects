<%-- 
    Document   : inicio
    Created on : 18-ene-2019, 10:05:52
    Author     : alumno_2DAW
--%>

<%@page import="java.util.List"%>
<%@page import="dvdRental.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            Helper helper = new Helper();
            List<Store> listaTiendas = helper.getTienda();
            List<Category> listaCategorias = helper.getCategoria();
        %>
    </head>
    <body>
    <center>
        <img src="videoteca.gif">
        <hr/>
        <form action="listado.jsp" method="POST">
            Video club: <select name="videoClub">
                <%
                    for (int x = 0; x < listaTiendas.size(); x++) {
                %>
                <option value="<%=listaTiendas.get(x).getStoreId()%>"><%=listaTiendas.get(x).getNombre()%></option>
                <%}%>
            </select>
            <hr/>
            <p>DATOS DEL NEGOCIO:</p>
            <table>
                <tr>
                    <td>
                        <input type="radio" name="datosNegocio" value="datosNegocio">Datos del negocio
                    </td>
                    <td rowspan="2"><button type="submit" value="1" name="boton1">Mostrar</button></td>
                </tr>
                <tr>
                    <td>
                        <input type="radio" name="datosNegocio" value="datosEmpleados">Datos de los empleados
                    </td>
                </tr>
            </table>
            <p>GESTION DE CLIENTES:</p>
            <table>
                <tr>
                    <td>
                        <input type="radio" name="gestionClientes" value="clientesActivos">Listado de clientes activos
                    </td>
                    <td rowspan="2"><button type="submit" value="2" name="boton2">Mostrar</button></td>
                </tr>
                <tr>
                    <td>
                        <input type="radio" name="gestionClientes" value="clientesInactivos">Listado de clientes inactivos
                    </td>
                </tr>
            </table>
            <p>GESTION DE INVENTARIO:</p>
            <table>
                <tr>
                    <td>
                        Categoria de peliculas:
                        <select name="categorias">
                            <%
                                for (int i = 0; i < listaCategorias.size(); i++) {
                            %>
                            <option value="<%=listaCategorias.get(i).getCategoryId()%>"><%=listaCategorias.get(i).getName()%></option>
                            <%}%>
                        </select>
                    </td>
                    <td>
                        <button type="submit" value="3" name="boton3">Mostrar</button>
                    </td>        
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
