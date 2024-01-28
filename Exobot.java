public class Exobot extends IABOT implements IEspanol,IIngles{
    private Botas botas;
    private Reactor reactor;
    private Laser laser;
    private Metralleta metralleta;
    private Lanzafuegos lanzafuego;
    private Bazuca bazuca;
    private Exobot exobot;

    public Exobot getExobot() {
        return exobot;
    }

    public void setExobot(Exobot exobot) {
        this.exobot = exobot;
    }

    public Exobot(){
        this.exobot= new Exobot();
        this.botas = new Botas(true);
        this.reactor = new Reactor(true);
        this.equiparlaser(false);
        this.equiparbazuca(false);
        this.equiparmetralleta(false);
        this.equiparlanzafuegos(false);
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