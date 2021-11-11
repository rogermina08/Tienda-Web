/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Devolución
 * @tema:       Acciones de CRUD
 * @descripción:Después de conectarse a la BD en Mysql,
 *              con esta prueba se puede realizar acciones de CRUD
 *              desde Netbeans, para la Gestión de Devolución en Compra 
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      20-09-2021
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DevolucionCompra_crud_admin {

    Conexion conexion1 = new Conexion(); 
    
    
    //Acciones CRUD para Devoluciones en Compras
      
    public void insertarDevolucionCompra(int id_ped){
        String query ="INSERT INTO devolucion_compra (devcpr_id, id_ped) "+
                    "VALUES (null,\""+id_ped+"\");";
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
        
    }
     
    
    public void leerDevolucionCompra(){
        String query1 = "SELECT * FROM devolucion_compra;";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);  //Directamente el metodo porque esta clase tiene extendes Conexion
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println("devcpr_id: "+rs1.getString("devcpr_id") +" devcpr_fecha: "+ rs1.getString("devcpr_fecha")+
                        " id_ped: "+rs1.getInt("id_ped")+ " devcpr_estado: "+rs1.getString("devcpr_estado")
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
    
    
    public void actualizarDevolucionCompra(int devcpr_id,int id_ped){
        String query = "UPDATE devolucion_compra SET "+
                ",id_ped="+"\""+id_ped+"\""+
                " WHERE devcpr_id="+devcpr_id+";";
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void eliminarDevolucionCompra(int devcpr_id){
        String query = "UPDATE devolucion_compra SET devcpr_estado= \"Inactivo\" WHERE devcpr_id="+devcpr_id+";"; 
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void activarDevolucionCompra(int devcpr_id){
        String query = "UPDATE devolucion_compra SET devcpr_estado= \"Activo\" WHERE devcpr_id="+devcpr_id+";"; 
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion

    }
    
    public void eliminarConfirmacionDevolucionCompra(int ped_id){
//        String query = "UPDATE pedido SET cpr_estado= \"Inactivo\" WHERE id_ped="+ped_id+";"; 
//        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
        System.out.println("OJO: Pendiente revisar código");
    }
    
}
