/**
 * @proyecto:   Tienda virtual
 * @épica:      NA
 * @tema:       Crear BD
 * @descripción:DAO para la creación de una BD de Mysql desde NetBeans
 *              e implementación de sus respectivas tablas 
 * @author:     Global Project
 * @email:      globalproject.uis@gmailcom
 * @fecha:      17-09-2021
 */
package Modelo;

public class BaseDatos_crear {
    
    Conexion conexion1 = new Conexion();
    
    
    public void crearBD(String bd){
        System.out.println("con de entreada: "+conexion1.con);
        System.out.println("nombre de tienda engressado = "+bd);
        String pass = "";
        ExisteBD existe = new ExisteBD();
        if(existe.dbExists(bd, pass)==true){
            System.out.println("La tienda '"+bd+"' ya existe, intente con otro nombre...\n");
        }else{
            
            System.out.println("Creando base de datos....");
            String query1 = "CREATE DATABASE "+bd+";";
            conexion1.ejecutarQuery(query1);
            
            System.out.println("Creando las tablas de la base de datos...");
            String query2 = "CREATE TABLE " + bd + ".categoria_producto LIKE tiendavirtual_gp.categoria_producto;";
            conexion1.ejecutarQuery(query2);
            String query3 = "CREATE TABLE " + bd + ".producto LIKE tiendavirtual_gp.producto;";
            conexion1.ejecutarQuery(query3);
            String query4 = "CREATE TABLE " + bd + ".proveedor LIKE tiendavirtual_gp.proveedor;";
            conexion1.ejecutarQuery(query4);
            String query5 = "CREATE TABLE " + bd + ".compra LIKE tiendavirtual_gp.compra;";
            conexion1.ejecutarQuery(query5);
            String query6 = "CREATE TABLE " + bd + ".venta LIKE tiendavirtual_gp.venta;";
            conexion1.ejecutarQuery(query6);
            String query7 = "CREATE TABLE " + bd + ".pedido LIKE tiendavirtual_gp.venta;";
            conexion1.ejecutarQuery(query7);
        }
    }
}
