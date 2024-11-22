// Patron creacional - Builder

import java.util.ArrayList;
import java.util.List;

public class ConstructorReserva {
    private String nombreCliente;
    private List<String> servicios = new ArrayList<>();

    public ConstructorReserva establecerNombreCliente(String nombre) {
        this.nombreCliente = nombre;
        return this;
    }

    public ConstructorReserva agregarServicio(String servicio) {
        this.servicios.add(servicio);
        return this;
    }

    public Reserva construir() {
        return new Reserva(nombreCliente, servicios);
    }
}
