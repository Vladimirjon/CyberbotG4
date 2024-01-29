import java.util.Random;

public abstract class IABOT {
   protected String VAcodigoSeguridad;

    public static String generarCodigoSeguridad() {
        StringBuilder codigo = new StringBuilder();
        String caracteres = "0123456789";
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int indice = random.nextInt(caracteres.length());
            codigo.append(caracteres.charAt(indice));
        }

        return codigo.toString();
    }
    public void pjpotenciarpiernas(){

    }
    public void pjpotenciarBrazoIzquierdo(){

    }
    public void pjpotenciaBrazoDerecha(){

    }


    public void vaAsignarCodigoSeguridad(String codigoSeguridad) {
        this.VAcodigoSeguridad = codigoSeguridad;
    }

    public abstract void vaAsignarCodigoSeguridad();
}
