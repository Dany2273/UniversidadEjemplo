package accesoADatos;

import entidades.Alumno;
import java.sql.Connection;
import java.util.List;

public class AlumnoData {

    private Connection con;

    public AlumnoData() {
    }

    public Alumno guardarAlumno(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet.");
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

    public Alumno modificarAlumno(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int eliminarAluno(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
