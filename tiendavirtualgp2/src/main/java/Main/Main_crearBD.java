/**
 * @proyecto:   Tienda virtual
 * @épica:      NA
 * @tema:       Crear BD
 * @descripción:Main para la creación de una BD en Mysql desde Netbeans
 * @author:     Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      17-09-2021
 */
package Main;

import Modelo.BaseDatos_crear;
import Modelo.ExisteBD;
import java.util.Scanner;

public class Main_crearBD {
    
    public static String nombre_tienda;
    public String Main_crearBD(){
        
        Scanner input = new Scanner (System.in);
        BaseDatos_crear crearbd = new BaseDatos_crear();
        
        System.out.println("\n=====================================================================================");
        System.out.println("-----  S i s t e m a   T i e n d a   V i r t u a l   -   G P 8   -   V e r.1.0  -----");
        System.out.println("=====================================================================================\n");

        System.out.println("Tiene una tienda registrada en el sistema? (si/no)");
        String registrado = input.next();
        String realizarOperaciones = "no";
        if(registrado.equals("si")){
            System.out.println("Desea realizar operaciones de negocio en su tienda? (si/no)");
            realizarOperaciones = input.next();
            if(realizarOperaciones.equals("si")){
                System.out.println("Ingrese el nombre de su tienda");
                nombre_tienda = input.next();
                ExisteBD existe = new ExisteBD();
                if(existe.dbExists(nombre_tienda, "")==false){
                    System.out.println("La tienda "+nombre_tienda+" no existe en la BD. ");
                    System.out.println("Ingrese el nombre nuevamente o cree una nueva tienda");
                    realizarOperaciones = "no";
                }
            }
            
        }else{
            System.out.println("Desea registrar una tienda? (si/no)");
            String deseoRegistrar = input.next();
            if(deseoRegistrar.equals("si")){
                System.out.println("Ingrese el nombre de su tienda");
                nombre_tienda = input.next();
                crearbd.crearBD(nombre_tienda);
                System.out.println("Desea realizar operaciones en la tienda '"+nombre_tienda+"' ? (si/no)\n");
                realizarOperaciones = input.next();
            }
        }
        
        return realizarOperaciones;
        //return nombre_tienda;
    }
}
