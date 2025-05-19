public class UnidadBomberos extends UnidadEmergencia {
    public UnidadBomberos( String nombre){
        super (nombre);
    }
    SistemaGPS gps;
    Sirena sirena;
    Operador operador;

    public UnidadBomberos( String nombre, String operadorN){
        super (nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(operadorN);
    }

    @Override
    public void responder() {
        System.out.println("Unidad de bomberos respondiendo a incendio estructural.");
    }

    public void iniciarOperacion(){
        activarUnidad();
        responder();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
    }
}
