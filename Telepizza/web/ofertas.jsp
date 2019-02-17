<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Oferta"%>
<%@page import="modelo.Bd"%>
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
            HttpSession sesion = request.getSession();
            String usuario = sesion.getAttribute("usuario").toString();
            String fecha = sesion.getAttribute("fecha").toString();
            String hora = sesion.getAttribute("hora").toString();
            ArrayList<Oferta> listaOfertas = Bd.consultaOfertas();
        %>
    </head>
    <body>
        <form action="menus.jsp" method="post">
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
                        Ofertas<br/><br/>
                        <select name="oferta">
                            <option value="0">-------------------------</option>
                            <%
                                for (int i = 0; i < listaOfertas.size(); i++) {%>
                            <option value="<%=listaOfertas.get(i).getDescripcion()%>"><%=listaOfertas.get(i).getDescripcion()%></option>
                            <%}
                            %>
                        </select>
                        <select name="cantOferta">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select>
                        <br/><br/><input type="submit" value="Pasar a menus"/>
                    </td>
                    <td colspan="2" align="right">Bienvenido <%=usuario%><br/>Usted ha accedido a nuestra zona de pedidos a las <%=hora%> del <%=fecha%></td>
                    <td width="7%" rowspan="5" bgcolor="#FFFFFF">&nbsp;</td>
                </tr>
                <tr>
                    <td></td>
                    <td width="25%" align="center"><img src="images/images_2016/oferta.gif" width="549" height="312"/></td>
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