/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Compra
 * @tema:       Interface de consola
 * @descripción:Con esta prueba se puede se puede tener una interfaz
 *              desde la consola de Netbeans, que ofrece un Menú
 *              para la completa Gestión de Compra
 *              en una BD de Mysql
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      17-09-2021
 */
package Main;

import Modelo.Compra_crud_admin;
import Modelo.Pedido_crud;
import Modelo.Producto_crud;
import Modelo.Proveedor_crud;
import java.util.Scanner;

public class Main_compra_admin {
    
    public void Main_compra(){
    
        Scanner input = new Scanner (System.in);
        Compra_crud_admin comcrud = new Compra_crud_admin();
        Pedido_crud pedcrud = new Pedido_crud();
//        Producto_crud procrud = new Producto_crud();
//        Proveedor_crud prvcrud = new Proveedor_crud();
        
        
        String repetir = "si";

        while(repetir.equals("si")){
            System.out.println("\n========================================");
            System.out.println("---------- GESTION DE COMPRAS ----------");
            System.out.println("========================================\n");
            System.out.println("1. Lectura de registros");
            System.out.println("2. Creación de nuevo registro");
            System.out.println("3. Actualizar un registro");
            System.out.println("4. Eliminar un registro");
            System.out.println("5. Activar un registro");
            System.out.println("========================================\n");
            
            System.out.println("Ingrese una opcion (1 - 5)");
            int opcion = input.nextInt();

            if(opcion==1){
                //Lectura de registros de la BD
                System.out.println("Compras de productos existentes en la BD de la Tienda Virtual");
                comcrud.leerCompra();
            }

            else if(opcion==2){
                //Creación de nuevo registro en la BD
                pedcrud.leerPedido();
                System.out.println("Ingrese el id del pedido: ");
                int idPedidoparaCompra = input.nextInt();
                
                comcrud.insertarCompra(idPedidoparaCompra);
            }
 
            else if(opcion==3){
                //Actualizar un registro de la BD
                System.out.println("Ingrese el id de la compra que desea actualizar: ");
                int cpr_id = input.nextInt();
                System.out.println("Ingrese el id_ped: ");
                int id_ped = input.nextInt();
                comcrud.actualizarCompra(cpr_id, id_ped);
            }

            else if(opcion==4){
                //Eliminar un registro de la BD
                System.out.println("Ingrese el id de la compra que desea eliminar: ");
                int cpr_id = input.nextInt();
                comcrud.eliminarCompra(cpr_id);
            }

            else if(opcion==5){
                //Activar un registro en la BD
                System.out.println("Ingrese el id de la compra que desea activar: ");
                int cpr_id = input.nextInt();
                comcrud.activarCompra(cpr_id);
            }

            else{
                System.out.println("Opcion invalida!");
            }
            
        System.out.println("Desea realizar otra acción en Gestión de Compras? (si/no): ");
        repetir = input.next();
        
        }
    }
}
