import java.util.Random;

public class Exobot extends IABOT implements IEspanol, IIngles {
    private static int VAcontadorExbots = 0;
    private Botas pjbotas;
    private Reactor pjreactor;
    private Laser pjlaser;
    private Metralleta pjmetralleta;
    private Lanzafuegos pjlanzafuego;
    private Bazuca pjbazuca;
    private Exobot exobot;
    private int VAnumero;
    private String VAserie;
    

    public Exobot getExobot() {
        return exobot;
    }

    public void setExobot(Exobot exobot) {
        this.exobot = exobot;
    }

      public Exobot(boolean ispjBazucaequipped, boolean ispjLaserequipped, boolean ispjBotasequipped,
            boolean ispjReactorequipped, boolean ispjMetralletaeqquiped, boolean ispjLanzafuegoequipped) {
        VAcontadorExbots++;
        this.VAnumero = VAcontadorExbots;
        this.pjbotas = new Botas(true);
        this.pjreactor = new Reactor(true);
        this.pjequiparlaser(false);
        this.pjequiparbazuca(false);
        this.pjequiparmetralleta(false);
        this.pjequiparlanzafuegos(false);
        vaAsignarCodigoSeguridad();
    }

    public void pjequiparmetralleta(boolean pjequipar) {
        this.pjmetralleta = new Metralleta(pjequipar);
    }

    public void pjequiparlaser(boolean pjequipar) {
        this.pjlaser = new Laser(pjequipar);
    }

    public void pjequiparbazuca(boolean pjequipar) {
        this.pjbazuca = new Bazuca(pjequipar);
    }

    public void pjequiparlanzafuegos(boolean pjequipar) {
        this.pjlanzafuego = new Lanzafuegos(pjequipar);
    }

    @Override
    public String pjenseniarIngles() {
        return "El " + this.getExobot() + "ha aprendido ingles.";
    }

    @Override
    public String pjensenaEspanol() {
        return "El " + this.getExobot() + "ha aprendido español.";
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
        System.out.println("Exobot " + VAnumero + ": Serie " + VAserie + ", Código de seguridad: " +vaObtenerCodigoSeguridad());
    }

  
    
    
}