/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Categoria de Productos
 * @tema:       Interface de consola
 * @descripción:Con esta prueba se puede se puede tener una interfaz
 *              desde la consola de Netbeans, que ofrece un Menú
 *              para la completa Gestión de Categoría de Productos
 *              en una BD de Mysql
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      17-09-2021
 */
package Main;

import Modelo.CategoriaProducto_crud;
import java.util.Scanner;

public class Main_categoriaProducto {
    
    public void Main_categoria(){
        
        Scanner input = new Scanner (System.in);
        CategoriaProducto_crud catprodcrud = new CategoriaProducto_crud();
                
        String repetir = "si";
        
        while(repetir.equals("si")){
            
            System.out.println("\n=======================================================");
            System.out.println("---------- GESTION DE CATEGORIA DE PRODUCTOS ----------");
            System.out.println("=======================================================\n");
            
            System.out.println("1. Lectura de registros");
            System.out.println("2. Creación de nuevo registro");
            System.out.println("3. Actualizar un registro");
            System.out.println("4. Eliminar un registro");
            System.out.println("5. Activar un registro");
            System.out.println("=======================================================\n");

            System.out.println("Ingrese una opcion (1 - 5)");
            int opcion = input.nextInt();

            if(opcion==1){
                //Lectura de registros de la BD
                System.out.println("Categorías de productos existentes en la BD de la Tienda Virtual");
                catprodcrud.leerCategoriaProducto();
            }

            else if(opcion==2){
                //Creación de nuevo registro en la BD
                System.out.println("Ingrese el nombre: ");
                String catpro_nombre = input.next();
                catprodcrud.insertarCategoriaProducto(catpro_nombre);
            }

            else if(opcion==3){
                //Actualizar un registro de la BD
                System.out.println("Ingrese el id de la categoría de producto que desea actualizar: ");
                int catpro_id = input.nextInt();
                System.out.println("Ingrese el nombre: ");
                String catpro_nombre = input.next();
                catprodcrud.actualizarCategoriaProducto(catpro_id, catpro_nombre);
            }

            else if(opcion==4){
                //Eliminar un registro de la BD
                System.out.println("Ingrese el id de la categoría de producto que desea eliminar: ");
                int catpro_id = input.nextInt();
                catprodcrud.eliminarCategoriaProducto(catpro_id);
            }

            else if(opcion==5){
                //Activar un registro en la BD
                System.out.println("Ingrese el id de la categoria de producto que desea activar: ");
                int catpro_id = input.nextInt();
                catprodcrud.activarCategoriaProducto(catpro_id);
            }

            else{
                System.out.println("Opcion invalida!");
            }
            
        System.out.println("Desea realizar otra acción en Gestión de Categoría de Producto? (si/no): ");
        repetir = input.next();
        
        }
    }
}
