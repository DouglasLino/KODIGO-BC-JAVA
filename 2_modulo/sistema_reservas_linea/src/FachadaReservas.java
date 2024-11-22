// Patron Estructural - Facade
public class FachadaReservas {
    public void realizarReserva(String tipoServicio) {
        ServicioReserva servicio = FabricaServiciosReserva.crearServicio(tipoServicio);
        servicio.reservar();
    }
}
