
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="modelo.*"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html:html lang="true">
    <head>
        <%
            List<Store> videoclub = Bd.consultaVideoclubs();
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body style="background-color: white">
        <html:form action="comprueba" method="POST">
            <bean:message key="registro.mensaje"/>
            <html:text property="nombre"/>
            <html:errors property="nombre"/>

            <html:select property="videoclub">
                <%for (int i = 0; i < videoclub.size(); i++) {%>
                <html:option value="<%=videoclub.get(i).getNombre()%>"/>
                <%}%>
            </html:select>
            <html:submit/>
        </html:form>
    </body>
</html:html>