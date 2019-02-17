<%-- 
    Document   : BoletinConApplet
    Created on : 05-oct-2018, 12:00:27
    Author     : alumno_2DAW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Boletin de noticias con applet</title>
    </head>
    <body>
        <h1>Boletin de noticias CON APPLET</h1>
        <b>Jueguecillo de capitales (es un applet):</b><p>
            <jsp:plugin type="applet" code="juegoCapitales.class" width="700" height="350">
            </jsp:plugin><hr><p>
            <b>Resumen de noticias:</b><p>
        <ol>
            <li><jsp:include page="/Noticia1.html"/><hr></li>
            <li><jsp:include page="/Noticia2.html"/><hr></li>
            <li><jsp:include page="/Noticia3.jsp">
                    <jsp:param name="origen" value="El Pais"/>
                </jsp:include><hr></li>
        </ol>
    </body>
</html>
