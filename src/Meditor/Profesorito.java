package Meditor;

public class Profesorito extends Usuario{
    public Profesorito(ChatMediador mediator, String nombre) {
        super(mediator, nombre);
        mediator.agregarUsuario(this);
    }

    @Override
    public void enviar(String msg) {
        System.out.println(this.nombre + " (Profesor) envía: " + msg);
        mediator.enviar(msg, this);
    }

    @Override
    public void recibir(String msg) {
        System.out.println(this.nombre + " (Profesor) recibe: " + msg);
    }
}
