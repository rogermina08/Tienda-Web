/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Kardex
 * @tema:       Acciones de CRUD
 * @descripción:Después de conectarse a la BD en Mysql,
 *              con esta prueba se puede realizar acciones de CRUD
 *              desde Netbeans, para la Gestión de Kardex
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha_rev.: 20-09-2021
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Kardex_crud_admin {
    
    Conexion conexion1 = new Conexion();
        
    
    //Acciones CRUD  (SOLO PARA EL ADMINISTRADOR)
      
    public void insertarKardex(int id_cpr, int id_vta){
        String query ="INSERT INTO kardex (kar_id, id_cpr, id_vta) "+
                    "VALUES (null,\""+id_cpr+"\","
                + " \""+id_vta+"\");";
        conexion1.ejecutarQuery(query);
    }
        
    
    public void leerKardex(){
        String query1 = "SELECT * FROM kardex;";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println("\nkar_id: "+rs1.getString("kar_id") +
                        " kar_fecha: "+ rs1.getString("kar_fecha")+
                        " id_cpr: "+rs1.getString("id_cpr")+ 
                        " id_vta: "+rs1.getString("id_vta")+ 
                        " pro_estado: "+rs1.getString("pro_estado")
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
    
    
    public void actualizarKardex(int kar_id, int id_cpr, int id_vta){
        String query = "UPDATE kardex SET id_cpr="+"\""+id_cpr+"\""+
                ",id_vra="+"\""+id_vta+"\""+
                " WHERE kar_id="+kar_id+";";
        conexion1.ejecutarQuery(query);
    }
    
    
    public void eliminarKardex(int kar_id){
        String query = "UPDATE kardex SET kar_estado= \"Inactivo\" WHERE kar_id="+kar_id+";"; 
        conexion1.ejecutarQuery(query);
    }
    
    
    public void activarKardex(int kar_id){
        String query = "UPDATE kardex SET kar_estado= \"Activo\" WHERE pro_id="+kar_id+";"; 
        conexion1.ejecutarQuery(query);
    }

    
}
