// Patron de comportamiento - Command
// Solicitudes de reserva

public interface Comando {
    void ejecutar();
}

class ComandoReserva implements Comando {
    private ServicioReserva servicio;

    public ComandoReserva(ServicioReserva servicio) {
        this.servicio = servicio;
    }

    public void ejecutar() {
        servicio.reservar();
    }
}
