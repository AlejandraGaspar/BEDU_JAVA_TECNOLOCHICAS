public class Main {
    public static void main(String[] args) {
        Factura fac1 = new Factura("FAC001", "Juan Pérez", 1450.0);
        Factura fac2 = new Factura("FAC001", "Comercial XYZ", 1450.0);

        System.out.println(fac1.toString());
        System.out.println(fac2.toString());
        System.out.println("¿Las facturas son iguales?: " + fac1.equals(fac2));
    }
}