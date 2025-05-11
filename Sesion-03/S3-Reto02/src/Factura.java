import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    public Factura(double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    public String getResumen(){
        String Factura = "Factura generada:";
        Factura += "Descripción: " + descripcion + "\n";
        Factura += "Monto: $" + monto + "\n";
        Factura += "RFC: " + rfc.orElse("RFC: [No proporcionado]") + "\n";

        return Factura;
    }
}
