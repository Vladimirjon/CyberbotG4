import java.util.ArrayList;
import java.util.Random;

public class Mecatronico {
    private static int VAcontadorExobots = 0;
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
        Mecatronico mecatronico = new Mecatronico();
        Exobot[] exobots = new Exobot[20];
        Soldado[] soldados = new Soldado[20];

        for (int i = 0; i < 20; i++) {
            exobots[i] = new Exobot();
            String serieAleatoria = mecatronico.vaAsignarSerie();
            exobots[i].vaAsignarSerie(serieAleatoria);
            
        }
        System.out.println("Lista de Exobots");
        for (Exobot exobot : exobots) {
            exobot.vaMostrarInformacion();
        }
        ArrayList<Mecatronico> TJomecatronico = new ArrayList<>();
        
        for(int i = 0; i<20; i++){
            TJomecatronico.add(new Mecatronico());
        }

        // for (int i = 0; i < TJomecatronico.size(); i++) {
        //     System.out.println(TJomecatronico.get(i).oLanzafuegos.ispjLanzafuegoequipped());
        //     // Hacer algo con exobotActual
        // }
        System.out.println("\nLista de Soldados");
        for(int i=0;i<20;i++){
            soldados[i] = new Soldado();
            soldados[i].agregarNombres();
        }
        for(int i=0;i<20;i++){
            ArrayList<String> nombresSoldado = soldados[i].geArrayList();
            System.out.println(nombresSoldado.get(i));
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
