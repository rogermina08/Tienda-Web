/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Producto
 * @tema:       Acciones de CRUD
 * @descripción:Creación de la clase Producto
 *              con sus respectivos atributos y métodos
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha_rev.: 20-09-2021
 */
package Modelo;

import java.util.Date;


public class Producto {
    
    //Atributos
    
    private int pro_id;
    private Date pro_fecha;
    private String pro_nombre;
    private String pro_marca;
    private String pro_unidad;
    private String pro_referencia;
    private double pro_valor_unitario_venta;
    private int id_catpro;
    private String pro_estado;
    
    
    //Constructores
    
    public Producto(){
    }

    public Producto(int pro_id, Date pro_fecha, String pro_nombre, String pro_marca, String pro_unidad, String pro_referencia, double pro_valor_unitario_venta, int id_catpro, String pro_estado) {
        this.pro_id = pro_id;
        this.pro_fecha = pro_fecha;
        this.pro_nombre = pro_nombre;
        this.pro_marca = pro_marca;
        this.pro_unidad = pro_unidad;
        this.pro_referencia = pro_referencia;
        this.pro_valor_unitario_venta = pro_valor_unitario_venta;
        this.id_catpro = id_catpro;
        this.pro_estado = pro_estado;
    }
    
    
    //Getters

    public int getPro_id() {
        return pro_id;
    }

    public Date getPro_fecha() {
        return pro_fecha;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public String getPro_marca() {
        return pro_marca;
    }

    public String getPro_unidad() {
        return pro_unidad;
    }

    public String getPro_referencia() {
        return pro_referencia;
    }

    public double getPro_valor_unitario_venta() {
        return pro_valor_unitario_venta;
    }

    public int getId_catpro() {
        return id_catpro;
    }

    public String getPro_estado() {
        return pro_estado;
    }
    
    
    //Setters

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public void setPro_fecha(Date pro_fecha) {
        this.pro_fecha = pro_fecha;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public void setPro_marca(String pro_marca) {
        this.pro_marca = pro_marca;
    }

    public void setPro_unidad(String pro_unidad) {
        this.pro_unidad = pro_unidad;
    }

    public void setPro_referencia(String pro_referencia) {
        this.pro_referencia = pro_referencia;
    }

    public void setPro_valor_unitario_venta(double pro_valor_unitario_venta) {
        this.pro_valor_unitario_venta = pro_valor_unitario_venta;
    }

    public void setId_catpro(int id_catpro) {
        this.id_catpro = id_catpro;
    }

    public void setPro_estado(String pro_estado) {
        this.pro_estado = pro_estado;
    }
    
    
    //ToString

    @Override
    public String toString() {
        return "Producto{" + "pro_id=" + pro_id + ", pro_fecha=" + pro_fecha + ", pro_nombre=" + pro_nombre + ", pro_marca=" + pro_marca + ", pro_unidad=" + pro_unidad + ", pro_referencia=" + pro_referencia + ", pro_valor_unitario_venta=" + pro_valor_unitario_venta + ", id_catpro=" + id_catpro + ", pro_estado=" + pro_estado + '}';
    }
   
}
