package State;

public class EnEspera implements EstadoInscripcion {
    @Override
    public void cambiarEstado(Inscripcion inscripcion) {
        System.out.println("Cambiando estado de 'En espera' a 'Inscrito'.");
        inscripcion.setEstado(new Inscripto());
    }
}
