package ChainOfResponsibility;

public class Solicitud {
    private String tipo;
    private String descripcion;

    public Solicitud(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
