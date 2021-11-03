/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Reporte
 * @tema:       Acciones de CRUD
 * @descripción:Después de conectarse a la BD en Mysql,
 *              con esta prueba se puede realizar acciones de CRUD
 *              desde Netbeans, para la Gestión de Reporte
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      26-09-2021
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Reporte_crud {
    
    Conexion conexion1 = new Conexion();
        
    //Acciones CRUD
    
    
    ////////////////////////////////////
    ////////  REPORTES VENTAS  /////////
    ////////////////////////////////////
    
    public void historicoVentas(){
        System.out.println("\nHistórico de ventas\n");
        String query = "SELECT\n" +
            "v.vta_id, v.vta_fecha,\n" +
            "(select c.catpro_id from categoria_producto c, producto r\n" +
            "	where v.id_pro=r.pro_id and r.id_catpro=c.catpro_id)  as 'cat_id' ,\n" +
            "(select c.catpro_nombre from categoria_producto c, producto r\n" +
            "	where v.id_pro=r.pro_id and r.id_catpro=c.catpro_id) as 'Categoria',\n" +
            "v.id_pro, \n" +
            "(select r.pro_nombre from producto r where r.pro_id = v.id_pro) as 'Producto', \n" +
            "(select r.pro_referencia from producto r where r.pro_id = v.id_pro) as 'Referencia',\n" +
            "(select r.pro_unidad from producto r where r.pro_id = v.id_pro) as 'Und', \n" +
            "v.vta_cantidad as 'Cantidad',\n" +
            "(select r.pro_valor_unitario_venta from producto r where r.pro_id = v.id_pro) as 'Vr.Unidad',\n" +
            "(select r.pro_valor_unitario_venta * CAST(v.vta_cantidad as DECIMAL(10,2)) \n" +
            "	from producto r where r.pro_id = v.id_pro) as 'Vr.Parcial'  \n" +
            "\n" +
            "from \n" +
            "venta v\n" +
            "\n" +
            "where\n" +
            "v.vta_estado = 'Activo';";

        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " vta_id: "+rs1.getString("vta_id") +
                        " vta_fecha: "+ rs1.getString("vta_fecha")+
                        " cat_id: "+rs1.getString("cat_id")+
                        " Categoria: "+rs1.getString("Categoria")+ 
                        " id_pro: "+rs1.getString("id_pro")+
                        " producto: "+rs1.getString("Producto")+
                        " referencia: "+rs1.getString("Referencia")+
                        " unidad: "+rs1.getString("Und")+
                        " cantidad: "+rs1.getString("Cantidad")+
                        " vr.unidad: "+rs1.getString("Vr.Unidad")+
                        " vr.parcial: "+rs1.getString("Vr.Parcial")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        //Cálculo del total de las ventas durante el período
        String query1 = "SELECT\n" +
            "sum(r.pro_valor_unitario_venta * CAST(v.vta_cantidad as DECIMAL(10,2))) as 'Total Ventas'\n" +
            "\n" +
            "from \n" +
            "producto r, venta v\n" +
            "\n" +
            "where \n" +
            "r.pro_id=v.id_pro and\n" +
            "	v.vta_estado = 'Activo' and  r.pro_estado = 'Activo';";
            //"	and (v.vta_fecha>="+fecha_inicial+" and v.vta_fecha<="+fecha_final+") and\n" +
            //"	(r.pro_fecha>="+fecha_inicial+" and r.pro_fecha<="+fecha_final)+    
        
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotas Ventas en el período: "+rs2.getString("Total Ventas")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
         
    }
    
    
    
    public void ventasCategoriaProducto(){
        System.out.println("\nVentas por categoría de producto\n");
        String query = "SELECT \n" +
            "(select c.catpro_id from categoria_producto c, producto r\n" +
            "	where v.id_pro=r.pro_id and r.id_catpro=c.catpro_id)  as 'cat_id' ,\n" +
            "(select c.catpro_nombre from categoria_producto c, producto r\n" +
            "	where v.id_pro=r.pro_id and r.id_catpro=c.catpro_id) as 'Categoría',\n" +
            "sum(r.pro_valor_unitario_venta * CAST(v.vta_cantidad as DECIMAL(10,2))) as 'Total Ventas'\n" +
            "\n" +
            "from \n" +
            "venta v, producto r, categoria_producto c\n" +
            "\n" +
            "where \n" +
            "r.pro_id=v.id_pro and r.id_catpro=c.catpro_id and \n" +
            "v.vta_estado = 'Activo' and r.pro_estado = 'Activo' and c.catpro_estado = 'Activo' \n" +
//            "and (v.vta_fecha>='2021-09-01' and v.vta_fecha<='2021-10-31') and\n" +
//            "(r.pro_fecha>='2021-09-01' and r.pro_fecha<='2021-10-31') and\n" +
//            "(c.catpro_fecha>='2021-09-01' and c.catpro_fecha<='2021-10-31')\n" +
            "\n" +
            "group by \n" +
            "r.id_catpro;";

        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " cat_id: "+rs1.getString("cat_id")+
                        " Categoría: "+rs1.getString("Categoría")+ 
                        " TotalxCategoría: "+rs1.getString("Total Ventas")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        //Cálculo del total de las ventas durante el período
        String query1 = "SELECT\n" +
            "sum(r.pro_valor_unitario_venta * CAST(v.vta_cantidad as DECIMAL(10,2))) as 'Total Ventas'\n" +
            "\n" +
            "from \n" +
            "producto r, venta v\n" +
            "\n" +
            "where \n" +
            "r.pro_id=v.id_pro and\n" +
            "	v.vta_estado = 'Activo' and  r.pro_estado = 'Activo';";
            //"	and (v.vta_fecha>="+fecha_inicial+" and v.vta_fecha<="+fecha_final+") and\n" +
            //"	(r.pro_fecha>="+fecha_inicial+" and r.pro_fecha<="+fecha_final)+    
        
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotas Ventas en el período: "+rs2.getString("Total Ventas")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
                
    }
    
    
    
    public void ventasProducto(){
        System.out.println("\nVentas por producto\n");
         String query = "SELECT\n" +
            "r.pro_id, r.pro_nombre as 'Producto', r.pro_unidad as 'Und',\n" +
            "(select sum(v.vta_cantidad) from venta v where r.pro_id = v.id_pro) as 'Cant.Total',\n" +
            "r.pro_valor_unitario_venta as 'Vr.Unitario',\n" +
            "(CAST((select sum(v.vta_cantidad) from venta v where r.pro_id = v.id_pro) as DECIMAL(10,2)) \n" +
            "	* r.pro_valor_unitario_venta) as 'Vr.Parcial'\n" +
            "\n" +
            "from\n" +
            "producto r, venta v \n" +
            "\n" +
            "where\n" +
            "r.pro_id = v.id_pro and\n" +
            "v.vta_estado = 'Activo' and r.pro_estado = 'Activo'\n" +
//            "	and (v.vta_fecha>='2021-09-01' and v.vta_fecha<='2021-10-31') and\n" +
//            "	(r.pro_fecha>='2021-09-01' and r.pro_fecha<='2021-10-31')\n" +
            "\n" +
            "group by\n" +
            "r.pro_id;";
         
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " pro_id: "+rs1.getString("pro_id")+
                        " Producto: "+rs1.getString("Producto")+ 
                        " Und: "+rs1.getString("Und")+ 
                        " Cant.Total: "+rs1.getString("Cant.Total")+
                        " Vr.Unitario: "+rs1.getString("Vr.Unitario")+ 
                        " Vr.Parcial: "+rs1.getString("Vr.Parcial")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        } 
         
        //Cálculo del total de las ventas durante el período
        String query1 = "SELECT\n" +
            "sum(r.pro_valor_unitario_venta * CAST(v.vta_cantidad as DECIMAL(10,2))) as 'Total Ventas'\n" +
            "\n" +
            "from \n" +
            "producto r, venta v\n" +
            "\n" +
            "where \n" +
            "r.pro_id=v.id_pro and\n" +
            "	v.vta_estado = 'Activo' and  r.pro_estado = 'Activo';";
            //"	and (v.vta_fecha>="+fecha_inicial+" and v.vta_fecha<="+fecha_final+") and\n" +
            //"	(r.pro_fecha>="+fecha_inicial+" and r.pro_fecha<="+fecha_final)+    
        
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotas Ventas en el período: "+rs2.getString("Total Ventas")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
         
    }
    
    
    
    public void ventasProveedor(){
        System.out.println("\nVentas por proveedor\n");
        System.out.println("En desarrollo............");
    }
    
    
    ////////////////////////////////////
    ////////  REPORTES COMPRAS  ////////
    ////////////////////////////////////
    
    public void historicoCompras(){
        System.out.println("\nHistorico de compras\n");
        String query = "SELECT\n" +
            "p.ped_id, p.ped_numero_pedido as 'No.Pedido', p.id_pro, \n" +
            "(select r.pro_nombre from producto r where r.pro_id = p.id_pro) as 'Producto', \n" +
            "(select r.pro_referencia from producto r where r.pro_id = p.id_pro) as 'Referencia',\n" +
            "(select r.pro_unidad from producto r where r.pro_id = p.id_pro) as 'Und', \n" +
            "p.ped_cantidad as 'Cantidad',\n" +
            "p.ped_valor_unitario_compra as 'Vr.Unidad',\n" +
            "(select p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2)) \n" +
            "	from producto r where r.pro_id = p.id_pro) as 'Vr.Parcial'  \n" +
            "\n" +
            "from \n" +
            "pedido p\n" +
            "\n" +
            "where \n" +
            "(p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si');";
//            "	(p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31')" +

        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " ped_id: "+rs1.getString("ped_id")+
                        " No.Pedido: "+rs1.getString("No.Pedido")+
                        " id_pro: "+rs1.getString("id_pro")+
                        " Producto: "+rs1.getString("Producto")+
                        " Referencia: "+rs1.getString("Referencia")+        
                        " Und: "+rs1.getString("Und")+ 
                        " Cantidad: "+rs1.getString("Cantidad")+
                        " Vr.Unidad: "+rs1.getString("Vr.Unidad")+
                        " Vr.Parcial: "+rs1.getString("Vr.Parcial")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        } 
        
            
        //Cálculo del total de las compras durante el período
        String query1 = "SELECT\n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total Compras'\n" +
            "\n" +
            "from\n" +
            "pedido p \n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' ;";
