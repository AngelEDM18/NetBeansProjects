<%-- 
    Document   : telefono
    Created on : 10-dic-2018, 21:10:18
    Author     : Angel
--%>

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
        %>
    </head>
    <body>
        <form method="POST" action="ServletNuevoPedido">
            <input type="hidden" name="bebidas" value="<%=request.getParameter("bebidas")%>">
            <input type="hidden" name="menus" value="<%=request.getParameter("menus")%>">
            <input type="hidden" name="complementos" value="<%=request.getParameter("complementos")%>">
            <input type="hidden" name="sandwiches" value="<%=request.getParameter("sandwiches")%>">
            <input type="hidden" name="ensaladas" value="<%=request.getParameter("ensaladas")%>">
            <table>
                <tr>
                    <td><img src="images/img-logo-head.gif"></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td><%=nombre%>, por favor indica su numero de telefono para confirmar el pedido</td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="number" name="telefono" required></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Confirmar pedido"></td>
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
