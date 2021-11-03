/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Pedido-Compra
 * @tema:       Interface de consola
 * @descripción:Con esta prueba se puede se puede tener una interfaz
 *              desde la consola de Netbeans, que ofrece un Menú
 *              para la completa Gestión de Pedido_Compra en una BD de Mysql
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      27-09-2021
 */
package Main;

import Modelo.Producto_crud;
import Modelo.Proveedor_crud;
import Modelo.Pedido_crud;
import Modelo.Compra_crud_admin;
import Modelo.Pedido;
import java.util.Scanner;

public class Main_pedido {
    
    public void Main_pedido(){
        
        Producto_crud procrud = new Producto_crud();
        Proveedor_crud prvcrud = new Proveedor_crud();
        Pedido_crud pedcrud = new Pedido_crud();
        Pedido ped = new Pedido();
        Compra_crud_admin comcrud = new Compra_crud_admin();
        
        Scanner input = new Scanner (System.in);        
        
        String repetir = "si";

        while(repetir.equals("si")){
            System.out.println("\n==================================================================");    
            System.out.println("----------------------- GESTION DE PEDIDOS -----------------------");
            System.out.println("==================================================================\n");    
            System.out.println("1.  Lectura de registros ");
            System.out.println("2.  Creación de nuevo registro");
            System.out.println("3.  Actualizar un registro");
            System.out.println("4.  Eliminar un registro de pedido producto individual");
            System.out.println("5.  Eliminar un registro de pedido producto total");
            System.out.println("6.  Activar un registro de pedido producto individual");
            System.out.println("7.  Activar un registro de pedido producto total");
            System.out.println("8.  Enviar pedido al proveedor");
            System.out.println("9.  Confirmar recibido de pedido producto individual");
            System.out.println("10. Confirmar recibido de pedido producto total");
            System.out.println("11. Eliminar confirmación de recibo de pedido producto individual");
            System.out.println("12. Eliminar confirmación de recibo de pedido producto total");
            System.out.println("13. Confirmar devolución de producto individual");
            System.out.println("14. Confirmar devolución de producto total");
            System.out.println("15. Eliminar confirmación de devolución de producto individual");
            System.out.println("16. Eliminar confirmación de devolución de producto total");
            System.out.println("==================================================================\n");
            
            System.out.println("Ingrese una opcion (1 - 16)");
            int opcion = input.nextInt();

            if(opcion==1){
                //Lectura de registros de la BD
                System.out.println("Pedidos registrados en la BD de la Tienda Virtual");
                pedcrud.leerPedido();
            }

            else if(opcion==2){
                //Creación de nuevo registro en la BD
                System.out.println("Ingrese el número del pedido: ");
                int ped_numero_pedido = input.nextInt();
                procrud.leerProducto();
                System.out.println("Ingrese el id del producto: ");
                int id_pro = input.nextInt();
                prvcrud.leerProveedor();
                System.out.println("Ingrese el id del proveedor: ");
                int id_prv = input.nextInt();
                System.out.println("Ingrese la cantidad: ");
                float ped_cantidad = input.nextFloat();
                System.out.println("Ingrese el valor unitario de compra: ");
                double ped_valor_unitario_compra = input.nextDouble();
                pedcrud.insertarPedido(ped_numero_pedido, id_pro, id_prv, ped_cantidad, ped_valor_unitario_compra);
            }

            else if(opcion==3){
                //Actualizar un registro de la BD
                System.out.println("Ingrese el id del pedido: ");
                int ped_id = input.nextInt();
                System.out.println("Ingrese el número del pedido: ");
                int ped_numero_pedido = input.nextInt();
                System.out.println("Ingrese el id del producto: ");
                int id_pro = input.nextInt();
                System.out.println("Ingrese el id del proveedor: ");
                int id_prv = input.nextInt();
                System.out.println("Ingrese la cantidad: ");
                float ped_cantidad = input.nextFloat();
                System.out.println("Ingrese el valor unitario de compra: ");
                double ped_valor_unitario_compra = input.nextDouble();
                pedcrud.actualizarPedido(ped_id, ped_numero_pedido, id_pro, id_prv, ped_cantidad, ped_valor_unitario_compra);
            }
            
            else if(opcion==4){
                //Eliminar un registro de pedido producto individual de la BD
                System.out.println("Ingrese el id del pedido que desea eliminar: ");
                int ped_id = input.nextInt();
                pedcrud.eliminarPedido(ped_id);
            }
            
            else if(opcion==5){
                //Eliminar un registro de pedido producto total de la BD
                System.out.println("Ingrese el número de pedido que desea eliminar: ");
                int ped_numero_pedido = input.nextInt();
                pedcrud.eliminarPedidoTotal(ped_numero_pedido);
            }

            else if(opcion==6){
                //Activar un registro de pedido producto individual en la BD
                System.out.println("Ingrese el id del pedido que desea activar: ");
                int ped_id = input.nextInt();
                pedcrud.activarPedido(ped_id);
            }
            
            else if(opcion==7){
                //Activar un registro de pedido producto total en la BD
                System.out.println("Ingrese el número del pedido que desea activar: ");
                int ped_numero_pedido = input.nextInt();
                pedcrud.activarPedidoTotal(ped_numero_pedido);
            }
            
            else if(opcion==8){
                //Enviar un pedido al proveedor
                System.out.println("Ingrese el número del pedido que desea enviar: ");
                int ped_numero_pedido_aEnviar = input.nextInt();
                pedcrud.enviarPedidoTotal(ped_numero_pedido_aEnviar);
            }
                         
            else if(opcion==9){
                //Confirmar recibido de pedido producto individual en la BD
                System.out.println("Ingrese el id del pedido: ");
                int ped_id = input.nextInt();
                pedcrud.confirmarRecibido(ped_id);
                //Una vez confirmado un recibido de un producto de un pedido, el producto entra realmente al inventario
                //y se actualiza la tabla Compra (ingresando los datos del producto del pedido)
                comcrud.insertarCompra(ped_id);
            }
                        
            else if(opcion==10){
                //Confirmar recibido de pedido producto total en la BD
                System.out.println("Ingrese el número del pedido: ");
                int ped_numero_pedido = input.nextInt();
                pedcrud.confirmarRecibidoTotal(ped_numero_pedido);
                
                //Una vez confirmado un recibido de todos los productos de un pedido, los productos entran realmente al inventario
                //y se actualiza la tabla Compra (ingresando los datos de los productos del pedido)
                pedcrud.leerNumeroPedido_A(ped_numero_pedido);
            }
                        
            else if(opcion==11){
                //Eliminar confirmación de recibido de pedido producto individual en la BD
                System.out.println("Ingrese el id del pedido: ");
                int ped_id = input.nextInt();
                pedcrud.eliminarConfirmacionRecibido(ped_id);
                //Una vez eliminada la confirmación de recibido del producto de un pedido, el producto sale (se da de baja) realmente al inventario
                //y se actualiza la tabla Compra (eliminando la compra: Inactivo)
                comcrud.eliminarConfirmacionCompra(ped_id);
            }
                         
            else if(opcion==12){
                //Eliminar confirmación de recibido de pedido producto total en la BD
                System.out.println("Ingrese el núumero de pedido del producto: ");
                int ped_numero_pedido = input.nextInt();
                pedcrud.eliminarConfirmacionRecibidoTotal(ped_numero_pedido);
                //Una vez eliminada la confirmación de recibido de todos los productos de un pedido, los producto salen (se da de baja) realmente al inventario
                //y se actualiza la tabla Compra (eliminando la compra: Inactivo)
                pedcrud.leerNumeroPedido_B(ped_numero_pedido);
            }
            
            else if(opcion==13){
                //Confirmar devolución de pedido producto individual en la BD
                System.out.println("Ingrese el id del pedido: ");
                int ped_id = input.nextInt();
                
                String repetir2 = "si";
                while(repetir2.equals("si")){
                    int ped_cantidad = pedcrud.leerCantidad(ped_id);
                    System.out.println("Cantidad máxima a devolver para este pedido: "+ped_cantidad);
                    System.out.println("Ingrese la cantidad para devolver: ");
                    int cantidadParaDevolver = input.nextInt();
                    if(cantidadParaDevolver <= pedcrud.leerCantidad(ped_id)){
                        int ped_cantidad_devolucion = pedcrud.leerCantidadDevolucion(ped_id);
                        pedcrud.confirmarDevolucion(ped_id, ped_cantidad_devolucion, ped_cantidad, cantidadParaDevolver);
                        
                        repetir2 = "no";
                        //Una vez confirmada una devolución de un producto de un pedido, la cantidad del producto devuelto ya no entra al inventario
                        //y el pedido de ese producto NO se tiene en cuenta en la tabla Compra.
                    }else{
                        System.out.println("Cantidad ingresada sobrepasa el límite del pedido");
                        System.out.println("Desea realizar ingresar otra cantidad? (si/no): ");
                        repetir2 = input.next();
                    }
                }
            
            }
            
            else if(opcion==14){
                //Confirmar devolución de pedido producto Total en la BD
                pedcrud.confirmarDevolucionTotal(opcion);
            }
            
            else if(opcion==15){
                //Eliminar confirmación de devolución de pedido producto individual en la BD
                pedcrud.eliminarConfirmacionDevolucion(opcion);
            }
            
            else if(opcion==16){
                //Eliminar confirmación de devolución de pedido producto total en la BD
                pedcrud.eliminarConfirmacionDevolucionTotal(opcion);
            }
            
            else{
                System.out.println("Opcion invalida!");
            }

        System.out.println("Desea realizar otra acción en Gestión de Pedido? (si/no): ");
        repetir = input.next();
        
        }
    }
}
