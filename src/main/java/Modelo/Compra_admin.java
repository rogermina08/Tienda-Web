/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Compra
 * @tema:       Acciones de CRUD
 * @descripción:Creación de la clase Compra
 *              con sus respectivos atributos y métodos
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha_rev.: 20-09-2021
 */
package Modelo;

import java.util.Date;


    public class Compra_admin {
       
    //Atributos
        
    private int cpr_id;
    private Date cpr_fecha;
    private int id_ped;
    private String cpr_estado;
    
    
    //Constructores
    
    public Compra_admin(){
    }
    
    public Compra_admin(int cpr_id, Date cpr_fecha, int id_ped, String cpr_estado) {
        this.cpr_id = cpr_id;
        this.cpr_fecha = cpr_fecha;
        this.id_ped = id_ped;
        this.cpr_estado = cpr_estado;
    }
    
        
    //Getters

    public int getCpr_id() {
        return cpr_id;
    }

    public Date getCpr_fecha() {
        return cpr_fecha;
    }

    public int getId_ped() {
        return id_ped;
    }

    public String getCpr_estado() {
        return cpr_estado;
    }

    
     //Setters

    public void setCpr_id(int cpr_id) {
        this.cpr_id = cpr_id;
    }

    public void setCpr_fecha(Date cpr_fecha) {
        this.cpr_fecha = cpr_fecha;
    }

    public void setId_ped(int id_ped) {
        this.id_ped = id_ped;
    }

    public void setCpr_estado(String cpr_estado) {
        this.cpr_estado = cpr_estado;
    }

        
    //ToString

    @Override
    public String toString() {
        return "Compra_admin{" + "cpr_id=" + cpr_id + ", cpr_fecha=" + cpr_fecha + ", id_ped=" + id_ped + ", cpr_estado=" + cpr_estado + '}';
    }
    
}
