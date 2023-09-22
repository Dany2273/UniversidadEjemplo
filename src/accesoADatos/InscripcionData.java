package accesoADatos;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection con = null;

    private MateriaData matData = null;

    private AlumnoData aluData = null;

    public InscripcionData() {
        con = Conexion.getConexion();
        matData = new MateriaData();
        aluData = new AlumnoData();
    }

    public void guardarInscripcion(Inscripcion insc) {

        String sql = "INSERT INTO inscripcion(idAlumno, idMateria, nota) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            
            ps.setInt(1, insc.getAlum().getIdAlumno());
            ps.setInt(2, insc.getMat().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripción guardada correctamente.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }

    }

    public List<Inscripcion> obtenerInscripciones() {
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion";
        Inscripcion ins = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ins=new Inscripcion();
                
                ins.setIdInscripcion(rs.getInt("idInscripto"));            //  _
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));    //   |--->Recupero los datos
                Materia mat = matData.buscarMateria(rs.getInt("idMateria")); //  _|
                
                ins.setAlum(alu);                //  -|
                ins.setMat(mat);                 //  _|--->Seteo alumno y materia
                ins.setNota(rs.getDouble("nota")); 
                
                inscripciones.add(ins);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }

        return inscripciones;
    }

    
    
    
      public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
         ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
      
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
              Inscripcion ins=new Inscripcion();
                
                ins.setIdInscripcion(rs.getInt("idInscripto"));            //  _
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));    //   |--->Recupero los datos
                Materia mat = matData.buscarMateria(rs.getInt("idMateria")); //  _|
                
                ins.setAlum(alu);                //  -|
                ins.setMat(mat);                 //  _|--->Seteo alumno y materia
                ins.setNota(rs.getDouble("nota"));
               ;
                
                inscripciones.add(ins);
               
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }

        return inscripciones;

    }
    
    

    public List<Materia> obtenerMateriasCursadas(int id) {//Se ingresa el Id de alumno
        List<Materia> materias = new ArrayList<>();
        
        String sql =  "SELECT  inscripcion.idMateria,  nombre,  añoMateria  FROM  inscripcion  JOIN  materia"
                + " ON(inscripcion.idMateria=materia.idMateria) WHERE inscripcion.idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while(rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAñoMateria(rs.getInt("añoMateria"));
                materias.add(materia);
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        
        return materias;

    }
 
    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList<>();
        
        String sql = "SELECT  inscripcion.idAlumno,dni, apellido, nombre, fechaNacimiento  "
                + "FROM  inscripcion  JOIN  alumno"
                + " ON(inscripcion.idAlumno=alumno.idAlumno) WHERE inscripcion.idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            
            Alumno alumno;
            while(rs.next()){
                alumno=new Alumno();
                
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
                
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return alumnos;
    }

    public List<Materia> obtenerMateriasNoCursadas(int id) {
        List<Materia> materias = new ArrayList<>();
        
        String sql =  "SELECT * FROM materia "
                + "WHERE estado = 1 AND idMateria NOT IN(SELECT idMateria "
                + "FROM inscripcion WHERE idAlumno = ?)"; //---->Se hace una subconsulta
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while(rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAñoMateria(rs.getInt("añoMateria"));
                materias.add(materia);
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        
        return materias;

    }

    public void borrarInscripcionesMateriaAlumno(int idAlumno, int idMateria) {
        
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "Inscripción eliminada con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nota actualizada correctamente.");
        }
        
    }

    
    
    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "Nota actualizada correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla Inscripcion");
        }
        
        
    }

}
