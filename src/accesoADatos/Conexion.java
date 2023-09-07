
package accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String URL = "jdbc:mysql://localhost/";
    private static final String DB = "universidadulp";
    private static final String USUARIO = "root";
    private static String PASSWORD = "";
    
    private static Connection connection;
    
    //metodo constructor
    
    private Conexion(){}
    
    public static Connection getConexion(){
    
        if(connection == null){
            
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                // Establece la conexion con la base de datos
                connection = DriverManager.getConnection(URL+DB+"?useLegacyDatetimeCode=false&serverTimezone=UTC"+
                        "&user="+USUARIO+"&password="+PASSWORD);
            } catch (ClassNotFoundException ex) {
               JOptionPane.showMessageDialog(null, "Error al cargar los Drivers "+ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD "+ex.getMessage());
            }
            
            
        }
        
        return connection;
    }
}
