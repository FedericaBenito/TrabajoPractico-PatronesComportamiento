package Visitor;

public class AlumnitoRegular implements Alumnito {
    private String nombre;
    private double cuotaMensual;

    public AlumnitoRegular(String nombre, double cuotaMensual) {
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    @Override
    public void aceptar(Visitante visitor) {
        visitor.visitar(this);
    }
}
