public class Reactor {
    private boolean pjreactor;
    private int pjBateria;

    public Reactor(){
        this.pjreactor = false;
        this.pjBateria = 100;
    }

    public boolean isPjreactor() {
        return pjreactor;
    }

    public void setPjreactor(boolean pjreactor) {
        this.pjreactor = pjreactor;
    }

    public boolean ispjReactorequipped() {
        return pjreactor;
    }

    public  int getPjBateria() {
        return pjBateria;
    // public Reactor(boolean pjreactor){
    //     this.pjreactor = pjreactor;
    // }
}
    public void pjusandoBateria(){
        if (pjBateria>30) {
            System.out.println("Volando y utilizando armas!");
    }else{
        System.out.println("Bateria baja. Recargar");
    }
}
public void pjRecargar(){
    if(pjBateria<=30){
        System.out.println("Bateria por debajo del 30%. Necesito recargar");
    }
}

public void pjcargaExobot(){
    if(pjBateria<=10){
        System.out.println("¡Bateria en niveles criticos! Recargar urgente");
    }
}
public void pjcarga(int  carga){
    pjBateria+=carga;
    if(pjBateria>100){
        pjBateria=100;
    }
    System.out.println("Bateria cargada al "+ pjBateria +"%");
    }
}

