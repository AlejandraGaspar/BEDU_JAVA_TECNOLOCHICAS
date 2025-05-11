import java.util.Objects;

public class CuentaFiscal {
    private final String rfc;
    private double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible){
        this.rfc = rfc;
        if (saldoDisponible < 0){
            System.out.println("El Saldo no puede ser menor de 0");
            this.saldoDisponible = 0;
        } else {
            this.saldoDisponible = saldoDisponible;
        }
    }

    public String getRfc(){ return rfc; }
    public double getSaldoDisponible(){ return saldoDisponible; }

    public boolean validarRFC(DeclaracionImpuestos d){
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    public void MostrarInformacion(){
        System.out.println("Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }
}