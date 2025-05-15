import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var saldo = 1000;
        int opcion;

        do {
            System.out.println("Bienvenido al cajero automatico");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opcion: ");

            opcion = scan.nextInt();
            switch (opcion)
            {
                case 1 -> {
                    System.out.println("Saldo total: " + saldo);

                }

                case 2 -> {
                    System.out.println("Ingrese el monto a depositar: ");

                    double deposito = scan.nextDouble();
                    if (deposito <= 0){
                        System.out.println("El monto debe ser mayor a 0");
                        continue;
                    }
                    saldo += deposito;
                    System.out.println("Deposito realizado correctamente. Monto depositado: " + deposito);
                }
                case 3 -> {
                    System.out.println("Ingrese el monto a retirar: ");

                    double retiro = scan.nextDouble();
                    if (retiro <= 0){
                        System.out.println("El monto debe ser mayor a 0");
                        continue;
                    }

                    if (retiro > saldo){
                        System.out.println("Saldo insuficiente");
                    } else{
                        saldo -= retiro;
                        System.out.println("Retiro realizado correctamente. Monto retirado: " + saldo);
                    }
                }
                case 4 -> {
                    System.out.println("SALIENDO DEL CAJERO AUTOMATICO ...");
                }
                default -> {
                    System.out.println("Opcion invalida");
                }
            }
        } while (opcion != 4);

        scan.close();
    }
}
