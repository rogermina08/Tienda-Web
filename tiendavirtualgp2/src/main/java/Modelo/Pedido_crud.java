/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Pedido
 * @tema:       Acciones de CRUD
 * @descripción:Después de conectarse a la BD en Mysql,
 *              con esta prueba se puede realizar acciones de CRUD
 *              desde Netbeans, para la Gestión de Pedido 
 * @autor:      Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      13-09-2021
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Pedido_crud {
    
    Conexion conexion1 = new Conexion();
        
    
    //Acciones CRUD
      
    public void insertarPedido(int ped_numero_pedido, int id_pro, int id_prv, float ped_cantidad, double ped_valor_unitario_compra){
        String query ="INSERT INTO pedido (ped_id, ped_numero_pedido, id_pro, id_prv, ped_cantidad, ped_valor_unitario_compra) "+
                    "VALUES (null,\""+ped_numero_pedido+"\", \""+id_pro+"\",\""+id_prv+"\",\""+ped_cantidad+"\", \""+ped_valor_unitario_compra+"\");";
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
    }
        
    
    public void leerPedido(){
        String query1 = "SELECT * FROM pedido;";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);  //Directamente el metodo porque esta clase tiene extendes Conexion
        try{
            int bandera=0;
            while(rs1.next()==true){
                System.out.println("ped_id: "+rs1.getString("ped_id") +" ped_fecha: "+ rs1.getString("ped_fecha")+
                        " ped_numero_pedido: "+rs1.getString("ped_numero_pedido")+
                        " id_pro: "+rs1.getString("id_pro")+ 
                        " id_prv: "+rs1.getString("id_prv")+
                        " ped_cantidad: "+rs1.getString("ped_cantidad")+
                        " ped_valor_unitario_compra: "+rs1.getString("ped_valor_unitario_compra")+
                        " ped_confirma_recibo: "+rs1.getString("ped_confirma_recibo")+
                        " ped_confirma_devolucion: "+rs1.getString("ped_confirma_devolucion")+
                        " ped_cantidad_devolucion: "+rs1.getString("ped_cantidad_devolucion")+
                        " ped_estado: "+rs1.getString("ped_estado")
                        ); 
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
    
    
    public void actualizarPedido(int ped_id, int ped_numero_pedido, int id_pro, int id_prv, float ped_cantidad, double ped_valor_unitario_compra){
        String query = "UPDATE pedido SET "
                + "ped_numero_pedido="+"\""+ped_numero_pedido+"\""+
                ",id_pro="+"\""+id_pro+"\""+
                ",id_prv="+"\""+id_prv+"\""+
                ",ped_cantidad="+"\""+ped_cantidad+"\""+
                ",ped_valor_unitario_compra="+"\""+ped_valor_unitario_compra+"\""+
                " WHERE ped_id="+ped_id+";";
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void eliminarPedido(int ped_id){
        String query = "UPDATE pedido SET ped_estado= \"Inactivo\" WHERE ped_id="+ped_id+";";
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    public void eliminarPedidoTotal(int ped_numero_pedido){
        String query = "UPDATE pedido SET ped_estado= \"Inactivo\" WHERE ped_numero_pedido="+ped_numero_pedido+";";
        conexion1.ejecutarQuery(query);  //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void activarPedido(int ped_id){
        String query = "UPDATE pedido SET ped_estado= \"Activo\" WHERE ped_id="+ped_id+";"; 
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    public void activarPedidoTotal(int ped_numero_pedido){
        String query = "UPDATE pedido SET ped_estado= \"Activo\" WHERE ped_numero_pedido="+ped_numero_pedido+";"; 
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    
    public void enviarPedidoTotal(int ped_numero_pedido_aEnviar){
//        String query = "UPDATE pedido SET ped_estado= \"Activo\" WHERE ped_numero_pedido="+ped_numero_pedido+";"; 
//        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
        System.out.println("El pedido se envió al email del Proveedor...");
    }
    
    
    public void confirmarRecibido(int ped_id){
        String query = "UPDATE pedido SET ped_confirma_recibo= \"Si\" WHERE ped_id="+ped_id+";"; 
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    public void confirmarRecibidoTotal(int ped_numero_pedido){
        String query = "UPDATE pedido SET ped_confirma_recibo= \"Si\" WHERE ped_numero_pedido="+ped_numero_pedido+";"; 
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
    }
        
    public void eliminarConfirmacionRecibido(int ped_id){
        String query = "UPDATE pedido SET ped_confirma_recibo= \"No\" WHERE ped_id="+ped_id+";"; 
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    public void eliminarConfirmacionRecibidoTotal(int ped_numero_pedido){
        String query = "UPDATE pedido SET ped_confirma_recibo= \"No\" WHERE ped_numero_pedido="+ped_numero_pedido+";"; 
        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
    }
    
    public int leerCantidad(int ped_id){
        String query1 = "SELECT ped_id, ped_cantidad FROM pedido;";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);  //Directamente el metodo porque esta clase tiene extendes Conexion
        int cantidad = 0;
        try{
            int bandera=0;
            while(rs1.next()==true){
                if(rs1.getInt("ped_id")==ped_id){
                    cantidad = rs1.getInt("ped_cantidad");
                }
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        return cantidad;
    }
    
    
    public void leerNumeroPedido_A(int ped_numero_pedido){
        Compra_crud_admin comcrud = new Compra_crud_admin();
        String query1 = "SELECT ped_id FROM pedido WHERE ped_numero_pedido="+ped_numero_pedido+";";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);  //Directamente el metodo porque esta clase tiene extendes Conexion
        try{
            int bandera=0;
            while(rs1.next()==true){
                comcrud.insertarCompra(rs1.getInt("ped_id"));  //El argumento debe pasar al método como Int
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
               
    public void leerNumeroPedido_B(int ped_numero_pedido){
        Compra_crud_admin comcrud = new Compra_crud_admin();
        String query1 = "SELECT ped_id FROM pedido WHERE ped_numero_pedido="+ped_numero_pedido+";";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);  //Directamente el metodo porque esta clase tiene extendes Conexion
        try{
            int bandera=0;
            while(rs1.next()==true){
                comcrud.eliminarConfirmacionCompra(rs1.getInt("ped_id"));  //El argumento debe pasar al método como Int
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
    }
    
    
    public void confirmarDevolucion(int ped_id, int ped_cantidad_devolucion, int ped_cantidad, int cantidadParaDevolver){
        Pedido ped = new Pedido();
        String query1 = "UPDATE pedido SET ped_confirma_devolucion= \"Si\" WHERE ped_id="+ped_id+";"; 
        conexion1.ejecutarQuery(query1);
        String query2 = "UPDATE pedido SET ped_cantidad_devolucion= "+(ped_cantidad_devolucion + cantidadParaDevolver)+" WHERE ped_id="+ped_id+";"; 
        conexion1.ejecutarQuery(query2);
        String query3 = "UPDATE pedido SET ped_cantidad= "+(ped_cantidad - cantidadParaDevolver)+" WHERE ped_id="+ped_id+";"; 
        conexion1.ejecutarQuery(query3);
        
    }
            
    public int leerCantidadDevolucion(int ped_id){
        String query1 = "SELECT ped_id, ped_cantidad_devolucion FROM pedido;";
        ResultSet rs1 = conexion1.ejecutarQueryLectura(query1);  //Directamente el metodo porque esta clase tiene extendes Conexion
        int cantidadDevolucion = 0;
        try{
            int bandera=0;
            while(rs1.next()==true){
                if(rs1.getInt("ped_id")==ped_id){
                    cantidadDevolucion = rs1.getInt("ped_cantidad_devolucion");
                }
                bandera=1;
            }
            if(bandera==0){
                System.out.println("No hay registros en la BD");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage()); 
        }
        
        return cantidadDevolucion;
    }
    
    
    
    public void confirmarDevolucionTotal(int ped_numero_pedido){
//        String query = "UPDATE pedido SET ped_confirma_devolucion= \"Si\" WHERE ped_numero_pedido="+ped_numero_pedido+";"; 
//        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
        System.out.println("Opción en desarrollo............");
    }
        
    public void eliminarConfirmacionDevolucion(int ped_id){
//        String query = "UPDATE pedido SET ped_confirma_recibo= \"No\" WHERE ped_id="+ped_id+";"; 
//        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
        System.out.println("Opción en desarrollo............");
    }
    
    public void eliminarConfirmacionDevolucionTotal(int ped_numero_pedido){
//        String query = "UPDATE pedido SET ped_confirma_recibo= \"No\" WHERE ped_numero_pedido="+ped_numero_pedido+";"; 
//        conexion1.ejecutarQuery(query); //Directamente el metodo porque esta clase tiene extendes Conexion
        System.out.println("Opción en desarrollo............");
    }
    
}
