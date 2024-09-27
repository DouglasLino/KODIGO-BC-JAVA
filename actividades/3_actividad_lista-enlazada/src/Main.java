//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        lista.agregarFinal(10);
        lista.agregarFinal(20);
        lista.agregarFinal(30);

        lista.mostrar(); // Salida: 10 -> 20 -> 30 -> null

    }
}