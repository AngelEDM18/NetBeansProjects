<%-- 
    Document   : peliculasAlquiladasCliente
    Created on : 18-ene-2018, 12:17:29
    Author     : Mode
--%>

<%@page import="ayuda.Film"%>
<%@page import="java.util.List"%>
<%@page import="ayuda.Customer"%>
<%@page import="ayuda.Ayudante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Películas alquiladas por un cliente</title>
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
        <img src="imagenes/videoteca.gif" width="150" height="90">
        <hr/><hr/>
        <% 
        
        String idvideoclub=request.getParameter("idvideoclub");
        String idcliente=request.getParameter("idcliente");
        
        Ayudante fh=new Ayudante();
        
        List<Film> listaPeliculas=fh.peliculasAlquiladasCliente(idcliente, idvideoclub);
        Long numpaginas=fh.numResultados(idcliente, idvideoclub);
        for (int i = 0; i < listaPeliculas.size(); i++) {
                Film nuevo=listaPeliculas.get(i);
                out.print(nuevo.getTitle()+"<br>");
            } 

        %>
        
        
        <hr/>
        <form method="get" action="index.jsp">
    <button type="submit">Volver a inicio</button>
</form>
        </div>
    </body>
</html>