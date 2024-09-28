# Implementación y Análisis de Algoritmos de Búsqueda y Ordenamiento en Java

## Integrantes
* Cesia Mariena Alfaro Hernández
* Rodrigo Aldair Lopez Pereira
* César Elmer Vanegas Mejía
* Katya Yanira González de Olivares
* Douglas Alfredo Lino Henriquez
* Alejandro Orellana Reyes

# Instrucciones para ejecutar el proyecto

Sigue los pasos a continuación para descargar y ejecutar este proyecto:

### 1. Clona el repositorio

Utiliza el siguiente comando para clonar este repositorio en tu máquina local:

```bash
git clone https://github.com/DouglasLino/KODIGO-BC-JAVA/tree/main
```

### 2. Abre el proyecto en IntelliJ
1. Abre IntelliJ IDEA.
2. Haz clic en File > Open....
3. Navega a la carpeta donde clonaste el repositorio y selecciona la carpeta del proyecto.
4. Contiene las siguientes estructura de clases que contienen las pruebas y se ejecutan individualmente cada una.

```plaintext
├── busqueda
│   ├── Binaria.java
│   └── Secuencial.java
└── ordenamiento
    ├── Burbuja.java
    ├── Insercion.java
    └── Seleccion.java
```

5. Para ejecutar cada prueba, selecciona la clase y haz clic en el botón RUN.

Por ejemplo, al ejeuctar la clase "Binaria.java" muestra el siguiente resultado:
```plaintext
======== BENCHMARK Busqueda Binaria --- MEJOR CASO
Tamaño del arreglo: 1000 - Tiempo de búsqueda: 1584 ns.   Valor que buscamos: 0
Tamaño del arreglo: 10000 - Tiempo de búsqueda: 1041 ns.   Valor que buscamos: 0
Tamaño del arreglo: 100000 - Tiempo de búsqueda: 1312 ns.   Valor que buscamos: 0
Tamaño del arreglo: 500000 - Tiempo de búsqueda: 1335 ns.   Valor que buscamos: 0

======== BENCHMARK Busqueda Binaria --- PROMEDIO Y PEOR CASO
Tamaño del arreglo: 1000 - Tiempo de búsqueda: 948 ns.   Valor que buscamos: 1001
Tamaño del arreglo: 10000 - Tiempo de búsqueda: 927 ns.   Valor que buscamos: 10001
Tamaño del arreglo: 100000 - Tiempo de búsqueda: 1065 ns.   Valor que buscamos: 100001
Tamaño del arreglo: 500000 - Tiempo de búsqueda: 2699 ns.   Valor que buscamos: 500001

Process finished with exit code 0
```