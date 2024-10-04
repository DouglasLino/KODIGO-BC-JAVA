# Implementación de una Lista Enlazada Simple en Java

## Integrantes

- Cesia Mariena Alfaro Hernández
- Rodrigo Aldair Lopez Pereira
- César Elmer Vanegas Mejía
- Katya Yanira González de Olivares
- Douglas Alfredo Lino Henriquez
- Alejandro Orellana Reyes

# Instrucciones para ejecutar el proyecto

Sigue los pasos a continuación para descargar y ejecutar este proyecto:

### 1. Clonar el repositorio

Utiliza el siguiente comando para clonar este repositorio en tu máquina local:

```bash
git clone https://github.com/DouglasLino/KODIGO-BC-JAVA/tree/main
```

### 2. Abrir el proyecto en IntelliJ

1. Abre IntelliJ IDEA.
2. Haz clic en File > Open....
3. Navega a la carpeta donde se ha clonado el repositorio y selecciona la carpeta del proyecto.
4. Allí estarán las clases que hacen funcionar la lista, en la clase Main se ejecuta el menu para acceder a cada una de las funciones.

```plaintext
├── ListaEnlazadaSimple.java
├── Main.java
└── Nodo.java
```

5. Para ejecutar el programa, selecciona la clase Main y haz clic en el botón RUN.

Al ejecutar el proyecto mostrará un menu donde se podrá interactuar con las diversas funciones, las cuales son:

- Insertar dato en cabecera
- Mostrar todos los datos
- Buscar posicion de un dato
- Borrar dato en cabecera
- Insertar dato en una posicion especifica
- Salir

Para acceder a cada función tendrás que ingresar el número correpondiente a dicha función, en el siguiente ejemplo se muestra el funcionamiento de cada una de las funciones (el programa viene con 3 datos pre-insertados, 23, 2 y  47).

Ejemplo de uso, donde se añadirá un "5" en el inicio de la lista y se mostra como esta la tabla actualemente, despues se buscara el valor "2" 
en la tabla, seguido de hará uso de la función de Borrar para borrar el valor que está al inicio y despues se insertará un valor de "7" en la
3ª posición de la tabla para finalmente mostrar toda la tabla con los cambios y finalizar el programa.  
```plaintext
Lista Enlazada
Opciones: 
1) Insertar dato en cabecera
2) Mostrar todos los datos
3) Buscar posicion de un dato
4) Borrar dato en cabecera
5) Insertar dato en una posicion especifica
6) Salir
in 1
Insertar dato de cabecera
in 5

Lista Enlazada
Opciones: 
1) Insertar dato en cabecera
2) Mostrar todos los datos
3) Buscar posicion de un dato
4) Borrar dato en cabecera
5) Insertar dato en una posicion especifica
6) Salir
in 2
1. 5
2. 23
3. 2
4. 47

Lista Enlazada
Opciones: 
1) Insertar dato en cabecera
2) Mostrar todos los datos
3) Buscar posicion de un dato
4) Borrar dato en cabecera
5) Insertar dato en una posicion especifica
6) Salir
in 3
Inserte el valor que busca: 
in 2
Dato: 2 En posicion: 3

Lista Enlazada
Opciones: 
1) Insertar dato en cabecera
2) Mostrar todos los datos
3) Buscar posicion de un dato
4) Borrar dato en cabecera
5) Insertar dato en una posicion especifica
6) Salir
in 4
Dato borrado...

Lista Enlazada
Opciones: 
1) Insertar dato en cabecera
2) Mostrar todos los datos
3) Buscar posicion de un dato
4) Borrar dato en cabecera
5) Insertar dato en una posicion especifica
6) Salir
in 5
Inserte el valor que desea insertar: 
in 7
Inserte la posición en la que desea insertarlo: 
in 3

Lista Enlazada
Opciones: 
1) Insertar dato en cabecera
2) Mostrar todos los datos
3) Buscar posicion de un dato
4) Borrar dato en cabecera
5) Insertar dato en una posicion especifica
6) Salir
in 2
1. 23
2. 2
3. 7
4. 47

Lista Enlazada
Opciones: 
1) Insertar dato en cabecera
2) Mostrar todos los datos
3) Buscar posicion de un dato
4) Borrar dato en cabecera
5) Insertar dato en una posicion especifica
6) Salir
in 6
Saliendo del programa...
```