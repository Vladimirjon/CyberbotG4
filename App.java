public class App {
    public static void main(String[] args) {
        Mecatronico mecatronico = new Mecatronico();
        Exobot[] exobots = new Exobot[20];

        for (int i = 0; i < 20; i++) {
            exobots[i] = new Exobot();
            String serieAleatoria = mecatronico.VAasignarSerie();
            exobots[i].vaAsignarSerie(serieAleatoria);
        }

        for (Exobot exobot : exobots) {
            exobot.vaMostrarInformacion();
        }
    }
    
}
