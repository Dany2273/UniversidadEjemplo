
package UniversidadEjemplo;

import accesoADatos.AlumnoData;
import accesoADatos.Conexion;
import accesoADatos.InscripcionData;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.Connection;
import java.time.LocalDate;
import vistas.MenuPrincipal;


public class UniversidadEJemplo {


    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.getConexion();//--->Llamamos al metodo de la clase para establecer la conexion
        
        Alumno alumno0 = new Alumno(12345678, "Perez", "Juan", LocalDate.of(2000, 5, 15),true);
        Alumno alumno1 = new Alumno(23456789, "Gomez", "Maria", LocalDate.of(1999, 8, 20), true);
        Alumno alumno2 = new Alumno(34567890, "Lopez", "Carlos", LocalDate.of(2001, 2, 10), true);
        Alumno alumno3 = new Alumno(45678901, "Rodriguez", "Laura", LocalDate.of(2003, 11, 25), true);
        Alumno alumno4 = new Alumno(56789012, "Martinez", "Pedro", LocalDate.of(2000, 4, 5), true);
        Alumno alumno5 = new Alumno(67890123, "Fernandez", "Ana", LocalDate.of(2002, 7, 30), true);
        Alumno alumno6 = new Alumno(78901234, "Sanchez", "Luis", LocalDate.of(1999, 12, 12), true);
        Alumno alumno7 = new Alumno(89012345, "Gonzalez", "Sofia", LocalDate.of(2004, 9, 8), true);
        Alumno alumno8 = new Alumno(90123456, "Lara", "Diego", LocalDate.of(2001, 6, 18), true);
        Alumno alumno9 = new Alumno(12345670, "Mendoza", "Elena", LocalDate.of(2003, 3, 3), true);
        
        AlumnoData alu = new AlumnoData();
        
        alu.guardarAlumno(alumno0);
        alu.guardarAlumno(alumno1);
        alu.guardarAlumno(alumno2);
        alu.guardarAlumno(alumno3);
        alu.guardarAlumno(alumno4);
        alu.guardarAlumno(alumno5);
        alu.guardarAlumno(alumno6);
        alu.guardarAlumno(alumno7);
        alu.guardarAlumno(alumno8);
        alu.guardarAlumno(alumno9);
        
        
        
        
        
    }
    
}
