public class Exobot extends IABOT implements IEspanol,IIngles{
    private Botas pjbotas;
    private Reactor pjreactor;
    private Laser pjlaser;
    private Metralleta pjmetralleta;
    private Lanzafuegos pjlanzafuego;
    private Bazuca pjbazuca;
    private Exobot exobot;

    public Exobot getExobot() {
        return exobot;
    }

    public void setExobot(Exobot exobot) {
        this.exobot = exobot;
    }

    public Exobot(boolean ispjBazucaequipped,boolean ispjLaserequipped,boolean ispjBotasequipped,boolean ispjReactorequipped,boolean ispjMetralletaeqquiped, boolean ispjLanzafuegoequipped){
        this.exobot= new Exobot(ispjBazucaequipped, ispjLaserequipped, ispjBotasequipped, ispjReactorequipped, ispjMetralletaeqquiped, ispjLanzafuegoequipped);
        this.pjbotas = new Botas(true);
        this.pjreactor = new Reactor(true);
        this.pjequiparlaser(false);
        this.pjequiparbazuca(false);
        this.pjequiparmetralleta(false);
        this.pjequiparlanzafuegos(false);
    }

    public void pjequiparmetralleta(boolean pjequipar){
        this.pjmetralleta = new Metralleta(pjequipar);
    }
    
    public void pjequiparlaser(boolean pjequipar){
        this.pjlaser = new Laser(pjequipar);
    }

    public void pjequiparbazuca(boolean pjequipar){
        this.pjbazuca = new Bazuca(pjequipar);
    }

    public void pjequiparlanzafuegos(boolean pjequipar){
        this.pjlanzafuego = new Lanzafuegos(pjequipar);
    }
    @Override
    public String pjenseniarIngles() {
        return "El "+this.getExobot()+"ha aprendido ingles.";
    }
    @Override
    public String pjensenaEspanol() {
        return "El "+this.getExobot()+"ha aprendido español.";
    }
}