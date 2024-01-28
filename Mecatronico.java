import java.util.Random;

class Mecatronico {
    public String VAasignarSerie() {
        StringBuilder serie = new StringBuilder();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int indice = random.nextInt(caracteres.length());
            serie.append(caracteres.charAt(indice));
        }

        return serie.toString();
    }
}