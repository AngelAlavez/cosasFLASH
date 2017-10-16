<%-- 
    Document   : indexJSP
    Created on : 16/10/2017, 08:04:06 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Comentario: AHÍ PONLE COLOR. TE AMAMOS. <3
        <div>
            <form method="POST" action="servlet">
                <h3>Pregunta #1</h3><br />
                <div class="resul1"><%=request.getParameter("resultado1")%></div>
              
                <h3>Pregunta #2</h3><br />
                <h1>¿Cómo se llama el presidente de los Estados Unidos de América?</h1><div class="resul2"><%=request.getParameter("resultado2")%></div>
                
                
                <h3>Pregunta #3</h3><br /><br />
                <h1>¿Cuántos años tiene el mundo?</h1><div class="resul3"><%=request.getParameter("resultado3")%></div>
                
            </form>
        </div>
    </body>
</html>
