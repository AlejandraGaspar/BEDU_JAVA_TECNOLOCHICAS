import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner pac = new Scanner(System.in);
        Paciente pacientes = new Paciente();

        System.out.println("Escribe el nombre del paciente:");
        pacientes.Nombre = pac.nextLine();
        System.out.println("Escribe la edad del paciente:");
        pacientes.Edad = pac.nextInt();
        System.out.println("Escribe el número de expediente del paciente:");
        pacientes.NumeroExpediente = pac.next();
        pac.close();

        pacientes.mostrarInformacion();
    }
}