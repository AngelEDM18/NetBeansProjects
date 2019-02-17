<%-- 
    Document   : Calculadora
    Created on : 05-oct-2018, 13:22:16
    Author     : alumno_2DAW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            double importe = Double.parseDouble(request.getParameter("importe"));
            double pago = Double.parseDouble(request.getParameter("pago"));
            int billete = 0, monedaUno = 0, monedaCinc = 0, monedaVein = 0, monedaCeroDos = 0, monedaCeroUno = 0;
            if (importe > pago) {
        %><font color="red"><h2>Error. La cantidad introducida es insuficiente</h2></font> <%
            } else {
                double cambio = pago - importe;
                do {
                    if (cambio >= 5) {
                        billete++;
                        cambio -= 5;
                    } else if (cambio >= 1) {
                        monedaUno++;
                        cambio -= 1;
                    } else if (cambio >= 0.5) {
                        monedaCinc++;
                        cambio -= 0.5;
                    } else if (cambio >= 0.2) {
                        monedaVein++;
                        cambio -= 0.2;
                    } else if (cambio >= 0.02) {
                        monedaCeroDos++;
                        cambio -= 0.02;
                    } else if (cambio >= 0.01) {
                        monedaCeroUno++;
                        cambio -= 0.01;
                    }
                } while (cambio > 0.001);
            }%>

        <table>
            <tr><td><%=billete%> billete/s de 5€</td></tr>
            <tr><td><%=monedaUno%> moneda/s de 1€</td></tr>
            <tr><td><%=monedaCinc%> moneda/s de 50 cent</td></tr>
            <tr><td><%=monedaVein%> moneda/s de 20 cent</td></tr>
            <tr><td><%=monedaCeroDos%> moneda/s de 2 cent</td></tr>
            <tr><td><%=monedaCeroUno%> moneda/s de 1 cent</td></tr>
        </table>





    </body>
</html>
