/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Pedido
 * @tema:       Acciones de CRUD
 * @descripción:Creación de la clase Pedido
 *              con sus respectivos atributos y métodos
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha_rev.: 20-09-2021
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Pedido {
    
    //Atributos
    
    private int ped_id;
    private int ped_numero_pedido;
    private Date ped_fecha;
    private int id_pro;
    private int id_prv;
    private float ped_cantidad;
    private String ped_confirma;
    private String ped_estado;
    private Double ped_valor_unitario_compra;
    
    Conexion conexion1 = new Conexion();
    
    //Constructores

    public Pedido() {
    }

    public Pedido(int ped_id, int ped_numero_pedido, Date ped_fecha, int id_pro, int id_prv, float ped_cantidad, String ped_confirma, String ped_estado) {
        this.ped_id = ped_id;
        this.ped_numero_pedido = ped_numero_pedido;
        this.ped_fecha = ped_fecha;
        this.id_pro = id_pro;
        this.id_prv = id_prv;
        this.ped_cantidad = ped_cantidad;
        this.ped_confirma = ped_confirma;
        this.ped_estado = ped_estado;
    }

    
    //Getters

    public int getPed_id() {
        return ped_id;
    }

    public int getPed_numero_pedido() {
        return ped_numero_pedido;
    }

    public Date getPed_fecha() {
        return ped_fecha;
    }

    public int getId_pro() {
        return id_pro;
    }

    public int getId_prv() {
        return id_prv;
    }

    public float getPed_cantidad() {
        return ped_cantidad;
    }

    public double getPed_valor_unitario_compra() {
        return ped_valor_unitario_compra;
    }
    
    public String getPed_confirma() {
        return ped_confirma;
    }

    public String getPed_estado() {
        return ped_estado;
    }
    
    
    //Setters

    public void setPed_id(int ped_id) {
        this.ped_id = ped_id;
    }

    public void setPed_numero_pedido(int ped_numero_pedido) {
        this.ped_numero_pedido = ped_numero_pedido;
    }

    public void setPed_fecha(Date ped_fecha) {
        this.ped_fecha = ped_fecha;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public void setId_prv(int id_prv) {
        this.id_prv = id_prv;
    }

    public void setPed_cantidad(float ped_cantidad) {
        this.ped_cantidad = ped_cantidad;
    }
    
    public void setPed_valor_unitario_compra(double ped_valor_unitario_compra) {
        this.ped_valor_unitario_compra = ped_valor_unitario_compra;
    }

    public void setPed_confirma(String ped_confirma) {
        this.ped_confirma = ped_confirma;
    }

    public void setPed_estado(String ped_estado) {
        this.ped_estado = ped_estado;
    }
    
    
    //ToString

    @Override
    public String toString() {
        return "Pedido{" + "ped_id=" + ped_id + ", ped_numero_pedido=" + ped_numero_pedido + ", ped_fecha=" + ped_fecha + ", id_pro=" + id_pro + ", id_prv=" + id_prv + ", ped_cantidad=" + ped_cantidad + ", ped_confirma=" + ped_confirma + ", ped_estado=" + ped_estado + '}';
    }

    public ArrayList<Pedido> leerPedidoN(){
        String query1 = "SELECT * FROM pedido;";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);  //Directamente el metodo porque esta clase tiene extendes Conexion
        
        ArrayList<Pedido> consultaResult = new ArrayList<Pedido>();
        
        try{
            int bandera=0;
            while(rs1.next()==true){
                Pedido pedidorep = new Pedido();
                pedidorep.setPed_id(rs1.getInt("ped_id"));
                pedidorep.setPed_fecha(rs1.getDate("ped_fecha"));
                pedidorep.setPed_numero_pedido(rs1.getInt("ped_numero_pedido"));
                pedidorep.setId_pro(rs1.getInt("id_pro"));
                pedidorep.setId_prv(rs1.getInt("id_prv"));
                pedidorep.setPed_cantidad(rs1.getFloat("ped_cantidad"));
                pedidorep.setPed_valor_unitario_compra(rs1.getDouble("ped_valor_unitario_compra"));
                pedidorep.setPed_confirma(rs1.getString("ped_confirma_recibo"));
                pedidorep.setPed_estado(rs1.getString("ped_estado"));
                consultaResult.add(pedidorep);
                
                System.out.println("ped_id: "+rs1.getString("ped_id") +" ped_fecha: "+ rs1.getString("ped_fecha")+
                        " ped_numero_pedido: "+rs1.getString("ped_numero_pedido")+
                        " id_pro: "+rs1.getString("id_pro")+ 
                        " id_prv: "+rs1.getString("id_prv")+
                        " ped_cantidad: "+rs1.getString("ped_cantidad")+
                        " ped_valor_unitario_compra: "+rs1.getString("ped_valor_unitario_compra")+
                        " ped_confirma_recibo: "+rs1.getString("ped_confirma_recibo")+ " ped_estado: "+rs1.getString("ped_estado")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
            return consultaResult;
            
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
            return consultaResult;
        }
    }

    
}
