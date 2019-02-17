<%-- 
    Document   : MainCompra
    Created on : 09-oct-2018, 13:34:52
    Author     : alumno_2DAW
--%>

<%@page import="modelo.Articulo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="/Compra/servlet">
            SELECCIONE ARTICULO: 
            <select name="articulo">
                <option value="BotellaAgua" selected="selected">Botella Agua 2L</option>
                <option value="BotellaCerveza">Botella Cerveza 25 cl</option>
                <option value="Pan">Pieza Pan 1kg</option>
                <option value="Leche">Leche 1L</option>
            </select>
            <br/>
            <br/>
            INDIQUE NUMERO DE UNIDADES <input type="number" name="uds"><br/><br/>
            <input type="submit" value="Añadir al carro">
            <input type="reset" value="Borrar">
        </form>
        <a href="VerCarro.jsp"><button>Ver Carro</button></a>
    </body>
</html>