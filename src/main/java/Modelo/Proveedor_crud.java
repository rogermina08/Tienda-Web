/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Proveedor
 * @tema:       Acciones de CRUD
 * @descripción:Después de conectarse a la BD en Mysql,
 *              con esta prueba se puede realizar acciones de CRUD
 *              desde Netbeans, para la Gestión de Proveedor
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      13-09-2021
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Proveedor_crud {
        
    Conexion conexion1 = new Conexion();
    
    
    //Acciones CRUD
            
    public void insertarProveedor(
            String prv_nombres_rep_legal,
            String prv_apellidos_rep_legal,
            int prv_identificacion_rep_legal,
            String prv_fecha_nacim_rep_legal,
            String prv_direccion_rep_legal,
            String prv_telefono_fijo_rep_legal,
            String prv_telefono_celular_rep_legal,
            String prv_ciudad_rep_legal,
            String prv_departamento_rep_legal,
            String prv_email_rep_legal,
            String prv_razon_social_empresa,
            int prv_nit_empresa,
            String prv_fecha_aniversario_empresa,
            String prv_direccion_empresa,
            String prv_telefono_fijo_empresa,
            String prv_telefono_celular_empresa,
            String prv_ciudad_empresa,
            String prv_departamento_empresa,
            String prv_email_empresa,
            String prv_web_empresa,
            String prv_facebook_empresa) {
        
        String query ="INSERT INTO proveedor ("
                + "prv_id, "
                + "prv_nombres_rep_legal, "
                + "prv_apellidos_rep_legal, "
                + "prv_identificacion_rep_legal, "
                + "prv_fecha_nacim_rep_legal, "
                + "prv_direccion_rep_legal, "
                + "prv_telefono_fijo_rep_legal, "
                + "prv_telefono_celular_rep_legal, "
                + "prv_ciudad_rep_legal, "
                + "prv_departamento_rep_legal, "
                + "prv_email_rep_legal, "
                + "prv_razon_social_empresa, "
                + "prv_nit_empresa,"
                + "prv_fecha_aniversario_empresa, "
                + "prv_direccion_empresa, "
                + "prv_telefono_fijo_empresa, "
                + "prv_telefono_celular_empresa, "
                + "prv_ciudad_empresa, "
                + "prv_departamento_empresa, "
                + "prv_email_empresa, "
                + "prv_web_empresa, "
                + "prv_facebook_empresa"
                + ")"
                + "VALUES ("
                + "null, "
                + "\""+prv_nombres_rep_legal+"\","
                + "\""+prv_apellidos_rep_legal+"\","
                + "\""+prv_identificacion_rep_legal+"\","
                + "\""+prv_fecha_nacim_rep_legal+"\","
                + "\""+prv_direccion_rep_legal+"\","
                + "\""+prv_telefono_fijo_rep_legal+"\","
                + "\""+prv_telefono_celular_rep_legal+"\","
                + "\""+prv_ciudad_rep_legal+"\","
                + "\""+prv_departamento_rep_legal+"\","
                + "\""+prv_email_rep_legal+"\","
                + "\""+prv_razon_social_empresa+"\","
                + "\""+prv_nit_empresa+"\","
                + "\""+prv_fecha_aniversario_empresa+"\","
                + "\""+prv_direccion_empresa+"\","
                + "\""+prv_telefono_fijo_empresa+"\","
                + "\""+prv_telefono_celular_empresa+"\","
                + "\""+prv_ciudad_empresa+"\","
                + "\""+prv_departamento_empresa+"\","
                + "\""+prv_email_empresa+"\","
                + "\""+prv_web_empresa+"\","
                + "\""+prv_facebook_empresa+"\""
                + ");";
        conexion1.ejecutarQuery(query);
    }
      
    
    public void leerProveedor(){
        String query1 = "SELECT * FROM proveedor;";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println(
                        "prv_id: "+rs1.getInt("prv_id") +
                        " prv_fecha: "+ rs1.getString("prv_fecha")+
                        " prv_nombres_rep_legal: "+rs1.getString("prv_nombres_rep_legal")+
                        " prv_apellidos_rep_legal: "+rs1.getString("prv_apellidos_rep_legal")+
                        " prv_identificacion_rep_legal: "+rs1.getString("prv_identificacion_rep_legal")+
                        " prv_fecha_nacim_rep_legal: "+rs1.getString("prv_fecha_nacim_rep_legal")+
                        " prv_direccion_rep_legal: "+rs1.getString("prv_direccion_rep_legal")+
                        " prv_telefono_fijo_rep_legal: "+rs1.getString("prv_telefono_fijo_rep_legal")+
                        " prv_telefono_celular_rep_legal: "+rs1.getString("prv_telefono_celular_rep_legal")+
                        " prv_ciudad_rep_legal: "+rs1.getString("prv_ciudad_rep_legal")+
                        " prv_departamento_rep_legal: "+rs1.getString("prv_departamento_rep_legal")+
                        " prv_email_rep_legal: "+rs1.getString("prv_email_rep_legal")+
                        " prv_razon_social_empresa: "+rs1.getString("prv_razon_social_empresa")+
                        " prv_nit_empresa: "+rs1.getInt("prv_nit_empresa")+
                        " prv_fecha_aniversario_empresa: "+rs1.getString("prv_fecha_aniversario_empresa")+
                        " prv_direccion_empresa: "+rs1.getString("prv_direccion_empresa")+
                        " prv_telefono_fijo_empresa: "+rs1.getString("prv_telefono_fijo_empresa")+
                        " prv_telefono_celular_empresa: "+rs1.getString("prv_telefono_celular_empresa")+
                        " prv_ciudad_empresa: "+rs1.getString("prv_ciudad_empresa")+
                        " prv_departamento_empresa: "+rs1.getString("prv_departamento_empresa")+
                        " prv_email_empresa: "+rs1.getString("prv_email_empresa")+
                        " prv_web_empresa: "+rs1.getString("prv_web_empresa")+
                        " prv_facebook_empresa: "+rs1.getString("prv_facebook_empresa")+
                        " prv_estado: "+rs1.getString("prv_estado")
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
    
    
    public void actualizarProveedor(
            int prv_id,
            String prv_nombres_rep_legal,
            String prv_apellidos_rep_legal,
            int prv_identificacion_rep_legal,
            String prv_fecha_nacim_rep_legal,
            String prv_direccion_rep_legal,
            String prv_telefono_fijo_rep_legal,
            String prv_telefono_celular_rep_legal,
            String prv_ciudad_rep_legal,
            String prv_departamento_rep_legal,
            String prv_email_rep_legal,
            String prv_razon_social_empresa,
            int prv_nit_empresa,
            String prv_fecha_aniversario_empresa,
            String prv_direccion_empresa,
            String prv_telefono_fijo_empresa,
            String prv_telefono_celular_empresa,
            String prv_ciudad_empresa,
            String prv_departamento_empresa,
            String prv_email_empresa,
            String prv_web_empresa,
            String prv_facebook_empresa
            ){
        String query = "UPDATE proveedor SET "
                + "prv_nombres_rep_legal="+"\""+prv_nombres_rep_legal+"\""
                + ",prv_apellidos_rep_legal="+"\""+prv_apellidos_rep_legal+"\""
                + ",prv_identificacion_rep_legal="+"\""+prv_identificacion_rep_legal+"\""
                + ",prv_fecha_nacim_rep_legal="+"\""+prv_fecha_nacim_rep_legal+"\""
                + ",prv_direccion_rep_legal="+"\""+prv_direccion_rep_legal+"\""
                + ",prv_telefono_fijo_rep_legal="+"\""+prv_telefono_fijo_rep_legal+"\""
                + ",prv_telefono_celular_rep_legal="+"\""+prv_telefono_celular_rep_legal+"\""
                + ",prv_ciudad_rep_legal="+"\""+prv_ciudad_rep_legal+"\""
                + ",prv_departamento_rep_legal="+"\""+prv_departamento_rep_legal+"\""
                + ",prv_email_rep_legal="+"\""+prv_email_rep_legal+"\""
                + ",prv_razon_social_empresa="+"\""+prv_razon_social_empresa+"\""
                + ",prv_nit_empresa="+"\""+prv_nit_empresa+"\""
                + ",prv_fecha_aniversario_empresa="+"\""+prv_fecha_aniversario_empresa+"\""
                + ",prv_direccion_empresa="+"\""+prv_direccion_empresa+"\""
                + ",prv_telefono_fijo_empresa="+"\""+prv_telefono_fijo_empresa+"\""
                + ",prv_telefono_celular_empresa="+"\""+prv_telefono_celular_empresa+"\""
                + ",prv_ciudad_empresa="+"\""+prv_ciudad_empresa+"\""
                + ",prv_departamento_empresa="+"\""+prv_departamento_empresa+"\""
                + ",prv_email_empresa="+"\""+prv_email_empresa+"\""
                + ",prv_web_empresa="+"\""+prv_web_empresa+"\""
                + ",prv_facebook_empresa="+"\""+prv_facebook_empresa+"\""
                + " WHERE prv_id="+prv_id+";";
        conexion1.ejecutarQuery(query);
    }
    
    
    public void eliminarProveedor(int prv_id){
        String query = "UPDATE proveedor SET prv_estado= \"Inactivo\" WHERE prv_id="+prv_id+";"; 
        conexion1.ejecutarQuery(query);
    }
     
    
    public void activarProveedor(int prv_id){
        String query = "UPDATE proveedor SET prv_estado= \"Activo\" WHERE prv_id="+prv_id+";"; 
        conexion1.ejecutarQuery(query);
    }

}
