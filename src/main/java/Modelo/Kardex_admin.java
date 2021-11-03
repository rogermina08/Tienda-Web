/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Kardex
 * @tema:       Acciones de CRUD
 * @descripción:Creación de la clase Kardex
 *              con sus respectivos atributos y métodos
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha_rev.: 20-09-2021
 */
package Modelo;

import java.util.Date;

public class Kardex_admin {
    private int kar_id;
    private Date kar_fecha;
    private int id_cpr;
    private int id_vta;
    private String estado;
    
    
    //Constructores

    public Kardex_admin() {
    }

    public Kardex_admin(int kar_id, Date kar_fecha, int id_cpr, int id_vta, String estado) {
        this.kar_id = kar_id;
        this.kar_fecha = kar_fecha;
        this.id_cpr = id_cpr;
        this.id_vta = id_vta;
        this.estado = estado;
    }
    
    
    //Getters

    public int getKar_id() {
        return kar_id;
    }

    public Date getKar_fecha() {
        return kar_fecha;
    }

    public int getId_cpr() {
        return id_cpr;
    }

    public int getId_vta() {
        return id_vta;
    }

    public String getEstado() {
        return estado;
    }
    
    
    //Setters

    public void setKar_id(int kar_id) {
        this.kar_id = kar_id;
    }

    public void setKar_fecha(Date kar_fecha) {
        this.kar_fecha = kar_fecha;
    }

    public void setId_cpr(int id_cpr) {
        this.id_cpr = id_cpr;
    }

    public void setId_vta(int id_vta) {
        this.id_vta = id_vta;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    //ToString

    @Override
    public String toString() {
        return "Kardex{" + "kar_id=" + kar_id + ", kar_fecha=" + kar_fecha + ", id_cpr=" + id_cpr + ", id_vta=" + id_vta + ", estado=" + estado + '}';
    }
}
