// Representa una reserva
import java.util.List;

public class Reserva {
    private String nombreCliente;
    private List<String> servicios;

    public Reserva(String nombreCliente, List<String> servicios) {
        this.nombreCliente = nombreCliente;
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", servicios=" + servicios +
                '}';
    }
}
