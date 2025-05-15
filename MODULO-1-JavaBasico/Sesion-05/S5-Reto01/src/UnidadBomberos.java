public class UnidadBomberos extends UnidadEmergencia {
    public UnidadBomberos( String nombre){
        super (nombre);
    }

    @Override
    public void responder() {
        System.out.println("Unidad de bomberos respondiendo a incendio estructural.");
    }
}
