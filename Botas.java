public class Botas {
    private boolean pjbotas=true;

    public boolean ispjBotasequipped() {
        return pjbotas;
    }

    public Botas(boolean pjbotas){
        this.pjbotas=pjbotas;
    }
    public void pjCorrer(){
        System.out.println("Puedo correr hasta 200 km/h");
    
    }
    public void pjSupersalto(){
        System.out.println("Puedo saltar hasta 50 metros");
    }
}
