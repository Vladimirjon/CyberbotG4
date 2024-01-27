public class Exobot extends IABOT implements IEspanol,IIngles{
    private Botas botas;
    private Reactor reactor;
    private Laser laser;
    private Metralleta metralleta;
    private Lanzafuegos lanzafuego;
    private Bazuca bazuca;

    public Exobot(){
        this.botas = new Botas(true);
        this.reactor = new Reactor();
        this.equiparlaser(false);
    }

    public void equiparlaser(boolean equiparlaser){
        this.laser = new Laser(equiparlaser);
    }
}
