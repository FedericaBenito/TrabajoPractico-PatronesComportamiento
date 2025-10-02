package Memento;

import java.util.HashMap;
import java.util.Map;

public class Examen {
    private Map<Integer, String> respuestas;

    public Examen() {
        this.respuestas = new HashMap<>();
    }

    public void responderPregunta(int numeroPregunta, String respuesta) {
        respuestas.put(numeroPregunta, respuesta);
        System.out.println("Respuesta guardada para la pregunta " + numeroPregunta + ": " + respuesta);
    }

    public Memento save() {
        System.out.println("Guardando progreso del examen...");
        return new Memento(respuestas);
    }

    public void restore(Memento memento) {
        this.respuestas = memento.getRespuestas();
        System.out.println("Progreso del examen restaurado.");
    }

    public void mostrarRespuestas() {
        System.out.println("Respuestas actuales:");
        for (Map.Entry<Integer, String> entry : respuestas.entrySet()) {
            System.out.println("Pregunta " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
