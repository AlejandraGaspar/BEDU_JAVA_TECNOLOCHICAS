import java.util.Scanner;

public class Medicamento {
    String Nombre;
    double Precio;
    int CantidadPiezas;

    public void Calcular(){
        double precio = Precio;
        int cantidad = CantidadPiezas;
        double resultadoM = cantidad * precio;
        var aplicadescuento = resultadoM > 500;
        double descuento = aplicadescuento ? resultadoM * 0.15 : 0;
        double totalFinal = resultadoM - descuento;

        System.out.println("\n");
        System.out.println("Medicamento: " + Nombre);
        System.out.println("Cantidad: " + CantidadPiezas);
        System.out.println("Precio Unitario: " + Precio);
        System.out.println("Total sin descuento: " + resultadoM);
        System.out.println("¿Aplica descuento?: " + aplicadescuento);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + totalFinal);
    }
}
