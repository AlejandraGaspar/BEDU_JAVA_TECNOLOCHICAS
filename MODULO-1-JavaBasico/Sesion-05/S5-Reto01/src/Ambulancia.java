public class Ambulancia extends UnidadEmergencia{

    SistemaGPS gps;
    Sirena sirena;
    Operador operador;

    public Ambulancia( String nombre, String operadorN){
        super (nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(operadorN);

    }

    @Override
    public void responder() {
        System.out.println("Ambulancia en camino al hospital más cercano.");
    }

    public void iniciarOperacion(){
            activarUnidad();
            responder();
            gps.localizar();
            sirena.activarSirena();
            operador.reportarse();
    }
}
