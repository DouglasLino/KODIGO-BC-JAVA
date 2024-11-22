public class ListaEnlazadaSimple {
Nodo cabeza = null;

    void  insertarAlInicio (int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    void eliminarAlInicio(){
        //Comprueba si no hay un valor en la cabezera
        if(cabeza == null){
            System.out.println("La cabeza de la lista esta vacia");
        //de no haberlo el valor siguiente será la cabezera borrando el actual
        }else{
            Nodo nuevo = cabeza;
            cabeza = nuevo.siguiente;
            System.out.println("Dato borrado...");
        }
    }
//recorre toda la lista y muestra cada dato hasta no quedar ninguno
    void mostrarLista(){
        Nodo actual = cabeza;
        int posicion = 1;
        //comprueba que la lista no este vacía, si no hay cabezera, no hay lista
        if(cabeza == null){
            System.out.println("La lista esta vacia");
        }else {
            while (actual != null) {
                System.out.println(posicion + ". "+ actual.dato);
                actual = actual.siguiente;
                posicion++;
            }
        }
    }

//Recorre toda la lista hasta encontrar el dato
    void busquedaLista(int dato){
        Nodo actual = cabeza;
        int posicion = 1;

        while (actual.dato != dato && actual.siguiente != null) {
            posicion++;
            actual = actual.siguiente;
        }
        //Si no existe siguiente dato y el actual no coincide entonces ya recorrio toda la lista sin encontrarlo
        if(actual.siguiente == null && actual.dato != dato){
            System.out.println("Dato no encontrado");
        }else{
            System.out.println("Dato: " + actual.dato + " En posicion: " + posicion);
        }
    }

    void insertarCualquierPosicion(int dato, int posicionBuscada){
        Nodo nuevo = new Nodo(dato);
        int posicionActual = 1;

        //La posicion 1 es el inicio de la lista por lo que para acceder se usa la función de insertar
        if(posicionBuscada == 1){
            insertarAlInicio(dato);
            return;
        }
        //Va a la cabeza de la lista para empezar a recorrerla
        Nodo actual = cabeza;

        //recorre la lista hasta estar una posicion antes de la buscada
        while (actual != null && posicionActual < posicionBuscada - 1) {
            actual = actual.siguiente;
            posicionActual++;
        }

        if (actual == null){
            System.out.println("Posicion inexistente");
            return;
        }

        nuevo.siguiente = actual.siguiente;
        actual.siguiente = nuevo;

    }



}
