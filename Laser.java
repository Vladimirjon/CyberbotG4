public class Laser implements IArma{
    private boolean pjlaser;

    public boolean ispjLaserequipped() {
        return pjlaser;
    }

    @Override
    public void pjDisaparar() {
        System.out.println("Disparo con el pjlaser");
    }
    
    public Laser(boolean pjlaser){
        this.pjlaser=pjlaser;
    }

}
