<%-- 
    Document   : login
    Created on : 08-nov-2018, 9:09:40
    Author     : alumno_2DAW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="index.html" %>
        <br/>
        <center>
            <form action="/VentasComerciales/CompruebaLogin">
                <table>
                    <tr>
                        <td>Usuario:</td>
                        <td><input type="text" name="usr"></td>
                    </tr>
                    <tr>
                        <td>Contraseña:</td>
                        <td><input type="password" name="pass"></td>
                    </tr>
                </table>
                <br>
                <input type="submit" value="Enviar">
            </form>
        </center>
    </body>
</html>
