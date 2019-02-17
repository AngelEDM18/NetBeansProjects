<%@page import="com.myapp.struts.form.NewStrutsActionForm"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <div class="contenedor">
        <h1 align="center">REGISTRO DE USUARIO</h1>
        <hr>
        <li>Nombre: <bean:write name="NewStrutsActionForm" property="nombre" /></li>
        <li>Apellido: <bean:write name="NewStrutsActionForm" property="apellido" /></li>
        <li>E-Mail: <bean:write name="NewStrutsActionForm" property="email" /></li>
        <li>Codigo Postal: <bean:write name="NewStrutsActionForm" property="cp" /></li>
        <li>Login: <bean:write name="NewStrutsActionForm" property="login" /></li>
        <li>Password: <bean:write name="NewStrutsActionForm" property="password" /></li>
        <hr>
        <h1 align="center">GÉNEROS DE CINE QUE LE INTERESAN</h1>
        <hr>

        <bean:write name="NewStrutsActionForm" property="comedia" ignore="true"/>
        <bean:write name="NewStrutsActionForm" property="musical" ignore="true"/>
        <bean:write name="NewStrutsActionForm" property="aventura" ignore="true"/>
        <bean:write name="NewStrutsActionForm" property="policiaco" ignore="true"/>
        <bean:write name="NewStrutsActionForm" property="clasico" ignore="true"/>
        <bean:write name="NewStrutsActionForm" property="melodrama" ignore="true"/>
        <hr>
        <p>¿Desea recibir notificaciones por e-mail?: <bean:write name="NewStrutsActionForm" property="opcion"/>
        <hr>
        </div>
        </body>
</html:html>
