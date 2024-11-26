/*
Funcion:
* gestionar el ciclo de vida de las reveras,permitiendo agregar nuevas reservas y recuperar la lista completa de reservas registradas en el sistema.

Responsabilidad:
* Garantizar que solo haya una instancia de GestorReservas mediante el patrón Singleton.
* Proveer acceso centralizado a todas las reservas del sistema, tanto para agregar nuevas reservas como para obtener las existentes.
 */

import java.util.ArrayList;
import java.util.List;

public class GestorReservas {
    private static GestorReservas instancia;
    private List<Reserva> reservas;

    // Constructor privado para evitar instanciación directa
    private GestorReservas() {
        reservas = new ArrayList<>();
    }

    // Método para obtener la única instancia de la clase
    public static GestorReservas obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorReservas();
        }
        return instancia;
    }

    // Método para agregar una reserva al registro
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    // Método para obtener todas las reservas registradas
    public List<Reserva> obtenerReservas() {
        return reservas;
    }
}
