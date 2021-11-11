<%-- 
    Document   : listapedido
    Created on : 4/10/2021, 02:15:58 PM
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
        <title>Lista Pedido</title>
    </head>
    <body>
        <%@ page import="Modelo.Pedido, java.util.ArrayList" %>
        <% 
        ArrayList<Pedido> pedidosrep = null;
        pedidosrep = (ArrayList<Pedido>)request.getAttribute("Pedidosrep");
        %>
        <div class="card text-center">
            <div class="card-header">
                  Mi Tienda Virtual
            </div>
            <div class="card-body">
                  <h5 class="card-title">Lista Pedido</h5>
                  <!-- <p class="card-text">Página inicial para abrir página .jsp que permite generar el reporte de inventario</p>  -->

                  <table class="table">
                    <tr>
                        <th>ped_id</th>
                        <th>ped_numero_pedido</th>
                        <th>ped_fecha</th>
                        <th>id_pro</th>
                        <th>id_prv</th>
                        <th>ped_cantidad</th>
                        <th>ped_valor_unitario_compra</th>
                        <th>ped_confirma_recibo</th>
                        <th>ped_estado</th>
                    </tr>
                    <%
                    for(Pedido pedido: pedidosrep)
                    {
                    %>
                    <tr valign="rigth">
                        <td><%=pedido.getPed_id() %></td>
                        <td><%=pedido.getPed_numero_pedido() %></td>
                        <td><%=pedido.getPed_fecha() %></td>
                        <td><%=pedido.getId_pro() %></td>
                        <td><%=pedido.getId_prv() %></td>
                        <td><%=pedido.getPed_cantidad() %></td>
                        <td><%=pedido.getPed_valor_unitario_compra() %></td>
                        <td><%=pedido.getPed_confirma() %></td>
                        <td><%=pedido.getPed_estado() %></td>
                    </tr>
                <% } %>
                </table>
                <br>
                <form action="pedido.jsp" method="post">
                    <input type="submit" value="Registrar pedido" class="btn btn-primary">
                </form>
                </div>
                <div class="card-footer text-muted">
                      Desarrollado por Grupo 8 - Global Project
                </div>
        </div>

    </body>
</html>
