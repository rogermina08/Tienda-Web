/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Producto
 * @tema:       Interface de consola
 * @descripción:Con esta prueba se puede se puede tener una interfaz
 *              desde la consola de Netbeans, que ofrece un Menú
 *              para la completa Gestión de Producto en una BD de Mysql
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      13-09-2021
 */
package Main;

import Modelo.CategoriaProducto_crud;
import Modelo.Producto_crud;
import java.util.Scanner;

public class Main_producto {
    
    public void Main_producto(){
        
        Producto_crud prodcrud = new Producto_crud();
        CategoriaProducto_crud catprocrud = new CategoriaProducto_crud();
        Scanner input = new Scanner (System.in);        
        
        String repetir = "si";

        while(repetir.equals("si")){
            System.out.println("\n=========================================");
            System.out.println("---------- GESTION DE PRODUCTO ----------");
            System.out.println("=========================================\n");
            System.out.println("1. Lectura de registros");
            System.out.println("2. Creación de nuevo registro");
            System.out.println("3. Actualizar un registro");
            System.out.println("4. Eliminar un registro");
            System.out.println("5. Activar un registro");
            System.out.println("=========================================\n");

            System.out.println("Ingrese una opcion (1 - 5)");
            int opcion = input.nextInt();

            if(opcion==1){
                //Lectura de registros de la BD
                System.out.println("Productos existentes en la BD de la Tienda Virtual");
                prodcrud.leerProducto();
            }

            else if(opcion==2){
                //Creación de nuevo registro en la BD
                System.out.println("Ingrese el nombre: ");
                String pro_nombre = input.next();
                System.out.println("Ingrese la marca: ");
                String pro_marca = input.next();
                System.out.println("Ingrese la unidad: ");
                String pro_unidad = input.next();
                System.out.println("Ingrese la referencia: ");
                String pro_referencia = input.next();
                System.out.println("Ingrese el valor unitario de venta: ");
                double pro_valor_unitario_venta = input.nextDouble();
                catprocrud.leerCategoriaProducto();
                System.out.println("Ingrese el id de la categoria: ");
                int id_catpro = input.nextInt();
                prodcrud.insertarProducto(pro_nombre, pro_marca, pro_unidad, pro_referencia, pro_valor_unitario_venta, id_catpro);
            }

            else if(opcion==3){
                //Actualizar un registro de la BD
                System.out.println("Ingrese el id del producto que desea actualizar: ");
                int pro_id = input.nextInt();
                System.out.println("Ingrese el nombre: ");
                String pro_nombre = input.next();
                System.out.println("Ingrese la marca: ");
                String pro_marca = input.next();
                System.out.println("Ingrese la unidad: ");
                String pro_unidad = input.next();
                System.out.println("Ingrese la referencia: ");
                String pro_referencia = input.next();
                System.out.println("Ingrese el valor unitario de venta: ");
                double pro_valor_unitario_venta = input.nextDouble();
                catprocrud.leerCategoriaProducto();
                System.out.println("Ingrese el id de la categoria: ");
                int id_catpro = input.nextInt();
                prodcrud.actualizarProducto(pro_id, pro_nombre, pro_marca, pro_unidad, pro_referencia, pro_valor_unitario_venta, id_catpro);
            }

            else if(opcion==4){
                //Eliminar un registro de la BD
                System.out.println("Ingrese el id del producto que desea eliminar: ");
                int pro_id = input.nextInt();
                prodcrud.eliminarProducto(pro_id);
            }

            else if(opcion==5){
                //Activar un registro en la BD
                System.out.println("Ingrese el id del producto que desea activar: ");
                int pro_id = input.nextInt();
                prodcrud.activarProducto(pro_id);
            }

            else{
                System.out.println("Opcion invalida!");
            }

        System.out.println("Desea realizar otra acción en Gestión de Producto? (si/no): ");
        repetir = input.next();
        
        }
    }
}
