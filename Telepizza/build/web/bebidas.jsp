<%@page import="java.util.ArrayList"%>
<%@page import="modelo.*"%>
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
            try{            String oferta = request.getParameter("oferta");
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
            HttpSession sesion = request.getSession();
            String usuario = sesion.getAttribute("usuario").toString();
            String fecha = sesion.getAttribute("fecha").toString();
            String hora = sesion.getAttribute("hora").toString();
            ArrayList<Bebida> listaBebidas = Bd.consultaBebidas();
        %>
    </head>
    <body>
        <form action="postres.jsp" method="post">
            <table width="100%" border="0">
                <tr bgcolor="#FF0000">
                    <td width="4%" bgcolor="#FFFFFF">&nbsp;</td>
                    <td colspan="3" class="inicio"><a href="ofertas.jsp">Inicio </a></td>
                    <td width="7%" bgcolor="#FFFFFF">&nbsp;</td>
                </tr>
                <tr bordercolor="#FF0000" bgcolor="#FF0000">
                    <td width="4%" bgcolor="#FFFFFF">&nbsp;</td>
                    <td colspan="3"><img src="images/images_2016/logo_telepizza.gif"  /><br />
                        <a href="ofertas.jsp"><img src="images/images_2016/ofertas.gif" width="73" height="31" longdesc="http://ofertas.jsp" /></a><a href="menus.jsp"><img src="images/images_2016/menus.gif" width="66" height="31" longdesc="http://ASD" /></a><a href="pizzas.jsp"><img src="images/images_2016/pizzas.gif" width="66" height="31" longdesc="http://SDFG" /></a><a href="entrantes.jsp"><img src="images/images_2016/entrantes.gif" width="85" height="31" longdesc="http://DFGSD" /></a><a href="hamburguesa.jsp"><img src="images/images_2016/hamburguesa.gif" width="123" height="31" longdesc="http://DFGDF" /></a><a href="pasta.jsp"><img src="images/images_2016/pasta.gif" width="58" height="31" longdesc="http://DFGH" /></a><a href="ensalada.jsp"><img src="images/images_2016/ensaladas.gif" width="94" height="31" longdesc="http://DFGH" /></a><a href="bebidas.jsp"><img src="images/images_2016/bebidas.gif" width="76" height="31" longdesc="http://SFGHDF" /></a><a href="postres.jsp"><img src="images/images_2016/postres.gif" width="70" height="31" alt="" longdesc="http://SDF" /></a></td>
                    <td width="7%" bgcolor="#FFFFFF">&nbsp;</td>
                </tr>
                <tr bordercolor="#FF0000" bgcolor="#FF0000">
                    <td width="4%" bgcolor="#FFFFFF">&nbsp;</td>
                    <td width="46%">&nbsp;</td>
                    <td colspan="2">&nbsp;</td>
                    <td width="7%" bgcolor="#FFFFFF">&nbsp;</td>
                </tr>
                <tr align="center">
                    <td width="4%" rowspan="5" bgcolor="#FFFFFF">&nbsp;</td>
                    <td width="46%" align="center" rowspan="5" class="ff">
                        Bebidas<br/><br/>
                        <select name="bebida">
                            <option value="0">-------------------------</option>
                            <%
                                for (int i = 0; i < listaBebidas.size(); i++) {%>
                            <option value="<%=listaBebidas.get(i).getDescripcion()%>"><%=listaBebidas.get(i).getDescripcion()%></option>
                            <%}
                            %>
                        </select>
                        <select name="cantBebida">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select>
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
                                                                                <br/><br/><input type="submit" value="Pasar a postres"/>
                                                                                </td>
                                                                                <td colspan="2" align="right">Bienvenido <%=usuario%><br/>Usted ha accedido a nuestra zona de pedidos a las <%=hora%> del <%=fecha%></td>
                                                                                <td width="7%" rowspan="5" bgcolor="#FFFFFF">&nbsp;</td>
                                                                                </tr>
                                                                                <tr>
                                                                                    <td width="25%" align="center"><img src="images/images_2016/menu.gif" width="300" height="250"/></td>
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