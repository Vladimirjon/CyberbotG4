import java.util.ArrayList;
import java.util.Random;

public class Mecatronico {
    private static int VAcontadorExobots = 0;
    public Exobot oExobot;
    public Lanzafuegos oLanzafuegos;
    public Metralleta oMetralleta;
    public Laser oLaser;
    public Bazuca oBazuca;
    public Botas pjBotas;


    public Mecatronico(){
        oExobot = new Exobot();
        oLanzafuegos = new Lanzafuegos(oExobot);
        oMetralleta = new Metralleta(oExobot);
        oLaser = new Laser(oExobot);
        oBazuca = new Bazuca(oExobot);
        pjBotas = new Botas();
    }
   
    public static void main(String[] args) {
        Mecatronico mecatronico = new Mecatronico();
        Exobot[] exobots = new Exobot[20];
        Soldado osoldado = new Soldado();
        osoldado.agregarNombres();
        ArrayList<String>  nombresSoldado = osoldado.getArrayList();

        for (int i = 0; i < 20; i++) {
            exobots[i] = new Exobot();
            String serieAleatoria = mecatronico.vaAsignarSerie();
            exobots[i].vaAsignarSerie(serieAleatoria);
        }
        ArrayList<Mecatronico> TJomecatronico = new ArrayList<>();
        for(int i = 0; i<20; i++){
            TJomecatronico.add(new Mecatronico());
        }

        //         Brazo izquierdo:
        // Equipado Lanzafuego: False
        // Equipado Laser: True

        // Brazo derecho: 
        // Equipado Metralleta: True
        // Equipado Bazuca: False

        // Piernas:
        // Puedo saltar hasta 50m 
        // Puedo correr a 200 km/

        //IMPRIMIR DATOS DE CYBERBOT
        for (int i = 0; i < 20; i++) {
            System.out.println(" - - - CYBERBOT " + (i + 1) + " - - -");
            System.out.println("Soldado: " + nombresSoldado.get(i+1));
            Exobot exobot = exobots[i];
            exobot.vaMostrarInformacion();
            System.out.println();
            System.out.println("Brazo derecha");
            System.out.println("Equipado Metralleta: "+ TJomecatronico.get(i).oMetralleta.ispjMetralletaeqquiped());
            System.out.println("Bazuca: "+ TJomecatronico.get(i).oBazuca.ispjBazucaequipped());
            System.out.println();
            System.out.println("Brazo izquierdo");
            System.out.println("Equipado Lanzafuego: " + TJomecatronico.get(i).oLanzafuegos.ispjLanzafuegoequipped());
            System.out.println("Equipado Laser: "+ TJomecatronico.get(i).oLaser.ispjLaserequipped());
            System.out.println();
            System.out.println("Piernas");
            TJomecatronico.get(i).pjBotas.pjCorrer();
            TJomecatronico.get(i).pjBotas.pjSupersalto();
            System.out.println();
        }
    }

    public String vaAsignarSerie() {
        StringBuilder VAserie = new StringBuilder();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int indice = random.nextInt(caracteres.length());
            VAserie.append(caracteres.charAt(indice));
        }

        return VAserie.toString();
    }
}