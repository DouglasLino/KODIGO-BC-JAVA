/*
Función: Es el punto de entrada principal del programa, donde el usuario interactúa con el sistema a través de un menú.
Responsabilidades:
* Muestra el menú para seleccionar opciones.
* Captura los datos del cliente (nombre, apellido, teléfono).
* Permite al usuario seleccionar los servicios que desea reservar (hotel, vuelo).
* Valida la selección de servicios y la adición de seguros.
* Llama a las clases correspondientes para realizar las reservas y mostrar las reservas existentes.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//    Punto de entrada principal del programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FachadaReservas fachada = new FachadaReservas();

        System.out.println("Bienvenido al sistema de reservas.");

        while (true) {
            System.out.println("\nMenú principal:");
            System.out.println("1. Ingresar nueva reserva");
            System.out.println("2. Mostrar todas las reservas existentes");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");

            String opcion_menu = scanner.nextLine();

            switch (opcion_menu) {
                case "1":
                    // Capturar datos del cliente
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese el apellido del cliente: ");
                    String apellido = scanner.nextLine();

                    // Validar teléfono (solo números)
                    String telefono = "";
                    while (true) {
                        System.out.print("Ingrese el teléfono del cliente (solo números): ");
                        telefono = scanner.nextLine();

                        // Verificar si el teléfono solo contiene números
                        if (telefono.matches("[0-9]+")) {
                            break; // Teléfono válido, salir del bucle
                        } else {
                            System.out.println("El teléfono solo puede contener números. Intente nuevamente.");
                        }
                    }

                    // Servicios disponibles
                    List<String> serviciosDisponibles = new ArrayList<>(List.of("hotel", "vuelo"));
                    List<String> serviciosSeleccionados = new ArrayList<>();

                    // Selección de servicios
                    while (true) {
                        System.out.println("Seleccione un tipo de servicio:");
                        for (int i = 0; i < serviciosDisponibles.size(); i++) {
                            if (!serviciosSeleccionados.contains(serviciosDisponibles.get(i))) {
                                System.out.println((i + 1) + ": " + serviciosDisponibles.get(i));
                            }
                        }
                        System.out.println("0: Finalizar selección");

                        String entrada = scanner.nextLine();

                        if (entrada.equals("0")) {
                            if (serviciosSeleccionados.isEmpty()) {
                                System.out.println("Debe seleccionar al menos un servicio.");
                            } else {
                                break; // Finalizar selección
                            }
                        } else {
                            try {
                                int opcion = Integer.parseInt(entrada);
                                if (opcion > 0 && opcion <= serviciosDisponibles.size()) {
                                    String servicio = serviciosDisponibles.get(opcion - 1);
                                    if (serviciosSeleccionados.contains(servicio)) {
                                        System.out.println("El servicio '" + servicio + "' ya ha sido seleccionado.");
                                    } else {
                                        serviciosSeleccionados.add(servicio);
                                        System.out.println("Servicio '" + servicio + "' añadido.");
                                        // Si ya se seleccionaron todos los servicios disponibles, finalizar automáticamente
                                        if (serviciosSeleccionados.size() == serviciosDisponibles.size()) {
                                            System.out.println("Todos los servicios disponibles han sido seleccionados.");
                                            break;
                                        }
                                    }
                                } else {
                                    System.out.println("Opción inválida. Por favor seleccione un número válido.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Entrada inválida. Por favor ingrese un número.");
                            }
                        }
                    }

                    // Validar la respuesta para el seguro
                    boolean tieneSeguro = false;
                    while (true) {
                        System.out.println("¿Desea añadir seguro? (si/no): ");
                        String respuesta = scanner.nextLine().toLowerCase();

                        if (respuesta.equals("si")) {
                            tieneSeguro = true;
                            break;
                        } else if (respuesta.equals("no")) {
                            tieneSeguro = false;
                            break;
                        } else {
                            System.out.println("Entrada inválida. Por favor ingrese 'si' o 'no'.");
                        }
                    }

                    // Crear la reserva
                    fachada.realizarReserva(nombre + " " + apellido, telefono, serviciosSeleccionados, tieneSeguro);
                    break;



                case "2":
                    // Mostrar todas las reservas existentes
                    System.out.println("\nMostrando todas las reservas existentes:");
                    fachada.mostrarReservas();
                    break;

                case "3":
                    // Salir del programa
                    System.out.println("Gracias por usar el sistema de reservas. ¡Hasta luego!");
                    return;

                default:
                    System.out.println("Opción inválida. Por favor ingrese '1', '2' o '3'.");
                    break;
            }
        }
    }
}
