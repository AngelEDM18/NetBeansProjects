<%-- 
    Document   : peliculasNumeroAlquiler
    Created on : 23-ene-2018, 11:49:16
    Author     : Mode
--%>

<%@page import="java.util.List"%>
<%@page import="ayuda.AlquilaVeces"%>
<%@page import="ayuda.Ayudante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Películas de un videoclub y veces alquilada</title>
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
                        <table style="width: 100%;">
            
            <tr>
                <th>Número</th>
                <th>Nombre</th>
                <th>Veces alquilada</th>
            </tr>
        <% 
        
        String idvideoclub=request.getParameter("idvideoclub");

        
        Ayudante fh=new Ayudante();
        List<AlquilaVeces> lista=fh.alquilaVeces(idvideoclub);
        
for (int i = 0; i < lista.size(); i++) {
        AlquilaVeces alquiler=lista.get(i);
        if (alquiler.getNombre()!=null & alquiler.getNumero()!=null){
            out.print("<tr><td>"+i+"</td><td>"+lista.get(i).getNombre()+"</td><td>"+lista.get(i).getNumero()+"</td></tr>");
        }
        
    }




        %>
        </table>
        
        <hr></hr>
        <form method="get" action="index.jsp">
    <button type="submit">Volver a inicio</button>
</form>
        </div>
    </body>
</html>