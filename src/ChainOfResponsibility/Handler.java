package ChainOfResponsibility;

public interface Handler {
    void setNext(Handler next);   // enlaza con el siguiente
    void handle(Solicitud solicitud); // maneja la solicitud
}
