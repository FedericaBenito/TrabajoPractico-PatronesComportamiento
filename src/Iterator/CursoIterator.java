package Iterator;

import java.util.ArrayList;
import java.util.List;

public class CursoIterator implements IteratorCurso{
    private List<Curso> cursos;
    private int posicion = 0;

    public CursoIterator(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public boolean hasNext() {
        return posicion < cursos.size();
    }

    @Override
    public Curso next() {
        return cursos.get(posicion++);
    }
}
