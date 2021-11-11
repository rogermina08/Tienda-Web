<%-- 
    Document   : listacompraventa
    Created on : 25/09/2021, 08:51:05 PM
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
        <title>Lista Inventario</title>
    </head>
    <body>
        <%@ page import="Modelo.CompraVentaCrud, java.util.ArrayList" %>
        <% 
        ArrayList<CompraVentaCrud> compraventas = null;
        compraventas = (ArrayList<CompraVentaCrud>)request.getAttribute("CompraVentas");
        %>
        <div class="card text-center">
            <div class="card-header">
                  Mi Tienda Virtual
            </div>
            <div class="card-body">
                  <h5 class="card-title">Lista Reporte Inventario</h5>
                  <!-- <p class="card-text">Página inicial para abrir página .jsp que permite generar el reporte de inventario</p>  -->

                  <table class="table">
                    <tr>
                        <th>pro_id</th>
                        <th>prv_id</th>
                        <th>pro_nombre</th>
                        <th>pro_marca</th>
                        <th>pro_referencia</th>
                        <th>id_catpro</th>
                        <th>pro_nombre_cat</th>
                        <th>suma_cpr_cantidad</th>
                        <th>suma_vta_cantidad</th>
                        <th>pro_existencias</th>
                        <th>prv_valor_unitario_compra</th>
                        <th>prv_valor_unitario_venta</th>
                    </tr>
                    <%
                    for(CompraVentaCrud compraventa: compraventas)
                    {
                    %>
                    <tr valign="rigth">
                        <td><%=compraventa.getpro_id() %></td>
                        <td><%=compraventa.getid_prv() %></td>
                        <td><%=compraventa.getpro_nombre() %></td>
                        <td><%=compraventa.getpro_marca() %></td>
                        <td><%=compraventa.getpro_referencia() %></td>
                        <td><%=compraventa.getid_catpro() %></td>
                        <td><%=compraventa.getcatpro_nombre() %></td>
                        <td><%=compraventa.getsuma_cpr_cantidad() %></td>
                        <td><%=compraventa.getsuma_vta_cantidad() %></td>
                        <td><%=compraventa.getpro_existencias() %></td>
                        <td><%=compraventa.getpro_prv_valor_unitario_compra() %></td>
                        <td><%=compraventa.getpro_prv_valor_unitario_venta() %></td>
                    </tr>
                <% } %>
                </table>
                <br>
                <form action="login.jsp" method="post">
                    <input type="submit" value="Regresar">
                </form>
                </div>
                <div class="card-footer text-muted">
                      Desarrollado por Grupo 8 - Global Project
                </div>
        </div>

    </body>
</html>
