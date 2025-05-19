public class PagoTransferencia extends MetodoPago{

    private boolean validacionE;

    public PagoTransferencia(double monto, boolean validacionE){
        super(monto);
        this.validacionE = validacionE;
    }

    @Override
    public boolean autenticar() {
        return validacionE;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia por $" + monto);
    }
}
