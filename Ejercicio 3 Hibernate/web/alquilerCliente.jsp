<%-- 
    Document   : alquilerCliente
    Created on : 01-feb-2019, 10:59:12
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
    </head>
    <body>
        <%
            String videoclub = request.getParameter("videoclub2");
            String cliente = request.getParameter("cliente2");
            int desde = Integer.parseInt(request.getParameter("desde"));
            int hasta = Integer.parseInt(request.getParameter("hasta"));
            Helper helper = new Helper();
            double total = 0;
            List<Payment> pago = helper.getPago(videoclub, cliente);
            List<Customer> client = helper.getCliente(cliente);
            for (int i = 0; i < pago.size(); i++) {
                if (pago.get(i).getPaymentDate().getMonth() >= desde && pago.get(i).getPaymentDate().getMonth() <= hasta) {
                    total += pago.get(i).getAmount();
                }
            }
        %>
        <p>Cliente: <%=client.get(0).getFirstName()%> <%=client.get(0).getLastName()%> </p>
        <p>Total alquiler: <%=total%>€</p>
    </body>
</html>
