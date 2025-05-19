import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        Path rutaLog = Paths.get("src/errores.log");
        Path rutaError = Paths.get("src/registro_fallos.txt");

        int totalLineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;

        try (BufferedReader lector = Files.newBufferedReader(rutaLog)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("Error")) {
                    conteoErrores++;
                }
                if (linea.contains("Warning")) {
                    conteoWarnings++;
                }
            }

            System.out.println("Análisis completado:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Total de errores (ERROR): " + conteoErrores);
            System.out.println("Total de advertencias (WARNING): " + conteoWarnings);

            double porcentajeE = (totalLineas > 0) ? ((double) conteoErrores / totalLineas) * 100 : 0;
            double porcentajeW = (totalLineas > 0) ? ((double) conteoWarnings / totalLineas) * 100 : 0;

            System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeE);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeW);

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo de logs: " + e.getMessage());

            try (BufferedWriter escritor = Files.newBufferedWriter(rutaError)) {
                escritor.write("Se produjo un error al leer el archivo 'errores.log': " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("No se pudo escribir en el archivo de registro de fallos." + ex.getMessage());
            }
        }
    }
}
