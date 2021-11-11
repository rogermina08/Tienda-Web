/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Venta
 * @tema:       Interface de consola
 * @descripción:Con esta prueba se puede se puede tener una interfaz
 *              desde la consola de Netbeans, que ofrece un Menú
 *              para la completa Gestión de Venta
 *              en una BD de Mysql
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      27-09-2021
 */
package Main;

import Modelo.Producto_crud;
import Modelo.Venta_crud;
import java.util.Scanner;

public class Main_venta {
    
    public void Main_venta(){
        
        Scanner input = new Scanner (System.in);
        Venta_crud vtacrud = new Venta_crud();
        Producto_crud procrud = new Producto_crud();
                
        String repetir = "si";
        
        while(repetir.equals("si")){
            System.out.println("=======================================");    
            System.out.println("---------- GESTION DE VENTAS ----------");
            System.out.println("=======================================");    
            System.out.println("1. Lectura de registros");
            System.out.println("2. Creación de nuevo registro");
            System.out.println("3. Actualizar un registro");
            System.out.println("4. Eliminar un registro");
            System.out.println("5. Activar un registro");
            System.out.println("=======================================");    

            System.out.println("Ingrese una opcion (1 - 5)");
            int opcion = input.nextInt();

            if(opcion==1){
                //Lectura de registros de la BD
                System.out.println("Ventas existentes en la BD de la Tienda Virtual");
                vtacrud.leerVenta();
            }

            else if(opcion==2){
                //Creación de nuevo registro en la BD
                procrud.leerProducto();
                System.out.println("\nIngrese el id_pro: ");
                int id_pro = input.nextInt();
                System.out.println("Ingrese la cantidad vendida: ");
                float vta_cantidad = input.nextFloat();
                vtacrud.insertarVenta(id_pro, vta_cantidad);
            }

            else if(opcion==3){
                //Actualizar un registro de la BD
                vtacrud.leerVenta();
                System.out.println("\nIngrese el id de la venta a actualizar: ");
                int vta_id = input.nextInt();
                System.out.println("Ingrese el id del producto: ");
                int id_pro = input.nextInt();
                System.out.println("Ingrese la cantidad: ");
                float vta_cantidad = input.nextFloat();
                vtacrud.actualizarVenta(vta_id, id_pro, vta_cantidad);
            }

            else if(opcion==4){
                //Eliminar un registro de la BD
                vtacrud.leerVenta();
                System.out.println("\nIngrese el id de la venta que desea eliminar: ");
                int vta_id = input.nextInt();
                vtacrud.eliminarVenta(vta_id);
            }

            else if(opcion==5){
                //Activar un registro en la BD
                vtacrud.leerVenta();
                System.out.println("\nIngrese el id de la venta que desea activar: ");
                int vta_id = input.nextInt();
                vtacrud.activarVenta(vta_id);
            }

            else{
                System.out.println("Opcion invalida!");
            }
                        
        System.out.println("Desea realizar otra acción en Gestión de Venta? (si/no): ");
        repetir = input.next();
        
        }
    }
}
