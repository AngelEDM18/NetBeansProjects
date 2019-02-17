<%-- 
    Document   : mostrar
    Created on : 17-feb-2019, 13:37:08
    Author     : Angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><bean:write name="NewStrutsActionForm" property="nombre" /></h1>
    </body>
</html>
