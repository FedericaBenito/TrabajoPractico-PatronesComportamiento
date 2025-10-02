package ChainOfResponsibility;

public class Asistente implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Solicitud solicitud) {
        if (solicitud.getTipo().equalsIgnoreCase("basica")) {
            System.out.println("Asistente atiende la solicitud: " + solicitud.getDescripcion());
        } else {
            System.out.println("Asistente deriva la solicitud...");
            if (next != null) {
                next.handle(solicitud);
            }
        }
    }
}
