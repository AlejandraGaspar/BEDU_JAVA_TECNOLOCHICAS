public class Patrulla extends UnidadEmergencia {
    SistemaGPS gps;
    Sirena sirena;
    Operador operador;

    public Patrulla( String nombre, String operadorN){
        super (nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(operadorN);
    }

    @Override
    public void responder() {
        System.out.println("Patrulla atendiendo situación de seguridad ciudadana.");
    }

    public void iniciarOperacion(){
        activarUnidad();
        responder();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
    }
}
