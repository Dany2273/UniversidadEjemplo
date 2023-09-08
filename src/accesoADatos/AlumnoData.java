package accesoADatos;

import entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection con = null;// Este objeto lo van a usar todos los metodos

    public AlumnoData() {
        //Constructor necesario para inicialiar la vaiable con
        //No recibe nada por parametro
        con = Conexion.getConexion();
    } 
    
    
    
    public void guardarAlumno(Alumno alumno) { //Acá vamos a hacer un insert en la tabla alumnos   
    
        //Establecemos la sentencia insert como en mysql
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES (? ,? ,? ,? ,?)";
        /*En este caso, como los datos que van en el insert los recibo del alumno que viene por parametro,
        lo que hacemos es poner caracteres comodines "?" que luego van a ser reemplazados por los 
        datos que corresponden*/
       
        try {
            //Generamos el objeto PreparedStatement para enviar la sentencia
            
            PreparedStatement ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            /*Ademas de la sentencia SQL, pero además, como vamos a hacr un INSERT, le pedimos que nos 
            devuelva la lista con las claves generadas ID*/
            
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));/*Tengo que transformar el localDate a un Date pero 
                                                             del paquete java.sql */
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            
           ResultSet rs = ps.getGeneratedKeys();
           //Devuelve una tabla de una sola columna con el ID generado y tantas filas como alumnos se hayan generado. 
                                                                   
           //Como solo ingresamos 1 alumno, recorremos con un if, de lo contrario utilizamos un while
           if(rs.next()){
               alumno.setIdAlumno(rs.getInt(1));//Seteamos el ID de alumno
               
               JOptionPane.showMessageDialog(null, "Alumno guardado correctamente.");
               //Generamos un mje de comprobacion, pero antes creamos un alumno en el main del proyecto
           }
           ps.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }

    public int buscarAlumno(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int buscarAlumnoPorDni(int dni) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Alumno> listarAlumnos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void modificarAlumno(Alumno alumno) {//Recibe por parametro un alumno ya existente en la BD
      
        String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?,fechaNacimiento = ? "
                +"WHERE idAlumno = ?";
        //Nuevamente como los datos se recibe por parametros, utilizamos un caracter comodin
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            
            int exito = ps.executeUpdate();//Como la sentencia devuelve un entero creamos una variable tipo Int
            
            if(exito==1){
                
                JOptionPane.showMessageDialog(null, "Alumno modificado con exito.");
                
                /*Guardamos los cambios y ejecutamos desde el main*/
                
            }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }

    public void eliminarAlumno(int id) {//Solo vamos a hacer un eliminado logico, o sea, cambiar estado a 0.
        //Recibimos por parametro el id del alumno que va a ser eliminado
        
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
           int exito = ps.executeUpdate();//Como la sentencia devuelve un entero creamos una variable tipo Int
            
            if(exito==1){
                
                JOptionPane.showMessageDialog(null, "Alumno eliminado con exito.");
                
                /*Guardamos los cambios y ejecutamos desde el main*/
                
            }
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
    }
}
