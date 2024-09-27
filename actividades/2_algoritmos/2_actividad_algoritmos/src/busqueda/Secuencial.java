package busqueda;

import java.util.Random;

public class Secuencial {


    public static void main(String[] args) {
        System.gc();  // Intenta forzar la recolección de basura después de liberar referencias

        // Configuramos los tamaños del arreglo para el benchmark
        int[] tamanios = {1000, 10000, 100000, 500000}; // Tamaños de los arreglos

        // Realizamos el benchmark para cada tamaño de arreglo
        System.out.println("======== BENCHMARK Busqueda Secuencial --- MEJOR CASO");
        for (int tamanio : tamanios) {
            // Creamos un arreglo de tamaño variable
            int[] arreglo = generarArregloMejorCaso(tamanio);

            // Escogemos un valor a buscar (primer valor para el mejor caso)
            int valorBuscado = arreglo[0]; // Mejor caso: el valor buscado es el primero


            // Medimos el tiempo de inicio
            long inicio = System.nanoTime();

            // Ejecutamos la búsqueda secuencial
            busquedaSecuencial(arreglo, valorBuscado);

            // Medimos el tiempo de finalización
            long fin = System.nanoTime();

            // Calculamos el tiempo transcurrido en nanosegundos
            long tiempo = (fin - inicio) ;

            // Mostramos los resultados
            System.out.println("Tamaño del arreglo: " + tamanio + " - Tiempo de búsqueda: " + tiempo + " ns.   Valor que buscamos: " + valorBuscado);
        }

        // Realizamos el benchmark para cada tamaño de arreglo
        System.out.println("\n======== BENCHMARK Busqueda Secuencial ---- PROMEDIO Y PEOR CASO");
        for (int tamanio : tamanios) {
            // Creamos un arreglo de tamaño variable
            int[] arreglo = generarArregloPromedioCasoPeorCaso(tamanio);

            // Escogemos un valor a buscar (último valor para el peor caso)
            int valorBuscado = arreglo[arreglo.length - 1];

            // Medimos el tiempo de inicio
            long inicio = System.nanoTime();

            // Ejecutamos la búsqueda secuencial
            busquedaSecuencial(arreglo, valorBuscado);

            // Medimos el tiempo de finalización
            long fin = System.nanoTime();

            // Calculamos el tiempo transcurrido en nanosegundos
            long tiempo = (fin - inicio) ;

            // Mostramos los resultados
            System.out.println("Tamaño del arreglo: " + tamanio + " - Tiempo de búsqueda: " + tiempo + " ns.   Valor que buscamos: " + valorBuscado);
        }
    }

    // Método para realizar la búsqueda secuencial
    public static int busquedaSecuencial(int[] arreglo, int clave) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == clave) {
                return i;
            }
        }
        return -1;
    }

    //    Mejor de los casos:
//    Cuando el valor que buscamos se encuentra en la primera iteracion
//    este es de grado O(1)

// Método para generar un arreglo ordenado ascendentemente
    public static int[] generarArregloMejorCaso(int size) {
        int[] arreglo = new int[size];
        for (int i = 0; i < size; i++) {
            arreglo[i] = i; // Generamos el arreglo en orden ascendente
        }
        return arreglo;
    }

    //Promedio y Peor de los casos:
//    Promedio y peor Caso:Cuando el valor que buscamos no esta en la posicion central y debe de hacer varias iteraciones
    // Método para generar un arreglo de tamaño dado con números aleatorios
//    Ambos son grado O(N)
    public static int[] generarArregloPromedioCasoPeorCaso(int size) {
        Random random = new Random();
        int[] arreglo = new int[size];

        // Llenamos el arreglo con números aleatorios
        for (int i = 0; i < size; i++) {
            arreglo[i] = random.nextInt(size); // Números aleatorios entre 0 y tamanio
        }

        // Aseguramos que el último valor es el que vamos a buscar (peor caso)
        arreglo[arreglo.length - 1] = size + 1; // Un valor seguro que no esté en el array

        return arreglo;
    }
}
