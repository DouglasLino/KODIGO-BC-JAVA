// Patron Estructural - Decorator
public abstract class DecoradorReserva implements ServicioReserva {
    protected ServicioReserva servicioDecorado;

    public DecoradorReserva(ServicioReserva servicio) {
        this.servicioDecorado = servicio;
    }

    public void reservar() {
        servicioDecorado.reservar();
    }
}

class SeguroDecorador extends DecoradorReserva {
    public SeguroDecorador(ServicioReserva servicio) {
        super(servicio);
    }

    public void reservar() {
        super.reservar();
        System.out.println("Seguro añadido a la reserva.");
    }
}
