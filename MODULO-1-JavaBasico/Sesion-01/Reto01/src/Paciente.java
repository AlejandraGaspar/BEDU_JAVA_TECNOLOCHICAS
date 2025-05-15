import java.util.Scanner;

public class Paciente {
    String Nombre;
    int Edad;
    String NumeroExpediente;

    public void mostrarInformacion(){
        System.out.println("Paciente: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Expediente: " + NumeroExpediente);
    }
}
