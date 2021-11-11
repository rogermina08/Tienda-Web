/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Devoluciones
 * @tema:       Interface de consola
 * @descripción:Con esta prueba se puede se puede tener una interfaz
 *              desde la consola de Netbeans, que ofrece un Menú
 *              para la completa Gestión de Devolución en Ventas en una BD de Mysql
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      27-09-2021
 */
package Main;

import Modelo.DevolucionVenta_crud_admin;
import Modelo.Venta_crud;
import java.util.Scanner;

public class Main_devolucionVenta_admin {
    
    public void Main_devolucionCompra(){
    
        Scanner input = new Scanner (System.in);
        DevolucionVenta_crud_admin devvtacrud = new DevolucionVenta_crud_admin();
        Venta_crud vtacrud = new Venta_crud();

        //Devolución en ventas
        String repetir = "si";

        while(repetir.equals("si")){
            System.out.println("\n=====================================================");
            System.out.println("---------- GESTION DE DEVOLUCION EN VENTAS ----------");
            System.out.println("=====================================================\n");
            System.out.println("1. Lectura de registros");
            System.out.println("2. Creación de nuevo registro");
            System.out.println("3. Actualizar un registro");
            System.out.println("4. Eliminar un registro");
            System.out.println("5. Activar un registro");
            System.out.println("=====================================================\n");

            System.out.println("Ingrese una opcion (1 - 5)");
            int opcion = input.nextInt();

            if(opcion==1){
                //Lectura de registros de la BD
                System.out.println("Devoluciones en ventas existentes en la BD de la Tienda Virtual");
                devvtacrud.leerDevolucionVenta();
            }

            else if(opcion==2){
                //Creación de nuevo registro en la BD
                vtacrud.leerVenta();
                System.out.println("Ingrese el id del pedido que contiene la devolución en venta: ");
                int id_ped = input.nextInt();
                devvtacrud.insertarDevolucionVenta(id_ped);

            }

            else if(opcion==3){
                //Actualizar un registro de la BD
                System.out.println("Ingrese el id de la devolución en venta que desea actualizar: ");
                int devcpr_id = input.nextInt();
                System.out.println("Ingrese el id_ped: ");
                int id_ped = input.nextInt();
                devvtacrud.actualizarDevolucionVenta(devcpr_id, id_ped);
            }

            else if(opcion==4){
                //Eliminar un registro de la BD
                System.out.println("Ingrese el id de la devolución en venta que desea eliminar: ");
                int devcpr_id = input.nextInt();
                devvtacrud.eliminarDevolucionVenta(devcpr_id);
            }

            else if(opcion==5){
                //Activar un registro en la BD
                System.out.println("Ingrese el id de la devolucion en venta que desea activar: ");
                int devcpr_id = input.nextInt();
                devvtacrud.activarDevolucionVenta(devcpr_id);
            }

            else{
                System.out.println("Opcion invalida!");
            }

        System.out.println("Desea realizar otra acción en Devolución de Ventas? (si/no): ");
        repetir = input.next();

        }
    }   
   
}
