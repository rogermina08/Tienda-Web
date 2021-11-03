<%-- 
    Document   : enlace3
    Created on : 10/10/2021, 09:39:11 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <link rel="shortcut icon" href="tv.ico">       
        <title>Tienda Virtual</title>
        <div align="center"> <img src="imagenes/tienda2.jpg" height="250" width=100%></div>

    </head>
    
    <body>
    <%
        if(request.getParameter("opcion1")!=null){  
    %>
            <br>
            <div class="card text-center">
                <div class="card-header">
                    <h1 class="card-title">Tienda Virtual</h1>
                </div>
                <div class="card-body">
                    <br><br>
                    <h3 class="card-title">Funcionalidades en desarrollo....</h3>
                    <br><br><br><br><br><br><br>
                    <a href="menuProducto.jsp" class="btn btn-primary">Regresar</a>
                    <br><br><br><br><br><br>
                </div>
            </div>   
    <%  }   %>
        
    </body>
    <div class="card text-center">
        <div class="card-footer text-muted">
            Desarrollado por Grupo 8 - Global Project 
        </div>
    </div>
        
</html>