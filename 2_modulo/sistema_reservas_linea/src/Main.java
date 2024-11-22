import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FachadaReservas fachada = new FachadaReservas();

        System.out.println("Bienvenido al sistema de reservas.");
        System.out.println("Seleccione el tipo de servicio (hotel/vuelo): ");
        String tipo = scanner.nextLine();

        fachada.realizarReserva(tipo);

        System.out.println("¿Desea añadir seguro? (sí/no): ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("sí")) {
            ServicioReserva servicio = new SeguroDecorador(
                    FabricaServiciosReserva.crearServicio(tipo)
            );
            servicio.reservar();
        }
    }
}