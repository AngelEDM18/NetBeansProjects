<%@page import="modelo.*"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Documento sin titulo</title>
        <style type="text/css">
            .inicio {
                text-align: right;
                font-weight: bold;
            }
        </style>
        <%
            try {
                String oferta = request.getParameter("oferta");
                String cantOferta = request.getParameter("cantOferta");
                String menu = request.getParameter("menu");
                String cantMenu = request.getParameter("cantMenu");
                String pizza = request.getParameter("pizza");
                String cantPizza = request.getParameter("cantPizza");
                String entrante = request.getParameter("entrante");
                String cantEntrante = request.getParameter("cantEntrante");
                String hamburguesa = request.getParameter("hamburguesa");
                String cantHamburguesa = request.getParameter("cantHamburguesa");
                String pasta = request.getParameter("pasta");
                String cantPasta = request.getParameter("cantPasta");
                String ensalada = request.getParameter("ensalada");
                String cantEnsalada = request.getParameter("cantEnsalada");
                String bebida = request.getParameter("bebida");
                String cantBebida = request.getParameter("cantBebida");
                String postre = request.getParameter("postre");
                String cantPostre = request.getParameter("cantPostre");
                HttpSession sesion = request.getSession();
                String usuario = sesion.getAttribute("usuario").toString();
                String fecha = sesion.getAttribute("fecha").toString();
                String hora = sesion.getAttribute("hora").toString();
        %>
    </head>
    <body>
        <form action="ServletFinal" method="post">
            <table width="100%" border="0">
                <tr bgcolor="#FF0000">
                    <td width="4%" bgcolor="#FFFFFF">&nbsp;</td>
                    <td colspan="3"></td>
                </tr>
                <tr bordercolor="#FF0000" bgcolor="#FF0000">
                    <td width="4%" bgcolor="#FFFFFF">&nbsp;</td>
                    <td colspan="3"><img src="images/images_2016/logo_telepizza.gif"  /></td>
                    <td width="7%" bgcolor="#FFFFFF">&nbsp;</td>
                </tr>
                <tr bordercolor="#FF0000" bgcolor="#FF0000">
                    <td width="4%" bgcolor="#FFFFFF">&nbsp;</td>
                    <td width="7%" bgcolor="#FFFFFF">&nbsp;</td>
                </tr>
                <tr align="center">
                    <td width="4%" rowspan="5" bgcolor="#FFFFFF">&nbsp;</td>
                    <td width="46%" align="center" rowspan="5" class="ff">
                        Gracias <%=usuario%><br/>Su pedido ha sido tramitado a las <%=hora%> del <%=fecha%>,<br/>
                        y consta de los siguientes productos:<br/><br/>
                        <%
                            if (!oferta.equals("0")) {%>
                        OFERTA:
                        -<%=cantOferta + " " + oferta%>
                        <br/>
                        <% }
                        %>
                        <%
                            if (!menu.equals("0")) {%>
                        MENU:
                        -<%=cantMenu + " " + menu%> 
                        <br/>
                        <% }
                        %>
                        <%
                            if (!pizza.equals("0")) {%>
                        PIZZA:
                        -<%=cantPizza + " " + pizza%>
                        <br/>
                        <% }
                        %>
                        <%
                            if (!entrante.equals("0")) {%>
                        ENTRANTE:
                        -<%=cantEntrante + " " + entrante%>
                        <br/>
                        <% }
                        %>
                        <%
                            if (!hamburguesa.equals("0")) {%>
                        HAMBURGUESA:
                        -<%=cantHamburguesa + " " + hamburguesa%> 
                        <br/>
                        <% }
                        %>
                        <%
                            if (!pasta.equals("0")) {%>
                        PASTA:
                        -<%=cantPasta + " " + pasta%> 
                        <br/>
                        <% }
                        %>
                        <%
                            if (!ensalada.equals("0")) {%>
                        ENSALADA:
                        -<%=cantEnsalada + " " + ensalada%> 
                        <br/>
                        <% }
                        %>
                        <%
                            if (!bebida.equals("0")) {%>
                        BEBIDA:
                        -<%=bebida + " " + bebida%> 
                        <br/>
                        <% }
                        %>
                        <%
                            if (!postre.equals("0")) {%>
                        POSTRE:
                        -<%=cantPostre + " " + postre%> 
                        <br/>
                        <% }
                        %>
                        <br/>Aproximadamente en 30 minutos sera servido su pedido en su domicilio.
                    </td>
                    <td colspan="2" align="right"></td>
                    <td width="7%" rowspan="5" bgcolor="#FFFFFF">&nbsp;</td>
                </tr>
                <tr>
                    <td width="25%" align="center"></td>
                </tr>
                <tr>
                    <td width="18%" class="inicio"></td>
                    <td width="25%"></td>
                </tr>
                <tr align="center">
                    <td colspan="2"></td>
                </tr>
                <tr align="center">
                </tr>
                <tr bgcolor="#990000" >
                    <td width="4%" bgcolor="#FFFFFF">&nbsp;</td>
                    <td align="left" width="46%"><img src="images/images_2016/telepizza_espana.gif" width="133" height="30" /></td>
                    <td align="right" colspan="2"><img src="images/images_2016/ico_facebook.gif" width="31" height="30" /> <img src="images/images_2016/ico_twitter.gif" width="31" height="30" /> <img src="images/images_2016/ico_youtube.gif" width="31" height="30" /> <img src="images/images_2016/ico_google.gif" width="31" height="30" /> <img src="images/images_2016/ico_instagram.gif" width="31" height="30" />&nbsp; </td>
                    <td width="7%" bgcolor="#FFFFFF">&nbsp;</td>
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
    }%>