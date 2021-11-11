/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Proveedor
 * @tema:       Acciones de CRUD
 * @descripción:Creación de la clase Proveedor
 *              con sus respectivos atributos y métodos
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha_rev.: 20-09-2021
 */
package Modelo;

import java.util.Date;


class Proveedor {
    
    //Atributos
    
    private int prv_id;
    private Date prv_fecha;
    private String nombres_rep_legal;
    private String apellidos_rep_legal;
    private String identificacion_rep_legal;
    private Date fecha_nacim_rep_legal;
    private String direccion_rep_legal;
    private String telefono_fijo_rep_legal;
    private String telefono_celular_rep_legal;
    private String ciudad_rep_legal;
    private String departamento_rep_legal;
    private String email_rep_legal;
    private String razon_social_empresa;
    private String nit_empresa;
    private Date fecha_aniversario_empresa;
    private String direccion_empresa;
    private String telefono_fijo_empresa;
    private String telefono_celular_empresa;
    private String ciudad_empresa;
    private String departamento_empresa;
    private String email_empresa;
    private String web_empresa;
    private String facebook_empresa;
    private String estado_empresa;
    
    
    //Constructores
    
    public Proveedor(){
    }
    
    public Proveedor(int prv_id, Date prv_fecha, String nombres_rep_legal, String apellidos_rep_legal, String identificacion_rep_legal, Date fecha_nacim_rep_legal, String direccion_rep_legal, String telefono_fijo_rep_legal, String telefono_celular_rep_legal, String ciudad_rep_legal, String departamento_rep_legal, String email_rep_legal, String razon_social_empresa, String nit_empresa, Date fecha_aniversario_empresa, String direccion_empresa, String telefono_fijo_empresa, String telefono_celular_empresa, String ciudad_empresa, String departamento_empresa, String email_empresa, String web_empresa, String facebook_empresa, String estado_empresa) {
        this.prv_id = prv_id;
        this.prv_fecha = prv_fecha;
        this.nombres_rep_legal = nombres_rep_legal;
        this.apellidos_rep_legal = apellidos_rep_legal;
        this.identificacion_rep_legal = identificacion_rep_legal;
        this.fecha_nacim_rep_legal = fecha_nacim_rep_legal;
        this.direccion_rep_legal = direccion_rep_legal;
        this.telefono_fijo_rep_legal = telefono_fijo_rep_legal;
        this.telefono_celular_rep_legal = telefono_celular_rep_legal;
        this.ciudad_rep_legal = ciudad_rep_legal;
        this.departamento_rep_legal = departamento_rep_legal;
        this.email_rep_legal = email_rep_legal;
        this.razon_social_empresa = razon_social_empresa;
        this.nit_empresa = nit_empresa;
        this.fecha_aniversario_empresa = fecha_aniversario_empresa;
        this.direccion_empresa = direccion_empresa;
        this.telefono_fijo_empresa = telefono_fijo_empresa;
        this.telefono_celular_empresa = telefono_celular_empresa;
        this.ciudad_empresa = ciudad_empresa;
        this.departamento_empresa = departamento_empresa;
        this.email_empresa = email_empresa;
        this.web_empresa = web_empresa;
        this.facebook_empresa = facebook_empresa;
        this.estado_empresa = estado_empresa;
    }
    
    
    //Getters

    public int getPrv_id() {
        return prv_id;
    }

    public Date getPrv_fecha() {
        return prv_fecha;
    }

    public String getNombres_rep_legal() {
        return nombres_rep_legal;
    }

    public String getApellidos_rep_legal() {
        return apellidos_rep_legal;
    }

    public String getIdentificacion_rep_legal() {
        return identificacion_rep_legal;
    }

    public Date getFecha_nacim_rep_legal() {
        return fecha_nacim_rep_legal;
    }

    public String getDireccion_rep_legal() {
        return direccion_rep_legal;
    }

    public String getTelefono_fijo_rep_legal() {
        return telefono_fijo_rep_legal;
    }

    public String getTelefono_celular_rep_legal() {
        return telefono_celular_rep_legal;
    }

    public String getCiudad_rep_legal() {
        return ciudad_rep_legal;
    }

    public String getDepartamento_rep_legal() {
        return departamento_rep_legal;
    }

    public String getEmail_rep_legal() {
        return email_rep_legal;
    }

    public String getRazon_social_empresa() {
        return razon_social_empresa;
    }

    public String getNit_empresa() {
        return nit_empresa;
    }

    public Date getFecha_aniversario_empresa() {
        return fecha_aniversario_empresa;
    }

    public String getDireccion_empresa() {
        return direccion_empresa;
    }

    public String getTelefono_fijo_empresa() {
        return telefono_fijo_empresa;
    }

    public String getTelefono_celular_empresa() {
        return telefono_celular_empresa;
    }

    public String getCiudad_empresa() {
        return ciudad_empresa;
    }

    public String getDepartamento_empresa() {
        return departamento_empresa;
    }

    public String getEmail_empresa() {
        return email_empresa;
    }

    public String getWeb_empresa() {
        return web_empresa;
    }

