public class Main {
    public static void main(String[] args) {
        Pasajero pasajero = new Pasajero("Ana Martínez", "AM237808");

        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        Boolean reservado = vuelo.reservarAsiento(pasajero);
        if(reservado) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        } else{
            System.out.println("❌ Reserva no relizada");
        }

        System.out.println(vuelo.obtenerItinerario());
        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();
        System.out.println(vuelo.obtenerItinerario());
        vuelo.reservarAsiento("Alejandra Gaspar", "AG456798");
        System.out.println(vuelo.obtenerItinerario());
    }
}