//            "	(p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31');";
                    
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotal Compras en el período: "+rs2.getString("Total Compras")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
    }
    
    public void comprasCategoriaProducto(){
         System.out.println("\nCompras por categoría de producto\n");
         String query = "SELECT\n" +
            "c.catpro_id, c.catpro_nombre as 'Categoría', \n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total ComprasxCategoría'\n" +
            "\n" +
            "from\n" +
            "categoria_producto c, producto r, pedido p\n" +
            "\n" +
            "where \n" +
            "c.catpro_id = r.id_catpro and \n" +
            "	r.pro_id = p.id_pro and \n" +
            "    c.catpro_estado = 'Activo' and r.pro_estado = 'Activo' and p.ped_estado = 'Activo' \n" +
//            "	and c.catpro_fecha>='2021-09-01' and c.catpro_fecha<='2021-10-31' and\n" +
//            "	r.pro_fecha>='2021-09-01' and r.pro_fecha<='2021-10-31' and\n" +
//            "	p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31'\n" +
            " \n" +
            "group by \n" +
            "c.catpro_id;";
         
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " catpro_id: "+rs1.getString("catpro_id")+
                        " Categoría: "+rs1.getString("Categoría")+
                        " Total ComprasxCategoría: "+rs1.getString("Total ComprasxCategoría")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        //Cálculo del total de las compras durante el período
        String query1 = "SELECT\n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total Compras'\n" +
            "\n" +
            "from\n" +
            "pedido p \n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' ;";
//            "	(p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31');";
                    
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotal Compras en el período: "+rs2.getString("Total Compras")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
                 
    }
    
    
    
    public void comprasProducto(){
        System.out.println("\nCompras por producto\n");
        String query = "SELECT\n" +
            "p.id_pro, \n" +
            "(select r.pro_nombre from producto r where p.id_pro = r.pro_id) as 'Producto', \n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total ComprasxProducto'\n" +
            "\n" +
            "from pedido p\n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' \n" +
//            "	and (p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31')\n" +
            "\n" +
            "group by \n" +
            "p.id_pro;";
        
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " id_pro: "+rs1.getString("id_pro")+
                        " Producto: "+rs1.getString("Producto")+ 
                        " Total ComprasxProducto: "+rs1.getString("Total ComprasxProducto")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        //Cálculo del total de las compras durante el período
        String query1 = "SELECT\n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total Compras'\n" +
            "\n" +
            "from\n" +
            "pedido p \n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' ;";
//            "	(p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31');";
                    
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotal Compras en el período: "+rs2.getString("Total Compras")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
          
    }
    
    
    
    public void comprasProveedor(){
        System.out.println("\nCompras por proveedor\n");
        String query = "SELECT\n" +
            "p.id_prv,\n" +
            "(select v.prv_nit_empresa from proveedor v where p.id_prv = v.prv_id) as 'Nit', \n" +
            "(select v.prv_razon_social_empresa from proveedor v where p.id_prv = v.prv_id) as 'Proveedor', \n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total ComprasxProveedor'\n" +
            "\n" +
            "from\n" +
            "pedido p\n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' \n" +
//            "	and (p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31')\n" +
            "\n" +
            "group by p.id_prv;";
        
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " id_prv: "+rs1.getString("id_prv")+
                        " Nit: "+rs1.getString("Nit")+        
                        " Proveedor: "+rs1.getString("Proveedor")+
                        " Total ComprasxProveedor: "+rs1.getString("Total ComprasxProveedor")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        //Cálculo del total de las compras durante el período
        String query1 = "SELECT\n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total Compras'\n" +
            "\n" +
            "from\n" +
            "pedido p \n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' ;";
//            "	(p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31');";
                    
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotal Compras en el período: "+rs2.getString("Total Compras")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
    }
    
    
    
    public void comprasPedido(){
        System.out.println("\nCompras por pedido\n");
        String query = "SELECT\n" +
            "p.ped_numero_pedido as 'No.Pedido', \n" +
            "	sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total ComprasxPedido'\n" +
            "\n" +
            "from\n" +
            "pedido p \n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' \n" +
//            "	and (p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31')\n" +
            "\n" +
            "group by \n" +
            "p.ped_numero_pedido;";
        
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " No.Pedido: "+rs1.getString("No.Pedido")+
                        " Total ComprasxPedido: "+rs1.getString("Total ComprasxPedido")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        //Cálculo del total de las compras durante el período
        String query1 = "SELECT\n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total Compras'\n" +
            "\n" +
            "from\n" +
            "pedido p \n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' ;";
//            "	(p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31');";
                    
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotal Compras en el período: "+rs2.getString("Total Compras")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
    }
        
    
    
    ///////////////////////////////////////
    ////////  REPORTES INVENTARIO  ////////
    ///////////////////////////////////////
        
    public void inventarioCategoria(){
        System.out.println("\nIventario por categoría\n");
    }
    
    public void inventarioProducto(){
        System.out.println("\nInventario por producto\n");
    }
    
    public void inventarioProductoStockMinimo(){
        System.out.println("\nInventario por producto - stock mínimo\n");
    }
        
    public void kardexProducto(){
        System.out.println("\nKardex por producto\n");
        System.out.println("En desarrollo...............");
//        String query1 = "SELECT .................................  ;";
//        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);  //Directamente el metodo porque esta clase tiene extendes Conexion
//        try{
//            int bandera=0;
//            while(rs1.next()==true){
//                System.out.println("ped_id: "+rs1.getString("ped_id") +" ped_fecha: "+ rs1.getString("ped_fecha")+
//                        " ped_numero_pedido: "+rs1.getString("ped_numero_pedido")+
//                        " id_pro: "+rs1.getString("id_pro")+ 
//                        " id_prv: "+rs1.getString("id_prv")+
//                        " ped_cantidad: "+rs1.getString("ped_cantidad")+
//                        " ped_valor_unitario_compra: "+rs1.getString("ped_valor_unitario_compra")+
//                        " ped_confirma_recibo: "+rs1.getString("ped_confirma_recibo")+ " ped_estado: "+rs1.getString("ped_estado")
//                        ); 
//                bandera=1;
//            }
//            if(bandera==0){
//                System.out.println("No hay registros en la BD");
//            }
//        }catch(SQLException e){
//            System.out.println(e.getMessage()); 
//        }
    }
    
    
    
    /////////////////////////////////////////////////
    ////////  REPORTES DE COSTOS - VENTAS  ////////// 
    /////////////////////////////////////////////////
        
    public void historicoCostosVentas(){
        System.out.println("\nHistórico costos por ventas\n");
        String query = "SELECT\n" +
            "v.vta_id, v.vta_fecha,\n" +
            "(select c.catpro_id from categoria_producto c, producto r\n" +
            "	where v.id_pro=r.pro_id and r.id_catpro=c.catpro_id)  as 'cat_id' ,\n" +
            "(select c.catpro_nombre from categoria_producto c, producto r\n" +
            "	where v.id_pro=r.pro_id and r.id_catpro=c.catpro_id) as 'Categoria',\n" +
            "v.id_pro, \n" +
            "(select r.pro_nombre from producto r where r.pro_id = v.id_pro) as 'Producto', \n" +
            "(select r.pro_referencia from producto r where r.pro_id = v.id_pro) as 'Referencia',\n" +
            "(select r.pro_unidad from producto r where r.pro_id = v.id_pro) as 'Und', \n" +
            "v.vta_cantidad as 'Cantidad',\n" +
            "(select r.pro_valor_unitario_venta from producto r where r.pro_id = v.id_pro) as 'Vr.Unidad',\n" +
            "(select r.pro_valor_unitario_venta * CAST(v.vta_cantidad as DECIMAL(10,2)) \n" +
            "	from producto r where r.pro_id = v.id_pro) as 'Vr.Parcial'  \n" +
            "\n" +
            "from \n" +
            "venta v\n" +
            "\n" +
            "where\n" +
            "v.vta_estado = 'Activo';";

        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " vta_id: "+rs1.getString("vta_id") +
                        " vta_fecha: "+ rs1.getString("vta_fecha")+
                        " cat_id: "+rs1.getString("cat_id")+
                        " Categoria: "+rs1.getString("Categoria")+ 
                        " id_pro: "+rs1.getString("id_pro")+
                        " producto: "+rs1.getString("Producto")+
                        " referencia: "+rs1.getString("Referencia")+
                        " unidad: "+rs1.getString("Und")+
                        " cantidad: "+rs1.getString("Cantidad")+
                        " vr.unidad: "+rs1.getString("Vr.Unidad")+
                        " vr.parcial: "+rs1.getString("Vr.Parcial")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        //Cálculo del total de las ventas durante el período
        String query1 = "SELECT\n" +
            "sum(r.pro_valor_unitario_venta * CAST(v.vta_cantidad as DECIMAL(10,2))) as 'Total Ventas'\n" +
            "\n" +
            "from \n" +
            "producto r, venta v\n" +
            "\n" +
            "where \n" +
            "r.pro_id=v.id_pro and\n" +
            "	v.vta_estado = 'Activo' and  r.pro_estado = 'Activo';";
            //"	and (v.vta_fecha>="+fecha_inicial+" and v.vta_fecha<="+fecha_final+") and\n" +
            //"	(r.pro_fecha>="+fecha_inicial+" and r.pro_fecha<="+fecha_final)+    
        
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotas Ventas en el período: "+rs2.getString("Total Ventas")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
    
    public void historicoCostosVentasCategoria(){
        System.out.println("\nHistórico costos de Ventas por Categorías de Productos\n");
        String query = "SELECT \n" +
            "(select c.catpro_id from categoria_producto c, producto r\n" +
            "	where v.id_pro=r.pro_id and r.id_catpro=c.catpro_id)  as 'cat_id' ,\n" +
            "(select c.catpro_nombre from categoria_producto c, producto r\n" +
            "	where v.id_pro=r.pro_id and r.id_catpro=c.catpro_id) as 'Categoría',\n" +
            "sum(r.pro_valor_unitario_venta * CAST(v.vta_cantidad as DECIMAL(10,2))) as 'Total Ventas'\n" +
            "\n" +
            "from \n" +
            "venta v, producto r, categoria_producto c\n" +
            "\n" +
            "where \n" +
            "r.pro_id=v.id_pro and r.id_catpro=c.catpro_id and \n" +
            "v.vta_estado = 'Activo' and r.pro_estado = 'Activo' and c.catpro_estado = 'Activo' \n" +
//            "and (v.vta_fecha>='2021-09-01' and v.vta_fecha<='2021-10-31') and\n" +
//            "(r.pro_fecha>='2021-09-01' and r.pro_fecha<='2021-10-31') and\n" +
//            "(c.catpro_fecha>='2021-09-01' and c.catpro_fecha<='2021-10-31')\n" +
            "\n" +
            "group by \n" +
            "r.id_catpro;";

        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " cat_id: "+rs1.getString("cat_id")+
                        " Categoría: "+rs1.getString("Categoría")+ 
                        " TotalxCategoría: "+rs1.getString("Total Ventas")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        //Cálculo del total de las ventas durante el período
        String query1 = "SELECT\n" +
            "sum(r.pro_valor_unitario_venta * CAST(v.vta_cantidad as DECIMAL(10,2))) as 'Total Ventas'\n" +
            "\n" +
            "from \n" +
            "producto r, venta v\n" +
            "\n" +
            "where \n" +
            "r.pro_id=v.id_pro and\n" +
            "	v.vta_estado = 'Activo' and  r.pro_estado = 'Activo';";
            //"	and (v.vta_fecha>="+fecha_inicial+" and v.vta_fecha<="+fecha_final+") and\n" +
            //"	(r.pro_fecha>="+fecha_inicial+" and r.pro_fecha<="+fecha_final)+    
        
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotas Ventas en el período: "+rs2.getString("Total Ventas")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
    
    public void historicoCostosVentasProducto(){
        System.out.println("\nHistórico costos de ventas por Producto\n");
         String query = "SELECT\n" +
            "r.pro_id, r.pro_nombre as 'Producto', r.pro_unidad as 'Und',\n" +
            "(select sum(v.vta_cantidad) from venta v where r.pro_id = v.id_pro) as 'Cant.Total',\n" +
            "r.pro_valor_unitario_venta as 'Vr.Unitario',\n" +
            "(CAST((select sum(v.vta_cantidad) from venta v where r.pro_id = v.id_pro) as DECIMAL(10,2)) \n" +
            "	* r.pro_valor_unitario_venta) as 'Vr.Parcial'\n" +
            "\n" +
            "from\n" +
            "producto r, venta v \n" +
            "\n" +
            "where\n" +
            "r.pro_id = v.id_pro and\n" +
            "v.vta_estado = 'Activo' and r.pro_estado = 'Activo'\n" +
//            "	and (v.vta_fecha>='2021-09-01' and v.vta_fecha<='2021-10-31') and\n" +
//            "	(r.pro_fecha>='2021-09-01' and r.pro_fecha<='2021-10-31')\n" +
            "\n" +
            "group by\n" +
            "r.pro_id;";
         
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " pro_id: "+rs1.getString("pro_id")+
                        " Producto: "+rs1.getString("Producto")+ 
                        " Und: "+rs1.getString("Und")+ 
                        " Cant.Total: "+rs1.getString("Cant.Total")+
                        " Vr.Unitario: "+rs1.getString("Vr.Unitario")+ 
                        " Vr.Parcial: "+rs1.getString("Vr.Parcial")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        } 
         
        //Cálculo del total de las ventas durante el período
        String query1 = "SELECT\n" +
            "sum(r.pro_valor_unitario_venta * CAST(v.vta_cantidad as DECIMAL(10,2))) as 'Total Ventas'\n" +
            "\n" +
            "from \n" +
            "producto r, venta v\n" +
            "\n" +
            "where \n" +
            "r.pro_id=v.id_pro and\n" +
            "	v.vta_estado = 'Activo' and  r.pro_estado = 'Activo';";
            //"	and (v.vta_fecha>="+fecha_inicial+" and v.vta_fecha<="+fecha_final+") and\n" +
            //"	(r.pro_fecha>="+fecha_inicial+" and r.pro_fecha<="+fecha_final)+    
        
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotas Ventas en el período: "+rs2.getString("Total Ventas")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
    
    public void historicoCostosVentasProveedor(){
        System.out.println("\nHistórico costos de ventas por Proveedor\n");
        System.out.println("En desarrollo..............");
    }
        
    
    /////////////////////////////////////////////////
    ////////  REPORTES DE COSTOS - COMPRAS  ///////// 
    /////////////////////////////////////////////////
    
    public void historicoCostosCompras(){
        System.out.println("\nHistórico costos por compras\n");
        String query = "SELECT\n" +
            "p.ped_id, p.ped_numero_pedido as 'No.Pedido', p.id_pro, \n" +
            "(select r.pro_nombre from producto r where r.pro_id = p.id_pro) as 'Producto', \n" +
            "(select r.pro_referencia from producto r where r.pro_id = p.id_pro) as 'Referencia',\n" +
            "(select r.pro_unidad from producto r where r.pro_id = p.id_pro) as 'Und', \n" +
            "p.ped_cantidad as 'Cantidad',\n" +
            "p.ped_valor_unitario_compra as 'Vr.Unidad',\n" +
            "(select p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2)) \n" +
            "	from producto r where r.pro_id = p.id_pro) as 'Vr.Parcial'  \n" +
            "\n" +
            "from \n" +
            "pedido p\n" +
            "\n" +
            "where \n" +
            "(p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si');";
//            "	(p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31')" +

        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " ped_id: "+rs1.getString("ped_id")+
                        " No.Pedido: "+rs1.getString("No.Pedido")+
                        " id_pro: "+rs1.getString("id_pro")+
                        " Producto: "+rs1.getString("Producto")+
                        " Referencia: "+rs1.getString("Referencia")+        
                        " Und: "+rs1.getString("Und")+ 
                        " Cantidad: "+rs1.getString("Cantidad")+
                        " Vr.Unidad: "+rs1.getString("Vr.Unidad")+
                        " Vr.Parcial: "+rs1.getString("Vr.Parcial")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        } 
        
            
        //Cálculo del total de las compras durante el período
        String query1 = "SELECT\n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total Compras'\n" +
            "\n" +
            "from\n" +
            "pedido p \n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' ;";
//            "	(p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31');";
                    
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotal Compras en el período: "+rs2.getString("Total Compras")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
    
    public void historicoCostosComprasCategoria(){
        System.out.println("\nHistórico costos de compras por Categoría de Producto\n");
        String query = "SELECT\n" +
            "c.catpro_id, c.catpro_nombre as 'Categoría', \n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total ComprasxCategoría'\n" +
            "\n" +
            "from\n" +
            "categoria_producto c, producto r, pedido p\n" +
            "\n" +
            "where \n" +
            "c.catpro_id = r.id_catpro and \n" +
            "	r.pro_id = p.id_pro and \n" +
            "    c.catpro_estado = 'Activo' and r.pro_estado = 'Activo' and p.ped_estado = 'Activo' \n" +
//            "	and c.catpro_fecha>='2021-09-01' and c.catpro_fecha<='2021-10-31' and\n" +
//            "	r.pro_fecha>='2021-09-01' and r.pro_fecha<='2021-10-31' and\n" +
//            "	p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31'\n" +
            " \n" +
            "group by \n" +
            "c.catpro_id;";
         
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " catpro_id: "+rs1.getString("catpro_id")+
                        " Categoría: "+rs1.getString("Categoría")+
                        " Total ComprasxCategoría: "+rs1.getString("Total ComprasxCategoría")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        //Cálculo del total de las compras durante el período
        String query1 = "SELECT\n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total Compras'\n" +
            "\n" +
            "from\n" +
            "pedido p \n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' ;";
//            "	(p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31');";
                    
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotal Compras en el período: "+rs2.getString("Total Compras")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
    
    public void historicoCostosComprasProducto(){
        System.out.println("\nHistórico costos de compras por Producto\n");
        String query = "SELECT\n" +
            "p.id_pro, \n" +
            "(select r.pro_nombre from producto r where p.id_pro = r.pro_id) as 'Producto', \n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total ComprasxProducto'\n" +
            "\n" +
            "from pedido p\n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' \n" +
//            "	and (p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31')\n" +
            "\n" +
            "group by \n" +
            "p.id_pro;";
        
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " id_pro: "+rs1.getString("id_pro")+
                        " Producto: "+rs1.getString("Producto")+ 
                        " Total ComprasxProducto: "+rs1.getString("Total ComprasxProducto")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        //Cálculo del total de las compras durante el período
        String query1 = "SELECT\n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total Compras'\n" +
            "\n" +
            "from\n" +
            "pedido p \n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' ;";
//            "	(p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31');";
                    
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotal Compras en el período: "+rs2.getString("Total Compras")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
    
    public void historicoCostosComprasProveedor(){
        System.out.println("\nHistórico costos de compras por Proveedor\n");
        String query = "SELECT\n" +
            "p.id_prv,\n" +
            "(select v.prv_nit_empresa from proveedor v where p.id_prv = v.prv_id) as 'Nit', \n" +
            "(select v.prv_razon_social_empresa from proveedor v where p.id_prv = v.prv_id) as 'Proveedor', \n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total ComprasxProveedor'\n" +
            "\n" +
            "from\n" +
            "pedido p\n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' \n" +
//            "	and (p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31')\n" +
            "\n" +
            "group by p.id_prv;";
        
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " id_prv: "+rs1.getString("id_prv")+
                        " Nit: "+rs1.getString("Nit")+        
                        " Proveedor: "+rs1.getString("Proveedor")+
                        " Total ComprasxProveedor: "+rs1.getString("Total ComprasxProveedor")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        //Cálculo del total de las compras durante el período
        String query1 = "SELECT\n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total Compras'\n" +
            "\n" +
            "from\n" +
            "pedido p \n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' ;";
//            "	(p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31');";
                    
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotal Compras en el período: "+rs2.getString("Total Compras")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
    
    public void historicoCostosComprasPedido(){
        System.out.println("\nHistórico costos de compras por Pedido\n");
        String query = "SELECT\n" +
            "p.ped_numero_pedido as 'No.Pedido', \n" +
            "	sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total ComprasxPedido'\n" +
            "\n" +
            "from\n" +
            "pedido p \n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' \n" +
//            "	and (p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31')\n" +
            "\n" +
            "group by \n" +
            "p.ped_numero_pedido;";
        
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        " No.Pedido: "+rs1.getString("No.Pedido")+
                        " Total ComprasxPedido: "+rs1.getString("Total ComprasxPedido")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        //Cálculo del total de las compras durante el período
        String query1 = "SELECT\n" +
            "sum(p.ped_valor_unitario_compra * CAST(p.ped_cantidad as DECIMAL(10,2))) as 'Total Compras'\n" +
            "\n" +
            "from\n" +
            "pedido p \n" +
            "\n" +
            "where\n" +
            "p.ped_estado = 'Activo' and p.ped_confirma_recibo = 'Si' ;";
//            "	(p.ped_fecha>='2021-09-01' and p.ped_fecha<='2021-10-31');";
                    
        ResultSet rs2 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs2.next()==true){
                System.out.println("\nTotal Compras en el período: "+rs2.getString("Total Compras")); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
    
}
