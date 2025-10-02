package Observer;

public class AlumnoObserver implements Observador{
    private String nombre;

    public AlumnoObserver(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String mensaje) {
        System.out.println(nombre + ", has recibido una notificación: " + mensaje);
    }
}
