<%-- 
    Document   : login
    Created on : 26/09/2021, 08:15:08 AM
    Author     : Margarita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <link rel="shortcut icon" href="tv.ico">
        <title>Reporte de inventario</title>
    </head>
    <body>
        
        <%@ page import="Controller.login" %>
        <div class="card text-center">
            <div class="card-header">
                  Mi Tienda Virtual
            </div>
            <div class="card-body">
                <h5 class="card-title">Reporte Inventario</h5>
                <!-- <p class="card-text">Página inicial para abrir página .jsp que permite generar el reporte de inventario</p>  -->
                <form action="login" method="post">
                        <input type="submit" value="Generar reporte de inventario" class="btn btn-primary">
                </form>
                <hr>
                <a href="menuReporteInventario.jsp" class="btn btn-primary">Regresar</a>
                  
            </div>
            <div class="card-footer text-muted">
                  Desarrollado por Grupo 8 - Global Project
            </div>
	</div>
    </body>
</html>
