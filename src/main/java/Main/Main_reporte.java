/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Reporte
 * @tema:       Interface de consola
 * @descripción:Con esta prueba se puede se puede tener una interfaz
 *              desde la consola de Netbeans, que ofrece un Menú
 *              para la completa Gestión de Reporte
 *              en una BD de Mysql
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      26-09-2021
 */
package Main;

import Modelo.Reporte_crud;
import java.text.ParseException;
import java.util.Scanner;

public class Main_reporte {
    
    public void Main_reporte() throws ParseException{
        
        Scanner input = new Scanner (System.in);
        Reporte_crud repcrud = new Reporte_crud();
                        
        String repetir = "si";
        
        while(repetir.equals("si")){
            System.out.println("\n=========================================");
            System.out.println("---------- GESTION DE REPORTES ----------");
            System.out.println("=========================================\n");
            System.out.println("1. Reportes de Ventas");
            System.out.println("2. Reportes de Compras");
            System.out.println("3. Reportes de Inventario");
            System.out.println("4. Reportes de Costos");
            System.out.println("=========================================\n");

            System.out.println("Ingrese una opcion (1 - 4)");
            int opcion = input.nextInt();

            if(opcion==1){
                //Reportes de Ventas
                
                String repetir2 = "si";
        
                while(repetir2.equals("si")){
                    System.out.println("\n=========================================");
                    System.out.println("----------- REPORTES DE VENTAS ----------");
                    System.out.println("=========================================\n");
                    System.out.println("1. Histórico de ventas");
                    System.out.println("2. Ventas por categoria de producto");
                    System.out.println("3. Ventas por producto");
                    System.out.println("4. Ventas por proveedor");
                    System.out.println("=========================================\n");
                
                    System.out.println("Ingrese una opcion (1 - 4)");
                    int numero_reporte = input.nextInt();
                    
                    if(numero_reporte==1){
                        System.out.println("Histórico de Ventas\n");
                        repcrud.historicoVentas();
                    }else if(numero_reporte==2){
                        repcrud.ventasCategoriaProducto();
                    }else if(numero_reporte==3){
                        repcrud.ventasProducto();
                    }else if(numero_reporte==4){
                        repcrud.ventasProveedor();
                    }else{
                        System.out.println("Opcion invalida!");
                    }
                System.out.println("\nDesea realizar otra acción en Reporte de Ventas? (si/no): ");
                repetir2 = input.next();
                }
            
            }else if(opcion==2){
                //Reportes de Compras
                
                String repetir2 = "si";
        
                while(repetir2.equals("si")){
                    System.out.println("\n=========================================");
                    System.out.println("---------- REPORTES DE COMPRAS ----------");
                    System.out.println("=========================================\n");
                    System.out.println("1. Histórico de compras");
                    System.out.println("2. Compras por categoria de producto");
                    System.out.println("3. Compras por producto");
                    System.out.println("4. Compras por proveedor");
                    System.out.println("5. Compras por pedido");
                    System.out.println("=========================================\n");

                    System.out.println("Ingrese una opcion (1 - 4)");
                    int numero_reporte = input.nextInt();
                    if(numero_reporte==1){
                        repcrud.historicoCompras();
                    }else if(numero_reporte==2){
                        repcrud.comprasCategoriaProducto();
                    }else if(numero_reporte==3){
                        repcrud.comprasProducto();
                    }else if(numero_reporte==4){
                        repcrud.comprasProveedor();
                    }else if(numero_reporte==5){
                        repcrud.comprasPedido();
                    }else{
                        System.out.println("Opcion invalida!");
                    }
                System.out.println("\nDesea realizar otra acción en Reporte de Compras? (si/no): ");
                repetir2 = input.next();
                }
                                
            }else if(opcion==3){
                //Reportes de Inventarios
                    
                String repetir2 = "si";
        
                while(repetir2.equals("si")){
                    System.out.println("\n=============================================");
                    System.out.println("---------- REPORTES DE INVENTARIOS ----------");
                    System.out.println("=============================================\n");
                    System.out.println("1. Inventario por categoria");
                    System.out.println("2. Inventario por producto");
                    System.out.println("3. Inventario por producto - stock mínimo");
                    System.out.println("4. Kardex");
                    System.out.println("=============================================\n");
                    

                    System.out.println("Ingrese una opcion (1 - 4)");
                    int numero_reporte = input.nextInt();
                    if(numero_reporte==1){
                        repcrud.inventarioCategoria();
                    }else if(numero_reporte==2){
                        repcrud.inventarioProducto();
                    }else if(numero_reporte==3){
                        repcrud.inventarioProductoStockMinimo();
                    }else if(numero_reporte==4){
                        repcrud.kardexProducto();
                    }else{
                        System.out.println("Opcion invalida!");
                    }
                System.out.println("\nDesea realizar otra acción en Reporte de Inventarios? (si/no): ");
                repetir2 = input.next();                
                }

            }else if(opcion==4){
               //Reportes de Otros
                    
                String repetir2 = "si";
        
                while(repetir2.equals("si")){
                    System.out.println("\n==============================================");
                    System.out.println("------------- REPORTES DE COSTOS -------------");
                    System.out.println("==============================================\n");
                    System.out.println("1.  Histórico costos por ventas");
                    System.out.println("2.  Costos de ventas por categoria");
                    System.out.println("3.  Costos de ventas por producto");
                    System.out.println("4.  Costos de ventas por proveedor");
                    System.out.println("5.  Histórico costos por compras");
                    System.out.println("6.  Costos de compras por categoría");
                    System.out.println("7.  Costos de compras por producto");
                    System.out.println("8.  Costos de compras por proveedor");
                    System.out.println("9.  Costos de venta por pedido");
                    System.out.println("==============================================\n");
                    
                    
                    System.out.println("Ingrese una opcion (1 - 9)");
                    int numero_reporte = input.nextInt();
                    if(numero_reporte==1){
                        repcrud.historicoCostosVentas();
                    }else if(numero_reporte==2){
                        repcrud.historicoCostosVentasCategoria();
                    }else if(numero_reporte==3){
                        repcrud.historicoCostosVentasProducto();
                    }else if(numero_reporte==4){
                        repcrud.historicoCostosVentasProveedor();
                    }else if(numero_reporte==5){
                        repcrud.historicoCostosCompras();
                    }else if(numero_reporte==6){
                        repcrud.historicoCostosComprasCategoria();
                    }else if(numero_reporte==7){
                        repcrud.historicoCostosComprasProducto();    
                    }else if(numero_reporte==8){
                        repcrud.historicoCostosComprasProveedor();    
                    }else if(numero_reporte==9){
                        repcrud.historicoCostosComprasPedido();
                    }else{
                        System.out.println("Opcion invalida!");
                    }
                System.out.println("\nDesea realizar otra acción en Reporte de Otros? (si/no): ");
                repetir2 = input.next();    
                }

            }else{
                System.out.println("Opcion invalida!");
            }
        
        System.out.println("\nDesea realizar otra acción en Gestión de Reportes? (si/no): ");
        repetir = input.next();
        
        }
    }
}
