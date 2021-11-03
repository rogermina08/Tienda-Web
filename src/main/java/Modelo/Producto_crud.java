/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Producto
 * @tema:       Acciones de CRUD
 * @descripción:Después de conectarse a la BD en Mysql,
 *              con esta prueba se puede realizar acciones de CRUD
 *              desde Netbeans, para la Gestión de Producto 
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      13-09-2021
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Producto_crud{
    
    Conexion conexion1 = new Conexion();
        
    
    //Acciones CRUD
      
    public void insertarProducto(String pro_nombre, String pro_marca, String pro_unidad, String pro_referencia, double pro_valor_unitario_venta, int id_catpro){
        String query ="INSERT INTO producto (pro_id, pro_nombre, pro_marca, pro_unidad, pro_referencia, pro_valor_unitario_venta, id_catpro) "+
                    "VALUES (null,\""+pro_nombre+"\","
                + "\""+pro_marca+"\",\""+pro_unidad+"\","
                + "\""+pro_referencia+"\", \""+pro_valor_unitario_venta+"\","
                + " \""+id_catpro+"\");";
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
    }
        
    
    public void leerProducto(){
        String query1 = "SELECT * FROM producto;";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);  //Directamente el metodo porque esta clase tiene extendes Conexion
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println("sipro_id: "+rs1.getString("pro_id") +" pro_fecha: "+ rs1.getString("pro_fecha")+
                        " pro_nombre: "+rs1.getString("pro_nombre")+ " pro_marca: "+rs1.getString("pro_marca")+
                        " pro_unidad: "+rs1.getString("pro_unidad")+ " pro_referencia: "+rs1.getString("pro_referencia")+
                        " pro_valor_unitario_venta: "+rs1.getString("pro_valor_unitario_venta")+
                        " id_catpro: "+rs1.getString("id_catpro")+ " pro_estado: "+rs1.getString("pro_estado")
                        );
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
    
    
    public void actualizarProducto(int pro_id, String pro_nombre,String pro_marca, String pro_unidad, String pro_referencia, double pro_valor_unitario_venta, int id_catpro){
        String query = "UPDATE producto SET pro_nombre="+"\""+pro_nombre+"\""+
                ",pro_marca="+"\""+pro_marca+"\""+
                ",pro_unidad="+"\""+pro_unidad+"\""+
                ",pro_referencia="+"\""+pro_referencia+"\""+
                ",pro_valor_unitario_venta="+"\""+pro_valor_unitario_venta+"\""+
                ",id_catpro="+"\""+id_catpro+"\""+
                " WHERE pro_id="+pro_id+";";
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void eliminarProducto(int pro_id){
        String query = "UPDATE producto SET pro_estado= \"Inactivo\" WHERE pro_id="+pro_id+";"; 
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void activarProducto(int pro_id){
        String query = "UPDATE producto SET pro_estado= \"Activo\" WHERE pro_id="+pro_id+";"; 
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
    }

}
