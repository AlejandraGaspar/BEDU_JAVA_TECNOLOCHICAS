public class DialogoTexto implements GestorDialogo {
    public void mostrarDialogo(PaqueteNarrativo paquete) {
        System.out.println("Escena actual: " + paquete.getEscenaActual());
        System.out.println("En lo alto de la montaña se observa el vuelo de las aves y en las llanuras el correr de los ciervos");
    }
}
