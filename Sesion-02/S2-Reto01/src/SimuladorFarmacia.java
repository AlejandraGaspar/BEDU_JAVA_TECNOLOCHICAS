import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Medicamento med = new Medicamento();
        System.out.println("Escribe el nombre del medicamento:");
        med.Nombre = scan.nextLine();
        System.out.println("Escribe el precio del medicamento:");
        med.Precio = scan.nextDouble();
        System.out.println("Escribe la cantidad:");
        med.CantidadPiezas = scan.nextInt();

        med.Calcular();
    }
}
