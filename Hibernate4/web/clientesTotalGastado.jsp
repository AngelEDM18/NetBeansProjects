<%-- 
    Document   : clientesTotalGastado
    Created on : 19-ene-2018, 12:22:27
    Author     : Mode
--%>

<%@page import="ayuda.Customer"%>
<%@page import="java.util.List"%>
<%@page import="ayuda.Clientetotal"%>
<%@page import="ayuda.Ayudante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Total gastado clientes de un videoclub</title>
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
                <th>Nombre</th>
                <th>Total</th>
            </tr>
            
                

        <% 
        
        String idvideoclub=request.getParameter("idvideoclub");
        String resultado1=request.getParameter("r1");
        int r1=Integer.parseInt(resultado1);
        
        Ayudante fh=new Ayudante();
        
        List<Customer> listaClientes=fh.clientesTotalGastado(idvideoclub);
        
         for (int i = 0; i < listaClientes.size(); i++) {
             
             if (listaClientes.get(i).getEmail()=="null"){
                 //out.print("<tr><td>"+listaClientes.get(i).getFirstName()+"</td><td> 0<br></td></tr>");
             } else {
                 out.print("<tr><td>"+listaClientes.get(i).getFirstName()+"</td><td> "+listaClientes.get(i).getEmail()+"<br></td></tr>");
             
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
