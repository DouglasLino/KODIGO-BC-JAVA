package busqueda;

public class Binaria {

    public static void main(String[] args) {
        System.gc();  // Intenta forzar la recolección de basura después de liberar referencias
        // Configuramos los tamaños del arreglo para el benchmark
        int[] tamanios = {1000, 10000, 100000, 500000}; // Tamaños de los arreglos

        // Realizamos el benchmark para cada tamaño de arreglo
        System.out.println("======== BENCHMARK Busqueda Binaria --- MEJOR CASO");
        for (int tamanio : tamanios) {
            // Creamos un arreglo de tamaño variable
            int[] arreglo = generarArregloMejorCaso(tamanio);

            // Escogemos un valor a buscar (primer valor para el mejor caso)
            int valorBuscado = arreglo[0]; // Mejor caso: el valor buscado es el primero


            // Medimos el tiempo de inicio
            long inicio = System.nanoTime();

            // Ejecutamos la búsqueda binaria
            busquedaBinaria(arreglo, valorBuscado);

            // Medimos el tiempo de finalización
            long fin = System.nanoTime();

            // Calculamos el tiempo transcurrido en nanosegundos
            long tiempo = (fin - inicio);

            // Mostramos los resultados
            System.out.println("Tamaño del arreglo: " + tamanio + " - Tiempo de búsqueda: " + tiempo + " ns.   Valor que buscamos: " + valorBuscado);
        }

        // Realizamos el benchmark para cada tamaño de arreglo

        System.gc();  // Intenta forzar la recolección de basura después de liberar referencias
        System.out.println("\n======== BENCHMARK Busqueda Binaria --- PROMEDIO Y PEOR CASO");
        for (int tamanio : tamanios) {
            // Creamos un arreglo de tamaño variable
            int[] arreglo = generarArregloPromedioCasePeorCaso(tamanio);

            // Escogemos un valor a buscar (último valor )
            int valorBuscado = arreglo[arreglo.length - 1];

            // Medimos el tiempo de inicio
            long inicio = System.nanoTime();

            // Ejecutamos la búsqueda binaria
            busquedaBinaria(arreglo, valorBuscado);

            // Medimos el tiempo de finalización
            long fin = System.nanoTime();

            // Calculamos el tiempo transcurrido en nanosegundos
            long tiempo = (fin - inicio);

            // Mostramos los resultados
            System.out.println("Tamaño del arreglo: " + tamanio + " - Tiempo de búsqueda: " + tiempo + " ns.   Valor que buscamos: " + valorBuscado);
        }
    }



    // Método que implementa la búsqueda binaria
    public static int busquedaBinaria(int[] arreglo, int clave) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arreglo[medio] == clave) {
                return medio; // Elemento encontrado
            }
            // Si el valor buscado es mayor, ignorar la mitad izquierda
            if (arreglo[medio] < clave) {
                inicio = medio + 1; // Buscar en la mitad derecha
            } else {
                fin = medio - 1; // Buscar en la mitad izquierda
            }
        }

        return -1; // Elemento no encontrado
    }
//    Mejor de los casos:
//    Cuando el valor que buscamos se encuentra en la primera iteracion
//    este es de grado O(1)
// Método para generar un arreglo ordenado ascendentemente
public static int[] generarArregloMejorCaso(int tamano) {
    int[] arreglo = new int[tamano];
    for (int i = 0; i < tamano; i++) {
        arreglo[i] = i; // Generamos el arreglo en orden ascendente
    }
    return arreglo;
}

//Promedio y Peor de los casos:
    //    Promedio Caso:Cuando el valor que buscamos no esta en la posicion central y debe de hacer varias iteraciones
    //   Peor caso: Cuando el valor que buscamos se encuentra hasta el final de la iteracion
//    Ambos son grado O(log n)
    // Método para generar un arreglo ordenado con números consecutivos
    public static int[] generarArregloPromedioCasePeorCaso(int size) {
        int[] arreglo = new int[size];
        for (int i = 0; i < size; i++) {
            arreglo[i] = i + 1; // Generamos números consecutivos desde 1
        }
        // Aseguramos que el último valor es el que vamos a buscar (peor caso)
        arreglo[arreglo.length - 1] = size + 1; // Un valor seguro que no esté en el array

        return arreglo;
    }
}
