/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Devoluciones
 * @tema:       Interface de consola
 * @descripción:Con esta prueba se puede se puede tener una interfaz
 *              desde la consola de Netbeans, que ofrece un Menú
 *              para la completa Gestión de Devolución en Compras en una BD de Mysql
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      27-09-2021
 */
package Main;

import Modelo.DevolucionCompra_crud_admin;
import Modelo.Pedido_crud;
import java.util.Scanner;

public class Main_devolucionCompra_admin {
    
    public void Main_devolucionCompra(){
    
        Scanner input = new Scanner (System.in);
        DevolucionCompra_crud_admin devcprcrud = new DevolucionCompra_crud_admin();
        Pedido_crud pedcrud = new Pedido_crud();
               
        //Devolución en compras
        String repetir = "si";

        while(repetir.equals("si")){
            System.out.println("\n======================================================");
            System.out.println("---------- GESTION DE DEVOLUCION EN COMPRAS ----------");
            System.out.println("======================================================\n");
            System.out.println("1. Lectura de registros");
            System.out.println("2. Creación de nuevo registro");
            System.out.println("3. Actualizar un registro");
            System.out.println("4. Eliminar un registro");
            System.out.println("5. Activar un registro");
            System.out.println("======================================================\n");

            System.out.println("Ingrese una opcion (1 - 5)");
            int opcion = input.nextInt();

            if(opcion==1){
                //Lectura de registros de la BD
                System.out.println("Devoluciones en compras existentes en la BD de la Tienda Virtual");
                devcprcrud.leerDevolucionCompra();
            }

            else if(opcion==2){
                //Creación de nuevo registro en la BD
                pedcrud.leerPedido();
                System.out.println("Ingrese el id del pedido que contiene la devolución en compra: ");
                int id_ped = input.nextInt();
                devcprcrud.insertarDevolucionCompra(id_ped);

            }

            else if(opcion==3){
                //Actualizar un registro de la BD
                System.out.println("Ingrese el id de la devolución en compra que desea actualizar: ");
                int devcpr_id = input.nextInt();
                System.out.println("Ingrese el id_ped: ");
                int id_ped = input.nextInt();
                devcprcrud.actualizarDevolucionCompra(devcpr_id, id_ped);
            }

            else if(opcion==4){
                //Eliminar un registro de la BD
                System.out.println("Ingrese el id de la devolución en compra que desea eliminar: ");
                int devcpr_id = input.nextInt();
                devcprcrud.eliminarDevolucionCompra(devcpr_id);
            }

            else if(opcion==5){
                //Activar un registro en la BD
                System.out.println("Ingrese el id de la devolucion en compra que desea activar: ");
                int devcpr_id = input.nextInt();
                devcprcrud.activarDevolucionCompra(devcpr_id);
            }

            else{
                System.out.println("Opcion invalida!");
            }

        System.out.println("Desea realizar otra acción en Devolución de Compras? (si/no): ");
        repetir = input.next();

        }
                
    }
     
}
