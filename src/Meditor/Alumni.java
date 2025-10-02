package Meditor;

public class Alumni extends Usuario{
    public Alumni(ChatMediador mediator, String nombre) {
        super(mediator, nombre);
        mediator.agregarUsuario(this);
    }

    @Override
    public void enviar(String msg) {
        System.out.println(this.nombre + " (Alumno) envía: " + msg);
        mediator.enviar(msg, this);
    }

    @Override
    public void recibir(String msg) {
        System.out.println(this.nombre + " (Alumno) recibe: " + msg);
    }
}
