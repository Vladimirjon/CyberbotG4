import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
        ArrayList<Mecatronico> TJomecatronico = new ArrayList<>();
        
        for(int i = 0; i<20; i++){
            TJomecatronico.add(new Mecatronico());
        }

        for (int i = 0; i < TJomecatronico.size(); i++) {
            System.out.println(TJomecatronico.get(i).oLanzafuegos.ispjLanzafuegoequipped());
            // Hacer algo con exobotActual
        }
        
    }

}
