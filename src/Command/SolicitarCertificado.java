package Command;

public class SolicitarCertificado implements Command{
    private Alumno alumno;
    private String curso;

    public SolicitarCertificado (Alumno alumno, String curso) {
        this.alumno = alumno;
        this.curso = curso;
    }

    @Override
    public void execute() {
        alumno.solicitarCertificado(curso);
    }
}
