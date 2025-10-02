package Strategy;

import java.util.ArrayList;

public class EstrategiaAlumno {
    private String nombre;
    private CalculoNota estrategia;

    public EstrategiaAlumno(String nombre, CalculoNota estrategia) {
        this.nombre = nombre;
        this.estrategia = estrategia;
    }

    public void setEstrategia(CalculoNota estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularNotaFinal(ArrayList<Integer> notas) {
        return estrategia.calcular(notas);
    }

    public String getNombre() {
        return nombre;
    }
}
