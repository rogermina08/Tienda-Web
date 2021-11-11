/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Producto
 * @tema:       Acciones de CRUD
 * @descripción:Después de conectarse a la BD en Mysql,
 *              con esta prueba se puede realizar acciones de CRUD
 *              desde Netbeans, para la Gestión de Producto 
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      23-09-2021
 */

package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Margarita
 */
public class CompraVentaCrud {

    private int pro_id;
    private String pro_nombre;
    private String pro_marca;
    //private String pro_unidad;
    private String pro_referencia;
    //private String pro_estado;
    private int id_catpro;
    private int pro_prv_id;
    private int id_prv;
    private int suma_cpr_cantidad;
    private int suma_vta_cantidad;
    private int pro_existencias;
    private String catpro_nombre;
    private Double pro_prv_valor_unitario_compra;
    private Double pro_prv_valor_unitario_venta;

    
    Conexion1 conexion1 = new Conexion1();
        
    //CONSTRUCTORES: 
    public CompraVentaCrud() {
    }
 
    public CompraVentaCrud(String pro_nombre, int suma_cpr_cantidad, int suma_vta_cantidad, int pro_existencias) {
        this.pro_nombre = pro_nombre;
        //this.pro_marca = pro_marca;
        //this.pro_unidad = pro_unidad;
        //this.pro_referencia = pro_referencia;
        //this.pro_estado = pro_estado;
        //this.id_cat = id_cat;
        this.suma_cpr_cantidad = suma_cpr_cantidad;
        this.suma_vta_cantidad = suma_vta_cantidad;
        this.pro_existencias = pro_existencias;

    }
    
    //ENCAPSULAR: 
    public int getpro_id() {
        return pro_id;
    }

    public void setpro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getpro_nombre() {
        return pro_nombre;
    }

    public void setpro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public int getsuma_cpr_cantidad() {
        return suma_cpr_cantidad;
    }

    public void setsuma_cpr_cantidad(int suma_cpr_cantidad) {
        this.suma_cpr_cantidad = suma_cpr_cantidad;
    }

    public int getsuma_vta_cantidad() {
        return suma_vta_cantidad;
    }

    public void setsuma_vta_cantidad(int suma_vta_cantidad) {
        this.suma_vta_cantidad = suma_vta_cantidad;
    }

    public int getpro_existencias() {
        return pro_existencias;
    }

    public void setpro_existencias(int pro_existencias) {
        this.pro_existencias = pro_existencias;
    }

    public int getpro_prv_id() {
        return pro_prv_id;
    }

    public void setpro_prv_id(int pro_prv_id) {
        this.pro_prv_id = pro_prv_id;
    }

    public int getid_prv() {
        return id_prv;
    }

    public void setid_prv(int id_prv) {
        this.id_prv = id_prv;
    }
    
    public String getpro_marca() {
        return pro_marca;
    }

    public void setpro_marca(String pro_marca) {
        this.pro_marca = pro_marca;
    }

    public String getpro_referencia() {
        return pro_referencia;
    }

    public void setpro_referencia(String pro_referencia) {
        this.pro_referencia = pro_referencia;
    }

    public int getid_catpro() {
        return id_catpro;
    }

    public void setid_catpro(int id_catpro) {
        this.id_catpro = id_catpro;
    }

    public String getcatpro_nombre() {
        return catpro_nombre;
    }

    public void setcatpro_nombre(String catpro_nombre) {
        this.catpro_nombre = catpro_nombre;
    }

    public Double getpro_prv_valor_unitario_compra() {
        return pro_prv_valor_unitario_compra;
    }

    public void setpro_prv_valor_unitario_compra(Double pro_prv_valor_unitario_compra) {
        this.pro_prv_valor_unitario_compra = pro_prv_valor_unitario_compra;
    }
    
    public Double getpro_prv_valor_unitario_venta() {
        return pro_prv_valor_unitario_venta;
    }

    public void setpro_prv_valor_unitario_venta(Double pro_prv_valor_unitario_venta) {
        this.pro_prv_valor_unitario_venta = pro_prv_valor_unitario_venta;
    }
    
