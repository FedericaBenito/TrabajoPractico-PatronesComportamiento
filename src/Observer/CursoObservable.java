package Observer;
import java.util.ArrayList;

public class CursoObservable {
    private ArrayList<Observador> observadores;
    private String nombreCurso;

    public CursoObservable(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.observadores = new ArrayList<>();
    }

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String mensaje) {
        System.out.println("\nNotificando a los alumnos del curso " + nombreCurso + ":");
        for (Observador observador : observadores) {
            observador.update(mensaje);
        }
    }

    public void cambiarHorario(String nuevoHorario) {
        String mensaje = "El horario del curso " + nombreCurso + " ha cambiado a: " + nuevoHorario;
        notificarObservadores(mensaje);
    }

    public void nuevoAviso(String aviso) {
        String mensaje = "Nuevo aviso para el curso " + nombreCurso + ": " + aviso;
        notificarObservadores(mensaje);
    }
}
