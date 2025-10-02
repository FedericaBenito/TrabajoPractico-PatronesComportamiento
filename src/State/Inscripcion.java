package State;

public class Inscripcion {
    private EstadoInscripcion estado;
    private String nombreAlumno;
    private String nombreCurso;

    public Inscripcion(String nombreAlumno, String nombreCurso) {
        this.nombreAlumno = nombreAlumno;
        this.nombreCurso = nombreCurso;
        this.estado = new EnEspera(); // Estado inicial
    }

    public void setEstado(EstadoInscripcion estado) {
        this.estado = estado;
    }

    public void cambiarEstado() {
        estado.cambiarEstado(this);
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }
}

