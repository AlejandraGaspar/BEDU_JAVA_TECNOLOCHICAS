//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crear mis objetos
        //1. clase
        //2. Identificador
        //3. new + constructor
        Estudiante est = new Estudiante();

        est.nombre = "Ale";
        est.edad = 21;

        est.saludar();
    }
}