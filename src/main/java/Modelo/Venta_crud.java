/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Venta
 * @tema:       Acciones de CRUD
 * @descripción:Después de conectarse a la BD en Mysql,
 *              con esta prueba se puede realizar acciones de CRUD
 *              desde Netbeans, para la Gestión de Venta 
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      20-09-2021
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class Venta_crud {
    
    Conexion conexion1 = new Conexion(); 
    
    
    //Acciones CRUD
      
    public void insertarVenta(int id_pro, float vta_cantidad){
        String query ="INSERT INTO venta (vta_id, id_pro, vta_cantidad) "+
                    "VALUES (null,\""+id_pro+"\", \""+vta_cantidad+"\");";
        conexion1.ejecutarQuery(query); //Direvtactamente el metodo porque esta clase tiene extendes Conexion
        
    }
     
    
    public void leerVenta(){
        String query1 = "SELECT * FROM venta;";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);  //Directamente el metodo porque esta clase tiene extendes Conexion
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println("vta_id: "+rs1.getString("vta_id") +" vta_fecha: "+ rs1.getString("vta_fecha")+
                        " id_pro: "+rs1.getInt("id_pro")+ " vta_cantidad: "+rs1.getFloat("vta_cantidad")+
                        " vta_estado: "+rs1.getString("vta_estado")
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
    
    
    public void actualizarVenta(int vta_id, int id_pro, float vta_cantidad){
        String query = "UPDATE venta SET "+
                "id_pro="+"\""+id_pro+"\""+
                ",vta_cantidad="+"\""+vta_cantidad+"\""+
                " WHERE vta_id="+vta_id+";";
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void eliminarVenta(int vta_id){
        String query = "UPDATE venta SET vta_estado= \"Inactivo\" WHERE vta_id="+vta_id+";"; 
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void activarVenta(int vta_id){
        String query = "UPDATE venta SET vta_estado= \"Activo\" WHERE vta_id="+vta_id+";"; 
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion

    }
       
}
