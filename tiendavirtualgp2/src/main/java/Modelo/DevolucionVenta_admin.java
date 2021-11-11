/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Devolución de Compra
 * @tema:       Acciones de CRUD
 * @descripción:Creación de la clase DevolucionCompra
 *              con sus respectivos atributos y métodos
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha_rev.: 20-09-2021
 */
package Modelo;

import java.util.Date;

public class DevolucionVenta_admin {
    
    //Atributos
    
    private int devvta_id;
    private Date devvta_fecha;
    private int id_vta;
    private String devvta_estado;
    
    
    //Constructores
    
    public DevolucionVenta_admin() {
    }

    public DevolucionVenta_admin(int devvta_id, Date devvta_fecha, int id_vta, String devvta_estado) {
        this.devvta_id = devvta_id;
        this.devvta_fecha = devvta_fecha;
        this.id_vta = id_vta;
        this.devvta_estado = devvta_estado;
    }
       
    
    //Getters

    public int getDevvta_id() {
        return devvta_id;
    }

    public Date getDevvta_fecha() {
        return devvta_fecha;
    }

    public int getId_vta() {
        return id_vta;
    }

    public String getDevvta_estado() {
        return devvta_estado;
    }
    
    
    //Setters

    public void setDevvta_id(int devvta_id) {
        this.devvta_id = devvta_id;
    }

    public void setDevvta_fecha(Date devvta_fecha) {
        this.devvta_fecha = devvta_fecha;
    }

    public void setId_vta(int id_vta) {
        this.id_vta = id_vta;
    }

    public void setDevvta_estado(String devvta_estado) {
        this.devvta_estado = devvta_estado;
    }
    
    
    //ToString

    @Override
    public String toString() {
        return "DevolucionVenta_admin{" + "devvta_id=" + devvta_id + ", devvta_fecha=" + devvta_fecha + ", id_vta=" + id_vta + ", devvta_estado=" + devvta_estado + '}';
    }

}
