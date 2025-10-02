package Visitor;

public class AplicarBeca implements Visitante{
    @Override
    public void visitar(AlumnitoRegular alumno) {
        // Aplicar un descuento del 10% a alumnos regulares
        double cuotaConDescuento = alumno.getCuotaMensual() * 0.9;
        System.out.println("Alumno Regular: " + alumno.getNombre());
        System.out.println("Cuota mensual original: $" + alumno.getCuotaMensual());
        System.out.println("Cuota con descuento del 10%: $" + cuotaConDescuento);
    }

    @Override
    public void visitar(AlumnitoBecado alumno) {
        // Aplicar la beca al alumno becado
        double cuotaConBeca = alumno.getCuotaMensual() * (1 - alumno.getPorcentajeBeca() / 100);
        System.out.println("Alumno Becado: " + alumno.getNombre());
        System.out.println("Cuota mensual original: $" + alumno.getCuotaMensual());
        System.out.println("Cuota con beca del " + alumno.getPorcentajeBeca() + "%: $" + cuotaConBeca);
    }
}
