/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Venta
 * @tema:       Acciones de CRUD
 * @descripción:Creación de la clase Venta
 *              con sus respectivos atributos y métodos
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha_rev.: 26-09-2021
 */
package Modelo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Venta {
    
    //Atributos
    
    private int vta_id;
    private Date vta_fecha;
    private int id_pro;
    private int vta_cantidad;
    private String vta_confirma_devolucion;
    private int vta_cantidad_devolucion;
    private String vta_estado;
    
    
    //Constructor

    public Venta() {
    }
    
    public Venta(int vta_id, Date vta_fecha, int id_pro, int vta_cantidad, String vta_confirma_devolucion, int vta_cantidad_devolucion, String vta_estado) {
        this.vta_id = vta_id;
        this.vta_fecha = vta_fecha;
        this.id_pro = id_pro;
        this.vta_cantidad = vta_cantidad;
        this.vta_confirma_devolucion = vta_confirma_devolucion;
        this.vta_cantidad_devolucion = vta_cantidad_devolucion;
        this.vta_estado = vta_estado;
    }    
    
    
    //Getters

    public int getVta_id() {
        return vta_id;
    }

    public Date getVta_fecha() {
        return vta_fecha;
    }

    public int getId_pro() {
        return id_pro;
    }

    public int getVta_cantidad() {
        return vta_cantidad;
    }

    public String getVta_confirma_devolucion() {
        return vta_confirma_devolucion;
    }

    public int getVta_cantidad_devolucion() {
        return vta_cantidad_devolucion;
    }

    public String getVta_estado() {
        return vta_estado;
    }
    
    
    //Setters

    public void setVta_id(int vta_id) {
        this.vta_id = vta_id;
    }

    public void setVta_fecha(Date vta_fecha) {
        this.vta_fecha = vta_fecha;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public void setVta_cantidad(int vta_cantidad) {
        this.vta_cantidad = vta_cantidad;
    }

    public void setVta_confirma_devolucion(String vta_confirma_devolucion) {
        this.vta_confirma_devolucion = vta_confirma_devolucion;
    }

    public void setVta_cantidad_devolucion(int vta_cantidad_devolucion) {
        this.vta_cantidad_devolucion = vta_cantidad_devolucion;
    }

    public void setVta_estado(String vta_estado) {
        this.vta_estado = vta_estado;
    }

    
    //ToString

    @Override
    public String toString() {
        return "Venta{" + "vta_id=" + vta_id + ", vta_fecha=" + vta_fecha + ", id_pro=" + id_pro + ", vta_cantidad=" + vta_cantidad + ", vta_confirma_devolucion=" + vta_confirma_devolucion + ", vta_cantidad_devolucion=" + vta_cantidad_devolucion + ", vta_estado=" + vta_estado + '}';
    }

}
