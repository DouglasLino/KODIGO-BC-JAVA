public class Main {
    public static void main(String[] args) {
        // Crear una lista enlazada
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        // Agregar nodos al inicio
        System.out.println("Agregando nodos al inicio:");
        lista.agregarInicio(10);
        lista.agregarInicio(20);
        lista.agregarInicio(30);
        lista.mostrar(); // Debe imprimir: 30 -> 20 -> 10 -> null

        // Agregar nodos al final
        System.out.println("\nAgregando nodos al final:");
        lista.agregarFinal(40);
        lista.agregarFinal(50);
        lista.mostrar(); // Debe imprimir: 30 -> 20 -> 10 -> 40 -> 50 -> null

        // Eliminar nodo al inicio
        System.out.println("\nEliminando el nodo al inicio:");
        lista.eliminarInicio();
        lista.mostrar(); // Debe imprimir: 20 -> 10 -> 40 -> 50 -> null

        // Eliminar nodo al final
        System.out.println("\nEliminando el nodo al final:");
        lista.eliminarFinal();
        lista.mostrar(); // Debe imprimir: 20 -> 10 -> 40 -> null

        // Buscar un valor en la lista
        System.out.println("\nBuscando valores:");
        System.out.println("¿Está el valor 10 en la lista? " + (lista.buscarValor(10) ? "Sí" : "No")); // Debe imprimir: Sí
        System.out.println("¿Está el valor 50 en la lista? " + (lista.buscarValor(50) ? "Sí" : "No")); // Debe imprimir: No

        // Eliminar todos los nodos de la lista
        System.out.println("\nEliminando todos los nodos:");
        lista.eliminarInicio(); // Eliminar 20
        lista.eliminarInicio(); // Eliminar 10
        lista.eliminarInicio(); // Eliminar 40
        lista.mostrar(); // Debe imprimir: null

        // Intentar eliminar de una lista vacía
        System.out.println("\nIntentando eliminar de una lista vacía:");
        lista.eliminarFinal(); // Debe imprimir un mensaje de lista vacía
    }
}
