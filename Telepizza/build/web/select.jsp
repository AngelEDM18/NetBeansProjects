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
            try{
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
                        <input type="hidden" name="oferta" value="<%=oferta%>">
                            <input type="hidden" name="cantOferta" value="<%=cantOferta%>">
                                <input type="hidden" name="menu" value="<%=menu%>">
                                    <input type="hidden" name="cantMenu" value="<%=cantMenu%>">
                                        <input type="hidden" name="pizza" value="<%=pizza%>">
                                            <input type="hidden" name="cantPizza" value="<%=cantPizza%>">
                                                <input type="hidden" name="entrante" value="<%=entrante%>">
                                                    <input type="hidden" name="cantEntrante" value="<%=cantEntrante%>">
                                                        <input type="hidden" name="hamburguesa" value="<%=hamburguesa%>">
                                                            <input type="hidden" name="cantHamburguesa" value="<%=cantHamburguesa%>">
                                                                <input type="hidden" name="pasta" value="<%=pasta%>">
                                                                    <input type="hidden" name="cantPasta" value="<%=cantPasta%>">
                                                                        <input type="hidden" name="ensalada" value="<%=ensalada%>">
                                                                            <input type="hidden" name="cantEnsalada" value="<%=cantEnsalada%>">
                                                                                <input type="hidden" name="bebida" value="<%=bebida%>">
                                                                                    <input type="hidden" name="cantBebida" value="<%=cantBebida%>">
                                                                                        <input type="hidden" name="postre" value="<%=postre%>">
                                                                                    <input type="hidden" name="cantPostre" value="<%=cantPostre%>">
                        <input type="radio" name="pedido" value="tienda">Recoger en tienda
                            <input type="radio" name="pedido" value="domicilio" selected>Entrega a domicilio<br>
                                    <br/><br/><input type="submit" value="Aceptar"/>
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