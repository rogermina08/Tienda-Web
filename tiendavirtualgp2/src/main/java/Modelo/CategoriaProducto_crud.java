/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Categoría de Productos
 * @tema:       Acciones de CRUD
 * @descripción:Después de conectarse a la BD en Mysql,
 *              con esta prueba se puede realizar acciones de CRUD
 *              desde Netbeans, para la Gestión de Categoría de Productos 
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      17-09-2021
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaProducto_crud {
    
    Conexion conexion1 = new Conexion();
    
    
    //Acciones CRUD
      
    public void insertarCategoriaProducto(String catpro_nombre){
        String query ="INSERT INTO categoria_producto (catpro_id, catpro_nombre)"+
                "VALUES (null,\""+catpro_nombre+"\");";
        conexion1.ejecutarQuery(query);
    }
    
        
    public void leerCategoriaProducto(){
        String query1 = "SELECT * FROM categoria_producto;";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println("catpro_id: "+rs1.getString("catpro_id") +
                        " catpro_fecha: "+ rs1.getString("catpro_fecha")+
                        " catpro_nombre: "+rs1.getString("catpro_nombre")+
                        " catpro_estado: "+rs1.getString("catpro_estado")
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
    
    
    public void actualizarCategoriaProducto(int catpro_id, String catpro_nombre){
        String query = "UPDATE categoria_producto SET catpro_nombre="+"\""+catpro_nombre+"\""+
                " WHERE catpro_id="+catpro_id+";";
        conexion1.ejecutarQuery(query);
    }
    
    
    public void eliminarCategoriaProducto(int catpro_id){
        String query = "UPDATE categoria_producto SET catpro_estado= \"Inactivo\" WHERE catpro_id="+catpro_id+";"; 
        conexion1.ejecutarQuery(query);
    }
     
    
    public void activarCategoriaProducto(int catpro_id){
        String query = "UPDATE categoria_producto SET catpro_estado= \"Activo\" WHERE catpro_id="+catpro_id+";"; 
        conexion1.ejecutarQuery(query);
    }
    
}
