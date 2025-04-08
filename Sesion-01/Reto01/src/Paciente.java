import java.util.Scanner;

public class Paciente {
    String Nombre;
    int Edad;
    int NumeroExpediente;

    public void mostrarInformacion(){
        Scanner pac = new Scanner(System.in);

        System.out.println("Escribe los siguientes datos: Nombre, Edad y Número de Expediente");

        Nombre = pac.nextLine();
        Edad = pac.nextInt();
        NumeroExpediente = pac.nextInt();

        System.out.println("Name: " + Nombre);
        System.out.println("Age: " + Edad);
        System.out.println("Salary: " + NumeroExpediente);
    }
}
