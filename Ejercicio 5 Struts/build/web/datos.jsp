<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos del formulario</title>
        <style>
            
            .contenedor {
                border:1px solid green;
                margin: 0 auto;
                width: 500px;
                padding: 20px;
            }
           

        </style>
    </head>
    <body>
        <div class="contenedor">
            <html:img srcKey="foto"/>
            <hr>
            <h2>Verificación de datos</h2>
            <hr>
            <li>Email: <bean:write name="NewStrutsActionForm" property="email" /></li>
            <li>Contrasena: <bean:write name="NewStrutsActionForm" property="contrasena" /></li>
            <li>Nombre: <bean:write name="NewStrutsActionForm" property="nombre" /></li>
            <li>Apellidos: <bean:write name="NewStrutsActionForm" property="apellido" /></li>
            <li>NIF:<bean:write name="NewStrutsActionForm" property="niff" /></li>
            <li>Provincia: <bean:write name="NewStrutsActionForm" property="provincia" /></li>
            <li>Municipio: <bean:write name="NewStrutsActionForm" property="municipio" /></li>
            <li>Telefono: <bean:write name="NewStrutsActionForm" property="telefono" /></li>
            <li><bean:write name="NewStrutsActionForm" property="publicidad" /></li>
            <center><html:img srcKey="fotoDos"/></center>
        </div>
    </body>
</html>
