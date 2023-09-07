
package accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "universidadulp";
    private static final String USUARIO = "root";
    private static String PASSWORD = "";
    
    private static Connection connection;
    
    //metodo constructor
    
    private Conexion(){}
    
    public static Connection getConexion(){ //--->Devuelve un objeto de tipo Connection
    
        if(connection == null){ //---> Continuamos solo si es la primera vez que establecemos una conexion
            
            try {
                Class.forName("org.mariadb.jdbc.Driver");//---> Cargamos los Drivers de conexion
                connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);//--->Establecemos la conexion a la base de datos
                
                JOptionPane.showMessageDialog(null, "Conexion Exitosa!");
                
            } catch (ClassNotFoundException ex) {
               JOptionPane.showMessageDialog(null, "Error al cargar los Drivers "+ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD "+ex.getMessage());
            }
            
            
        }
        
        return connection;
    }
}
