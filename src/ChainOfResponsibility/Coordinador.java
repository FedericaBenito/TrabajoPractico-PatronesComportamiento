package ChainOfResponsibility;

public class Coordinador implements Handler{
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next; // no se usará, ya que es el último
    }

    @Override
    public void handle(Solicitud solicitud) {
        // Coordinador se hace cargo de lo que nadie resolvió
        System.out.println("Coordinador atiende la solicitud: " + solicitud.getDescripcion());
    }
}
