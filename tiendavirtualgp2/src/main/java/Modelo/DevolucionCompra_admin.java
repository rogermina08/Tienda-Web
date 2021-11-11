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

public class DevolucionCompra_admin {
    
    //Atributos
    
    private int devcpr_id;
    private Date devcpr_fecha;
    private int id_ped;
    private String devcpr_estado;
    
    
    //Constructores

    public DevolucionCompra_admin() {
    }

    public DevolucionCompra_admin(int devcpr_id, Date devcpr_fecha, int id_ped, String devcpr_estado) {
        this.devcpr_id = devcpr_id;
        this.devcpr_fecha = devcpr_fecha;
        this.id_ped = id_ped;
        this.devcpr_estado = devcpr_estado;
    }
    
    
    //Getters

    public int getDevcpr_id() {
        return devcpr_id;
    }

    public Date getDevcpr_fecha() {
        return devcpr_fecha;
    }

    public int getId_ped() {
        return id_ped;
    }

    public String getDevcpr_estado() {
        return devcpr_estado;
    }
    
    
    //Setters

    public void setDevcpr_id(int devcpr_id) {
        this.devcpr_id = devcpr_id;
    }

    public void setDevcpr_fecha(Date devcpr_fecha) {
        this.devcpr_fecha = devcpr_fecha;
    }

    public void setId_ped(int id_ped) {
        this.id_ped = id_ped;
    }

    public void setDevcpr_estado(String devcpr_estado) {
        this.devcpr_estado = devcpr_estado;
    }
    
    
    //ToString

    @Override
    public String toString() {
        return "DevolucionCompra_admin{" + "devcpr_id=" + devcpr_id + ", devcpr_fecha=" + devcpr_fecha + ", id_ped=" + id_ped + ", devcpr_estado=" + devcpr_estado + '}';
    }
  
}
