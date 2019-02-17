<%-- 
    Document   : totalClienteMes
    Created on : 19-ene-2018, 11:59:14
    Author     : Mode
--%>

<%@page import="ayuda.Ayudante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dinero gastado de cliente durante mes elegido</title>
        <style>
            
            .contenedor {
                border:1px solid lightblue;
                width: 500px;
                
                margin:0 auto;
                text-align: center;
            }
            
        </style>
    </head>
    <body>
        <div class="contenedor">
        <img src="imagenes/videoteca.gif" width="150px" height="90px">
        <hr></hr>
        <% 
        
        String idvideoclub=request.getParameter("idvideoclub");
        String idcliente=request.getParameter("idcliente");
        String desde=request.getParameter("desde");
        String hasta=request.getParameter("hasta");

        Ayudante fh= new Ayudante();
        Long total=fh.totalClienteMes(idcliente, idvideoclub, desde, hasta);
        String nombre=fh.nombreCliente(idcliente);


        %>
        <table style="width: 100%;">
            
            <tr>
                <th>Nombre</th>
                <th>Total</th>
            </tr>
            <tr>
                <td><% out.print(nombre); %></td>
                <td><% out.print(total); %></td>
            </tr>
        </table>
        
        <hr></hr>
        <form method="get" action="index.jsp">
    <button type="submit">Volver a inicio</button>
</form>
        </div>
    </body>
</html>
