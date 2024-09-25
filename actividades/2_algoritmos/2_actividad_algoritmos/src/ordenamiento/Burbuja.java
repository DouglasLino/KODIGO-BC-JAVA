package ordenamiento;

public class Burbuja {



    // Método main idéntico al de búsqueda secuencial y binaria
    public static void main(String[] args) {
        // Configuramos los tamaños del arreglo para el benchmark
        int[] tamanios = {1000, 10000, 100000, 1000000}; // Tamaños de los arreglos

        // Realizamos el benchmark para cada tamaño de arreglo
        System.out.println("======== BENCHMARK Ordenamiento Burbuja --- MEJOR DE LOS CASOS");
        for (int tamanio : tamanios) {
            // Creamos un arreglo de tamaño variable
            int[] arreglo = generarArregloMejorCaso(tamanio);

            // Medimos el tiempo de inicio
            long inicio = System.nanoTime();

            // Ejecutamos el ordenamiento burbuja
            ordenamientoBurbuja(arreglo);

            // Medimos el tiempo de finalización
            long fin = System.nanoTime();

            // Calculamos el tiempo transcurrido en nanosegundos
            long tiempo = (fin - inicio);

            // Mostramos los resultados
            System.out.println("Tamaño del arreglo: " + tamanio + " - Tiempo de ordenamiento: " + tiempo + " ns");
        }

        // Realizamos el benchmark para cada tamaño de arreglo
        System.out.println("\n======== BENCHMARK Ordenamiento Burbuja --- PEOR DE LOS CASOS");
        for (int tamanio : tamanios) {
            // Creamos un arreglo de tamaño variable
            int[] arreglo = generarArregloPromedioCasoPeorCaso(tamanio);

            // Medimos el tiempo de inicio
            long inicio = System.nanoTime();

            // Ejecutamos el ordenamiento burbuja
            ordenamientoBurbuja(arreglo);

            // Medimos el tiempo de finalización
            long fin = System.nanoTime();

            // Calculamos el tiempo transcurrido en milisegundos ya que en el arreglo 1000000 se toma su tiempo
            long tiempo = (fin - inicio) / 1000000;

            // Mostramos los resultados
            System.out.println("Tamaño del arreglo: " + tamanio + " - Tiempo de ordenamiento: " + tiempo + " ms");
        }
    }



    // Método que implementa el ordenamiento burbuja
    public static void ordenamientoBurbuja(int[] arreglo) {
        boolean intercambio;
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false; // Reseteamos la bandera para cada pasada

            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiamos los elementos si no están en el orden correcto
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true; // Marcamos que hubo un intercambio
                }
            }

            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!intercambio) {
                break;
            }
        }
    }

    //    Mejor de los casos:
//    Cuando el arreglo ya esta ordenado y solo lo recorre 1 vez
//    este es de grado O(n)

    // Método para generar un arreglo ordenado ascendentemente
    public static int[] generarArregloMejorCaso(int size) {
        int[] arreglo = new int[size];
        for (int i = 0; i < size; i++) {
            arreglo[i] = i; // Generamos el arreglo en orden ascendente
        }
        return arreglo;
    }



// Peor de los casos:

//    Promedio y Peor caso:
    // Método para generar un arreglo desordenado con números consecutivos
//    Ambos es de grado O(N^2)
    public static int[] generarArregloPromedioCasoPeorCaso(int size) {
        int[] arreglo = new int[size];
        for (int i = 0; i < size; i++) {
            // Generamos un arreglo en orden descendente para maximizar el tiempo de intercambios (peor de los casos)
            arreglo[i] = size - i;
        }
        return arreglo;
    }
}
