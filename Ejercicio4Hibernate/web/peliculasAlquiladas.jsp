<%-- 
    Document   : peliculasAlquiladas
    Created on : 29-ene-2019, 18:43:37
    Author     : Angel
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="dvdRental.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String id = request.getParameter("videoClub1");
            String cliente = request.getParameter("cliente1");
            Helper helper = new Helper();
            List<Store> videoclub = helper.getTienda(id);
            List<Customer> clientes = helper.getCliente(cliente);
            List<Rental> ventas = helper.getVentas(cliente, id);

            /*int num=1;
            for (Iterator it = videoclub.get(0).getInventories().iterator(); it.hasNext();) {
                Inventory inventario = (Inventory) it.next();
                out.print(num+" - "+inventario.getFilm().getTitle()+"<br/>");
                num++;
            }*/
            if (clientes.get(0).getStore().getStoreId().toString().equals(videoclub.get(0).getStoreId().toString())) {
                out.print("aaa");
            }
        %>
    </body>
</html>
