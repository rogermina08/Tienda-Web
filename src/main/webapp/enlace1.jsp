<%-- 
    Document   : prueba1
    Created on : 9/10/2021, 12:27:01 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        if(request.getParameter("opcion1")!=null){
            if(request.getParameter("opcion1").equals("categorias")){ 
    %>
                    <jsp:forward page = "menuCategoriaProducto.jsp" />
            <% } else if(request.getParameter("opcion1").equals("productos")){ %>
                    <jsp:forward page = "menuProducto.jsp" />
            <% } else if(request.getParameter("opcion1").equals("proveedores")){ %>
                    <jsp:forward page = "menuProveedor.jsp" />
            <% } else if(request.getParameter("opcion1").equals("pedidos")){ %>
                    <jsp:forward page = "menuPedido.jsp" />
            <% } else if(request.getParameter("opcion1").equals("ventas")){ %>
                    <jsp:forward page = "menuVenta.jsp" />
            <% } else if(request.getParameter("opcion1").equals("reportes")){ %>
                    <jsp:forward page = "menuReporte.jsp" />
            <% }
        } %>
    
</html>
