<%-- 
    Document   : eleccion
    Created on : 17-dic-2018, 11:38:49
    Author     : DOCENTRO
--%>

<%@page import="modelo.*"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            try {
            HttpSession sesion = request.getSession();
            String nombreCompleto = sesion.getAttribute("nombreCompleto").toString();
            String dia = sesion.getAttribute("dia").toString();
            String hora = sesion.getAttribute("hora").toString();
            ArrayList<Pizza> listaPizzas = Bd.consultaPizzas();
        %>
    </head>
    <body>
        <form action="CompruebaEleccion" method="post">
            <table>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td align="right">Bienvenido <%=nombreCompleto%><br/>Usted ha accedido a nuestra zona de pedidos el <%=dia%> a las <%=hora%></td>
                </tr>
                <tr>
                    <td>Amantes de la carne: </td>
                    <td>
                        <select name="amCarne">
                            <option value="0">--------------</option>
                            <%
                                for (int i = 0; i < listaPizzas.size(); i++) {
                                    if (listaPizzas.get(i).getIdpizza() == 2) {%>
                            <option value="<%=listaPizzas.get(i).getId()%>"><%=listaPizzas.get(i).getNompizzas()%></option>
                            <%}
                                }
                            %>
                        </select>
                    </td>
                    <td>
                        <select name="amCarneCant">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select>
                    </td>
                    <td rowspan="5"><img src="images/kk.gif"></td>
                </tr>
                <tr>
                    <td>Los mas queseros: </td>
                    <td>
                        <select name="ques">
                            <option value="0">--------------</option>
                            <%
                                for (int i = 0; i < listaPizzas.size(); i++) {
                                    if (listaPizzas.get(i).getIdpizza() == 3) {%>
                            <option value="<%=listaPizzas.get(i).getId()%>"><%=listaPizzas.get(i).getNompizzas()%></option>
                            <%}
                                }
                            %>
                        </select>
                    </td>
                    <td>
                        <select name="quesCant">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Los clasicos: </td>
                    <td>
                        <select name="clas">
                            <option value="0">--------------</option>
                            <%
                                for (int i = 0; i < listaPizzas.size(); i++) {
                                    if (listaPizzas.get(i).getIdpizza() == 4) {%>
                            <option value="<%=listaPizzas.get(i).getId()%>"><%=listaPizzas.get(i).getNompizzas()%></option>
                            <%}
                                }
                            %>
                        </select>
                    </td>
                    <td>
                        <select name="clasCant">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Sin gluten: </td>
                    <td>
                        <select name="sing">
                            <option value="0">--------------</option>
                            <%
                                for (int i = 0; i < listaPizzas.size(); i++) {
                                    if (listaPizzas.get(i).getIdpizza() == 5) {%>
                            <option value="<%=listaPizzas.get(i).getId()%>"><%=listaPizzas.get(i).getNompizzas()%></option>
                            <%}
                                }
                            %>
                        </select>
                    </td>
                    <td>
                        <select name="singCant">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Infantil: </td>
                    <td>
                        <select name="inf">
                            <option value="0">--------------</option>
                            <%
                                for (int i = 0; i < listaPizzas.size(); i++) {
                                    if (listaPizzas.get(i).getIdpizza() == 6) {%>
                            <option value="<%=listaPizzas.get(i).getId()%>"><%=listaPizzas.get(i).getNompizzas()%></option>
                            <%}
                                }
                            %>
                        </select>
                    </td>
                    <td>
                        <select name="infCant">
                            <option value="0">0</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><input type="submit" name="Confirmar pedido"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
<%
    } catch (NullPointerException ex) {
        ServletContext contexto = getServletContext();
        RequestDispatcher rd;
        rd = contexto.getRequestDispatcher("/index.html");
        rd.forward(request, response);
    }
%>
