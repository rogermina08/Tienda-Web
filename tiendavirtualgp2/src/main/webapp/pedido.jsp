<%-- 
    Document   : pedido
    Created on : 4/10/2021, 10:07:36 AM
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
        <title>Formulario para pedido</title>
    </head>
    <body>
        
        <%@ page import="Controller.pedido" %>
        
        <div class="card text-center">
            <div class="card-header">
                  Mi Tienda Virtual
            </div>
            <div class="card-body">
                <h5 class="card-title">Registre un pedido:</h5>
                <!-- <p class="card-text">Página inicial para abrir página .jsp que permite generar el reporte de inventario</p>  -->
                <form action="pedido" method="post">
                    <select name="productosel" class="form-select" aria-label="Default select example">
                        <option selected>Seleccione el producto:</option>
                        <option value="39">aaaaaaaa aaaaaaaa aaaaaaaaa</option>
                        <option value="30">aceite purisimo 1000cc</option>
                        <option value="19">acetaminofén laproff socrex10tab</option>
                        <option value="28">arroz roa blanco</option>
                        <option value="18">azúcar manuelita blancax2kg</option>
                        <option value="17">café colcafe gramuladox500gr</option>
                        <option value="20">cuaderno el cid argolladox100h-Image</option>
                        <option value="40">cuaderno el cid argolladox100h-Imagenes</option>
                        <option value="33">cuaderno norma x100Hargolla</option>
                        <option value="36">d d d</option>
                        <option value="27">durazno fincas maduro</option>
                        <option value="46">escoba fuller suave</option>
                        <option value="44">fff fff fff</option>
                        <option value="31">frijol castilla rojo</option>
                        <option value="16">galleta dux integral</option>
                        <option value="41">galleta dux limónx50gr</option>
                        <option value="34">harina la espiga extrafina</option>
                        <option value="26">lapicero bic negro</option>
                        <option value="35">lenteja gurmet nativa</option>
                        <option value="21">maizitos ramo limónx150gr</option>
                        <option value="29">pan bimbo croisan</option>
                        <option value="32">panela dulceria cuadro</option>
                        <option value="24">papaya granjera pintona</option>
                        <option value="25">pera granjera injerto</option>
                        <option value="38">s s s1</option>
                        <option value="37">s s s2</option>
                        <option value="43">www www www</option>
                        <option value="45">xxxx xxxx xxxx</option>
                        <option value="42">yyyyy ttttt rrrrr</option>
                    </select>

                    <br>
                    <select name="proveedorsel"class="form-select" aria-label="Default select example">
                        <option selected>Seleccione el proveedor:</option>
                        <option value="5">global project</option>
                        <option value="6">supertienda del hogar</option>
                        <option value="7">distribuidora andina</option>
                        <option value="8">www</option>
                        <option value="9">xxx</option>
                    </select>
                    <br>
                    <input class="form-control" type="text" placeholder="Cantidad" aria-label="35" name="cantidad">
                    <br>
                    <input class="form-control" type="text" placeholder="Valor Unitario (use solo punto para decimales)" aria-label="3500" name="valorunitario">

                    <br>
                    <input type="submit" value="Registrar pedido" class="btn btn-primary">
                </form>
            </div>
            <div class="card-footer text-muted">
                  Desarrollado por Grupo 8 - Global Project
            </div>
        </div>
	
    </body>
</html>

