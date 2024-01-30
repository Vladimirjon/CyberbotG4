import java.util.ArrayList;

public class Soldado {

    public String tjpiernas(){
        return "Se han potencializado las piernas";
    }


    public String tjBrazoIzquierdo(){
        return "Se ha potencializado el brazo Izquierdo";
    }


    public String tjBrazoDerecha(){
        return "Se ha potencializado el brazo Derecho";

    }

    private ArrayList<String> TJnombreSoldados;

    public Soldado() {
        TJnombreSoldados = new ArrayList<>();
    }

    public void agregarNombres() {
        for(int i=0;i<=20;i++){
            TJnombreSoldados.add("Wladimir "+(i));
        }
    }

    public ArrayList<String> getArrayList(){
        return this.TJnombreSoldados;
    }
}
