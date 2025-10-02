package ChainOfResponsibility;

public class Profesor implements Handler{
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Solicitud solicitud) {
        if (solicitud.getTipo().equalsIgnoreCase("intermedia")) {
            System.out.println("Profesor atiende la solicitud: " + solicitud.getDescripcion());
        } else {
            System.out.println("Profesor deriva la solicitud...");
            if (next != null) {
                next.handle(solicitud);
            }
        }
    }
}
