package Meditor;

public interface ChatMediador {
    void enviar(String msg, Usuario usuario);
    void agregarUsuario(Usuario usuario);
}
