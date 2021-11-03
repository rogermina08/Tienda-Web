/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Compra
 * @tema:       Acciones de CRUD
 * @descripción:Después de conectarse a la BD en Mysql,
 *              con esta prueba se puede realizar acciones de CRUD
 *              desde Netbeans, para la Gestión de Compra 
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      20-09-2021
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Compra_crud_admin {
    
    Conexion conexion1 = new Conexion(); 
    
    
    //Acciones CRUD
      
    public void insertarCompra(int id_ped){
        String query ="INSERT INTO compra (cpr_id, id_ped) "+
                    "VALUES (null,\""+id_ped+"\");";
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
        
    }
     
    
    public void leerCompra(){
        String query1 = "SELECT * FROM compra;";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);  //Directamente el metodo porque esta clase tiene extendes Conexion
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println("cpr_id: "+rs1.getString("cpr_id") +" cpr_fecha: "+ rs1.getString("cpr_fecha")+
                        " id_ped: "+rs1.getInt("id_ped")+ " cpr_estado: "+rs1.getString("cpr_estado")
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
    
    
    public void actualizarCompra(int cpr_id,int id_ped){
        String query = "UPDATE compra SET "+
                ",id_ped="+"\""+id_ped+"\""+
                " WHERE cpr_id="+cpr_id+";";
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void eliminarCompra(int cpr_id){
        String query = "UPDATE compra SET cpr_estado= \"Inactivo\" WHERE cpr_id="+cpr_id+";"; 
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void activarCompra(int cpr_id){
        String query = "UPDATE compra SET cpr_estado= \"Activo\" WHERE cpr_id="+cpr_id+";"; 
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion

    }
    
    public void eliminarConfirmacionCompra(int ped_id){
        String query = "UPDATE pedido SET cpr_estado= \"Inactivo\" WHERE id_ped="+ped_id+";"; 
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
}
