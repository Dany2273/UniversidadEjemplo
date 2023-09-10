package accesoADatos;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection con=null;

    private MateriaData matData=null;

    private AlumnoData aluData=null;

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {
        
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria)"
                + "   VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setDouble(1, insc.getNota());
            ps.setInt(2,insc.getAlum().getIdAlumno());
            ps.setInt(3, insc.getMat().getIdMateria());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripción guardada correctamente.");
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
        
        
    }

    public List<Inscripcion> obtenerInscripciones() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
         List<Materia> materias = new ArrayList<Materia>();
        return null;
         
         
         
    }

    public List<Materia> obtenerMateriasNoCursadas(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void borrarInscripcionesMateriaAlumno(int idAlumno, int idMateria) {
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
