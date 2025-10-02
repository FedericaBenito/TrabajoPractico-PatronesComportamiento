package Meditor;

import java.util.ArrayList;

public class ChatRoom implements ChatMediador {
    private ArrayList<Usuario> usuarios;

    public ChatRoom() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void enviar(String msg, Usuario usuario) {
        for (Usuario u : this.usuarios) {
            // El mensaje no se envía al remitente
            if (u != usuario) {
                u.recibir(msg);
            }
        }
    }
}
