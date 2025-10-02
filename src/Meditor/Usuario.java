package Meditor;

public abstract class Usuario {
    protected ChatMediador mediator;
    protected String nombre;

    public Usuario(ChatMediador mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public abstract void enviar(String msg);
    public abstract void recibir(String msg);
}
