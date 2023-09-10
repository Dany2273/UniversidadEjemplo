
package UniversidadEjemplo;

import accesoADatos.AlumnoData;
import accesoADatos.Conexion;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import java.sql.Connection;
import java.time.LocalDate;


public class UniversidadEJemplo {


    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.getConexion();//--->Llamamos al metodo de la clase para establecer la conexion
        
//      Materia materia = new Materia("Lengua Y Literatura", 2, true);
//      Materia materia = new Materia(2, "Inglés", 1, true);
      MateriaData mat = new MateriaData();
//      mat.guardarMateria(materia);
      
//        Materia materiaEncontrada = mat.buscarMateria(2);
//        
//        if(materiaEncontrada != null){
//            System.out.println("Nombre: "+materiaEncontrada.getNombre());
//            System.out.println("Año Materia: "+materiaEncontrada.getAñoMateria());
//        }
//       mat.modificarMateria(materia);
   //      mat.eliminarMateria(2);
   
        for(Materia materias:mat.listarMaterias()){
            System.out.println("Nombre: "+materias.getNombre());
            System.out.println("Año Materia: "+materias.getAñoMateria());
            System.out.println("----------------------");
        }
   
    }
    
}
