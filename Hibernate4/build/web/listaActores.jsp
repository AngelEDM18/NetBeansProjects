<%-- 
    Document   : listaActores
    Created on : 19-ene-2018, 13:32:16
    Author     : Mode
--%>

<%@page import="java.util.List"%>
<%@page import="ayuda.Actor"%>
<%@page import="ayuda.Ayudante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de actores de una película</title>
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
        
        String idpelicula=request.getParameter("idpelicula");

        
        Ayudante fh=new Ayudante();
        List<Actor> listaActores=fh.listaActores(idpelicula);
        for (int i = 0; i < listaActores.size(); i++) {
                Actor nuevo=listaActores.get(i);
                out.print(nuevo.getFirstName()+" "+nuevo.getLastName()+"<br>");
            }


        %>
        
        
        <hr></hr>
        <form method="get" action="index.jsp">
    <button type="submit">Volver a inicio</button>
</form>
        </div>
    </body>
</html>
