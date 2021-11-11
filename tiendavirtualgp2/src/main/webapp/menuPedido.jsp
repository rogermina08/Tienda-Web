<%-- 
    Document   : menuPedido
    Created on : 7/10/2021, 05:02:27 PM
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
        <form action="enlace5.jsp" method="post">
            <br>
            <div class="card text-center">

                <div class="card-header">
                    <h1 class="card-title">Tienda Virtual</h1>
                </div>
                <div class="card-body">

                    <h4 class="card-title">Menú Pedidos</h4>
                    <br>
                    <input type = "radio" name ="opcion1" value= "leer" checked>  Leer Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "insertar" >  Crear Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "actualizar" >  Actualizar Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "eliminarUno" >  Eliminar un Producto en un Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "eliminarTodos" >  Eliminar todos los Productos en un Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "activarUno" >  Activar un Producto en un Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "activarTodos" >  Activar todos los Productos en un Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "enviarPedido" >  Enviar un pedido a un Proveedor <br><br>
                    <input type = "radio" name ="opcion1" value= "confirmarReciboUno" >  Confirmar Recibido de un Producto en un Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "confirmarReciboTodos" >  Confirmar Recibido de todos los Productos en un Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "eliminarConfirmarReciboUno" >  Eliminar Confirmación Recibido de un Producto en un Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "eliminarConfirmarReciboTodos" >  Eliminar Confirmación Recibido de todos los Productos en un Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "confirmarDevolucionUno" >  Confirmar Devolción de un Producto en un Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "confirmarDevolucionTodos" >  Confirmar Devolución de todos los Productos en un Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "eliminarConfirmarDevolucionUno" >  Eliminar Confirmación Devolución de un Producto en un Pedido <br><br>
                    <input type = "radio" name ="opcion1" value= "eliminarConfirmarDevolucionTodos" >  Eliminar Confirmación Devolución de todos los Productos en un Pedido <br><br>
                    <hr>
                    <input type="submit"  class="btn btn-primary" value="Aceptar">
                    <a href="menuPrincipal.jsp" class="btn btn-primary">Regresar</a>
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
