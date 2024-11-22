import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        Scanner sc = new Scanner(System.in);
        int opcion, dato, posicion;

        lista.insertarAlInicio(47);
        lista.insertarAlInicio(2);
        lista.insertarAlInicio(23);

        do{
            System.out.println("Lista Enlazada\nOpciones: ");
            System.out.println("1) Insertar dato en cabecera");
            System.out.println("2) Mostrar todos los datos");
            System.out.println("3) Buscar posicion de un dato");
            System.out.println("4) Borrar dato en cabecera");
            System.out.println("5) Insertar dato en una posicion especifica");
            System.out.println("6) Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Insertar dato de cabecera");
                    dato = sc.nextInt(); lista.insertarAlInicio(dato); break;
                case 2:
                    lista.mostrarLista(); break;
                case 3:
                    System.out.println("Inserte el valor que busca: ");
                    dato = sc.nextInt(); lista.busquedaLista(dato); break;
                case 4:
                    lista.eliminarAlInicio(); break;
                case 5:
                    System.out.println("Inserte el valor que desea insertar: ");
                    dato = sc.nextInt();
                    System.out.println("Inserte la posición en la que desea insertarlo: ");
                    posicion = sc.nextInt();
                    lista.insertarCualquierPosicion(dato, posicion); break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while (opcion != 6);

    }
}
