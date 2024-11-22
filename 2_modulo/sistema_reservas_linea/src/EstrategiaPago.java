// Patron de comportamiento - Strategy
public interface EstrategiaPago {
    void pagar(double monto);
}

class PagoTarjetaCredito implements EstrategiaPago {
    public void pagar(double monto) {
        System.out.println("Pago realizado con tarjeta de crédito: $" + monto);
    }
}

class PagoPayPal implements EstrategiaPago {
    public void pagar(double monto) {
        System.out.println("Pago realizado con PayPal: $" + monto);
    }
}
