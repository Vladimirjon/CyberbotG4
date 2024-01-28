import java.util.Random;

public class Exobot extends IABot implements IEspanol, IIngles {

    
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
        this.tjbotas = true;
        this.tjreactor = true;


        Random random = new Random();
        this.pjequiparlaser = random.nextBoolean();
        this.pjequiparmetralleta = random.nextBoolean();
        this.pjequiparlanzafuego = !pjequiparlaser;
        this.pjequiparbazuca = !pjequiparmetralleta;


        // Equipar armas
        
    }


    // public void pjequiparmetralleta(boolean pjequipar) {
    //     this.pjMetralleta = new Metralleta(pjequipar);
    // }

    // public void pjequiparlaser(boolean pjequipar) {
    //     this.pjLaser = new Laser(pjequipar);
    // }

    // public void pjequiparbazuca(boolean pjequipar) {
    //     this.pjBazuca = new Bazuca(pjequipar);
    // }

    // public void pjequiparlanzafuegos(boolean pjequipar) {
    //     this.pjLanzafuegos = new Lanzafuegos(pjequipar);
    // }

  
}
