package Command;

public class AbandonarCurso implements Command{
    private Alumno alumno;
    private String curso;

    public AbandonarCurso(Alumno alumno, String curso) {
        this.alumno = alumno;
        this.curso = curso;
    }

    @Override
    public void execute() {
        alumno.abandonarCurso(curso);
    }
}
