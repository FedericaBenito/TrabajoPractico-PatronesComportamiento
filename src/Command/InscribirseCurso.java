package Command;

public class InscribirseCurso implements Command{
    private Alumno alumno;
    private String curso;

    public InscribirseCurso(Alumno alumno, String curso) {
        this.alumno = alumno;
        this.curso = curso;
    }

    @Override
    public void execute() {
        alumno.inscribirseCurso(curso);
    }
}
