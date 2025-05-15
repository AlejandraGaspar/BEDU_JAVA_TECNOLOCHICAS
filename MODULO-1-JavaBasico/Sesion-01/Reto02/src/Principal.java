public class Principal {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("Festival de Año Nuevo", 557.50);
        Entrada entrada2 = new Entrada("Concierto de BTS", 7507.50);
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        Entrada_Record entrad = new Entrada_Record("Festival de Navidad", 345.67);
        entrad.mostrarInformacion();
    }
}
