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
        %>
    </head>
    <body>
    <center>
        <img src="videoteca.gif"/><hr/>
        <form action="peliculasAlquiladas.jsp" method="POST">
            Listado de peliculas alquiladas por un cliente en un videoclub<br/>
            <select name="videoClub1">
                <%for (int x = 0; x < videoclub.size(); x++) {%>
                <option value="<%=videoclub.get(x).getStoreId()%>"><%=videoclub.get(x).getNombre()%></option>
                <%}%>
            </select>
            <select name="cliente1">
                <%for (int x = 0; x < clientes.size(); x++) {%>
                <option value="<%=clientes.get(x).getCustomerId()%>"><%=clientes.get(x).getFirstName() + " " + clientes.get(x).getLastName()%></option>
                <%}%>
            </select>
            <input type="submit" value="mostrar">
        </form>
    </center>
</body>
</html>
