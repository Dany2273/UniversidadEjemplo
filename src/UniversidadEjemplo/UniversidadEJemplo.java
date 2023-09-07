
package UniversidadEjemplo;

import accesoADatos.Conexion;
import java.sql.Connection;


public class UniversidadEJemplo {


    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.getConexion();//--->Llamamos al metodo de la clase
    }
    
}
