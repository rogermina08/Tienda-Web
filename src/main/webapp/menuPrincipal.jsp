<%-- 
    Document   : index
    Created on : 7/10/2021, 01:10:33 AM
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
        <form action="enlace1.jsp" method="post">
            <br>
            <div class="card text-center">

                <div class="card-header">
                    <h1 class="card-title">Tienda Virtual</h1>
                </div>

                <div class="card-body">

                    <h4 class="card-title">Menú Principal</h4>
                    <br>

                    <input type = "radio" name ="opcion1" value= "categorias" checked>  Gestión de Categorías de Productos <br><br>
                    <input type = "radio" name ="opcion1" value= "productos" >  Gestión de Productos <br><br>
                    <input type = "radio" name ="opcion1" value= "proveedores" >  Gestión de Proveedores <br><br>
                    <input type = "radio" name ="opcion1" value= "pedidos" >  Gestión de Pedidos <br><br>
                    <input type = "radio" name ="opcion1" value= "ventas" >  Gestión de Ventas <br><br>
                    <input type = "radio" name ="opcion1" value= "reportes">  Gestión de Reportes <br><br>
                    <hr>
                   
                    <input type="submit"  class="btn btn-primary" value="Aceptar">
                    <a href="salir.jsp" class="btn btn-primary">Salir</a>

                </div>
            </div>
        </form>
    </body>
    
    <div class="card text-center">
        <div class="card-footer text-muted">
            Desarrollado por Grupo 8 - Global Project 
        </div>
    </div>
    
</html>

    
    

