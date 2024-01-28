import java.util.ArrayList;

public class Exobot extends IABOT implements IEspanol,IIngles{
    private Botas pjbotas;
    private Reactor pjreactor;
    private Laser pjlaser;
    private Metralleta pjmetralleta;
    private Lanzafuegos pjlanzafuego;
    private Bazuca pjbazuca;

    public Exobot(){
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

}
