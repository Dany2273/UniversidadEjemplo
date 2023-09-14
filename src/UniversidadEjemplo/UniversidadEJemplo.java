
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
import java.util.ArrayList;
import vistas.MenuPrincipal;


public class UniversidadEJemplo {


    public static void main(String[] args) {
        // TODO code application logic here
//        Connection con = Conexion.getConexion();//--->Llamamos al metodo de la clase para establecer la conexion
        
//        Alumno alum = new Alumno(30892114, "Martinez", "Julian", LocalDate.of(2010, 10, 22), true);
//        System.out.println(alum.getIdAlumno());
//        
//        AlumnoData aData = new AlumnoData();
//        aData.guardarAlumno(alum);
// -----------------------------------------------------------------------------------------------------       
//        MateriaData mData = new MateriaData();
//        
//        Materia mat = new Materia("Matematica 2", 1, true);
//        mData.guardarMateria(mat);
//        System.out.println(mat.getIdMateria());
//        
//        Inscripcion insc = new Inscripcion(alum, mat, 7);
//        System.out.println(insc.getAlum().getIdAlumno());
//        System.out.println(insc.getMat().getIdMateria());
//        
//        InscripcionData ins = new InscripcionData();
//        
//        ins.guardarInscripcion(insc);
//-----------------------------------------------------------------------------------------------------------
//        InscripcionData iData = new InscripcionData();
 
//       for(Inscripcion ins:iData.obtenerInscripcionesPorAlumno(7)){
//           
//           if(ins.getMat().getNombre()!=null){
//               System.out.println("Alumno: "+ins.getAlum().getNombre());
//               System.out.println("Materia: "+ins.getMat().getNombre());
//               System.out.println("Nota: "+ins.getNota());
//           }
//       }
// -----------------------------------------------------------------------------------------------------------
//      
//      InscripcionData data = new InscripcionData();
//      
//      for(Materia ins : data.obtenerMateriasNoCursadas(7)){
//          
//          System.out.println("Materia: "+ins.getNombre());
//          System.out.println("Año: "+ins.getAñoMateria());
//      }
//
//----------------------------------------------------------------------------------------------------------------
        
//        AlumnoData ad = new  AlumnoData();
//        MateriaData md = new MateriaData();
        InscripcionData id = new InscripcionData();
//        
//        Alumno juan = ad.buscarAlumno(3);
//        Materia mate = md.buscarMateria(12);
//        Inscripcion insc = new Inscripcion(juan, mate, 7);
//        
////        id.guardarInscripcion(insc);
//
//        id.actualizarNota(3, 12, 10);

//          id.borrarInscripcionesMateriaAlumno(3, 12);

//          for(Inscripcion i:id.obtenerInscripciones()){
//              System.out.println(i.getAlum().getApellido());
//              System.out.println(i.getMat().getNombre());
//              System.out.println(i.getNota());
//          }
            
//            for(Inscripcion i:id.obtenerInscripcionesPorAlumno(7)){
//                System.out.println(i.getIdInscripcion());
//                System.out.println(i.getAlum().getApellido());
//                System.out.println(i.getMat().getNombre());
//            }
            
             for(Alumno a:id.obtenerAlumnosXMateria(8)){
                System.out.println(a.getNombre());
                System.out.println(a.getApellido());
                System.out.println(a.getFechaNac());
            }
   }    
}
