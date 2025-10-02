package Strategy;

import java.util.ArrayList;

public class ExamenExtr implements CalculoNota{
    @Override
    public double calcular(ArrayList<Integer> notas) {
        if (notas.size() < 2) {
            throw new IllegalArgumentException("Se necesitan al menos 2 notas para incluir el examen extra.");
        }
        // La última nota es el examen extra y vale el 50%
        double sumaNotasParciales = 0;
        for (int i = 0; i < notas.size() - 1; i++) {
            sumaNotasParciales += notas.get(i);
        }
        double promedioParciales = sumaNotasParciales / (notas.size() - 1);
        return (promedioParciales * 0.5) + (notas.get(notas.size() - 1) * 0.5);
    }
}
