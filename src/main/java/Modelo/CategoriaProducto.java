/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Categoria de Producto
 * @tema:       Acciones de CRUD
 * @descripción:Creación de la clase CategoríaProducto
 *              con sus respectivos atributos y métodos
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha_rev.: 20-09-2021
 */
package Modelo;

import java.util.Date;


public class CategoriaProducto {
    
    //Atributos
    
    private int catpro_id;
    private Date catpro_fecha;
    private String catpro_nombre;
    private String catpro_estado;
    
    
    //Constructores

    public CategoriaProducto() {
    }

    public CategoriaProducto(int catpro_id, Date catpro_fecha, String catpro_nombre, String catpro_estado) {
        this.catpro_id = catpro_id;
        this.catpro_fecha = catpro_fecha;
        this.catpro_nombre = catpro_nombre;
        this.catpro_estado = catpro_estado;
    }

    
    //Getters
    
    public int getCatpro_id() {
        return catpro_id;
    }

    public Date getCatpro_fecha() {
        return catpro_fecha;
    }

    public String getCatpro_nombre() {
        return catpro_nombre;
    }

    public String getCatpro_estado() {
        return catpro_estado;
    }
    
    
    //Setters

    public void setCatpro_id(int catpro_id) {
        this.catpro_id = catpro_id;
    }

    public void setCatpro_fecha(Date catpro_fecha) {
        this.catpro_fecha = catpro_fecha;
    }

    public void setCatpro_nombre(String catpro_nombre) {
        this.catpro_nombre = catpro_nombre;
    }

    public void setCatpro_estado(String catpro_estado) {
        this.catpro_estado = catpro_estado;
    }
    
    
    //ToString

    @Override
    public String toString() {
        return "CategoriaProducto{" + "catpro_id=" + catpro_id + ", catpro_fecha=" + catpro_fecha + ", catpro_nombre=" + catpro_nombre + ", catpro_estado=" + catpro_estado + '}';
    }
    
}
