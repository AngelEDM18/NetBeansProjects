<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> <bean:message key="titulo.login"/></title>
    <html:base/>
    <link rel="stylesheet" type="text/css" href="css/estilo.css" />
</head>
<body>
    <div id="contenedor">
        <h2> <bean:message key="titulo.login"/> </h2>
        <div id="errores"> <html:errors /></div>
        <div id="imagen"><html:img srcKey="login.imagen" titleKey="login.imagen.alt"/></div>
        <div id="contenido"> <html:form action="loginAction" focus="nombre" styleId="formulario" method="post">
                <div class="campo"><bean:message key="login.nombre"/><html:text property="nombre"/></div>
                <div class="campo"><bean:message key="login.apellidos"/><html:text property="apellidos"/></div>
                <div class="campo"><bean:message key="login.clave" /><html:password property="clave" maxlength="8" size="8"/></div>
                <div class="campo"><bean:message key="login.claveConfirmacion" /><html:password property="claveConfirmacion" maxlength="8" size="8"/></div>
                <html:submit styleClass="boton" value="enviar"/>
                <html:cancel styleClass="boton" value="cancelar"/>
            </html:form>
        </div>
        <div id="pie">
            <p> </p>
        </div>
    </div>
</body>
</html:html>