public class Entrada {
    String NombreEvento;
    double PrecioEntrada;

    public Entrada(String x, double y){
        this.NombreEvento = x;
        this.PrecioEntrada = y;
    }
    public void mostrarInformacion(){
        System.out.println("Evento: " + NombreEvento + " | Precio: " + PrecioEntrada);
    }
}
