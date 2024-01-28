import java.util.Random;

public class Mecatronico {
    private static int VAcontadorExobots = 0;
    public static void main(String[] args) {
        Mecatronico mecatronico = new Mecatronico();
        Exobot[] exobots = new Exobot[20];

        for (int i = 0; i < 20; i++) {
            exobots[i] = new Exobot(false, false, false, false, false, false);
            String serieAleatoria = mecatronico.vaAsignarSerie();
            exobots[i].vaAsignarSerie(serieAleatoria);
        }

        for (Exobot exobot : exobots) {
            exobot.vaMostrarInformacion();
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
