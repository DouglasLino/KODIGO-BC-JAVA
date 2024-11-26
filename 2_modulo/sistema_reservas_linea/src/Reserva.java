/*
Función: Representa una reserva realizada por un cliente.
Responsabilidades:
* Almacena los datos de la reserva, como el cliente (nombre, apellido, teléfono), los servicios seleccionados y si tiene seguro.
* Proporciona un método para mostrar los detalles de la reserva.
 */


import java.util.List;

public class Reserva {
    private String nombreCliente;
    private String telefono;
    private List<String> servicios;
    private boolean tieneSeguro; // Nuevo campo

    public Reserva(String nombreCliente, String telefono, List<String> servicios, boolean tieneSeguro) {
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        this.servicios = servicios;
        this.tieneSeguro = tieneSeguro;
    }

    public void setTieneSeguro(boolean tieneSeguro) {
        this.tieneSeguro = tieneSeguro;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", telefono='" + telefono + '\'' +
                ", servicios=" + servicios +
                ", tieneSeguro=" + (tieneSeguro ? "Sí" : "No") +
                '}';
    }
}

