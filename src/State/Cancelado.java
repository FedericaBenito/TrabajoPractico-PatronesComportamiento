package State;

public class Cancelado implements EstadoInscripcion{
    @Override
    public void cambiarEstado(Inscripcion inscripcion) {
        System.out.println("No se puede cambiar el estado de una inscripción cancelada.");
    }
}
