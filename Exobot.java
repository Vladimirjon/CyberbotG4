public class Exobot extends IABot implements IEspanol,IIngles{
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

    public void equiparmetralleta(boolean equipar){
        this.metralleta = new Metralleta(equipar);
    }
    
    public void equiparlaser(boolean equipar){
        this.laser = new Laser(equipar);
    }

    public void equiparbazuca(boolean equipar){
        this.bazuca = new Bazuca(equipar);
    }

    public void equiparlanzafuegos(boolean equipar){
        this.lanzafuego = new Lanzafuegos(equipar);
    }
    @Override
    public String pjenseniarIngles() {
        return "El "+this.getExobot()+"ha aprendido español.";
    }
    @Override
    public String pjensenaEspanol() {
        return "El "+this.getExobot()+"ha aprendido español.";
    }
}
