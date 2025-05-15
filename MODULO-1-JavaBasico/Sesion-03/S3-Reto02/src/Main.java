public class Main {
    public static void main(String[] args) {
        Factura fac1 = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");
        Factura fac2 = new Factura(1800.0, "Reparación de equipo", null);

        System.out.println(fac1.getResumen());

        System.out.println(fac2.getResumen());
    }
}