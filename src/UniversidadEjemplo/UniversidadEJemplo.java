
package UniversidadEjemplo;

import accesoADatos.AlumnoData;
import accesoADatos.Conexion;
import entidades.Alumno;
import java.sql.Connection;
import java.time.LocalDate;


public class UniversidadEJemplo {


    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.getConexion();//--->Llamamos al metodo de la clase para establecer la conexion
        
        //Alumno juan = new Alumno(1,41901122, "Perez", "Juan Pedro", LocalDate.of(1998, 9, 10), true);
        
        /*Para guardar el Alumno creado en la base de datos debo crear un AlumnoData, que es 
        quien me va a permitir operar con la tabla alumnos*/
        AlumnoData alu = new AlumnoData();
        
        //alu.guardarAlumno(juan);
        
        /*Para modficar los datos se crea un alumno con el constructor que contiene
        el idAlumno, y se modifica algun dato, este caso se agrego Pedro al nombre*/
        //alu.modificarAlumno(juan);
        
       /*Para eliminar un alumno, invocamos el metodo eliminar y
        pasamos por parametro el id correspondiente al alumno*/
       //alu.eliminarAlumno(1);
       
       /*Para buscar un alumno creamos una variable alumno donde guardamos los
       datos del alumno encontrado*/
//       Alumno alumnoEncontrado = alu.buscarAlumno(4);
//        if(alumnoEncontrado != null){//Con el if evitamos caer en el NullPointerException
//          System.out.println("dni: "+alumnoEncontrado.getDni());
//        System.out.println("apellido: "+alumnoEncontrado.getApellido());
//        System.out.println("nombre: "+alumnoEncontrado.getNombre());  
//        }
            
          Alumno alumnoEncontrado = alu.buscarAlumnoPorDni(41901122);
            
        if(alumnoEncontrado!=null){
            System.out.println("nombre: "+alumnoEncontrado.getNombre());
            System.out.println("apellido: "+alumnoEncontrado.getApellido());
        }
       
    }
    
}
