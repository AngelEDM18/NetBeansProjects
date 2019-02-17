<%-- 
    Document   : Index
    Created on : 03-feb-2019, 13:18:24
    Author     : Angel
--%>

<%@page import="java.util.List"%>
<%@page import="move.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Gestion de empleados</h1>
        <hr/>
        <form action="empleadosPais.jsp" method="POST">
            Listado de empleados del pais <select name="pais">
                <%
                    Helper helper = new Helper();
                    List<String> paises = helper.getPaises();
                    for (int i = 0; i < paises.size(); i++) {%>
                <option value="<%=paises.get(i).toString()%>"><%=paises.get(i).toString()%></option>
                <%}%>
            </select>
            <input type="submit" value="mostrar">
        </form>
        <br/>
        <form action="empleadosCiudad.jsp" method="POST">
            Listado de empleados de la  ciudad <select name="ciudad">
                <%
                    List<String> ciudades = helper.getCiudades();
                    for (int i = 0; i < ciudades.size(); i++) {%>
                <option value="<%=ciudades.get(i).toString()%>"><%=ciudades.get(i).toString()%></option>
                <%}%>
            </select>
            <input type="submit" value="mostrar">
        </form>
        <br/>
        <form action="empleadosYear.jsp" method="POST">
            Listado de empleados contratados en el año: 
            <input type="radio" name="year" value="1992" checked>1992 
            <input type="radio" name="year" value="1993">1993 
            <input type="radio" name="year" value="1994">1994 
            <input type="submit" value="mostrar">
        </form>
        <br/>
        <form action="empleadoMasJoven.jsp" method="POST">
            Empleado mas joven de la empresa 
            <input type="submit" value="mostrar">
        </form>
        <br/>
        <form action="empleadoMasViejo.jsp" method="POST">
            Empleado mas viejo de la empresa 
            <input type="submit" value="mostrar">
        </form>
        <br/>
        <h1>Gestion de clientes</h1>
        <hr/>
        <form action="pedidosClientes.jsp" method="POST">
            Listado de pedidos del cliente <select name="cliente">
                <%
                    List<Clientes> clientes = helper.getClientes();
                    for (int i = 0; i < clientes.size(); i++) {%>
                <option value="<%=clientes.get(i).getIdCliente()%>"><%=clientes.get(i).getNombreContacto()%></option>
                <%}%>
            </select>
            <input type="submit" value="mostrar">
        </form>
        <br/>
        <form action="pedidosClientesMeses.jsp" method="POST">
            Listado de pedidos del cliente <select name="cliente2">
                <%
                    for (int i = 0; i < clientes.size(); i++) {%>
                <option value="<%=clientes.get(i).getIdCliente()%>"><%=clientes.get(i).getNombreContacto()%></option>
                <%}%>
            </select>
            entre los meses de <select name="desde">
                <option value="1">Enero</option>
                <option value="2">Febrero</option>
                <option value="3">Marzo</option>
                <option value="4">Abril</option>
                <option value="5">Mayo</option>
                <option value="6">Junio</option>
                <option value="7">Julio</option>
                <option value="8">Agosto</option>
                <option value="9">Septiembre</option>
                <option value="10">Octubre</option>
                <option value="11">Noviembre</option>
                <option value="12">Diciembre</option>
            </select>
            y el mes de <select name="hasta">
                <option value="1">Enero</option>
                <option value="2">Febrero</option>
                <option value="3">Marzo</option>
                <option value="4">Abril</option>
                <option value="5">Mayo</option>
                <option value="6">Junio</option>
                <option value="7">Julio</option>
                <option value="8">Agosto</option>
                <option value="9">Septiembre</option>
                <option value="10">Octubre</option>
                <option value="11">Noviembre</option>
                <option value="12">Diciembre</option>
            </select>
            <input type="submit" value="mostrar">
        </form>
        <br/>
        <form action="totalGastado.jsp" method="POST">
            Total dinero gastado en pedidos el cliente <select name="cliente3">
                <%
                    for (int i = 0; i < clientes.size(); i++) {%>
                <option value="<%=clientes.get(i).getIdCliente()%>"><%=clientes.get(i).getNombreContacto()%></option>
                <%}%>
            </select>
            <input type="submit" value="mostrar">
        </form>
    </body>
</html>
