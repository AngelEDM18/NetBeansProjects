<%-- 
    Document   : pedido
    Created on : 10-dic-2018, 19:46:45
    Author     : Angel
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="modelo.*"%>
<%@page import="java.util.ArrayList"%>
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
                String nombre = sesion.getAttribute("nombre").toString();
                String id = sesion.getAttribute("id").toString();
                long fecha=sesion.getCreationTime();
                Date fechaInicio=new Date(fecha);
                Date horaInicio=new Date(fecha);
                SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat formatoHora=new SimpleDateFormat("kk:mm:ss");
                ArrayList<Bebidas> bebidas = Bd.consultaBebidas();
                ArrayList<Complementos> complementos = Bd.consultaComplementos();
                ArrayList<Ensaladas> ensaladas = Bd.consultaEnsaladas();
                ArrayList<Menus> menus = Bd.consultaMenus();
                ArrayList<Sandwiches> sandwiches = Bd.consultaSandwiches();
        %>
    </head>
    <body bgcolor="#F4F4F4">
        <form method="POST" action="telefono.jsp">
            <table>
                <tr>
                    <td><img src="images/img-logo-head.gif"></td>
                    <td colspan="3" align="right">
                        Bienvenido <%=nombre%><br/>
                        Usted ha accedido a nuestra zona de pedidos a las: <%=formatoHora.format(horaInicio) %> del <%=formato.format(fechaInicio) %>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><img src="images/menus.gif"></td>
                    <td>
                        <select name="menus">
                            <option value="0">------------</option>
                            <%
                                for (int i = 0; i < menus.size(); i++) {%>
                            <option value="<%=menus.get(i).getDescripcion()%>"><%=menus.get(i).getDescripcion()%></option>
                            <% }
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><img src="images/sandwis.gif"></td>
                    <td>
                        <select name="sandwiches">
                            <option value="0">------------</option>
                            <%
                                for (int x = 0; x < sandwiches.size(); x++) {%>
                            <option value="<%=sandwiches.get(x).getDescripcion()%>"><%=sandwiches.get(x).getDescripcion()%></option>
                            <% }
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><img src="images/complementos.gif"></td>
                    <td>
                        <select name="complementos">
                            <option value="0">------------</option>
                            <%
                                for (int y = 0; y < complementos.size(); y++) {%>
                            <option value="<%=complementos.get(y).getDescripcion()%>"><%=complementos.get(y).getDescripcion()%></option>
                            <% }
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><img src="images/ensaladas.gif"></td>
                    <td>
                        <select name="ensaladas">
                            <option value="0">------------</option>
                            <%
                                for (int z = 0; z < ensaladas.size(); z++) {%>
                            <option value="<%=ensaladas.get(z).getDescripcion()%>"><%=ensaladas.get(z).getDescripcion()%></option>
                            <% }
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><img src="images/bebidas.gif"></td>
                    <td>
                        <select name="bebidas">
                            <option value="0">------------</option>
                            <%
                                for (int k = 0; k < bebidas.size(); k++) {%>
                            <option value="<%=bebidas.get(k).getDescripcion()%>"><%=bebidas.get(k).getDescripcion()%></option>
                            <% }
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><img src="images/img-24h.png"></td>
                    <td colspan="3" align="center">Por favor seleccione los articulos y confirme su pedido.<br/>Gracias</td>
                </tr>
                <tr>
                    <td></td>
                    <td colspan="3" align="center"><input type="submit" value="Confirmar pedido"></td>
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
