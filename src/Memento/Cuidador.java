package Memento;

import java.util.ArrayList;
import java.util.List;

public class Cuidador {
    private ArrayList<Memento> mementos;

    public Cuidador() {
        this.mementos = new ArrayList<>();
    }

    public void agregarMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento obtenerMemento(int indice) {
        return mementos.get(indice);
    }
}

