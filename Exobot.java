public class Exobot implements IEspanol, IIngles {
    private static int contadorExbots = 0;
    private Botas botas;
    private Reactor reactor;
    private Laser laser;
    private Metralleta metralleta;
    private Lanzafuegos lanzafuego;
    private Bazuca bazuca;
    private int numero;
    private String serie;

    public Exobot() {
        contadorExbots++;
        this.numero = contadorExbots;
        this.botas = new Botas(true);
        this.reactor = new Reactor(true);
        this.equiparLaser(false);
        this.equiparBazuca(false);
        this.equiparMetralleta(false);
        this.equiparLanzafuegos(false);
    }

    public void equiparMetralleta(boolean equipar) {
        this.metralleta = new Metralleta(equipar);
    }

    public void equiparLaser(boolean equipar) {
        this.laser = new Laser(equipar);
    }

    public void equiparBazuca(boolean equipar) {
        this.bazuca = new Bazuca(equipar);
    }

    public void equiparLanzafuegos(boolean equipar) {
        this.lanzafuego = new Lanzafuegos(equipar);
    }

    public void vaAsignarSerie(String serie) {
        this.serie = serie;
    }

    public void vaMostrarInformacion() {
        System.out.println("Exobot " + numero + ": Serie " + serie);
    }
}





