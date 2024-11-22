// Patron Estructural - Adapter
public interface ServicioReservaExterno {
    void hacerReserva();
}

class AdaptadorSistemaExterno implements ServicioReserva {
    private ServicioReservaExterno servicioExterno;

    public AdaptadorSistemaExterno(ServicioReservaExterno servicioExterno) {
        this.servicioExterno = servicioExterno;
    }

    public void reservar() {
        servicioExterno.hacerReserva();
    }
}
