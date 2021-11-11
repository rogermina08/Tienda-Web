/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Proveedor
 * @tema:       Interface de consola
 * @descripción:Con esta prueba se puede se puede tener una interfaz
 *              desde la consola de Netbeans, que ofrece un Menú
 *              para la completa Gestión de Proveedor en una BD de Mysql
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      13-09-2021
 */
package Main;
import Modelo.Proveedor_crud;
import java.util.Scanner;

public class Main_proveedor {
    
    public void Main_proveedor(){
        
        Scanner input = new Scanner (System.in);
        Proveedor_crud provcrud = new Proveedor_crud();
                
        String repetir = "si";
        
        while(repetir.equals("si")){
            System.out.println("\n==========================================");    
            System.out.println("---------- GESTION DE PROVEEDOR ----------");
            System.out.println("==========================================\n");    
            System.out.println("1. Lectura de registros");
            System.out.println("2. Creación de nuevo registro");
            System.out.println("3. Actualizar un registro");
            System.out.println("4. Eliminar un registro");
            System.out.println("5. Activar un registro");
            System.out.println("==========================================\n");    
            
            System.out.println("Ingrese una opcion (1 - 5)");
            int opcion = input.nextInt();

            if(opcion==1){
                //Lectura de registros de la BD
                System.out.println("Proveedores existentes en la BD de la Tienda Virtual");
                provcrud.leerProveedor();
            }

            else if(opcion==2){
                //Creación de nuevo registro en la BD
                System.out.println("\nInformación del representante legal del proveedor\n");
                System.out.println("Ingrese los nombres: ");
                String prv_nombres_rep_legal = input.next();
                System.out.println("Ingrese los apellidos: ");
                String prv_apellidos_rep_legal = input.next();
                System.out.println("Ingrese la identificación: ");
                int prv_identificacion_rep_legal = input.nextInt();
                System.out.println("Ingrese la fecha de nacimiento: ");
                String prv_fecha_nacim_rep_legal = input.next();
                System.out.println("Ingrese la direccion domiciliaria: ");
                String prv_direccion_rep_legal = input.next();
                System.out.println("Ingrese el teléfono fijo: ");
                String prv_telefono_fijo_rep_legal = input.next();
                System.out.println("Ingrese el teléfono celular: ");
                String prv_telefono_celular_rep_legal = input.next();
                System.out.println("Ingrese la ciudad: ");
                String prv_ciudad_rep_legal = input.next();
                System.out.println("Ingrese el departamento: ");
                String prv_departamento_rep_legal = input.next();
                System.out.println("Ingrese el email: ");
                String prv_email_rep_legal = input.next();
                System.out.println("\nInformación de la empresa del proveedor\n");
                System.out.println("Ingrese la razón social: ");
                String prv_razon_social_empresa = input.next();
                System.out.println("Ingrese el nit: ");
                int prv_nit_empresa = input.nextInt();
                System.out.println("Ingrese la fecha de aniversario: ");
                String prv_fecha_aniversario_empresa = input.next();
                System.out.println("Ingrese la dirección: ");
                String prv_direccion_empresa = input.next();
                System.out.println("Ingrese el teléfono fijo: ");
                String prv_telefono_fijo_empresa = input.next();
                System.out.println("Ingrese el teléfono celular: ");
                String prv_telefono_celular_empresa = input.next();
                System.out.println("Ingrese la ciudad: ");
                String prv_ciudad_empresa = input.next();
                System.out.println("Ingrese el departamento: ");
                String prv_departamento_empresa = input.next();
                System.out.println("Ingrese el email: ");
                String prv_email_empresa = input.next();
                System.out.println("Ingrese el sitio web: ");
                String prv_web_empresa = input.next();
                System.out.println("Ingrese el link de facebook: ");
                String prv_facebook_empresa = input.next();
                provcrud.insertarProveedor(
                        prv_nombres_rep_legal, 
                        prv_apellidos_rep_legal, prv_identificacion_rep_legal, 
                        prv_fecha_nacim_rep_legal, 
                        prv_direccion_rep_legal,
                        prv_telefono_fijo_rep_legal, prv_telefono_celular_rep_legal,
                        prv_ciudad_rep_legal, prv_departamento_rep_legal,
                        prv_email_rep_legal,
                        prv_razon_social_empresa, prv_nit_empresa,
                        prv_fecha_aniversario_empresa,
                        prv_direccion_empresa, prv_telefono_fijo_empresa,
                        prv_telefono_celular_empresa, prv_ciudad_empresa,
                        prv_departamento_empresa, prv_email_empresa,
                        prv_web_empresa, prv_facebook_empresa);
            }

            else if(opcion==3){
                //Actualizar un registro de la BD
                System.out.println("Ingrese el id del proveedor que desea actualizar: ");
                int prv_id = input.nextInt();
                System.out.println("\nInformación del representante legal del proveedor\n");
                System.out.println("Ingrese los nombres: ");
                String prv_nombres_rep_legal = input.next();
                System.out.println("Ingrese los apellidos: ");
                String prv_apellidos_rep_legal = input.next();
                System.out.println("Ingrese la identificación: ");
                int prv_identificacion_rep_legal = input.nextInt();
                System.out.println("Ingrese la fecha de nacimiento: ");
                String prv_fecha_nacim_rep_legal = input.next();
                System.out.println("Ingrese la direccion domiciliaria: ");
                String prv_direccion_rep_legal = input.next();
                System.out.println("Ingrese el teléfono fijo: ");
                String prv_telefono_fijo_rep_legal = input.next();
                System.out.println("Ingrese el teléfono celular: ");
                String prv_telefono_celular_rep_legal = input.next();
                System.out.println("Ingrese la ciudad: ");
                String prv_ciudad_rep_legal = input.next();
                System.out.println("Ingrese el departamento: ");
                String prv_departamento_rep_legal = input.next();
                System.out.println("Ingrese el email: ");
                String prv_email_rep_legal = input.next();
                System.out.println("\nInformación de la empresa del proveedor\n");
                System.out.println("Ingrese la razón social: ");
                String prv_razon_social_empresa = input.next();
                System.out.println("Ingrese el nit: ");
                int prv_nit_empresa = input.nextInt();
                System.out.println("Ingrese la fecha de aniversario: ");
                String prv_fecha_aniversario_empresa = input.next();
                System.out.println("Ingrese la dirección: ");
                String prv_direccion_empresa = input.next();
                System.out.println("Ingrese el teléfono fijo: ");
                String prv_telefono_fijo_empresa = input.next();
                System.out.println("Ingrese el teléfono celular: ");
                String prv_telefono_celular_empresa = input.next();
                System.out.println("Ingrese la ciudad: ");
                String prv_ciudad_empresa = input.next();
                System.out.println("Ingrese el departamento: ");
                String prv_departamento_empresa = input.next();
                System.out.println("Ingrese el email: ");
                String prv_email_empresa = input.next();
                System.out.println("Ingrese el sitio web: ");
                String prv_web_empresa = input.next();
                System.out.println("Ingrese el link de facebook: ");
                String prv_facebook_empresa = input.next();
                provcrud.actualizarProveedor(
                        prv_id, prv_nombres_rep_legal, 
                        prv_apellidos_rep_legal, prv_identificacion_rep_legal, 
                        prv_fecha_nacim_rep_legal, 
                        prv_direccion_rep_legal,
                        prv_telefono_fijo_rep_legal, prv_telefono_celular_rep_legal,
                        prv_ciudad_rep_legal, prv_departamento_rep_legal,
                        prv_email_rep_legal,
                        prv_razon_social_empresa, prv_nit_empresa,
                        prv_fecha_aniversario_empresa,
                        prv_direccion_empresa, prv_telefono_fijo_empresa,
                        prv_telefono_celular_empresa, prv_ciudad_empresa,
                        prv_departamento_empresa, prv_email_empresa,
                        prv_web_empresa, prv_facebook_empresa);

            }

            else if(opcion==4){
                //Eliminar un registro de la BD
                System.out.println("Ingrese el id del proveedor que desea eliminar: ");
                int pro_id = input.nextInt();
                provcrud.eliminarProveedor(pro_id);
            }

            else if(opcion==5){
                //Activar un registro en la BD
                System.out.println("Ingrese el id del proveedor que desea activar: ");
                int pro_id = input.nextInt();
                provcrud.activarProveedor(pro_id);
            }

            else{
                System.out.println("Opcion invalida!");
            }
            
        System.out.println("Desea realizar otra acción en Gestión de Proveedor? (si/no): ");
        repetir = input.next();
        
        }
    }
}
