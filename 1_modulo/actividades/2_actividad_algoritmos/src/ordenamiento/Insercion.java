package ordenamiento;

public class Insercion {

        // Método main idéntico a los anteriores para el benchmark
    public static void main(String[] args) {
        // Configuramos los tamaños del arreglo para el benchmark
        int[] tamanios = {1000, 10000, 500000 }; // Tamaños de los arreglos (el de 1 millón puede tardar mucho en el peor caso)

        // Realizamos el benchmark para cada tamaño de arreglo
        System.out.println("======== BENCHMARK Ordenamiento por Inserción (Mejor Caso)");
        for (int tamanio : tamanios) {
            // Creamos un arreglo de tamaño variable
            int[] arreglo = generarArregloAscendentemente(tamanio);

            // Medimos el tiempo de inicio
            long inicio = System.nanoTime();

            // Ejecutamos el ordenamiento por inserción
            ordenamientoPorInsercion(arreglo);

            // Medimos el tiempo de finalización
            long fin = System.nanoTime();

            // Calculamos el tiempo transcurrido en nanosegundos ya que en el arreglo 1000000 se toma su tiempo
            long tiempo = (fin - inicio) ;

            // Mostramos los resultados
            System.out.println("Tamaño del arreglo: " + tamanio + " - Tiempo de ordenamiento: " + tiempo + " ns");
        }

        // Realizamos el benchmark para cada tamaño de arreglo
        System.out.println("\n======== BENCHMARK Ordenamiento por Inserción (Promedio y Peor Caso)");
        for (int tamanio : tamanios) {
            // Creamos un arreglo de tamaño variable
            int[] arreglo = generarArregloDescendente(tamanio);

            // Medimos el tiempo de inicio
            long inicio = System.nanoTime();

            // Ejecutamos el ordenamiento por inserción
            ordenamientoPorInsercion(arreglo);

            // Medimos el tiempo de finalización
            long fin = System.nanoTime();

            // Calculamos el tiempo transcurrido en nanosegundos ya que en el arreglo 1000000 se toma su tiempo
            long tiempo = (fin - inicio);

            // Mostramos los resultados
            System.out.println("Tamaño del arreglo: " + tamanio + " - Tiempo de ordenamiento: " + tiempo + " ns");
        }
    }

    //    Mejor de los casos:
//    Cuando el arreglo ya esta ordenado y solo lo recorre 1 vez
//    este es de grado O(n)

    // Método para generar un arreglo ordenado ascendentemente
    public static int[] generarArregloAscendentemente(int size) {
        int[] arreglo = new int[size];
        for (int i = 0; i < size; i++) {
            arreglo[i] = i; // Generamos el arreglo en orden ascendente
        }
        return arreglo;
    }

//    Peor de los casos:
//    Cuando el arreglo esta ordenado descendente
//    este es de grado O(n^2)

    // Método para generar un arreglo desordenado en orden descendente (peor caso)
    public static int[] generarArregloDescendente(int size) {
        int[] arreglo = new int[size];
        for (int i = 0; i < size; i++) {
            arreglo[i] = size - i; // Generamos el arreglo en orden descendente
        }
        return arreglo;
    }

    // Método que implementa el ordenamiento por inserción
    public static void ordenamientoPorInsercion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int clave = arreglo[i];
            int j = i - 1;

            // Desplazar los elementos que son mayores que la clave a una posición adelante de su posición actual
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = clave;
        }
    }
}

