import java.util.ArrayList;

public class Mecatronico {
    //Esta el constructor donde se crean todas las variables aleatoriamente
    public Exobot oExobot;
    public Lanzafuegos oLanzafuegos;
    public Metralleta oMetralleta;
    public Laser oLaser;
    public Bazuca oBazuca;

    public Mecatronico(){
        oExobot = new Exobot();
        oLanzafuegos =new Lanzafuegos(oExobot);
        oMetralleta = new Metralleta(oExobot);
        oLaser = new Laser(oExobot);
        oBazuca = new Bazuca(oExobot);
    }
   
  

}
