<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Declaraciones</title>
    </head>
    <body>
        <h1>Declaraciones</h1>
        <%!
            double num1 = 2, num2 = 3, num3 = 5.6;
            String miNombre = "Angel";
        %>
        Hola, me llamo <%=miNombre%> y los numeros a promediar son: <%=num1%>, <%=num2%>  <%=num3%>
        <%!
            public double media(double n1, double n2, double n3) {
                return (n1 + n2 + n3) / 3;
            }
        %>
        <p>
            Media=<%=media(num1, num2, num3)%>
    </body>
</html>