    @Override
    public String toString() {
        return "CompraVenta{ "  +  "pro_id" + pro_id +  "pro_nombre" + pro_nombre +  "suma_cpr_cantidad" + suma_cpr_cantidad +  "suma_vta_cantidad" + suma_vta_cantidad +  "pro_existencias" + pro_existencias+ '}';
    }
    
    //METODOS: 
    public ArrayList<CompraVentaCrud> listarCompraVentaN(){
        //Conexion objConector = new Conexion();
        //objConector.conectar();
        ResultSet consulta = null;
        ResultSet consulta1 = null;
        ResultSet consulta2 = null;
        ResultSet consulta3 = null;

        String lugar="0";
        
        //List<CompraVentaCrud> consultaResult = new ArrayList<>();
        ArrayList<CompraVentaCrud> consultaResult = new ArrayList<CompraVentaCrud>();

        try{
            String sql = "SELECT producto.pro_id, producto.pro_nombre, producto.pro_marca, producto.pro_referencia, producto.id_catpro, categoria_producto.catpro_nombre FROM producto LEFT JOIN categoria_producto ON producto.id_catpro = categoria_producto.catpro_id GROUP BY producto.pro_id;";
            //String sql1 = "SELECT SUM(cpr_cantidad) FROM compra WHERE id_pro = ? GROUP BY id_pro;";
            //String sql2 = "SELECT SUM(vta_cantidad) FROM venta WHERE id_pro = ? GROUP BY id_pro;";
            
            //SELECT producto.pro_id, producto.pro_nombre,  producto.pro_marca,  producto.pro_referencia, producto.id_catpro, producto_proveedor.id_prv, producto_proveedor.pro_prv_id,  producto_proveedor.pro_prv_valor_unitario_compra, producto_proveedor.pro_prv_valor_unitario_venta FROM producto LEFT JOIN producto_proveedor ON producto.pro_id = producto_proveedor.id_pro  GROUP BY producto.pro_id, producto_proveedor.id_prv;
            //select producto.pro_id, producto.pro_nombre, producto_proveedor.id_prv, producto_proveedor.pro_prv_id,  producto_proveedor.pro_prv_valor_unitario_compra, producto_proveedor.pro_prv_valor_unitario_venta from producto LEFT JOIN producto_proveedor ON producto.pro_id = producto_proveedor.id_pro  GROUP BY producto.pro_id, producto_proveedor.id_prv;
            
            consulta = conexion1.ejecutarQueryLectura(sql);

            lugar = "1";

            while(consulta.next()==true){
                CompraVentaCrud compraventa = new CompraVentaCrud();
                compraventa.setpro_id(consulta.getInt("pro_id"));
                compraventa.setpro_nombre(consulta.getString("pro_nombre"));
                compraventa.setpro_marca(consulta.getString("pro_marca"));
                compraventa.setpro_referencia(consulta.getString("pro_referencia"));
                compraventa.setid_catpro(consulta.getInt("id_catpro"));
                compraventa.setcatpro_nombre(consulta.getString("catpro_nombre"));
                                
                //compraventa.setpro_prv_id(consulta.getInt("pro_prv_id"));
                //pro_prv_valor_unitario_compra
                
                String sql1 = "SELECT COUNT(ped_cantidad), SUM(ped_cantidad) AS suma_cpr_cantidad, (sum(`ped_cantidad`*`ped_valor_unitario_compra`)/SUM(ped_cantidad)) AS pro_prv_valor_unitario_compra, id_prv FROM pedido WHERE id_pro = " 
                        + compraventa.getpro_id() + " GROUP BY id_prv;";
                // stmt1.setInt(1, compraventa.getpro_id());
                lugar = "2.0";
                consulta1 = conexion1.ejecutarQueryLectura(sql1); 
                lugar = "2.1";
                if(consulta1.next()==true){
                    //CompraVenta compraventa1 = new CompraVenta();
                    compraventa.setsuma_cpr_cantidad(consulta1.getInt("suma_cpr_cantidad"));
                    compraventa.setid_prv(consulta1.getInt("id_prv"));
                    compraventa.setpro_prv_valor_unitario_compra(consulta1.getDouble("pro_prv_valor_unitario_compra"));
                 }
                else compraventa.setsuma_cpr_cantidad(0);

                String sql2= "SELECT producto.pro_id, count(venta.id_pro), sum(venta.vta_cantidad) AS suma_vta_cantidad, producto.pro_valor_unitario_venta AS pro_prv_valor_unitario_venta FROM producto, venta WHERE producto.pro_id = venta.id_pro AND id_pro = " 
                        + compraventa.getpro_id() + " ;";

                //stmt2.setInt(1, compraventa.getpro_id());
                consulta2 = conexion1.ejecutarQueryLectura(sql2); 
                if(consulta2.next()==true){
                    //CompraVenta compraventa = new CompraVenta();
                    compraventa.setsuma_vta_cantidad(consulta2.getInt("suma_vta_cantidad"));
                    compraventa.setpro_prv_valor_unitario_venta(consulta2.getDouble("pro_prv_valor_unitario_venta"));
                }
                else compraventa.setsuma_vta_cantidad(0);

                compraventa.setpro_existencias(compraventa.getsuma_cpr_cantidad() - compraventa.getsuma_vta_cantidad());
                
                /*String sql3 = "SELECT catpro_nombre FROM categoria_producto WHERE catpro_id = "
                        + compraventa.getid_catpro() +" ;";
                lugar = "4";
                consulta3 = conexion1.ejecutarQueryLectura(sql3); 
                if(consulta3.next()==true){
                    //CompraVenta compraventa1 = new CompraVenta();
                    compraventa.setcatpro_nombre(consulta3.getString("catpro_nombre"));
                }
                else compraventa.setcatpro_nombre("Sin nombre en categoría");*/
                
                consultaResult.add(compraventa);
                
                System.out.println("objeto local compraventa: pro_id: " + compraventa.getpro_id() +" pro_prv_id: " + compraventa.getpro_prv_id()  +" pro_nombre: " + compraventa.getpro_nombre() +" suma_cpr_cantidad: " + compraventa.getsuma_cpr_cantidad() +" suma_vta_cantidad: " + compraventa.getsuma_vta_cantidad() +" categoría: " + compraventa.getcatpro_nombre());
            }
            
            //return consulta; 
            conexion1.desconectar();
            return consultaResult; 
        }
        catch (Exception error){
            //JOptionPane.showMessageDialog(null, "Error ModProd: "+error);
            System.out.println("Error: "+error + " lugar:" +lugar);
            error.printStackTrace();
        }
        
        conexion1.desconectar();
        return null; 

    }


   
    //Acciones CRUD 
    /**--- no es una tabla por lo cual no aplican estos métodos de CRUD **---  
    public void insertarCompraVenta(int id_pro_prv, int vta_cantidad, String vta_estado){
        String query ="INSERT INTO venta (vta_id, id_pro_prv, vta_cantidad, vta_estado) "+
                    "VALUES (null,\""+id_pro_prv+"\",\""+vta_cantidad+"\",\""+vta_estado+"\");";
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
    }
        
    public void leercompraVenta(){
        String query1 = "SELECT * FROM venta;";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);  //Directamente el metodo porque esta clase tiene extendes Conexion
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println("vta_id: "+rs1.getInt("vta_id") +" vta_fecha: "+ rs1.getString("vta_fecha")+
                        " id_pro_prv: "+rs1.getInt("id_pro_prv")+ " vta_cantidad: "+rs1.getInt("vta_cantidad")+
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
    
    public void actualizarCompraVenta(int vta_id, int id_pro_prv, int vta_cantidad, String vta_estado){
        String query = "UPDATE venta SET id_pro_prv="+"\""+id_pro_prv+"\""+
                ",vta_cantidad="+"\""+vta_cantidad+"\""+
                ",vta_estado="+"\""+vta_estado+"\""+
                " WHERE vta_id="+vta_id+";";
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void eliminarCompraVenta(int vta_id){
        String query = "UPDATE venta SET vta_estado= \"Inactivo\" WHERE vta_id="+vta_id+";"; 
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void activarCompraVenta(int vta_id){
        String query = "UPDATE venta SET vta_estado= \"Activo\" WHERE vta_id="+vta_id+";"; 
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    * ---------- */

}
