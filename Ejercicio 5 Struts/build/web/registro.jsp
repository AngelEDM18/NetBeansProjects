<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="titulo.registro" /></title>
        <html:base />
        <style>

            .contenedor {
                margin: 0 auto;
                border: 1px solid green;
                width: 500px;
                padding: 10px;
            }

        </style>
    </head>
    <body>
        <div class="contenedor">
            <html:form action="controlador" focus="nombre" styleId="formulario" method="post">

                <html:img srcKey="foto"/>
                <hr>
                <p style="width: 100%; background-color: lightgray"><bean:message key="registro.identificacion" /></p>

                <bean:message key="registro.email" />
                <html:text property="email" />
                <html:errors property="email"/><br><br>

                <bean:message key="registro.contrasena" />
                <html:text property="contrasena" />
                <html:errors property="contrasena"/>     <br><br>

                <bean:message key="registro.emailDos" />
                <html:text property="emailDos" />
                <html:errors property="emailDos"/><br><br>

                <bean:message key="registro.contrasenaDos"/>
                <html:text property="contrasenaDos" />
                <html:errors property="contrasenaDos"/><br><br>

                <html:errors property="confirmacionEmail"/>
                <html:errors property="confirmacionContrasena"/>
                <p style="width: 100%; background-color: lightgray"><bean:message key="registro.personales" /></p>

                <bean:message key="registro.nombre" />
                <html:text property="nombre" />
                <html:errors property="nombre"/><br><br>
                <bean:message key="registro.provincia"/>
                <html:select property="provincia">
                    <html:option value="Cadiz"/>
                    <html:option value="Sevilla"/>
                    <html:option value="Cordoba"/>
                    <html:option value="Huelva"/>
                    <html:option value="Granada"/>
                    <html:option value="Jaen"/>
                    <html:option value="Almeria"/>
                    <html:option value="Malaga"/>
                </html:select>

                <bean:message key="registro.apellido" />
                <html:text property="apellido" />
                <html:errors property="apellido"/><br><br>
                <bean:message key="registro.municipio"/>
                <html:text property="municipio" />
                <html:errors property="municipio"/><br><br>

                <bean:message key="registro.niff" />
                <html:text property="niff" />
                <html:errors property="niff"/><br><br>
                <bean:message key="registro.telefono"/>
                <html:text property="telefono" />

                <html:errors property="telefono"/><br><br>

                <html:checkbox property="publicidad" />
                <bean:message key="registro.publicidad" />

                <hr>     
                <html:submit styleClass="boton" value="Alta Usuario" />
            </div>
        </html:form>
    </body>
</html:html>
