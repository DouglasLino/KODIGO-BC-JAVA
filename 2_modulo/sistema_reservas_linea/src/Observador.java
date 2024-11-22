// Patron de comportamiento - observer
// Notificacion a usuarios

import java.util.ArrayList;
import java.util.List;

public interface Observador {
    void actualizar(String mensaje);
}

class Usuario implements Observador {
    public void actualizar(String mensaje) {
        System.out.println("Notificación: " + mensaje);
    }
}

class NotificadorReservas {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificar(String mensaje) {
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }
}
