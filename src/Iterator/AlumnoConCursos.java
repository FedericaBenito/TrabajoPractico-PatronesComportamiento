package Iterator;

import java.util.ArrayList;

public class AlumnoConCursos {
    private String nombre;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public AlumnoConCursos(String nombre) {
        this.nombre = nombre;
    }

    public void inscribirse(Curso curso) {
        cursos.add(curso);
        System.out.println(nombre + " se inscribió en: " + curso.getNombre());
    }

    public IteratorCurso getIterator() {
        return new CursoIterator(cursos);
    }
}
