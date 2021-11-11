/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Devolución
 * @tema:       Acciones de CRUD
 * @descripción:Después de conectarse a la BD en Mysql,
 *              con esta prueba se puede realizar acciones de CRUD
 *              desde Netbeans, para la Gestión de Devolución en Venta 
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      20-09-2021
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DevolucionVenta_crud_admin {
    
      Conexion conexion1 = new Conexion(); 
    
      
    //Acciones CRUD para Devoluciones en Ventas
          
    public void insertarDevolucionVenta(int id_vta){
        String query ="INSERT INTO devolucion_venta (devvta_id, id_ped) "+
                    "VALUES (null,\""+id_vta+"\");";
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
        
    }
     
    
    public void leerDevolucionVenta(){
        String query1 = "SELECT * FROM devolucion_venta;";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);  //Directamente el metodo porque esta clase tiene extendes Conexion
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println("devvta_id: "+rs1.getString("devvta_id") +" devvta_fecha: "+ rs1.getString("devvta_fecha")+
                        " id_vta: "+rs1.getInt("id_vta")+ " devvta_estado: "+rs1.getString("devvta_estado")
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
    
    
    public void actualizarDevolucionVenta(int devvta_id,int id_vta){
        String query = "UPDATE devolucion_venta SET "+
                ",id_vta="+"\""+id_vta+"\""+
                " WHERE devvta_id="+devvta_id+";";
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void eliminarDevolucionVenta(int devvta_id){
        String query = "UPDATE devolucion_venta SET devvta_estado= \"Inactivo\" WHERE devvta_id="+devvta_id+";"; 
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void activarDevolucionVenta(int devvta_id){
        String query = "UPDATE devolucion_venta SET devvta_estado= \"Activo\" WHERE devvta_id="+devvta_id+";"; 
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion

    }
    
    public void eliminarConfirmacionDevolucionVenta(int vta_id){
//        String query = "UPDATE venta SET cpr_estado= \"Inactivo\" WHERE id_ped="+ped_id+";"; 
//        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
        System.out.println("OJO: Pendiente revisar código");
    }
    
}
