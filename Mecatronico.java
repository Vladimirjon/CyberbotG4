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
   
    public static void main(String[] args) {
        ArrayList<Mecatronico> TJomecatronico = new ArrayList<>();
        
        for(int i = 0; i<20; i++){
            TJomecatronico.add(new Mecatronico());
        }

        for (int i = 0; i < TJomecatronico.size(); i++) {
            System.out.println(TJomecatronico.get(i).oLanzafuegos.ispjLanzafuegoequipped());
            // Hacer algo con exobotActual
        }
        
    }
  

}
