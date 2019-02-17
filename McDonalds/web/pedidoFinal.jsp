<%-- 
    Document   : pedidoFinal
    Created on : 10-dic-2018, 21:33:20
    Author     : Angel
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            ServletContext contexto = getServletContext();
            RequestDispatcher rd;
            try {
                HttpSession sesion = request.getSession();
                long fecha=sesion.getCreationTime();
                Date fechaInicio=new Date(fecha);
                Date horaInicio=new Date(fecha);
                SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat formatoHora=new SimpleDateFormat("kk:mm:ss");
                String nombre = sesion.getAttribute("nombre").toString();
                String menus = request.getParameter("menus");
                String bebidas = request.getParameter("bebidas");
                String complementos = request.getParameter("complementos");
                String ensaladas = request.getParameter("ensaladas");
                String sandwiches = request.getParameter("sandwiches");
        %>
    </head>
    <body>
        <form method="POST" action="cerrarSesion.jsp">
            <table>
                <tr>
                    <td><img src="images/img-logo-head.gif"></td>
                    <td colspan="3" align="right">
                        Gracias <%=nombre%><br/>
                        Tu pedido ha sido tramitado a las: <%=formatoHora.format(horaInicio) %> del <%=formato.format(fechaInicio) %>
                        <br/>
                        Y consta de los siguientes productos:
                    </td>
                </tr>
                <%
                    if (!menus.equals("0")) {%>
                <tr>
                    <td></td>
                    <td><ul><%="Menu: " + menus%></ul></td>
                <tr>
                    <% }%>
                    <%
                        if (!sandwiches.equals("0")) {%>
                <tr>
                    <td></td>
                    <td><ul><%="Sandwich: " + sandwiches%></ul></td>
                <tr>
                    <% }%>
                    <%
                        if (!complementos.equals("0")) {%>
                <tr>
                    <td></td>
                    <td><ul><%="Complemento: " + complementos%></ul></td>
                <tr>
                    <% }%>
                    <%
                        if (!ensaladas.equals("0")) {%>
                <tr>
                    <td></td>
                    <td><ul><%="Ensalada: " + ensaladas%></ul></td>
                <tr>
                    <% }%>
                    <%
                        if (!bebidas.equals("0")) {%>
                <tr>
                    <td></td>
                    <td><ul><%="Bebida: " + bebidas%></ul></td>
                <tr>
                    <% }%>
                    <td></td>
                    <td colspan="3" align="right">
                        Aproximadamente en 30 minutos sera servido el pedido en su domicilio
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td align="center"><input type="submit" value="Salir"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
<%
    } catch (NullPointerException ex) {
        rd = contexto.getRequestDispatcher("/index.html");
        rd.forward(request, response);
    }
%>
