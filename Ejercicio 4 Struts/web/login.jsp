<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<!DOCTYPE html>

<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> <bean:message key="titulo.login"/></title>
        <html:base/>

    </head>
    <body> 
<center>
        <h2> <bean:message key="titulo.login"/> </h2>
        <h4> <bean:message key="titulo.requerido"/> </h2>
        <div> <html:errors/></div>

        <div class="contenedor">
            <html:form action="validateLogin"  method="post"> 
                <div><bean:message key="login.nombre"/><html:text property="nombre"/><bean:message key="login.apellido"/><html:text property="apellido"/></div><br>
                <div><bean:message key="login.email"/><html:text property="email"/><bean:message key="login.cp"/><html:text property="cp"/></div><br>
                <div><bean:message key="login.login"/><html:text property="login"/></div><br>
                <div><bean:message key="login.password" /><html:password property="password" maxlength="8" size="8"/><bean:message key="login.confirmapassword" /><html:password property="confirmapassword" maxlength="8" size="8"/></div><br>
                <div><bean:message key="titulo.genero" /></div>
                <div><bean:message key="login.comedia" /><html:checkbox property="comedia" value="comedia"/><bean:message key="login.musical" /><html:checkbox property="musical" value="musical"/></div>
                <div><bean:message key="login.aventura" /><html:checkbox property="aventura" value="aventura"/><bean:message key="login.policiaco" /><html:checkbox property="policiaco" value="policiaco"/></div>
                <div><bean:message key="login.clasico" /><html:checkbox property="clasico" value="clasico"/><bean:message key="login.melodrama" /><html:checkbox property="melodrama" value="melodrama"/></div><br>
                <div><bean:message key="titulo.notificaciones" /></div>
                <div><bean:message key="login.notificaciones.si" /><html:radio property="opcion" value="si"/><bean:message key="login.notificaciones.no" /><html:radio property="opcion" value="no"/></div><br>
                <html:submit  value="Enviar"/>
                <html:reset  value="Reiniciar"/> 
            </html:form>
        </div>
</center>

</body>
</html:html>
