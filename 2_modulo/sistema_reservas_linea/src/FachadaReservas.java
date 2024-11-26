// Patron Estructural - Facade

/*
Función: Actúa como una fachada para simplificar la interacción con el sistema de reservas, ocultando la complejidad interna.
Responsabilidades:
* Controla las reservas y las almacena.
* Ofrece un método realizarReserva que recibe los detalles de la reserva y los almacena.
* Tiene un método mostrarReservas para mostrar todas las reservas realizadas, junto con información de si tienen seguro o no.
 */

import java.util.List;

public class FachadaReservas {
    public void realizarReserva(String nombreCliente, String telefono, List<String> servicios, boolean tieneSeguro) {
        // Crear una reserva a través del Builder
        ConstructorReserva constructor = new ConstructorReserva();
        for (String servicio : servicios) {
            constructor.agregarServicio(servicio);
        }
        Reserva reserva = constructor.establecerNombreCliente(nombreCliente)
                .establecerTelefono(telefono)
                .establecerSeguro(tieneSeguro)
                .construir();

        System.out.println("Reserva creada: " + reserva);
    }

    public void mostrarReservas() {
        List<Reserva> reservas = GestorReservas.obtenerInstancia().obtenerReservas();
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }
}
