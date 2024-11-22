// Patron creacional - Factory method
public interface ServicioReserva {
    void reservar();
}

class ReservaHotel implements ServicioReserva {
    public void reservar() {
        System.out.println("Hotel reservado exitosamente.");
    }
}

class ReservaVuelo implements ServicioReserva {
    public void reservar() {
        System.out.println("Vuelo reservado exitosamente.");
    }
}

class FabricaServiciosReserva {
    public static ServicioReserva crearServicio(String tipo) {
        return switch (tipo) {
            case "hotel" -> new ReservaHotel();
            case "vuelo" -> new ReservaVuelo();
            default -> throw new IllegalArgumentException("Tipo de servicio desconocido.");
        };
    }
}
