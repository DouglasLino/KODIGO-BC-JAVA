// Patron creacional - Singleton
public class SistemaReservas {
    private static SistemaReservas instancia;

    private SistemaReservas() {}

    public static SistemaReservas obtenerInstancia() {
        if (instancia == null) {
            instancia = new SistemaReservas();
        }
        return instancia;
    }
}
