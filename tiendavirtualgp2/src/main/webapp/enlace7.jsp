<%-- 
    Document   : enlace7
    Created on : 10/10/2021, 10:08:00 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <%
        if(request.getParameter("opcion1")!=null){
            if(request.getParameter("opcion1").equals("ventas")){ 
    %>
                    <jsp:forward page = "menuReporteVenta.jsp" />
            <% } else if(request.getParameter("opcion1").equals("compras")){ %>
                    <jsp:forward page = "menuReporteCompra.jsp" />
            <% } else if(request.getParameter("opcion1").equals("inventario")){ %>
                    <jsp:forward page = "menuReporteInventario.jsp" />
            <% } else if(request.getParameter("opcion1").equals("costos")){ %>
                    <jsp:forward page = "menuReporteCostos.jsp" />
            <% }
        } %>
    

</html>
