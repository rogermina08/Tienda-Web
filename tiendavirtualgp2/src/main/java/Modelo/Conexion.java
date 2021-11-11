/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Producto
 * @tema:       Conexion a BD
 * @descripción:Con esta clase se puede se puede conectar desde Netbeans
 *              a una BD existente Mysql.
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      13-09-2021
 */

package Modelo;

import Main.Main_crearBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    
    Connection con;
    
    String nombre_tienda = Main_crearBD.nombre_tienda;   //Variable nombre_tienda,  declarada y traída como global desde Main_crearBD
    
    public Conexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/"+nombre_tienda,"root","");
            if(con!=null){
                System.out.println("Conectado1....");
            }
        }catch(Exception e){
            System.out.println("Error al conectar: " + e);
        }
    }
    
    
    public Conexion(String bd, String pass){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/"+bd,"root",pass);
            if(con!=null){
                System.out.println("Conectado2....");
            }
        }catch(Exception e){
            System.out.println("Error al conectar: " + e);
        }
    }
    
    
    public boolean ejecutarQuery(String query){
        Boolean result = true;
        try{
            Statement stmt = con.createStatement();
            stmt.execute(query);
            System.out.println("la acción solicitada se ejecutó exitósamente!");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("la acción solicitada no se ejecutó!");
            result = false;
        }
        
        return result;
    }
    
    
    public ResultSet ejecutarQueryLectura(String query){
        ResultSet rs = null;
        try{
           java.sql.Statement stmt = con.createStatement();
           rs = stmt.executeQuery(query);
           System.out.println("la acción solicitada se ejecutó exitósamente!");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("la acción solicitada no se ejecutó!");
            
        }
        return rs;
    }
    
    
//    //Cerrar la conexión
//    public void closeConnection(Connection con) {
//        if (con != null) {
//            try {
//                con.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }



}
