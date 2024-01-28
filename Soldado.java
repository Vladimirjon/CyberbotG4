import java.util.ArrayList;

public class Soldado {

    private ArrayList<String> TJnombreSoldados;

    public Soldado() {
        TJnombreSoldados = new ArrayList<>();
    }

    public void agregarNombres() {
        for(int i=0;i<20;i++){
            TJnombreSoldados.add("Wladimir "+(i+1));
        }
    }

    public ArrayList<String> geArrayList(){
        return this.TJnombreSoldados;
    }
}