    public String getFacebook_empresa() {
        return facebook_empresa;
    }

    public String getEstado_empresa() {
        return estado_empresa;
    }

    
    //Setters
    
    public void setPrv_id(int prv_id) {
        this.prv_id = prv_id;
    }

    public void setPrv_fecha(Date prv_fecha) {
        this.prv_fecha = prv_fecha;
    }

    public void setNombres_rep_legal(String nombres_rep_legal) {
        this.nombres_rep_legal = nombres_rep_legal;
    }

    public void setApellidos_rep_legal(String apellidos_rep_legal) {
        this.apellidos_rep_legal = apellidos_rep_legal;
    }

    public void setIdentificacion_rep_legal(String identificacion_rep_legal) {
        this.identificacion_rep_legal = identificacion_rep_legal;
    }

    public void setFecha_nacim_rep_legal(Date fecha_nacim_rep_legal) {
        this.fecha_nacim_rep_legal = fecha_nacim_rep_legal;
    }

    public void setDireccion_rep_legal(String direccion_rep_legal) {
        this.direccion_rep_legal = direccion_rep_legal;
    }

    public void setTelefono_fijo_rep_legal(String telefono_fijo_rep_legal) {
        this.telefono_fijo_rep_legal = telefono_fijo_rep_legal;
    }

    public void setTelefono_celular_rep_legal(String telefono_celular_rep_legal) {
        this.telefono_celular_rep_legal = telefono_celular_rep_legal;
    }

    public void setCiudad_rep_legal(String ciudad_rep_legal) {
        this.ciudad_rep_legal = ciudad_rep_legal;
    }

    public void setDepartamento_rep_legal(String departamento_rep_legal) {
        this.departamento_rep_legal = departamento_rep_legal;
    }

    public void setEmail_rep_legal(String email_rep_legal) {
        this.email_rep_legal = email_rep_legal;
    }

    public void setRazon_social_empresa(String razon_social_empresa) {
        this.razon_social_empresa = razon_social_empresa;
    }

    public void setNit_empresa(String nit_empresa) {
        this.nit_empresa = nit_empresa;
    }

    public void setFecha_aniversario_empresa(Date fecha_aniversario_empresa) {
        this.fecha_aniversario_empresa = fecha_aniversario_empresa;
    }

    public void setDireccion_empresa(String direccion_empresa) {
        this.direccion_empresa = direccion_empresa;
    }

    public void setTelefono_fijo_empresa(String telefono_fijo_empresa) {
        this.telefono_fijo_empresa = telefono_fijo_empresa;
    }

    public void setTelefono_celular_empresa(String telefono_celular_empresa) {
        this.telefono_celular_empresa = telefono_celular_empresa;
    }

    public void setCiudad_empresa(String ciudad_empresa) {
        this.ciudad_empresa = ciudad_empresa;
    }

    public void setDepartamento_empresa(String departamento_empresa) {
        this.departamento_empresa = departamento_empresa;
    }

    public void setEmail_empresa(String email_empresa) {
        this.email_empresa = email_empresa;
    }

    public void setWeb_empresa(String web_empresa) {
        this.web_empresa = web_empresa;
    }

    public void setFacebook_empresa(String facebook_empresa) {
        this.facebook_empresa = facebook_empresa;
    }

    public void setEstado_empresa(String estado_empresa) {
        this.estado_empresa = estado_empresa;
    }
    
    
    //ToString

    @Override
    public String toString() {
        return "Proveedor{" + "prv_id=" + prv_id + ", prv_fecha=" + prv_fecha +
                ", nombres_rep_legal=" + nombres_rep_legal + 
                ", apellidos_rep_legal=" + apellidos_rep_legal + 
                ", identificacion_rep_legal=" + identificacion_rep_legal + 
                ", fecha_nacim_rep_legal=" + fecha_nacim_rep_legal + 
                ", direccion_rep_legal=" + direccion_rep_legal + 
                ", telefono_fijo_rep_legal=" + telefono_fijo_rep_legal + 
                ", telefono_celular_rep_legal=" + telefono_celular_rep_legal + 
                ", ciudad_rep_legal=" + ciudad_rep_legal + 
                ", departamento_rep_legal=" + departamento_rep_legal + 
                ", email_rep_legal=" + email_rep_legal + 
                ", razon_social_empresa=" + razon_social_empresa + 
                ", nit_empresa=" + nit_empresa + 
                ", fecha_aniversario_empresa=" + fecha_aniversario_empresa + 
                ", direccion_empresa=" + direccion_empresa + 
                ", telefono_fijo_empresa=" + telefono_fijo_empresa + 
                ", telefono_celular_empresa=" + telefono_celular_empresa + 
                ", ciudad_empresa=" + ciudad_empresa + 
                ", departamento_empresa=" + departamento_empresa + 
                ", email_empresa=" + email_empresa + 
                ", web_empresa=" + web_empresa + 
                ", facebook_empresa=" + facebook_empresa + 
                ", estado_empresa=" + estado_empresa + '}';
    }
    
    
    
    

    
    
    
    
    
    
    
    
}
