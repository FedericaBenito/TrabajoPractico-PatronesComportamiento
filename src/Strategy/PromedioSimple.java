package Strategy;

import java.util.ArrayList;

public class PromedioSimple implements CalculoNota {
    @Override
    public double calcular(ArrayList<Integer> notas) {
        double suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
}
