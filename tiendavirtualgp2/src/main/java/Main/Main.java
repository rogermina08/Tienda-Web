/**
 * @proyecto:   Tienda virtual
 * @épica:      Menú Principal
 * @tema:       Interface de consola
 * @descripción:Con esta prueba se puede se puede tener una interfaz
 *              desde la consola de Netbeans, que ofrece una vista
 *              del Menú Principal para el proyecto Tienda Virtual
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      17-09-2021
 */
package Main;

import java.text.ParseException;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner input = new Scanner (System.in);
        
        Main_crearBD maincrearbd = new Main_crearBD();
        
        if(maincrearbd.Main_crearBD().equals("si")){
            
            Main_categoriaProducto maincat = new Main_categoriaProducto();
            Main_producto mainpro = new Main_producto();
            Main_proveedor mainprv = new Main_proveedor();
            Main_pedido mainped = new Main_pedido();
            Main_venta mainven = new Main_venta();
            Main_reporte mainrep = new Main_reporte();

            String repetir = "si";

            while(repetir.equals("si")){
                System.out.println("\n====================================");
                System.out.println  ("---------- MENU PRINCIPAL ----------");
                System.out.println  ("====================================");
                System.out.println("1. Gestión de Categorias ");
                System.out.println("2. Gestión de Productos");
                System.out.println("3. Gestión de Proveedores");
                System.out.println("4. Gestión de Pedidos");
                System.out.println("5. Gestión de Ventas");
                System.out.println("6. Gestión de Reportes");
                System.out.println("====================================");
                
                System.out.println("Ingrese una opcion (1 - 6)");
                int opcion = input.nextInt();

                if(opcion==1){
                    maincat.Main_categoria();
                }else if(opcion==2){
                    mainpro.Main_producto();
                }else if(opcion==3){
                    mainprv.Main_proveedor();
                }else if(opcion==4){
                    mainped.Main_pedido();
                }else if(opcion==5){
                    mainven.Main_venta();
                }else if(opcion==6){
                    mainrep.Main_reporte();
                }else{
                    System.out.println("opción inválida");
                }

                System.out.println("Desea realizar otra acción de Gestion? (si/no): ");
                repetir = input.next();

            }

        }
        
//        //Creación de un manejador de BD (modelo) para productos
//        ProductoBD prodBD = new ProductoBD();
//        
//        
//        //Creación de una ventana(vista) principal y mostrarla(hacerla visible)
//        Producto_vista vista = new Producto_vista();
//        
//        
//        //Creación de un objeto controlador y le pasamos como parámetros los objetos de 
//        //la ventana(vista) y el manejador de BD (modelo) creados anteriormente
//        Controlador_producto productController = new Controlador_producto(prodBD, vista);

    }
 
}
