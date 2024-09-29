class ListaEnlazadaSimple {
    Nodo cabeza;

    public ListaEnlazadaSimple() {
        cabeza = null;
    }

//    Metodo para agregar un nodo al inicio de la lista
    public void agregarInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);  // Crear el nuevo nodo
        nuevoNodo.siguiente = cabeza;     // Hacer que apunte al nodo cabeza actual
        cabeza = nuevoNodo;               // Actualizar cabeza para que apunte al nuevo nodo
    }

    // Metodo para agregar un nodo al final de la lista
    public void agregarFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Metodo para eliminar el nodo al inicio de la lista
    public void eliminarInicio() {
        if (cabeza == null) {
            System.out.println("La lista está vacía, no se puede eliminar.");
        } else {
            cabeza = cabeza.siguiente;  // Mover la referencia de cabeza al siguiente nodo
        }
    }

    // Metodo para eliminar el nodo al final de la lista
    public void eliminarFinal() {
        if (cabeza == null) {
            System.out.println("La lista está vacía, no se puede eliminar.");
        } else if (cabeza.siguiente == null) {
            // Solo hay un nodo en la lista
            cabeza = null;  // Eliminar el único nodo
        } else {
            Nodo temp = cabeza;
            // Recorrer la lista hasta encontrar el penúltimo nodo
            while (temp.siguiente.siguiente != null) {
                temp = temp.siguiente;
            }
            // El penúltimo nodo ahora apunta a null, eliminando el último nodo
            temp.siguiente = null;
        }
    }

    // Metodo para buscar un valor en la lista
    public boolean buscarValor(int valor) {
        Nodo temp = cabeza;
        while (temp != null) { // si la cabeza es igual a null, llegamos al final de la lista
            if (temp.dato == valor) {
                return true;  // Se encontró el valor
            }
            temp = temp.siguiente;  // Mover al siguiente nodo
        }
        return false;  // Si llegamos al final, el valor no está en la lista
    }

    // Método para imprimir la lista
    public void mostrar() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
}
