<%-- 
    Document   : include
    Created on : 04-oct-2018, 10:00:39
    Author     : alumno_2DAW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estudio de la directiva include</title>
    </head>
    <body>
        <h1>Ejemplo de la directiva include</h1>
        <font color="red"><b>
            <%@ include file="/newjsp1.jsp"%>
        </b></font>
        <font color="blue"><b>
            <%@ include file="/Copyright.html"%>
        </b></font>
        <b><i>Cucurrucu paloma</i></b>
    </body>
</html>
