package ordenamiento;

public class Seleccion {

    // Método main idéntico a los anteriores para el benchmark
    public static void main(String[] args) {
        // Configuramos los tamaños del arreglo para el benchmark
        int[] tamanios = {1000, 10000, 100000}; // Tamaños de los arreglos (el de 1 millón podría tardar mucho en el peor caso)

        // Realizamos el benchmark para cada tamaño de arreglo
        System.out.println("======== BENCHMARK Ordenamiento por Selección --- Arreglo ascendente (Mejor caso)");
        for (int tamanio : tamanios) {
            // Creamos un arreglo de tamaño variable
            int[] arreglo = generarArregloAscendentemente(tamanio);

            // Medimos el tiempo de inicio
            long inicio = System.nanoTime();

            // Ejecutamos el ordenamiento por selección
            ordenamientoPorSeleccion(arreglo);

            // Medimos el tiempo de finalización
            long fin = System.nanoTime();

            // Calculamos el tiempo transcurrido en milisegundos ya que en el arreglo 1000000 se toma su tiempo
            long tiempo = (fin - inicio) / 1000000;

            // Mostramos los resultados
            System.out.println("Tamaño del arreglo: " + tamanio + " - Tiempo de ordenamiento: " + tiempo + " ms");
        }

        // Realizamos el benchmark para cada tamaño de arreglo
        System.out.println("======== BENCHMARK Ordenamiento por Selección ---- Arreglo descendente (Peor caso)");
        for (int tamanio : tamanios) {
            // Creamos un arreglo de tamaño variable
            int[] arreglo = generarArregloDescendente(tamanio);

            // Medimos el tiempo de inicio
            long inicio = System.nanoTime();

            // Ejecutamos el ordenamiento por selección
            ordenamientoPorSeleccion(arreglo);

            // Medimos el tiempo de finalización
            long fin = System.nanoTime();

            // Calculamos el tiempo transcurrido en milisegundos ya que en el arreglo 1000000 se toma su tiempo
            long tiempo = (fin - inicio) / 1000000;

            // Mostramos los resultados
            System.out.println("Tamaño del arreglo: " + tamanio + " - Tiempo de ordenamiento: " + tiempo + " ms");
        }
    }


//    En este caso, dado la naturaleza del algoritmo, no beneficia que este ordenado
//    el arreglo
//    Tiempo de ejecucion es O(n^2)
    // Método para generar un arreglo ordenado ascendentemente

    public static int[] generarArregloAscendentemente(int size) {
        int[] arreglo = new int[size];
        for (int i = 0; i < size; i++) {
            arreglo[i] = i; // Generamos el arreglo en orden ascendente
        }
        return arreglo;
    }

//    En este caso, dado la naturaleza del algoritmo, no beneficia que este ordenado
//    el arreglo, pero si complica mas el tiempo de ejecucion.
//    Tiempo de ejecucion es O(n^2)

    // Método para generar un arreglo desordenado en orden descendente
    public static int[] generarArregloDescendente(int tamano) {
        int[] arreglo = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = tamano - i; // Generamos el arreglo en orden descendente
        }
        return arreglo;
    }

    // Método que implementa el ordenamiento por selección
    public static void ordenamientoPorSeleccion(int[] arreglo) {
        int n = arreglo.length;

        // Recorremos todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del menor elemento en el resto del arreglo
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIdx]) {
                    minIdx = j;
                }
            }

            // Intercambiar el menor elemento con el primer elemento desordenado
            int temp = arreglo[minIdx];
            arreglo[minIdx] = arreglo[i];
            arreglo[i] = temp;
        }
    }
}
