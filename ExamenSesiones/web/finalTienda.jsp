<%-- 
    Document   : final
    Created on : 17-dic-2018, 13:06:49
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
                String nombre = sesion.getAttribute("nombre").toString();
                String dia = sesion.getAttribute("dia").toString();
                String hora = sesion.getAttribute("hora").toString();
                int amCarne = Integer.parseInt(sesion.getAttribute("amCarne").toString());
                int amCarneCant = Integer.parseInt(sesion.getAttribute("amCarneCant").toString());
                int ques = Integer.parseInt(sesion.getAttribute("ques").toString());
                int quesCant = Integer.parseInt(sesion.getAttribute("quesCant").toString());
                int clas = Integer.parseInt(sesion.getAttribute("clas").toString());
                int clasCant = Integer.parseInt(sesion.getAttribute("clasCant").toString());
                int sing = Integer.parseInt(sesion.getAttribute("sing").toString());
                int singCant = Integer.parseInt(sesion.getAttribute("singCant").toString());
                int inf = Integer.parseInt(sesion.getAttribute("inf").toString());
                int infCant = Integer.parseInt(sesion.getAttribute("infCant").toString());
                double precioAmCarne = 0;
                double precioQues = 0;
                double precioClas = 0;
                double precioSing = 0;
                double precioInf = 0;
        %>
    </head>
    <body>
        <form action="cerrarSesion.jsp">
            <table>
                <tr>
                    <td>Gracias</td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><%=nombre%>, tu pedido ha sido tramitado a las <%=hora%> del <%=dia%>,<br/>y consta de los siguientes productos:<br/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Cantidad</td>
                    <td>Descripcion</td>
                    <td>Precio Unidad</td>
                    <td></td>
                </tr>
                <%
                    ArrayList<Pizza> listaPizzas = Bd.consultaPizzas();
                    for (int i = 0; i < listaPizzas.size(); i++) {
                        if (listaPizzas.get(i).getId() == amCarne) {%>
                <tr>
                    <td><%=amCarneCant%></td>
                    <td><%=listaPizzas.get(i).getNompizzas()%></td>
                    <td><% out.println(listaPizzas.get(i).getPrecio());
                        precioAmCarne = listaPizzas.get(i).getPrecio();%></td>
                    <td></td>
                </tr>
                <%}
                    if (listaPizzas.get(i).getId() == ques) {%>
                <tr>
                    <td><%=quesCant%></td>
                    <td><%=listaPizzas.get(i).getNompizzas()%></td>
                    <td><% out.println(listaPizzas.get(i).getPrecio());
                        precioQues = listaPizzas.get(i).getPrecio();%></td>
                    <td></td>
                </tr>
                <%}
                    if (listaPizzas.get(i).getId() == clas) {%>
                <tr>
                    <td><%=clasCant%></td>
                    <td><%=listaPizzas.get(i).getNompizzas()%></td>
                    <td><% out.println(listaPizzas.get(i).getPrecio());
                        precioClas = listaPizzas.get(i).getPrecio();%></td>
                    <td></td>
                </tr>
                <%}
                    if (listaPizzas.get(i).getId() == sing) {%>
                <tr>
                    <td><%=singCant%></td>
                    <td><%=listaPizzas.get(i).getNompizzas()%></td>
                    <td><% out.println(listaPizzas.get(i).getPrecio());
                        precioSing = listaPizzas.get(i).getPrecio();%></td>
                    <td></td>
                </tr>
                <%}
                    if (listaPizzas.get(i).getId() == inf) {%>
                <tr>
                    <td><%=infCant%></td>
                    <td><%=listaPizzas.get(i).getNompizzas()%></td>
                    <td><% out.println(listaPizzas.get(i).getPrecio());
                        precioInf = listaPizzas.get(i).getPrecio();%></td>
                    <td></td>
                </tr>
                <%}
                    }
                    double precio = (amCarneCant * precioAmCarne) + (quesCant * precioQues) + (clasCant * precioClas) + (singCant * precioSing) + (infCant * precioInf);
                %>
            </table>
            <p>TOTAL PEDIDO: <%=precio%>€</p>
            <br/>
            <p>Aproximadamente en 30 minutos puede pasar a recoger su pedido </p>
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
