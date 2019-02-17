<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> <bean:message key="satisfactoria.titulo"/></title>
    <html:base/>
    <link rel="stylesheet" type="text/css" href="css/estilo.css" />
</head>
<body>
    <div id="contenedor">
        <h2> <bean:message key="satisfactoria.titulo"/> </h2>
        <div id="imagen">
            <html:img srcKey="satisfactoria.imagen" titleKey="satisfactoria.imagen.alt"/>
        </div>
        <div id="mensaje">
            <bean:message key="satisfactoria.mensaje"/>
            <div class="campo">
                <bean:write name="FormularioForm" property="nombre"/>
            </div>
        </div>
        <div id="pie">
            <p> DAWES.JoseCabrera</p>
        </div>
    </div>
</body>
</html:html>