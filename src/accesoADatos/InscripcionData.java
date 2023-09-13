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

        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlum().getIdAlumno());
            ps.setInt(3, insc.getMat().getIdMateria());
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

        String sql = "SELECT idInscripto, nota, idAlumno, idMateria FROM inscripcion";
        Inscripcion ins = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ins=new Inscripcion();
                ps.setInt(1, ins.getIdInscripcion());
                ps.setDouble(2, ins.getNota());
                ps.setInt(3, ins.getAlum().getIdAlumno());
                ps.setInt(4, ins.getMat().getIdMateria());

                inscripciones.add(ins);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
        }

        return inscripciones;
    }

    
    
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();

        String sql = "SELECT idInscripto, nota, idMateria FROM inscripcion WHERE idAlumno = ?";
        Inscripcion ins = null;
        Alumno alumno = null;
        Materia materia = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                alumno=new Alumno();
                materia = new Materia();
                ins = new Inscripcion();
                
                aluData = new AlumnoData();
                matData = new MateriaData();
                
                alumno = aluData.buscarAlumno(id);
                materia = matData.buscarMateria(rs.getInt("idMateria"));//Aca puede estar el problema
                 
                ins.setIdInscripcion(rs.getInt("idInscripto"));
                ins.setAlum(alumno);
                ins.setMat(materia);
                ins.setNota(rs.getDouble("nota"));
               
                inscripciones.add(ins);
            }
            ps.close();
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

    public void borrarInscripcionesMateriaAlumno(int idAlumno, int idMateria) {
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
    }

}
