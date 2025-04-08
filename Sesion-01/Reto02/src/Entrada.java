public class Entrada {
    String NombreEvento;
    double PrecioEntrada;

    public Entrada(String x, double y){
        NombreEvento = x;
        PrecioEntrada = y;
    }
    public void mostrarInformacion(){
        System.out.println("Evento: " + NombreEvento + " | Precio: " + PrecioEntrada);
    }
}
