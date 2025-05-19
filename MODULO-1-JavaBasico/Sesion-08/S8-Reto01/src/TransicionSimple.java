public class TransicionSimple implements TransicionHistoria {
    public void realizarTransicion(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("El jugador decide subir por la montaña...");
        } else {
            System.out.println("El jugador regresa al pueblo en busca de su equipo para acampar en la montaña...");
        }
    }
}
