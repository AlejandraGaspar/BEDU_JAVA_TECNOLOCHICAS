public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia Cruz Roja", "Juan");
        Patrulla patrulla = new Patrulla("Patrulla", "Laura");
        UnidadBomberos uBomberos = new UnidadBomberos("UnidadBomberos", "Marco");

        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        uBomberos.iniciarOperacion();
    }
}
