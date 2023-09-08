package accesoADatos;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.Connection;
import java.util.List;

public class InscripcionData {

    private Connection con;

    private MateriaData matData;

    private AlumnoData aluData;

    public InscripcionData() {
    }

    public void guardarInscripcion(Inscripcion insc) {
    }

    public List<Inscripcion> obtenerInscripciones() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
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
