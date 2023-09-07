
package entidades;


public class inscripcion {
    
    private int idInscripcion;
    private alumno alum;
    private materia mat;
    private double nota;

    public inscripcion() {
    }

    public inscripcion(int idInscripcion, alumno alum, materia mat, double nota) {
        this.idInscripcion = idInscripcion;
        this.alum = alum;
        this.mat = mat;
        this.nota = nota;
    }

    public inscripcion(alumno alum, materia mat, double nota) {
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

    public alumno getAlum() {
        return alum;
    }

    public void setAlum(alumno alum) {
        this.alum = alum;
    }

    public materia getMat() {
        return mat;
    }

    public void setMat(materia mat) {
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
