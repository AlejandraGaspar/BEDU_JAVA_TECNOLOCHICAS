public class Main {
    public static void main(String[] args) {
        DeclaracionImpuestos declaracionImpuestos = new DeclaracionImpuestos("XAXX010101000", 8700.0);
        CuentaFiscal cuentaFiscal = new CuentaFiscal("XAXX010101000", 9500.0);

        System.out.println("Declaración enviada por RFC: " + declaracionImpuestos.rfcContribuyente() + " por $" + declaracionImpuestos.montoDeclarado());
        cuentaFiscal.MostrarInformacion();
        boolean rfcValido = cuentaFiscal.validarRFC(declaracionImpuestos);
        System.out.println("¿RFC válido para esta cuenta?: " + rfcValido);
    }
}