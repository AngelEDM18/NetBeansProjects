<%-- 
    Document   : telefono
    Created on : 17-dic-2018, 12:24:57
    Author     : DOCENTRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <%
        try {
        HttpSession sesion = request.getSession();
        String tipoEnvio = request.getParameter("tipoEnvio");
        sesion.setAttribute("tipoEnvio", tipoEnvio);
        if (tipoEnvio == null) {
            ServletContext contexto = getServletContext();
            RequestDispatcher rd;
            rd = contexto.getRequestDispatcher("/tipoEnvio.html");
            rd.forward(request, response);
        } else {

    %>
    <body>
        <form action="ServletCompruebaTelefono">
            <table>
                <tr><td><%=sesion.getAttribute("nombreCompleto").toString()%> usted debe indicar su numero de telefono para confirmar el pedido</td></tr>
                <tr><td><input type="number" name="telefono" required></td></tr>
                <tr><td><input type="submit" name="Tramitar pedido"></td></tr>
            </table>
        </form>
    </body>
</html>
<%
    }
%>
<%
    } catch (NullPointerException ex) {
        ServletContext contexto = getServletContext();
        RequestDispatcher rd;
        rd = contexto.getRequestDispatcher("/index.html");
        rd.forward(request, response);
    }
%>
