<%-- 
    Document   : index
    Created on : 28-ene-2019, 13:44:56
    Author     : alumno_2DAW
--%>

<%@page import="ayuda.Film"%>
<%@page import="ayuda.Film"%>
<%@page import="ayuda.Customer"%>
<%@page import="java.util.List"%>
<%@page import="ayuda.Store"%>
<%@page import="ayuda.Store"%>
<%@page import="ayuda.Ayudante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vídeoteca</title>
        <style>
            body {
                text-align: center;
            }
        </style>
    </head>
    <body>
        <img src="imagenes/videoteca.gif" width="200" height="200">
        <form action="peliculasAlquiladasCliente.jsp" method="get">
        <p style="width: 100%; background-color: darkcyan; color:white">Listado de películas alquiladas por un cliente en un videoclub:</p>
        Videoclub:         
        <select id="idvideoclub" name="idvideoclub">
                            <% 
        
                Ayudante fh=new Ayudante();
        List<Store> videoclubs=fh.getStores();
        Store nuevo=null;
        
        for (int i = 0; i < videoclubs.size(); i++) {
                nuevo=videoclubs.get(i);
                out.print("<option value='"+nuevo.getStoreId()+"'>"+nuevo.getNombre());
            }
        
        
        %>

        </select>
         Clientes:
                <select id="idcliente" name="idcliente">
                            <% 
        
                
        List<Customer> clientes=fh.getClientes();
        Customer cliente=null;
        
        for (int i = 0; i < clientes.size(); i++) {
                cliente=clientes.get(i);
                out.print("<option value='"+cliente.getCustomerId()+"'>"+cliente.getFirstName()+" "+cliente.getLastName());
            }
        
        
        %>

        </select>
        
  <input style="float:right" type="submit" value="Mostrar">
  </form>
        <p style="width: 100%; background-color: darkcyan; color:white">Total de dinero gastado por un cliente en el alquiler de películas de un videoclub en un mes:</p>
        <form action="totalClienteMes.jsp" method="post">
                    Videoclub:         
        <select id="idvideoclub" name="idvideoclub">
                            <% 
        
             
        
        for (int i = 0; i < videoclubs.size(); i++) {
                nuevo=videoclubs.get(i);
                out.print("<option value='"+nuevo.getStoreId()+"'>"+nuevo.getNombre());
            }
        
        
        %>

        </select>
         Clientes:
                <select id="idcliente" name="idcliente">
                            <% 
        
                
      
        
        for (int i = 0; i < clientes.size(); i++) {
                cliente=clientes.get(i);
                out.print("<option value='"+cliente.getCustomerId()+"'>"+cliente.getFirstName()+" "+cliente.getLastName());
            }
        
        
        %>

        </select>
        
        Mes desde:
        <select id="desde" name="desde">
            
            <option value="05">Mayo</option>
            <option value="06">Junio</option>
            <option value="07">Julio</option>
            <option value="08">Agosto</option>
            
        </select>
        Mes hasta:
                <select id="hasta" name="hasta">
            
            <option value="05">Mayo</option>
            <option value="06">Junio</option>
            <option value="07">Julio</option>
            <option value="08">Agosto</option>
            
        </select>
        <input style="float:right" type="submit" value="Mostrar">
        </form>
        
        <p style="width: 100%; background-color: darkcyan; color:white">Listado de clientes de un videoclub y el total gastado en el alquiler de películas:</p>
  
        <form action="clientesTotalGastado.jsp" method="post">
        Video club: 
        <select id="idvideoclub" name="idvideoclub">
        <% 
        for (int i = 0; i < videoclubs.size(); i++) {
                nuevo=videoclubs.get(i);
                out.print("<option value='"+nuevo.getStoreId()+"'>"+nuevo.getNombre());
            }
        %>
        </select>
        <input type="hidden" id="r1" name="r1" value="0">
            <input style="float:right" type="submit" value="Mostrar">
        </form>

        <p style="width: 100%; background-color: darkcyan; color:white">Listado de películas de un videoclub y el total de veces que han sido alquiladas:</p>
    
            <form action="peliculasNumeroAlquiler.jsp" method="post">
        Video club: 
        <select id="idvideoclub" name="idvideoclub">
        <% 
        for (int i = 0; i < videoclubs.size(); i++) {
                nuevo=videoclubs.get(i);
                out.print("<option value='"+nuevo.getStoreId()+"'>"+nuevo.getNombre());
            }
        %>
        </select>
            <input style="float:right" type="submit" value="Mostrar">
        </form>
    
            <p style="width: 100%; background-color: darkcyan; color:white">Listado de actores que trabajan en una película:</p>
    
                    <form action="listaActores.jsp" method="post">
        Película: 
        <select id="idpelicula" name="idpelicula">
        <% 
            List<Film> listaPeliculas=fh.listadoPeliculas();
        for (int i = 0; i < listaPeliculas.size(); i++) {
                Film nueva=listaPeliculas.get(i);
                out.print("<option value='"+nueva.getFilmId()+"'>"+nueva.getTitle());
            }
        %>
        </select>
            <input style="float:right" type="submit" value="Mostrar">
        </form>
    
    </body>
</html>