import java.util.Random;

public class Exobot extends IABOT implements IEspanol, IIngles {
    private static int VAcontadorExbots=0;
    private Exobot exobot;
    private int VAnumero;
    private String VAserie;

    


    @Override
    public void pjpotenciarpiernas(){
        System.out.println("Se han potencializado las piernas");
    }

    @Override
    public void pjpotenciarBrazoIzquierdo(){
        System.out.println("Se ha potencializado el brazo Izquierdo");
    }

    @Override
    public void pjpotenciaBrazoDerecha(){
        System.out.println("Se ha potencializado el brazo Derecho");

    }
    
    public Exobot getExobot() {
        return exobot;
    }

    public void setExobot(Exobot exobot) {
        this.exobot = exobot;
    }

    
    private boolean tjreactor;

    public boolean getTjreactor() {
        return tjreactor;
    }

    public void setTjreactor(boolean tjreactor) {
        this.tjreactor = tjreactor;
    }

    private boolean tjbotas;
    
    public boolean isTjbotas() {
        return tjbotas;
    }

    public void setTjbotas(boolean tjbotas) {
        this.tjbotas = tjbotas;
    }
    
    private boolean pjequiparlaser;
    
    public boolean getPjequiparlaser() {
        return pjequiparlaser;
    }

    public void setPjequiparlaser(boolean pjequiparlaser) {
        this.pjequiparlaser = pjequiparlaser;
    }

    private boolean pjequiparmetralleta;
    public boolean getPjequiparmetralleta() {
        return pjequiparmetralleta;
    }

    public void setPjequiparmetralleta(boolean pjequiparmetralleta) {
        this.pjequiparmetralleta = pjequiparmetralleta;
    }


    
    private boolean pjequiparlanzafuego;

    public boolean getPjequiparlanzafuego() {
        return pjequiparlanzafuego;
    }

    public void setPjequiparlanzafuego(boolean pjequiparlanzafuego) {
        this.pjequiparlanzafuego = pjequiparlanzafuego;
    }

    public boolean getPjequiparbazuca() {
        return pjequiparbazuca;
    }

    public void setPjequiparbazuca(boolean pjequiparbazuca) {
        this.pjequiparbazuca = pjequiparbazuca;
    }

    private boolean pjequiparbazuca;

    public Exobot() {
        
        this.VAnumero = VAcontadorExbots;
        this.tjbotas = true;
        this.tjreactor = true;

        Random random = new Random();
        this.pjequiparlaser = random.nextBoolean();
        this.pjequiparmetralleta = random.nextBoolean();
        this.pjequiparlanzafuego = !pjequiparlaser;
        this.pjequiparbazuca = !pjequiparmetralleta;
        vaAsignarCodigoSeguridad();
        VAcontadorExbots++;

    }
    @Override
    public String pjenseniarIngles() {
        return "El exobot ha aprendido ingles.";
    }
    @Override
    public String pjensenaEspanol() {
        return "El exobot ha aprendido español.";
    }

    public void vaAsignarSerie(String VAserie) {
        this.VAserie = VAserie;
    }

    public void vaAsignarCodigoSeguridad() {
        String codigoSeguridad = IABOT.generarCodigoSeguridad();
        vaAsignarCodigoSeguridad(codigoSeguridad);
    }

    public String vaObtenerCodigoSeguridad() {
        return super.VAcodigoSeguridad;
    }
    public void vaMostrarInformacion() {
        System.out.println("Exobot: Exobot " + VAnumero + 
        "\nSerie: " + this.VAserie + 
        "\nCódigo de seguridad: " +vaObtenerCodigoSeguridad());
    }
    public void pjcargarReactor(){
        System.out.println("Se ha cargado el reactor");
    }
}
