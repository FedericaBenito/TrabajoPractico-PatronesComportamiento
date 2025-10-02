package Memento;

import java.util.HashMap;
import java.util.Map;

public class Memento {
    private Map<Integer, String> respuestas;

    public Memento(Map<Integer, String> respuestas) {
        this.respuestas = new HashMap<>(respuestas);
    }

    public Map<Integer, String> getRespuestas() {
        return new HashMap<>(respuestas);
    }
}

