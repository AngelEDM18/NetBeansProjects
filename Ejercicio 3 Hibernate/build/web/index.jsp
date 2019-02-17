<%-- 
    Document   : index
    Created on : 29-ene-2019, 18:00:49
    Author     : Angel
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
            List<Store> videoclub = helper.getTiendas();
            List<Customer> clientes = helper.getClientes();
            List<Film> peliculas = helper.getPeliculas();
        %>
    </head>
    <body>
    <center>
        <img src="videoteca.gif"/><hr/>
        <form action="peliculasAlquiladas.jsp" method="POST">
            Listado de peliculas alquiladas por un cliente en un videoclub<br/>
            <select name="videoclub">
                <%for (int x = 0; x < videoclub.size(); x++) {%>
                <option value="<%=videoclub.get(x).getStoreId()%>"><%=videoclub.get(x).getNombre()%></option>
                <%}%>
            </select>
            <select name="cliente">
                <%for (int x = 0; x < clientes.size(); x++) {%>
                <option value="<%=clientes.get(x).getCustomerId()%>"><%=clientes.get(x).getFirstName() + " " + clientes.get(x).getLastName()%></option>
                <%}%>
            </select>
            <input type="hidden" value="0" name="t">
            <input type="submit" value="mostrar">
        </form>
        <br/>
        <form action="alquilerCliente.jsp" method="POST">
            Total de dinero gastado por un cliente en el alquiler de peliculas de un videoclub en un mes<br/>
            <select name="videoclub2">
                <%for (int x = 0; x < videoclub.size(); x++) {%>
                <option value="<%=videoclub.get(x).getStoreId()%>"><%=videoclub.get(x).getNombre()%></option>
                <%}%>
            </select>
            <select name="desde">
                <option value="5">Mayo</option>
                <option value="6">Junio</option>
                <option value="7">Julio</option>
                <option value="8">Agosto</option>
            </select>
            <br/>
            <select name="cliente2">
                <%for (int x = 0; x < clientes.size(); x++) {%>
                <option value="<%=clientes.get(x).getCustomerId()%>"><%=clientes.get(x).getFirstName() + " " + clientes.get(x).getLastName()%></option>
                <%}%>
            </select>
            <select name="hasta">
                <option value="5">Mayo</option>
                <option value="6">Junio</option>
                <option value="7">Julio</option>
                <option value="8">Agosto</option>
            </select>
            <input type="submit" value="mostrar">
        </form>
        <br/>
        <form action="clientesVideoclub.jsp" method="POST">
            Listado de clientes de un videoclub y el total gastado en el alquiler de peliculas
            <br/>
            <select name="videoclub3">
                <%for (int x = 0; x < videoclub.size(); x++) {%>
                <option value="<%=videoclub.get(x).getStoreId()%>"><%=videoclub.get(x).getNombre()%></option>
                <%}%>
            </select>
            <input type="hidden" value="0" name="t3">
            <input type="submit" value="mostrar">
        </form>
        <br/>
        <form method="POST" action="muestraVeces.jsp">
            Listado de las peliculas de un videoclub y el total de veces que han sido alquiladas
            <br/>
            <select name="videoclub4">
                <% for (int x = 0; x < videoclub.size(); x++) {%>
                <option value="<%=videoclub.get(x).getStoreId()%>"><%=videoclub.get(x).getNombre()%></option>
                <% }%>
            </select>
            <input type="hidden" value="0" name="t4">
            <button type="submit">Mostrar</button>
        </form>
        <br/>
        <form action="actores.jsp" method="POST">
            Listado de clientes de un videoclub y el total gastado en el alquiler de peliculas
            <br/>
            <select name="pelicula">
                <%for (int x = 0; x < peliculas.size(); x++) {%>
                <option value="<%=peliculas.get(x).getFilmId()%>"><%=peliculas.get(x).getTitle()%></option>
                <%}%>
            </select>
            <input type="submit" value="mostrar">
        </form>
    </center>
</body>
</html>
