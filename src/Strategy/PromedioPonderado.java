package Strategy;

import java.util.ArrayList;

public class PromedioPonderado implements CalculoNota {
    @Override
    public double calcular(ArrayList<Integer> notas) {
        if (notas.size() != 3) {
            throw new IllegalArgumentException("Se necesitan exactamente 3 notas para el promedio ponderado.");
        }
        // Supongamos que los pesos son 30%, 30% y 40%
        return (notas.get(0) * 0.3) + (notas.get(1) * 0.3) + (notas.get(2) * 0.4);
    }
}