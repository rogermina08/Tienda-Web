/**
 * @proyecto:   Tienda virtual
 * @épica:      Gestión de Producto
 * @tema:       Validación de BD
 * @descripción:Con esta clase se puede comprobar desde Netbeans
 *              si una BD existe o no en Mysql
 * @author:     Global Project
 * @email:      globalproject.uis@gmail.com
 * @fecha:      13-09-2021
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExisteBD {

    public ExisteBD() {
    }
    
    public boolean dbExists(String db, String pass) {
        boolean exist = false;
        Scanner input = new Scanner (System.in);
        try {
            Connection conn = null;
            //Statement st = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + db, "root", pass);
            java.sql.Statement st = conn.createStatement();
            String sql = "SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = '" + db + "'";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                exist = true;
            }
        } catch (ClassNotFoundException ex) {
        
        } catch (SQLException ex) {
            exist = false;
        }
        return exist;
    }
}
