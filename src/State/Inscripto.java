package State;

public class Inscripto implements EstadoInscripcion{
    @Override
    public void cambiarEstado(Inscripcion inscripcion) {
        System.out.println("El alumno ya está inscrito en el curso.");
    }
}
