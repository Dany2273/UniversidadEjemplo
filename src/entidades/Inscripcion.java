
package entidades;


public class Inscripcion {
    
    private int idInscripcion;
    private Alumno alum;
    private Materia mat;
    private double nota;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, Alumno alum, Materia mat, double nota) {
        this.idInscripcion = idInscripcion;
        this.alum = alum;
        this.mat = mat;
        this.nota = nota;
    }

    public Inscripcion(Alumno alum, Materia mat, double nota) {
        this.alum = alum;
        this.mat = mat;
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlum() {
        return alum;
    }

    public void setAlum(Alumno alum) {
        this.alum = alum;
    }

    public Materia getMat() {
        return mat;
    }

    public void setMat(Materia mat) {
        this.mat = mat;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String insc = idInscripcion+ " "+alum.getApellido()+", "+alum.getNombre()+", "+mat.getNombre();
        return insc;
    }
    
}
